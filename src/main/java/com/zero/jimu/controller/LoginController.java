package com.zero.jimu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.zero.jimu.entity.User;
import com.zero.jimu.service.user.UserService;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 微信小程序登陆接口
 * 通过前台页面传入的js_code值
 */
@RestController
public class LoginController {
    /**
     * appid 小程序id
     * 微信公众平台 设置中的开发设置中可以查到，相当于qq的qq号
     * 建议单独创建一个配置文件储存此类值和函数
     */
    public static final String APPID="wx5220ee738b28806c";
    /**
     * AppSecret 小程序密钥
     * 微信公众平台 设置中的开发设置中可以查询 但是每次查询会重置密钥 相当于qq的qq密码
     * 建议单独储存0
     */
    public static final String SECRET="85ebd9ea3390fa1200f81b8cb678eafd";
    /**
     *用于获取用户openid的接口网址
     * 其中%s将会用String.format函数替换为实际的值
     * 建议单独储存
     */
    public static final String Web_access_tokenhttps = "https://api.weixin.qq.com/sns/jscode2session?appid=%s&secret=%s&js_code=%s&grant_type=authorization_code";
    /**
     *通过APPID，SECET，code组合出用于获取用户openid的实际网址
     * 建议单独储存
     */
    public static String getWebAccess(String code) {
        return String.format(Web_access_tokenhttps, APPID, SECRET, code);
    }
    @Autowired
    private UserService us;//用于用户的数据库存储查询
    /**
     * 小程序登陆后台接口使用框架为Springboot+maven+JPA
     *  需要将前端code 发送到该处，使用code 换取openid 和 session_key
     *  本例中接口地址为http://127.0.0.1：8080/log/in
     * @param code 前台通过wx.login函数success微信服务器回传的code（有效期5min）
     *              本例中前台格式为 code: res.code+
     *             66---
     *
     * @return json格式数据 如果成功返回值为{ userid:XX}
     */
    @ResponseBody
    @PostMapping("/login")
    public Map<String,Object> login(String code){
        Map<String,Object> map=new HashMap<>();
        System.out.println(">>>微信小程序登录，请求数据为[ code:"+code);
        //获取用户openid的实际网址
        String token = getWebAccess(code);
        //通过HttpGet方法将token发送至微信服务器并获得其回执
        String rec = httpGet(token);
        System.out.println("微信回执为：/n"+rec);

        JSONObject json = JSON.parseObject(rec);
        //获取回执的openid
        if(json!=null){
            //获取openid
            String openid=json.getString("openid");
            if(openid==null){
                map.put("code","1");
                map.put("message","code已失效");
                return map;
            }
            String session_key = json.getString("session_key");
            //以下时我自己写的
            //查找数据库user表有无该openid
            //如果无则new一个User储存至数据库并返回id
            //如果有则返回此条数据的id
            User user = us.findByOpenIdLike(openid);
            if(user!=null){
                map.put("userid", user.getId());
                map.put("code","0");
            }else{
                user=new User();
                user.setOpenid(openid);
                user.setSessionkey(session_key);
                int res = us.insertUser(user);
                map.put("userid", res);
                map.put("code","0");
            }
        }
        return map;
    }

    /**
     * 通过HttpGet类发送GET请求并获取返回信息
     * @param path 发送至的网址
     * @return
     */
    public String httpGet(String path){
        if(path==null){
            return null;
        }
        String rec=null;
        HttpGet get=new HttpGet(path);
        try {
            HttpResponse response = HttpClients.createDefault().execute(get);
            HttpEntity entity=response.getEntity();
            rec= EntityUtils.toString(entity);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rec;
    }
}
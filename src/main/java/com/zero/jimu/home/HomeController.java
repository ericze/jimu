package com.zero.jimu.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ResponseBody
@Controller
public class HomeController {
    @RequestMapping("/home")
    public String HomeData(){
        return "推荐，最近访问，我的关注";
    }
}

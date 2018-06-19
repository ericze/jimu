package com.zero.jimu.utils;

//import com.apin.init.po.ApinCity;
//import com.apin.init.po.ApinNation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/8/15.
 */
public class Constant {

    //init
    //sms_model_map:modelName-->modelContent
    public static final Map<String,String> DICT_SMS_MODEL_MAP=new HashMap<>();

    //apin_city_list
  //  public static List<ApinCity> DICT_APIN_CITY_LIST=new ArrayList<>();

    //apin_city_map:cityName-->cityCode
  //  public static final Map<String,String> DICT_APIN_CITY_MAP=new HashMap<>();

  //  public static List<ApinNation> DICT_APIN_NATION_LIST=new ArrayList<>();

    public static final String [] FIELDS={"osType","deviceToken","phone"};

    //session timeout:1day
//    public static final int SESSION_EXPIRE_TIME=604800;

    //verify code timeout:180s
//    public static final int MOBILE_CODE_EXPIRE_TIME=180;

    //order timeout:10min
//    public static final long ORDER_TIMER_TIME=600000;

    //the third pay orgnization
//    public static final long THIRD_PAY_EXTRA_TIME=8000;

    //order notify timeout:5min
//    public static final long ORDER_NOTIFY_TIME=300000;

    //merchant handle route timeout:30min
//    public static final long MERCHANT_HANDLE_ROUTE_TIME=1800000;

    public static final String ALIPAY_PUBLIC_KEY="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnx" +
            "j/9qwVfgoUh/y2W89L6BkRAFljhNhgPdyPuBV64bfQNN1PjbCzkIM6qRdKBoLPXmKKMiFYnkd6rAoprih" +
            "3/PrQEB/VsW8OoM8fxn67UDYuyBTqA23MML9q1+ilIZwBC2AQ2UBVOrFXfFl75p6/B5KsiNG9zpgmLCUYuLkxpLQIDAQAB";

    //qiniu
    public static final String APIN_QINIU_AK = "zU-y1HkFebHKXr5Vi2KVuO0iYslhUIdbETam97mY";

    public static final String APIN_QINIU_SK = "S0-Fsl9r7N6S9CuVTDDncHh-W-kBL-XavnXxZpAH";

    //    public static final String QINIU_IMG_URL_PRE = "http://7xk8ag.com1.z0.glb.clouddn.com/";
    public static final String QINIU_IMG_URL_PRE = "http://www.hzapin.com/";

//    public static final String APIN_QINIU_BUCKETS = "apin";
    public static final String APIN_QINIU_BUCKETS = "apin201609";

    public static final String APIN_QINIU_POINT=".";

    public static final String APIN_QINIU_HEAD_PIC_PREFIX="headPic/";

    public static final String APIN_QINIU_SUFFIX="jpg";

    //server_salt
    public static final String SERVER_KEY="1@w$b09o";


































}

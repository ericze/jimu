package com.zero.jimu.utils;

import java.util.Collections;


/**
 * Created by Administrator on 2016/8/15.
 */
public class ApinResponseUtil {

    public static  ApinResponse good(long startTime){
        return good(startTime, Collections.emptyMap());
    }

    public static <T> ApinResponse good(long startTime,T body){
        long currentTime=System.currentTimeMillis();
        long delayInMs=currentTime-startTime;
        float delayInS=(float)delayInMs/1000;
        String delayStr=String.valueOf(delayInS);
        ApinResponse apinResponse=new ApinResponse(ErrorEnum.ERROR_SUCCESS.getErrorCode(),ErrorEnum.ERROR_SUCCESS.getErrorMsg(),delayStr,body);
        return apinResponse;
    }

    public static ApinResponse bad(long startTime,ErrorEnum errorEnum){
        return bad(startTime,errorEnum.getErrorCode(),errorEnum.getErrorMsg());
    }

    public static ApinResponse bad(long startTime,String errorCode,String errorMsg){
        long currentTime=System.currentTimeMillis();
        long delayInMs=currentTime-startTime;
        float delayInS=(float)delayInMs/1000;
        String delayStr=String.valueOf(delayInS);
        ApinResponse apinResponse=new ApinResponse(errorCode,errorMsg,delayStr,Collections.emptyMap());
        return apinResponse;
    }
}

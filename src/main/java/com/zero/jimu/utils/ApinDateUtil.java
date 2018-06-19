package com.zero.jimu.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2016/8/16.
 */
public class ApinDateUtil {

    private static final Logger logger = LoggerFactory.getLogger(ApinDateUtil.class);
    public static final String [] DATE_FORMATS=new String[]{"yyyy-MM-dd HH:mm:ss","yyyy-MM-dd","yyyyMMddHHmmss",
            "yyyyMMdd","yyyy/MM/dd"};

    public ApinDateUtil(){

    }

    public static String format(Date source){
        return format(source,DATE_FORMATS[0]);
    }

    public static String format(Date source,int dateFormatIndex){
        return format(source,DATE_FORMATS[dateFormatIndex]);
    }

    public static String format(Date source,String format){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
        String dest=simpleDateFormat.format(source);
        return dest;
    }

    public static Date parse(String source) throws Throwable{
        return parse(source,DATE_FORMATS[0]);
    }

    public static Date parse(String source,int dateFormatIndex) throws Throwable{
        return parse(source,DATE_FORMATS[dateFormatIndex]);
    }

    public static Date parse(String source,String format) throws Throwable{
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
        Date dest=simpleDateFormat.parse(source);
        return dest;
    }

    public static long getRemainTimeInS(Date endDate){
        long currentTime=System.currentTimeMillis();
        long endTime=endDate.getTime();
        if(currentTime>=endTime){
            return 0;
        }else{
            long remianTimeInS=(endTime-currentTime)/1000;
            return remianTimeInS;
        }
    }

    public static long getRemainTimeInS(long endTime){
        long currentTime=System.currentTimeMillis();
        if(currentTime>=endTime){
            return 0;
        }else{
            long remianTimeInS=(endTime-currentTime)/1000;
            return remianTimeInS;
        }
    }

    public static long getRemainTimeInMS(Date endDate){
        long currentTime=System.currentTimeMillis();
        long endTime=endDate.getTime();
        if(currentTime>=endTime){
            return 0;
        }else{
            long remianTimeInMS=endTime-currentTime;
            return remianTimeInMS;
        }
    }

    public static long getRemainTimeInMS(long endTime){
        long currentTime=System.currentTimeMillis();
        if(currentTime>=endTime){
            return 0;
        }else{
            long remianTimeInMS=endTime-currentTime;
            return remianTimeInMS;
        }
    }



}

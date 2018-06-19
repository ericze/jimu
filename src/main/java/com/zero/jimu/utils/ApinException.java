package com.zero.jimu.utils;

/**
 * Created by Administrator on 2016/8/14.
 */
public class ApinException extends RuntimeException{

    public ApinException(){
        super();
    }

    public ApinException(String msg){
        super("ApinException:"+msg);
    }
}

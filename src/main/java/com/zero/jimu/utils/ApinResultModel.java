package com.zero.jimu.utils;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/8/14.
 */
public class ApinResultModel extends HashMap<String,Object> implements Serializable{

    private static final long serialVersionUID = -7611083545782545691L;

    private String errorCode="00000000";
    private String errorMsg="操作成功";

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public void setErrorEnum(ErrorEnum errorEnum,boolean isThrow){
        this.errorCode=errorEnum.getErrorCode();
        this.errorMsg=errorEnum.getErrorMsg();
        if(isThrow){
            throw new ApinException(errorMsg);
        }
    }

    public void setErrorEnum(ErrorEnum errorEnum){
        setErrorEnum(errorEnum,true);
    }

    public void setObjectData(Object data){
        this.put("result", data);
    }

    public Object getData(){
        return this.get("result");
    }

    public void setData(Collection collection){
      this.setObjectData(collection);
    }

    public void setData(Map map){
        this.setObjectData(map);
    }

    public void setData(String msg){
        this.setObjectData(msg);
    }
}

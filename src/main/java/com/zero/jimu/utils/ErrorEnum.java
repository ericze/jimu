package com.zero.jimu.utils;

/**
 * Created by Administrator on 2016/8/14.
 */
public enum ErrorEnum {

    //common error
    ERROR_SUCCESS("00000000","操作成功"),
    ERROR_NOT_LOGIN("00000001","未登录没有操作权限"),
    ERROR_INTERNAL_SERVER_ERROR("00000002","服务器内部错误"),
    ERROR_PARAM_ISBLANK("00000003","存在为空的参数"),
    ERROR_FAILED_VERIFIED("000000004","验证失败"),

    //login error
    ERROR_LOGIN_MOBILE_PHONE_FORMAT("00001000","手机格式不正确"),
    ERROR_LOGIN_VERIFICATIONCODE_EXPIRE("00001001","验证码已经过期"),
    ERROR_LOGIN_VERIFICATIONCODE_NOT_MATCH("00001002","验证码不匹配"),
    ERROR_LOGIN_INVITATION_CODE_NOT_EXIST("00001003","邀请码不存在"),

    //order error
    ERROR_ORDER_REMAIN_TICKET_NOT_ENOUGH("10002000","余票数量不足"),
    ERROR_ORDER_NOT_EXIST("10002001","订单不存在"),
    ERROR_ORDER_PASSENGER_NUMBER_NOT_ENOUGH("10002002","添加乘机人数不足"),
    ERROR_ORDER_PASSENGER_NUMBER_OVERMUCH("10002003","添加乘机人数过多"),
    ERROR_ORDER_PASSENGER_HAS_EXISTED("10002004","乘机人已存在"),


    //pay error
    ERROR_PAY_VERIFICATION_FAIL("10003000","校验失败"),
    ERROR_PAY_AMOUNT_NOT_MATCH("10003001","支付金额不匹配"),

    //route error
    ERROR_ROUTE_NOT_SUITABLE_FLIGHTS("10004000","没有找到合适的航班"),

    //user service
    ERROR_USER_SERVICE_COMMON_PASSENGER_HAS_EXIST("10005000","该常用乘机人已经存在");

    ErrorEnum(String errorCode,String errorMsg){
        this.errorCode=errorCode;
        this.errorMsg=errorMsg;
    }

    private String errorCode;
    private String errorMsg;

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

    public String getErrorMsgWithParam(String param){
        return errorMsg+":["+param+"]";
    }
}

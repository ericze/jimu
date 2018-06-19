package com.zero.jimu.utils;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/8/15.
 */
public class ApinResponse<T> implements Serializable{

    private static final long serialVersionUID = -6509403838778742882L;

    private Head head;
    private T body;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public ApinResponse(String code,String msg,String time,T body){
        Head head=new Head();
        head.setCode(code);
        head.setMsg(msg);
        head.setTime(time);
        this.head=head;
        this.body=body;
    }

    public class Head{
        private String code;
        private String msg;
        private String time;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}

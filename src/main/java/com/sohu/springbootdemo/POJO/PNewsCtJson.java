package com.sohu.springbootdemo.POJO;

/**
 * @author haochen
 * @date 2019/4/2 3:23 PM
 */
public class PNewsCtJson {
    private String code;
    private String msg;
    private Long time=System.currentTimeMillis() ;
    private Long costTm;

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

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getCostTm() {
        return costTm;
    }

    public void setCostTm(Long costTm) {
        this.costTm = costTm;
    }
}

package com.yh.controller;

/**
 * date 2022/12/19
 *
 * @author yu
 * 传输数据
 */
public class Result {
    private Integer code;
    private Object data;
    private String msg;

    public Result() {
    }

    public Result(Integer code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public Result(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

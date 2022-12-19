package com.yh.exception;

/**
 * date 2022/12/19
 *
 * @author yu
 */
public class SystemException extends RuntimeException{
    /**异常编号*/
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public SystemException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public SystemException(String message, Throwable cause, Integer code) {
        super(message, cause);
        this.code = code;
    }


}

package com.yh.controller;

import com.yh.exception.BusinessException;
import com.yh.exception.SystemException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * date 2022/12/19
 *
 * @author yu
 */
@RestControllerAdvice//处理rest风格的异常
public class ProjectExceptionAdvice {

    @ExceptionHandler(SystemException.class)//拦截异常
    public Result doSystemException(SystemException e) {
        //记录日志
        //发送消息给运维
        //发送邮件给开发
        return new Result(e.getCode(),null,e.getMessage());
    }

    @ExceptionHandler(BusinessException.class)//拦截异常
    public Result doBusinessException(BusinessException e) {
        //记录日志
        //发送消息给运维
        //发送邮件给开发 e对象给开发人员
        return new Result(e.getCode(), null, e.getMessage());
    }

    @ExceptionHandler(Exception.class)//拦截异常
    public Result doException(Exception e) {
        return new Result(Code.SYSTEM_UNKNOW_ERR, null, "系统繁忙，请稍后再试");
    }

}

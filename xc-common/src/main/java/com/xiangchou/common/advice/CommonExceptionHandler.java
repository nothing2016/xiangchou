package com.xiangchou.common.advice;

import com.xiangchou.common.exception.XcException;
import com.xiangchou.common.pojo.ExceptionResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 通用异常处理，对一切的Controller进行拦截
 * @author oudaming
 * @date 2019/6/12 0012 22:53
 */
@ControllerAdvice
public class CommonExceptionHandler {

    /**
     * 拦截处理一切的RuntimeException.class
     * @return
     */
    @ExceptionHandler(XcException.class)
    public ResponseEntity<ExceptionResult> handleException(XcException e){
        return ResponseEntity
                .status(e.getExceptionEnum().getCode())
                .body(new ExceptionResult(e.getExceptionEnum()));
    }
}

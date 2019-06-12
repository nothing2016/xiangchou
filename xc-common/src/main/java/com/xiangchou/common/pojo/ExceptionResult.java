package com.xiangchou.common.pojo;

import com.xiangchou.common.enums.ExceptionEnum;
import lombok.Data;

/**
 * @author oudaming
 * @date 2019/6/12 0012 23:59
 */
@Data
public class ExceptionResult {
    private int status;
    private String message;
    private long timeStamp;

    public ExceptionResult(ExceptionEnum exceptionEnum) {
        this.status = exceptionEnum.getCode();
        this.message = exceptionEnum.getMsg();
        this.timeStamp = System.currentTimeMillis();
    }
}

package com.xiangchou.common.exception;

import com.xiangchou.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author oudaming
 * @date 2019/6/12 0012 23:37
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class XcException extends RuntimeException{
    private ExceptionEnum exceptionEnum;
}

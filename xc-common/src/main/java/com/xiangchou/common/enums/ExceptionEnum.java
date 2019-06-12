package com.xiangchou.common.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * 异常的枚举类
 * @author oudaming
 * @date 2019/6/12 0012 23:41
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {

    BRAND_NOT_FOUND(404,"品牌没有找到!"),
    PRICE_NOT_BE_NULL(400,"价格不能为空!"),
    ;
    private int code;
    private String msg;
}

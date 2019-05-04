package com.example.demo;

import java.lang.annotation.*;

/**
 * Created by athena.li on 2019/4/13 22:32
 */
//自定义注解
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface OperateAnnotation {
    String key() default "123456";
}

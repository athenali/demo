package com.example.demo.proxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by athena.li on 2019/4/28 21:40
 */
public class MiShu implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.print("==========开始预约");
        Object invoke = methodProxy.invokeSuper(o, objects);
        return invoke;
    }
}

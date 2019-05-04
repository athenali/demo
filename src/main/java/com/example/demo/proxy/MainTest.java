package com.example.demo.proxy;

import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

/**
 * Created by athena.li on 2019/4/28 21:43
 */
public class MainTest {
    public static  void main(String[] args){
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(LaoZong.class);
        enhancer.setCallback(new MiShu());
       LaoZong laoZong=(LaoZong) enhancer.create();
       laoZong.say();
    }
}

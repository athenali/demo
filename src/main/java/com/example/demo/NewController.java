package com.example.demo;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by athena.li on 2019/3/24 14:24
 */
@RestController
public class NewController {
    private  static  final Logger logger=LoggerFactory.getLogger(NewController.class);
    @RequestMapping(value = "/test")
    public String test(){

        //测试提交
        return "hello word";
    }
}

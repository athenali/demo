package com.example.demo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by athena.li on 2019/4/25 23:34
 */

public class Person {
    @JSONField(ordinal = 1)
    private String name;
    @JSONField(ordinal = 4)
    private String age;
    @JSONField(ordinal = 3)
    private String sex;
    @JSONField(ordinal = 2)
    private String bag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Person(String name, String age, String sex, String bag) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.bag = bag;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBag() {
        return bag;
    }

    public void setBag(String bag) {
        this.bag = bag;
    }
}

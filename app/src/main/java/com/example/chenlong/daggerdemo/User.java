package com.example.chenlong.daggerdemo;

import javax.inject.Inject;

/**
 * Created by ChenLong on 2017/2/14.
 */

public class User
{
    String name;

    @Inject         //inject用在类的构造上 表示是一个依赖的提供者
    public User(){
        this.name="张三";
    }
}

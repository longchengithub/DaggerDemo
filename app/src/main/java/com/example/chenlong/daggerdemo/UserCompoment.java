package com.example.chenlong.daggerdemo;

import dagger.Component;

/**
 * Created by ChenLong on 2017/2/14.
 */

@Component  //component用作接口上,表面这个接口是一个"配送中心",连接了需要依赖的和提供依赖的两方
public interface UserCompoment
{
    void bind(MainActivity mainActivity);
}

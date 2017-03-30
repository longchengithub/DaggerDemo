package com.example.chenlong.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity
{
    @Inject     //inject使用在成员变量上 表示是一个注入,需要一个依赖的提供者
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserCompoment compoment=DaggerUserCompoment.create();   //@component用于接口上 由于链接依赖方与注入方
        compoment.bind(this);
        System.out.println(user.name);

    }
}

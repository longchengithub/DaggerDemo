package com.example.chenlong.daggerdemo2;

import dagger.Component;

/**
 * Created by ChenLong on 2017/2/14.
 */

@Component(modules = ClothModule.class)
public interface ClothComponent
{
    void bind(ClothActivity clothActivity);
}

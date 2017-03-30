package com.example.chenlong.daggerdemo2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ChenLong on 2017/2/14.
 */

@Module
public class ClothModule
{
    @Provides
    public Cloth getCloth()
    {
        Cloth cloth = new Cloth("红色", "23尺", 1);
        return cloth;
    }
}

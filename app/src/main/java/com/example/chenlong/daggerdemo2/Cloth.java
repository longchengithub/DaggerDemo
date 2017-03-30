package com.example.chenlong.daggerdemo2;

/**
 * Created by ChenLong on 2017/2/14.
 */

public class Cloth          //一个bean类用来被依赖
{
    private String color;   //颜色
    private String size;    //尺寸
    private int style;      //样式

    public Cloth()
    {
    }

    public Cloth(String color, String size, int style)
    {
        this.color = color;
        this.size = size;
        this.style = style;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public int getStyle()
    {
        return style;
    }

    public void setStyle(int style)
    {
        this.style = style;
    }

    @Override
    public String toString()
    {
        return "Cloth{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", style=" + style +
                '}';
    }
}

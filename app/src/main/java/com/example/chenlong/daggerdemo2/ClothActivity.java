package com.example.chenlong.daggerdemo2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.chenlong.daggerdemo.R;

import javax.inject.Inject;

public class ClothActivity extends AppCompatActivity
{

    @Inject
    Cloth mCloth;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloth);
        DaggerClothComponent clothComponent= (DaggerClothComponent) DaggerClothComponent.create();
        clothComponent.bind(this);

        TextView tv= (TextView) findViewById(R.id.dagger2_cloth);
        tv.setText(mCloth.toString());

    }

}

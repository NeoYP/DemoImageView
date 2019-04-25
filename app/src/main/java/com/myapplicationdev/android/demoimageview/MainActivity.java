package com.myapplicationdev.android.demoimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //Declare the ImageView object called ivDay2
    ImageView ivDay2;
    ImageView ivDay4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get the ImageView object and assign to ivDay2
        ivDay2 = findViewById(R.id.imageView2);
        //Set the image
        ivDay2.setImageResource(R.drawable.day2);
        //Get the ImageView object and assign to ivDay4
        ivDay4 = findViewById(R.id.imageView4);
        //Set the image
        ivDay4.setImageResource(R.drawable.day4);
    }
}

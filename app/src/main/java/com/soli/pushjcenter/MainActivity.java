package com.soli.pushjcenter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        LottieAnimationView view = new LottieAnimationView(this);

//        TestOne one = new TestOne();
//        one.thisMethodOne();

        ((SimpleDraweeView) findViewById(R.id.image)).setImageURI("https://s2.fa7.in/qn_2811f1fc7a5c474098176a1ab49da579_600_800_154260.0x0.jpg");
    }
}

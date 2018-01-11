package com.soli.pushjcenter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;
import com.soli.libone.test.TestOne;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LottieAnimationView view = new LottieAnimationView(this);

        TestOne one = new TestOne();
        one.thisMethodOne();
    }
}

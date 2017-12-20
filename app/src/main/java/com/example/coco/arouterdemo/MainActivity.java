package com.example.coco.arouterdemo;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SystemClock.sleep(2000);
        ARouter.getInstance().build("/coco/bactivity")
                .withString("name", "coco")
                .withInt("age",19)
                .navigation();
    }
}

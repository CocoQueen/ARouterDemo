package com.example.coco.arouterdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/coco/bactivity")
public class BActivity extends AppCompatActivity {
    @Autowired
    public String name;
    @Autowired
    public int age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        ARouter.getInstance().inject(this);
        Toast.makeText(this, name + "   " + age, Toast.LENGTH_SHORT).show();
    }
}

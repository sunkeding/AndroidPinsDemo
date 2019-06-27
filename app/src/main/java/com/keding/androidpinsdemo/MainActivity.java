package com.keding.androidpinsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sunkeding.businessa.BusinessAUtil;
import com.sunkeding.businessb.BusinessBUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BusinessAUtil.log();
        BusinessBUtil.log();
    }
}

package com.android.usingintent;

import android.app.Activity;
import android.os.Bundle;

public class SecondActivity extends Activity{

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}

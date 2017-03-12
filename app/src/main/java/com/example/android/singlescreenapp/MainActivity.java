package com.example.android.singlescreenapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        TextView addressMap = (TextView) findViewById(R.id.directions);
        addressMap.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

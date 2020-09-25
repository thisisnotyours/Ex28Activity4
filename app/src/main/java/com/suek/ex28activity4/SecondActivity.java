package com.suek.ex28activity4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setTitle("Second Activity");   //참조변수 getSupportActionBar() 없이 씀

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);  왜 뒤로가기 안됨???
    }
}

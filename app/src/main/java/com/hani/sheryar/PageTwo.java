package com.hani.sheryar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by faizan on 10/26/16.
 */
public class PageTwo extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_two);
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        Intent intent = getIntent();
        String intentText = intent.getExtras().getString("etText");
        tv2.setText(intentText);
    }
}

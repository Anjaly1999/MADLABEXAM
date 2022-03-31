package com.example.sjcet.myapplication;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tv,tv1,tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=findViewById(R.id.tv);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        SharedPreferences mypref=getSharedPreferences(activity_main.xml,0);
        String str= mypref.getString(fname, "NULL");
        String str1=mypref.getString(surname,"NULL");
        String str2= mypref.getString(email, "NULL");
        String str3= mypref.getString(password,"NULL");
        tv.setText(str);
        tv1.setText(str1);
        tv2.setText(str2);
        tv3.setText(str3);
    }
}

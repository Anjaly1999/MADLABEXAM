package com.example.sjcet.myapplication;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    Button btn;
    CheckBox checkBox,checkBox2,checkBox3;
    RadioButton radioButton,radioButton2,radioButton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        ed3=findViewById(R.id.ed3);
        ed4=findViewById(R.id.ed4);
        btn=findViewById(R.id.btn);
        checkBox=findViewById(R.id.checkBox);
        checkBox2=findViewById(R.id.checkBox2);
        checkBox=findViewById(R.id.checkBox3);
        SharedPreferences mypref=getSharedPreferences( activity_main2,0);
        SharedPreferences edit editor =mypref.edit();
        editor.getString(,ed1.getText().toString());
        editor.getString(ed2.getText().toString());
        editor.getString(ed3.getText().toString());
        editor.getString(ed4.getText().toString());
        Button btn=findViewById(R.id.btn);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Click(View view) {
        String itemname=getApplicationInfo(i).toString();
        Toast.makeText(this, "itemname", Toast.LENGTH_SHORT).show();
    }
}

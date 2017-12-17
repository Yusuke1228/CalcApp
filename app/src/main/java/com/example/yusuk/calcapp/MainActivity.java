package com.example.yusuk.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // 変数の定義
    EditText mEditText1;
    EditText mEditText2;
    String str1;
    String str2;
    Double dbl1;
    Double dbl2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, SecondActivity.class);

        // String型に変換した後、Double型に変換する
        str1 = mEditText1.getText().toString();
        str2 = mEditText2.getText().toString();

        dbl1 = Double.parseDouble(str1);
        dbl2 = Double.parseDouble(str2);

        if (v.getId() == R.id.button1){

            // 足し算の時
            intent.putExtra("VALUE", dbl1 + dbl2);

        }else if (v.getId() == R.id.button2){

            // 引き算の時
            intent.putExtra("VALUE", dbl1 - dbl2);

        }else if (v.getId() == R.id.button3){

            // 掛け算の時
            intent.putExtra("VALUE", dbl1 * dbl2);

        }else if (v.getId() == R.id.button4){

            // 割り算の時
            intent.putExtra("VALUE", dbl1 / dbl2);

        }
        startActivity(intent);
    }
}
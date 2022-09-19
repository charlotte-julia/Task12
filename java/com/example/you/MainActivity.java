package com.example.you;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.*;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    public TextView tvOut;
    private Button btnOk;
    private Button btnCancel;

    private static final String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
/*
        // Нахождение View-элементов
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        //создаем обработчик
        OnClickListener oclBtn = new OnClickListener() {
            @Override
            public void onClick(View v) {
         //  по id определеяем кнопку, вызвавшую этот обработчик
                switch (v.getId()){
                    case R.id.btnOk:
                        tvOut.setText("Нажата кнопка Ok");
                        break;
                    case R.id.btnCancel:
                        tvOut.setText("Нажата кнопка Cancel");
                        break;
                }
            }
        };
        btnCancel.setOnClickListener(oclBtn);
        btnOk.setOnClickListener(oclBtn);*/

        Log.d(TAG,"View-элементы");
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk= (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        Log.d(TAG,"присваиваем обработчик кнопкам");
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }
//Обработчик активити
    @Override
    public void onClick(View v){
        Log.d(TAG,"по id определяем кнопку, вызвавшую этот обработчик");
        switch (v.getId()){
            case R.id.btnOk:
                Log.d(TAG,"кнопка ОK");
                tvOut.setText("Нажата кнопка ок");
                Toast.makeText(this,"Нажата кнопка OK",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnCancel:
                Log.d(TAG,"кнопка Cancel");
                tvOut.setText("Нажата кнопка Cancel");
                Toast.makeText(this,"Нажата кнопка Cancel",Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
package com.emo.javacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText sayi1text;
    EditText sayi2text;
    TextView sonuctext;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sayi1text=findViewById(R.id.sayi1);
        sayi2text=findViewById(R.id.sayi2);
        sonuctext=findViewById(R.id.sonuc);

    }
    public void toplam(View view){
        if (sayi1text.getText().toString().matches("")||sayi2text.getText().toString().matches("")){
            sonuctext.setText("Enter Number!!!");
        }
        else{
            int number1= Integer.parseInt(sayi1text.getText().toString());
            int number2=Integer.parseInt(sayi2text.getText().toString());
            int result=number1+number2;
            sonuctext.setText("Result: "+result);
        }


    }
    public void cik(View view){
        if (sayi1text.getText().toString().matches("")||sayi2text.getText().toString().matches("")){
            sonuctext.setText("Enter Number!!!");
        }
        else{
            int number1= Integer.parseInt(sayi1text.getText().toString());
            int number2=Integer.parseInt(sayi2text.getText().toString());
            int result=number1-number2;
            sonuctext.setText("Result: "+result);
        }


    }
    public void carp(View view){
        if (sayi1text.getText().toString().matches("")||sayi2text.getText().toString().matches("")){
            sonuctext.setText("Enter Number!!!");
        }
        else{
            int number1= Integer.parseInt(sayi1text.getText().toString());
            int number2=Integer.parseInt(sayi2text.getText().toString());
            int result=number1*number2;
            sonuctext.setText("Result: "+result);
        }


    }
    public void bol(View view){
        if (sayi1text.getText().toString().matches("")||sayi2text.getText().toString().matches("")){
            sonuctext.setText("Enter Number!!!");
        }
        else{
            int number1= Integer.parseInt(sayi1text.getText().toString());
            int number2=Integer.parseInt(sayi2text.getText().toString());
            int result=number1/number2;
            sonuctext.setText("Result: "+result);
        }


    }

}
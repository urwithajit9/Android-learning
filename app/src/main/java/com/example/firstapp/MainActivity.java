package com.example.firstapp;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Integer number1, number2;
    EditText result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addition = findViewById(R.id.add);
        Button sub = findViewById(R.id.sub);
        Button multi = findViewById(R.id.multiply);
        Button div   = findViewById(R.id.divide);
        result = findViewById(R.id.result);


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                get_input();
                subtract(number1, number2);
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                get_input();
                multiply(number1, number2);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                get_input();
                divide(number1, number2);
            }
        });

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                get_input();
                add(number1, number2);


            }
        });
    }


    public void get_input(){
        EditText input1 = findViewById(R.id.number1);
        EditText input2 = findViewById(R.id.number2);
        Editable num1_temp = input1.getText();
        Editable num2_temp = input2.getText();

        if(num1_temp.length() > 0 && num2_temp.length() >0){
            number1 = Integer.valueOf(num1_temp.toString());
            number2 = Integer.valueOf(num2_temp.toString());
        } else
        {
            if (num1_temp.length() == 0)   {
                input1.setError("Please Enter a valid number.");
            }

            if (num2_temp.length() == 0)   {
                input2.setError("Please Enter a valid number.");
            }
        }
    }
    public void add(Integer num1, Integer num2){
        result.setText(String.valueOf(num1+num2));
    }

    public void subtract(Integer num1, Integer num2){
        result.setText(String.valueOf(num1-num2));
    }

    public void multiply(Integer num1, Integer num2){
        result.setText(String.valueOf(num1*num2));
    }
    public void divide(Integer num1, Integer num2){
        result.setText(String.valueOf(num1/num2));
    }

}
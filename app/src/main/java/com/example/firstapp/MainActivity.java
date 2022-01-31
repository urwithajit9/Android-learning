package com.example.firstapp;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sum = findViewById(R.id.add);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText number1 = findViewById(R.id.number1);
                EditText number2 = findViewById(R.id.number2);
                Editable num1_temp = number1.getText();
                Editable num2_temp = number2.getText();

                if(num1_temp.length() > 0 && num2_temp.length() >0){
                    add(Integer.valueOf(num1_temp.toString()), Integer.valueOf(num2_temp.toString()));
                }
                else
                {
                 if (num1_temp.length() == 0)   {
                     number1.setError("Please Enter a valid number.");
                 }

                    if (num2_temp.length() == 0)   {
                        number2.setError("Please Enter a valid number.");
                    }
                }


            }
        });
    }

    public void add(Integer num1, Integer num2){
        EditText result = findViewById(R.id.result);
        result.setText(String.valueOf(num1+num2));
    }
}
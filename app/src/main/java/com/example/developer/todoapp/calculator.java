package com.example.developer.todoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

    public class calculator extends AppCompatActivity {

        EditText e1, e2;
        TextView res;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_calculator);
            e1 = findViewById(R.id.number1);
            e2 = findViewById(R.id.number2);
            res =findViewById(R.id.result);
        }

        public void sum(View view) {
            int num1 = Integer.parseInt(e1.getText().toString());
            int num2 = Integer.parseInt(e2.getText().toString());
            int sum = num1 + num2;
            res.setText(Integer.toString(sum));
        }
    }

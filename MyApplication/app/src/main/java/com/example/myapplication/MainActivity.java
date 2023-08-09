package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView inputName;
    private TextView inputEmail;
    private TextView inputNumber1;
    private TextView inputNumber2;
    private Button calculateButton;
    private Button showButton;
    private Double media;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputName = findViewById(R.id.inputName);
        inputEmail = findViewById(R.id.inputEmail);
        inputNumber1 = findViewById(R.id.inputNumber1);
        inputNumber2 = findViewById(R.id.inputNumber2);

        calculateButton = findViewById(R.id.calculateButton);
        showButton = findViewById(R.id.showButton);

        result = findViewById(R.id.result);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                media = (Double.parseDouble(inputNumber1.getText().toString()) + Double.parseDouble(inputNumber2.getText().toString())) / 2;
            }
        });

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(media.toString());
            }
        });
    }
}
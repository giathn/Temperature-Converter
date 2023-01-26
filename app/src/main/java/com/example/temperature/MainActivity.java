package com.example.temperature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    EditText inputText;
    TextView displayText;
    Button buttonF;
    Button buttonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.inputText);
        displayText = findViewById(R.id.displayText);
        buttonC = findViewById(R.id.buttonC);
        buttonF = findViewById(R.id.buttonF);



        buttonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = inputText.getText().toString();
                double n = Double.parseDouble(s);
                displayText.setText(n + " Celsius is " +  (n * (9.0/5) + 32) + " Fahreinheit ");
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = inputText.getText().toString();
                double n = Double.parseDouble(s);
                displayText.setText(n + " Fahrenheit is " +  (n-32) * (5.0/9) + " Celsius ");
            }
        });

    }
}
package com.example.group7andoirdcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText input1;
    EditText input2;
    TextView tview;
    Button btnplus;
    Button btnminus;
    Button btnpmul;
    Button btnpdiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        tview = findViewById(R.id.textView1);
        btnplus = findViewById(R.id.buttonPlus);
        btnminus = findViewById(R.id.buttonMinus);
        btnpmul = findViewById(R.id.buttonMul);
        btnpdiv = findViewById(R.id.buttonDiv);



        btnplus.setOnClickListener(v -> {
            clear(tview);
            double num1 = Double.parseDouble(input1.getText().toString());
            double num2 = Double.parseDouble(input2.getText().toString());
            double result = add(num1,num2);
            tview.setText(Double.toString(result));
        });

        btnminus.setOnClickListener(v -> {
            clear(tview);
            double num1 = Double.parseDouble(input1.getText().toString());
            double num2 = Double.parseDouble(input2.getText().toString());
            double result = minus(num1,num2);
            tview.setText(Double.toString(result));
        });

        btnpmul.setOnClickListener(v -> {
            clear(tview);
            double num1 = Double.parseDouble(input1.getText().toString());
            double num2 = Double.parseDouble(input2.getText().toString());
            double result = mul(num1,num2);
            tview.setText(Double.toString(result));
        });

        btnpdiv.setOnClickListener(v -> {
            clear(tview);
            double num1 = Double.parseDouble(input1.getText().toString());
            double num2 = Double.parseDouble(input2.getText().toString());
            double result = div(num1,num2);
            tview.setText(Double.toString(result));
        });
    }

    void clear (TextView txtview) {
        txtview.setText("");
    }

    double add(double input1,double input2) {
        return input1 + input2;
    }
    double minus(double input1,double input2) {
        return input1 - input2;
    }
    double mul(double input1,double input2) {
        return input1 * input2;
    }
    double div(double input1,double input2) {
        return input1 / input2;
    }
}
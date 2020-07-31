package com.ismailvardien.profitcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity {
    EditText rev, exp;
    TextView tvResult;
    TextView tvResult2;
    Button btnRunFormula, btnCalculatorBack;
    int  revenue, expenses, result, profit;
    float result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        rev = findViewById(R.id.et_height);
        exp = findViewById(R.id.et_width);
        tvResult = findViewById(R.id.tv_calculation_result);
        tvResult2 = findViewById(R.id.tv_calculation_result2);
        btnCalculatorBack = findViewById(R.id.btn_calculator_back_menu);
        btnRunFormula = findViewById(R.id.btn_run_formula);

        btnRunFormula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rev.getText().toString().isEmpty()||
                        exp.getText().toString().isEmpty()) {
                    if (rev.getText().toString().isEmpty()) {
                        rev.setError("Enter value");
                    }



                } else {
                    revenue = Integer.parseInt(rev.getText().toString());
                    expenses = Integer.parseInt(exp.getText().toString());

                    result = revenue - expenses;

                    tvResult.setText(String.valueOf(result));
                    profit = Integer.parseInt(tvResult.getText().toString());

                    result2 = (profit / revenue) * 100;

                    tvResult2.setText(String.valueOf(result2));
                }
            }
        });

        btnCalculatorBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Calculator.this, MenuScreen.class);
                startActivity(intent);
            }
        });
    }

}

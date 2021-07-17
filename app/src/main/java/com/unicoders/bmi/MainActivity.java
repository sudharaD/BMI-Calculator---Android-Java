package com.unicoders.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button calculate;
    EditText weight, height;
    TextView result1, result2;

    float w, h, r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculate=findViewById(R.id.btnCal);
        weight=findViewById(R.id.weight);
        height=findViewById(R.id.height);
        result1=findViewById(R.id.result1);
        result2=findViewById(R.id.result2);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                w = Float.parseFloat(weight.getText().toString());
                h = Float.parseFloat(height.getText().toString());

                r1 = w/((h*h)/10000);

                if(r1 >= 25) {
                    result2.setText("Fat");
                } else if(r1 >= 18) {
                    result2.setText("Average");
                } else {
                    result2.setText("Thin");
                }

                result1.setText(String.valueOf(r1));

            }
        });

    }
}
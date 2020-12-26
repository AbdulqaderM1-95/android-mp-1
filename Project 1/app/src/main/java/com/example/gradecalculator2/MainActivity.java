package com.example.gradecalculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText n1 ;
    private EditText n2 ;
    private EditText n3 ;
    private EditText n4 ;
    private TextView t1 ;
    private Button b1 ;
    private Button b2 ;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            n1 =  findViewById(R.id.quiz) ;
            n2 = findViewById(R.id.homework) ;
            n3 = findViewById(R.id.midterm) ;
            n4 = findViewById(R.id.finals) ;
            t1 = findViewById(R.id.res) ;
            b1 = findViewById(R.id.Calcu) ;
            b2 = findViewById(R.id.reset) ;

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (n1.getText().toString().length() == 0) {
                        n1.setText("0");
                    }
                    if (n2.getText().toString().length() == 0) {
                        n2.setText("0");
                    }
                    if (n3.getText().toString().length() == 0) {
                        n3.setText("0");
                    }
                    if (n4.getText().toString().length() == 0) {
                        n4.setText("0");
                    }

                    int num1 = Integer.parseInt(n1.getText().toString()) ;
                    int num2 = Integer.parseInt(n2.getText().toString()) ;
                    int num3 = Integer.parseInt(n3.getText().toString()) ;
                    int num4 = Integer.parseInt(n4.getText().toString()) ;

                    int sum = num1+num2+num3+num4 ;
                    t1.setText(String.valueOf(sum)) ;
                    if (sum >= 90) t1.setText("A") ;
                    else if (sum >= 80) t1.setText("B");
                    else if (sum >= 70) t1.setText("C");
                    else if (sum >= 60) t1.setText("D");
                    else if (sum >= 50) t1.setText("F");
                    if (sum >= 90) t1.setTextColor(Color.GREEN) ;
                    else if (sum >= 80) t1.setTextColor(Color.MAGENTA);
                    else if (sum >= 70) t1.setTextColor(Color.BLUE);
                    else if (sum >= 60) t1.setTextColor(Color.BLACK);
                    else if (sum >= 50) t1.setTextColor(Color.RED);


                }
            });
            // reset button
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) { if (t1.getText().equals(90)) {t1.setText("A");}

                    n1.setText(null) ;
                    n1.dispatchDisplayHint(View.VISIBLE);
                    n2.setText(null) ;
                    n2.dispatchDisplayHint(View.VISIBLE);
                    n3.setText(null) ;
                    n3.dispatchDisplayHint(View.VISIBLE);
                    n4.setText(null) ;
                    n4.dispatchDisplayHint(View.VISIBLE);

                    t1.setText("Result");
                    t1.setTextColor(Color.RED);
                }
            });

    }
    }
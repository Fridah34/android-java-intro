package com.example.sample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText ednum1;
    EditText ednum2;
    Button btnAdd;
    TextView txtresults;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                    Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                    return insets;
                });

            ednum1=(EditText)findViewById(R.id.ednum1);
            ednum2=(EditText)findViewById(R.id.ednum2);
            btnAdd=(Button) findViewById(R.id.btnAdd);
            txtresults=(TextView) findViewById(R.id.txtresults);
            btnAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    double num1=Double.parseDouble(ednum1.getText().toString());
                    double num2=Double.parseDouble(ednum2.getText().toString());
                    double sum=num1+num2;
                    txtresults.setText(Double.toString(sum));


                }
            });
        }
    }

package com.example.dummy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText input;
Button genrate, clear;
TextView fact, square;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        genrate = findViewById(R.id.genrate);
        clear = findViewById(R.id.clear);
        fact = findViewById(R.id.fact_output);
        square = findViewById(R.id.square_out);
        input = findViewById(R.id.input_box);
    genrate.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if( input.getText() != null)
            {
                String value= input.getText().toString();
                int num =Integer.parseInt(value);
                int f = 1, i;
                for(i = num; i>1; i--)
                {
                    f *=i;
                }
                fact.setText("Factorial : "+f);
                square.setText("Square : "+num*num);
            }
        }
    });
    clear.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            square.setText("");
            fact.setText("");
            input.setText("");
        }
    });
    }

}

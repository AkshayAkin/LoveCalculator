package com.example.lovecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText uName, lName;
        uName = (EditText) findViewById(R.id.name);
        lName = (EditText) findViewById(R.id.love);

        Button calcButton;
        calcButton = (Button) findViewById(R.id.calculate_button);

        final TextView result;
        result = (TextView) findViewById(R.id.result_text);

        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rNumber = new Random();
                int number = rNumber.nextInt(100);

                result.setText(uName.getText() + " and " + lName.getText() + " are " + number + "% compatible.");


            }
        });


    }
}

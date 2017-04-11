package com.example.csaper6.radionumberselecterwheelapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioButton correct;
    private NumberPicker first;
    private NumberPicker second;
    private NumberPicker third;
    private Button checkSolution;
    private RadioButton wrong1;
    private RadioButton wrong2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        correct = (RadioButton) findViewById(R.id.correct_button);
        first = (NumberPicker) findViewById(R.id.first_number);
        second = (NumberPicker) findViewById(R.id.second_number);
        third = (NumberPicker) findViewById(R.id.third_number);
        checkSolution = (Button) findViewById(R.id.check_button);
        wrong1 = (RadioButton) findViewById(R.id.wrongButton1);
        wrong2 = (RadioButton) findViewById(R.id.wrongButton2);

        first.setEnabled(false);
        second.setEnabled(false);
        third.setEnabled(false);
        checkSolution.setEnabled(false);
        first.setVisibility(View.INVISIBLE);
        second.setVisibility(View.INVISIBLE);
        third.setVisibility(View.INVISIBLE);
        checkSolution.setVisibility(View.INVISIBLE);

        first.setMaxValue(9);
        first.setMinValue(0);
        second.setMaxValue(9);
        second.setMinValue(0);
        third.setMaxValue(9);
        third.setMinValue(0);

        correct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first.setEnabled(true);
                second.setEnabled(true);
                third.setEnabled(true);
                checkSolution.setEnabled(true);
                first.setVisibility(View.VISIBLE);
                second.setVisibility(View.VISIBLE);
                third.setVisibility(View.VISIBLE);
                checkSolution.setVisibility(View.VISIBLE);
            }
        });

        wrong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first.setEnabled(false);
                second.setEnabled(false);
                third.setEnabled(false);
                checkSolution.setEnabled(false);
                first.setVisibility(View.INVISIBLE);
                second.setVisibility(View.INVISIBLE);
                third.setVisibility(View.INVISIBLE);
                checkSolution.setVisibility(View.INVISIBLE);
            }
        });

        wrong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first.setEnabled(false);
                second.setEnabled(false);
                third.setEnabled(false);
                checkSolution.setEnabled(false);
                first.setVisibility(View.INVISIBLE);
                second.setVisibility(View.INVISIBLE);
                third.setVisibility(View.INVISIBLE);
                checkSolution.setVisibility(View.INVISIBLE);
            }
        });

        checkSolution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check();
            }
        });

    }

    private void check() {
        if (first.getValue() == 4 && second.getValue() == 1 && third.getValue() == 7){
            Toast.makeText(MainActivity.this, "Right", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
        }
    }
}

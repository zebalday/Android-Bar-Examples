package com.asignatura.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    Button Add5, Add10, Add20, Reset;
    ProgressBar PB1;
    Intent skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // DECLARED BUTTONS
        Add5 = (Button) findViewById(R.id.btnAdd5);
        Add10 = (Button) findViewById(R.id.btnAdd10);
        Add20 = (Button) findViewById(R.id.btnAdd20);
        Reset = (Button) findViewById(R.id.btnReset);
        PB1 = (ProgressBar) findViewById(R.id.PBHorizontal);

        // EVENTS
        Add5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int progress1  = PB1.getProgress();
                PB1.setProgress(progress1 + 5);
            }
        });

        Add10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int progress1  = PB1.getProgress();
                PB1.setProgress(progress1 + 10);
            }
        });

        Add20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int progress1  = PB1.getProgress();
                PB1.setProgress(progress1 + 20);
            }
        });

        Reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                PB1.setProgress(0);
            }
        });
    }

    // SKIP ACTIVITY
    public void SkipActivity(View view){
        skip = new Intent(this, SeekBarActivity.class);
        startActivity(skip);
    }


}
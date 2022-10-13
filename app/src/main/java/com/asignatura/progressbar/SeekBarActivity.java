package com.asignatura.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekBarActivity extends AppCompatActivity {

    TextView info1, info2;
    SeekBar SB1, SB2;
    Button reset;
    Intent back, skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);

        // DECLARED SEEKBARS
        SB1 = (SeekBar) findViewById(R.id.SB1);
        SB2 = (SeekBar) findViewById(R.id.SB2);

        // MAX PROGRESS VALUE
        SB1.setMax(100);
        SB2.setMax(10);

        // DECLARED INFO VALUES
        info1 = (TextView) findViewById(R.id.info1);
        info2 = (TextView) findViewById(R.id.info2);
        info1.setText(String.valueOf(SB1.getProgress()));
        info2.setText(String.valueOf(SB2.getProgress()));

        // DECLARED BUTTON
        reset = (Button) findViewById(R.id.btnReset);

        // SEEKBAR 1 CHANGE VALUE EVENT
        SB1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                info1.setText(String.valueOf(seekBar.getProgress())+"%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        // SEEKBAR 2 CHANGE VALUE EVENT
        SB2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                info2.setText(String.valueOf(seekBar.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SB1.setProgress(0);
                SB2.setProgress(0);
            }
        });

    }

    public void backActivity(View view){
        back = new Intent(this, MainActivity.class);
        startActivity(back);
    }

    public void skipActivity(View view){
        skip = new Intent(this, RatingBarActivity.class);
        startActivity(skip);
    }
}
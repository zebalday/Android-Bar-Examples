package com.asignatura.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class RatingBarActivity extends AppCompatActivity {

    RatingBar RB1;
    TextView info1;
    Button reset;
    Intent back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);

        // DECLARED RATING BAR
        RB1 = (RatingBar) findViewById(R.id.RB1);

        // DECLARED TEXTVIEW
        info1 = (TextView) findViewById(R.id.rate_info);
        info1.setText(String.valueOf(RB1.getRating())+"\nStars ranked");

        // RATING CHANGED EVENT
        RB1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                info1.setText(String.valueOf(ratingBar.getRating())+"\nStars ranked");
            }
        });

        // DECLARED RESET BUTTON & EVENT
        reset = (Button) findViewById(R.id.btnReset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RB1.setProgress(0);
            }
        });


    }

    public void backActivity(View view){
        back = new Intent(this, SeekBarActivity.class);
        startActivity(back);
    }
}
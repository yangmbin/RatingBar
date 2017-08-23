package com.ymb.ratingbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ymb.ratingbar_lib.RatingBar;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RatingBar ratingView;

    private Button buttonRating, buttonIndicator;

    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingView = (RatingBar) findViewById(R.id.ratingView);

        buttonIndicator = (Button) findViewById(R.id.buttonIndicator);
        buttonRating = (Button) findViewById(R.id.buttonRating);

        buttonIndicator.setOnClickListener(this);
        buttonRating.setOnClickListener(this);

        ratingView.setOnRatingChangedListener(new RatingBar.OnRatingChangedListener() {
            @Override
            public void onRatingChange(float oldRating, float newRating) {
                ToastUtils.text(MainActivity.this, "Old rating = " + oldRating + "; New rating = " + newRating);
            }
        });

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonIndicator:
                ratingView.setIsIndicator(!ratingView.isIndicator());
                break;
            case R.id.buttonRating:
                ratingView.setRating(random.nextFloat() * ratingView.getMaxCount());
                break;
        }
    }
}

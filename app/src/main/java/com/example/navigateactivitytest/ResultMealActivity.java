package com.example.navigateactivitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultMealActivity extends AppCompatActivity {

    TextView kcalTextView;
    TextView weightTextView;
    TextView fatTextView;
    TextView muscleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_meal);

        Intent intent = getIntent();

        kcalTextView = (TextView)findViewById(R.id.kcalFood);
        weightTextView = (TextView)findViewById(R.id.weightTextID);
        fatTextView = (TextView)findViewById(R.id.fatTextID);
        muscleTextView = (TextView)findViewById(R.id.muscleTextID);

        kcalTextView.setText("현재 당신이 먹은 칼로리: " + intent.getStringExtra("kcal"));
        weightTextView.setText("현재 당신의 몸무게: " + intent.getStringExtra("kg"));
        fatTextView.setText("현재 당신의 지방: " + intent.getStringExtra("fat"));
        muscleTextView.setText("현재 당신의 근육량: " + intent.getStringExtra("muscle"));
    }

}

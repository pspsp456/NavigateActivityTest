package com.example.navigateactivitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MealManagerActivity extends AppCompatActivity {

    EditText kcalText;
    EditText kgText;
    EditText fatText;
    EditText muscleText;

    Button kcalButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_manager);

        kcalText = (EditText) findViewById(R.id.foodKcal);
        kgText = (EditText) findViewById(R.id.kgTextID);
        fatText = (EditText) findViewById(R.id.fatTextID);
        muscleText = (EditText) findViewById(R.id.muscleTextID);

        kcalButton = (Button) findViewById(R.id.kcalButton);
    }

    public void kcalOnClick(View v) {
        Intent mealManager = new Intent(MealManagerActivity.this, ResultMealActivity.class);

        Log.d(kcalText.getText().toString(), "값이 어떻게 나오니?");
        mealManager.putExtra("kcal", kcalText.getText().toString());
        mealManager.putExtra("kg", kgText.getText().toString());
        mealManager.putExtra("fat", fatText.getText().toString());
        mealManager.putExtra("muscle", muscleText.getText().toString());

        MealManagerActivity.this.startActivity(mealManager);
    }

    public void mealReportOnClick(View v)
    {
        /*Intent mainIntent = new Intent(MealManagerActivity.this, RelativeLayout.class);
        MealManagerActivity.this.startActivity(mainIntent);*/
    }
}

package com.example.shoroukramzi.rowing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openTraining(View view) {
        Intent i = new Intent(this, Training.class);
        startActivity(i);
    }
    public void openAccount(View view) {
        Intent i = new Intent(this, MyAccount.class);
        startActivity(i);
    }
    public void openWorkouts(View view) {
        Intent i = new Intent(this, Workouts.class);
        startActivity(i);
    }
    public void openCompetition(View view) {
        Intent i = new Intent(this, Competition.class);
        startActivity(i);
    }

    public void openNews(View view) {
        Intent i = new Intent(this, News.class);
        startActivity(i);

    }
    public void openFeeds(View view) {
        Intent i = new Intent(this, Feeds.class);
        startActivity(i);
    }
}

package com.example.android.rugbyscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeam1 = 0;
    int scoreTeam2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays Team 1 Score.
     */
    public void displayTeam1 (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team1score);
        scoreView.setText(String.valueOf(score));
    }
    public void add5pointsTeam1 (View view){
        scoreTeam1 = scoreTeam1 + 5;
        displayTeam1(scoreTeam1);
    }
    public void add3pointsTeam1 (View view){
        scoreTeam1 = scoreTeam1 + 3;
        displayTeam1(scoreTeam1);
    }
    public void add2pointsTeam1 (View view){
        scoreTeam1 = scoreTeam1 + 2;
        displayTeam1(scoreTeam1);
    }
    /**
     * Displays Team 2 Score.
     */
    public void displayTeam2 (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team2score);
        scoreView.setText(String.valueOf(score));
    }
    public void add5pointsTeam2 (View view){
        scoreTeam2 = scoreTeam2 + 5;
        displayTeam2(scoreTeam2);
    }
    public void add3pointsTeam2 (View view){
        scoreTeam2 = scoreTeam2 + 3;
        displayTeam2(scoreTeam2);
    }
    public void add2pointsTeam2 (View view){
        scoreTeam2 = scoreTeam2 + 2;
        displayTeam2(scoreTeam2);
    }
    /**
     * Reset Scores.
     */
    public void reset (View view){
        scoreTeam1 = 0;
        scoreTeam2 = 0;
        displayTeam1(scoreTeam1);
        displayTeam2(scoreTeam2);
    }
}

package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // tracks the score for tem A
    int scoreTeamA = 0 ;
    // tracks the score for tem B
    int scoreTeamB = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(8);
    }
    /**
     * Increase the score for Team A by three points.
     */
    public void addThreeForTeamA(View v){
        scoreTeamA = scoreTeamA + 3 ;
        displayForTeamA (scoreTeamA);
    }
    /**
     * Increase the score for Team A by two points.
     */
    public void addTwoForTeamA(View v){
        scoreTeamA = scoreTeamA + 2 ;
        displayForTeamA (scoreTeamA);
    }
    /**
     * Increase the score for Team A by one point.
     */
    public void addOneForTeamA(View v){
        scoreTeamA = scoreTeamA + 1 ;
        displayForTeamA (scoreTeamA);
    }


    /**
     * Increase the score for Team B by three points.
     */
    public void addThreeForTeamB(View v){
        scoreTeamB = scoreTeamB + 3 ;
        displayForTeamB (scoreTeamB);
    }
    /**
     * Increase the score for Team B by two points.
     */
    public void addTwoForTeamB(View v){
        scoreTeamA = scoreTeamA + 2 ;
        displayForTeamB (scoreTeamA);
    }
    /**
     * Increase the score for Team B by one point.
     */
    public void addOneForTeamB(View v){
        scoreTeamB = scoreTeamB + 1 ;
        displayForTeamB (scoreTeamB);
    }
    /**
     * RESETS Scores
     */
    public void resetScore (View v){
       scoreTeamA = 0;
       scoreTeamB = 0;
       displayForTeamA(scoreTeamA);
       displayForTeamB(scoreTeamB);
    }



    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}

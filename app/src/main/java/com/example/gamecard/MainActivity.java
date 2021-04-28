package com.example.gamecard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int TotalTeamScoreA=0;
    int TotalTeamScoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /* Add 3 points to Team A*/
    public void AddThreePoints(View v){
        TotalTeamScoreA=TotalTeamScoreA+3;
        displayscore(TotalTeamScoreA);
    }
    /* Add 3 points to Team B*/
    public void AddThreePointsB(View v){
        TotalTeamScoreB=TotalTeamScoreB+3;
        displayscoreB(TotalTeamScoreB);
    }
    /* Add 2 points to Team A*/
    public void AddTwoPoints(View v){
        TotalTeamScoreA=TotalTeamScoreA+2;
        displayscore(TotalTeamScoreA);
    }
    /* Add 3 points to Team B*/
    public void AddTwoPointsB(View v){
        TotalTeamScoreB=TotalTeamScoreB+2;
        displayscoreB(TotalTeamScoreB);
    }
    /* Add 1 points to Team A*/
    public void AddOnePoints(View v){
        TotalTeamScoreA=TotalTeamScoreA+1;
        displayscore(TotalTeamScoreA);
    }
    /* Add 1 points to Team B*/
    public void AddOnePointsB(View v){
        TotalTeamScoreB=TotalTeamScoreB+1;
        displayscoreB(TotalTeamScoreB);
    }
   public void displayscore(int score){
        TextView displayScore= findViewById(R.id.score_update);
        displayScore.setText(String.valueOf(score));
    }
    public void displayscoreB(int score){
        TextView displayScoreB= findViewById(R.id.score_updateTeamB);
        displayScoreB.setText(String.valueOf(score));
    }
}
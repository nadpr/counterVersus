package com.example.android.counterversus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threePointA(View v){
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }
    public void twoPointA(View v){
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }
    public void onePointA(View v){
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }
    public void threePointB(View v){
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }
    public void twoPointB(View v){
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }
    public void onePointB(View v){
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }
    public void resetPoint(View v){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

    /**
     * Displays the given score for Team.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.teamAscore);
        scoreView.setText(String.valueOf(scoreA));
    }
    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.teamBscore);
        scoreView.setText(String.valueOf(scoreB));
    }

}

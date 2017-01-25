package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreOfA = 0;
    int scoreOfB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Aincrement2(View view){
        scoreOfA+=2;
        displayforTeamA(scoreOfA);
    }

    public void Aincrement3(View view){
        scoreOfA+=3;
        displayforTeamA(scoreOfA);
    }

    public void Afreethrow(View view){
        scoreOfA++;
        displayforTeamA(scoreOfA);
    }

    public void Bincrement2(View view){
        scoreOfB+=2;
        displayforTeamB(scoreOfB);
    }

    public void Bincrement3(View view){
        scoreOfB+=3;
        displayforTeamB(scoreOfB);
    }

    public void Bfreethrow(View view){
        scoreOfB++;
        displayforTeamB(scoreOfB);
    }

    /** display the score for team A**/
    public void displayforTeamA(int score){
        TextView scoreview = (TextView)findViewById(R.id.score_for_a);
        scoreview.setText(String.valueOf(score));
    }

    /** display the score for team B**/
    public void displayforTeamB(int score){
        TextView scoreview = (TextView)findViewById(R.id.score_for_b);
        scoreview.setText(String.valueOf(score));
    }

}

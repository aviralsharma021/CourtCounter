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

    /** To increase the score of the Team by 2**/
    public void Aincrement2(View view){
        scoreOfA+=2;
        displayforTeamA(scoreOfA);
    }

    /** To increase the score of the Team by 3**/
    public void Aincrement3(View view){
        scoreOfA+=3;
        displayforTeamA(scoreOfA);
    }

    /** To increase the score of the Team by 1**/
    public void Afreethrow(View view){
        scoreOfA++;
        displayforTeamA(scoreOfA);
    }

    /** To increase the score of the Team by 2**/
    public void Bincrement2(View view){
        scoreOfB+=2;
        displayforTeamB(scoreOfB);
    }

    /** To increase the score of the Team by 3**/
    public void Bincrement3(View view){
        scoreOfB+=3;
        displayforTeamB(scoreOfB);
    }

    /** To increase the score of the Team by 1**/
    public void Bfreethrow(View view){
        scoreOfB++;
        displayforTeamB(scoreOfB);
    }

    /** Reset the values for the next match**/
    public void Reset(View view){
        scoreOfA=0;
        scoreOfB=0;
        displayforTeamA(scoreOfA);
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

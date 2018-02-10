package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mQuestion;
    Button mAnswerTop, mAnswerButtom;
    int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mQuestion = (TextView) findViewById(R.id.storyTextView);
        mAnswerTop = (Button) findViewById(R.id.buttonTop);
        mAnswerButtom = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mAnswerTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1) {
                    mQuestion.setText(R.string.T3_Story);
                    mAnswerTop.setText(R.string.T3_Ans1);
                    mAnswerButtom.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else if (mStoryIndex == 2) {
                    mQuestion.setText(R.string.T3_Story);
                    mAnswerTop.setText(R.string.T3_Ans1);
                    mAnswerButtom.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else if (mStoryIndex == 3) {
                    mQuestion.setText(R.string.T6_End);
                    makeButtonsInvisible();
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mAnswerButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1) {
                    mQuestion.setText(R.string.T2_Story);
                    mAnswerTop.setText(R.string.T2_Ans1);
                    mAnswerButtom.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2) {
                    mQuestion.setText(R.string.T4_End);
                    makeButtonsInvisible();
                } else if (mStoryIndex == 3) {
                    mQuestion.setText(R.string.T5_End);
                    makeButtonsInvisible();
                }
            }
        });
    }
    public void makeButtonsInvisible () {
        mAnswerTop.setVisibility(View.GONE);
        mAnswerButtom.setVisibility(View.GONE);
    }
}

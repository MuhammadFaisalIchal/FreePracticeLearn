package com.practice.learn.freepracticelearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        TextView txtTest1 = findViewById(R.id.test1);
        TextView txtTest2 = findViewById(R.id.test2);

        sleepIn(true, false);
    }

    public boolean sleepIn(boolean weekday, boolean vacation){
        if (!weekday || !vacation){
            return false;
        }
        return true;
    }
}

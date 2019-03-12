package com.practice.learn.freepracticelearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.practice.learn.freepracticelearn.helper.SessionManager;

import java.util.HashMap;

public class Main2Activity extends AppCompatActivity {

    private SessionManager session;
    private TextView txtsession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        session = new SessionManager(getApplicationContext());
//        session.getUserPoint(getString())

        Button button13 = findViewById(R.id.button13);

        txtsession = findViewById(R.id.txtSession);

/*
        HashMap<String, String> usernameMap = session.getUserInfoMap();
        getUserName = usernameMap.get(SessionManager.PREF_KEY_USERNAME);
*/

        // Nge-crash karna shared preferences yang tersimpan bertipe <int>, tapi tidak di parse ke string untuk ditampilkan
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtsession.setText(session.getUserPoint());
            }
        });

//
    }
}

package com.practice.learn.freepracticelearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.practice.learn.freepracticelearn.helper.SessionManager;

public class MainActivity extends AppCompatActivity {

    private Button button, buttonExpand, buttonJava;
    private SessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        session = new SessionManager(getApplicationContext());

        button = findViewById(R.id.button);
        buttonExpand = findViewById(R.id.button2);
        buttonJava = findViewById(R.id.button3);
        Button btnSession = findViewById(R.id.testSession);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ItemListActivity.class));
            }
        });

        btnSession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                session.createSession(111);
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
                Toast.makeText(getApplicationContext(), "berhasil simpan shared", Toast.LENGTH_LONG).show();
            }
        });

        buttonExpand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ExpandableTextActivity.class));
            }
        });

        buttonJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}

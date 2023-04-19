package com.example.project_test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity3 extends AppCompatActivity {
    private FirebaseAuth auth ;
    private EditText signupemail, signuppw;
 Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button = findViewById(R.id.next_btn);
        signupemail = findViewById(R.id.email_id);
        signuppw= findViewById(R.id.PW);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iPtnt = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(iPtnt);
            }
        });
    }
}
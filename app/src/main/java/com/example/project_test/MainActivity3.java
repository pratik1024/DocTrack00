package com.example.project_test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import io.github.muddz.styleabletoast.StyleableToast;

public class MainActivity3 extends AppCompatActivity {
    private FirebaseAuth auth ;
    private EditText signupemail, signuppw;
 Button button;
    String email_txt;
    String pw_txt;
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
                String user = signupemail.getText().toString().trim();
                String pass = signuppw.getText().toString().trim();
                if(user.isEmpty()){
                    signupemail.setError("Email can't be empty");
                }
                if ( pass.isEmpty()){
                    signuppw.getText().toString().trim();
                }
                else {
                    auth.createUserWithEmailAndPassword(user,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if( task.isSuccessful()){
                                StyleableToast.makeText(getApplicationContext(), "Dataset Updated", Toast.LENGTH_LONG, R.style.mytoast).show();
                                Intent iPtnt = new Intent(getApplicationContext(), MainActivity4.class);
                                startActivity(iPtnt);
                            }
                            else {
                                StyleableToast.makeText(getApplicationContext(), "Dataset Updated Failed" + task.getException().getMessage(), Toast.LENGTH_LONG, R.style.mytoast).show();
                            }
                        }
                    });
                }

            }
        });
    }
}
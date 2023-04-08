package com.example.project_test;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;


public class MainActivity6 extends AppCompatActivity {
 AutoCompleteTextView autoCompleteTextView,autoCompleteTextView2;
 TextInputLayout textInputLayout,textInputLayout2;
 Button rgstr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        textInputLayout =findViewById(R.id.til_dept);
        autoCompleteTextView = findViewById(R.id.act_dept);
        textInputLayout2 =findViewById(R.id.til_doct);
        autoCompleteTextView2 = findViewById(R.id.act_doct);
        String [] dept={"Dept1","Dept2","Dept3","Dept4","Dept5","Dept6","Other"};
        String [] doct={"Doct1","Doct2","Doct3","Doct4","Doct5","Doct6","Other",};
        ArrayAdapter<String> itemAdapter = new ArrayAdapter<>(getApplicationContext(), R.layout.dept_list,dept);
        autoCompleteTextView.setAdapter(itemAdapter);
        autoCompleteTextView.setThreshold(1);
        ArrayAdapter<String> itemAdapter2 = new ArrayAdapter<>(getApplicationContext(),R.layout.dept_list,doct);
        autoCompleteTextView2.setAdapter(itemAdapter2);
        autoCompleteTextView2.setThreshold(1);
//        autoCompleteTextView.setOnClickListener(new AdapterView.OnItemClickListener(){
//            @Override
//            public void onItemClick(AdapterView<?>parent, View view, int position,long id){}
//
//        });

        rgstr = findViewById(R.id.rgstr_btn);
        rgstr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBookedDialog();
            }
        });

    }
    private void showBookedDialog(){
        ConstraintLayout boookedlayout = findViewById(R.id.bookedDialog);
        View view= LayoutInflater.from(getApplicationContext()).inflate(R.layout.activity_main7,boookedlayout);
        Button done=view.findViewById(R.id.done);

        AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
        builder.setView(view);
        final AlertDialog alertDialog = builder.create();

        done.findViewById(R.id.done).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
//                Intent iPtnt = new Intent(getApplicationContext(), MainActivity3.class);
//                startActivity(iPtnt);
                Toast.makeText(MainActivity6.this, "Login your Account", Toast.LENGTH_SHORT).show();
            }
        });
        if ( alertDialog.getWindow() != null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialog.show();
    }
}
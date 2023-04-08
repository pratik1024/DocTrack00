package com.example.project_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;


public class MainActivity6 extends AppCompatActivity {
 AutoCompleteTextView autoCompleteTextView;
 TextInputLayout textInputLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        textInputLayout =findViewById(R.id.til_dept);
        autoCompleteTextView = findViewById(R.id.act_dept);
        String [] dept={"Dept1","Dept2","Dept3","Dept4","Dept5","Dept6","Other"};
        ArrayAdapter<String> itemAdapter = new ArrayAdapter<>(getApplicationContext(), R.layout.dept_list,dept);
        autoCompleteTextView.setAdapter(itemAdapter);
        autoCompleteTextView.setThreshold(1);
//        autoCompleteTextView.setOnClickListener(new AdapterView.OnItemClickListener(){
//            @Override
//            public void onItemClick(AdapterView<?>parent, View view, int position,long id){}
//
//        });
    }
}
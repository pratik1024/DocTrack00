package com.example.project_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity10 extends AppCompatActivity {
Spinner spinner,spinner2,spinner3;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        spinner=findViewById(R.id.dept);
        spinner2=findViewById(R.id.qual);
        spinner3=findViewById(R.id.expr);
        button= findViewById(R.id.rgstr_btn2);

        String [] dept={"Select Dept.","Dept1","Dept2","Dept3","Dept4","Dept5","Dept6"};
        String [] qual={"Select Qual.","Qual1","Qual2","Qual3","Qual4","Qual5","Qual6"};
        String [] expr={"Select Expr.","Expr1","Expr2","Expr3","Expr4","Expr5","Expr6"};

        ArrayAdapter<String> itemAdapter = new ArrayAdapter<>(getApplicationContext(), R.layout.dept_list,dept);
        ArrayAdapter<String> itemAdapter2 = new ArrayAdapter<>(getApplicationContext(), R.layout.dept_list,qual);
        ArrayAdapter<String> itemAdapter3 = new ArrayAdapter<>(getApplicationContext(), R.layout.dept_list,expr);


        itemAdapter.setDropDownViewResource(R.layout.dept_list);
        spinner.setAdapter(itemAdapter);
        itemAdapter.setDropDownViewResource(R.layout.dept_list);
        spinner2.setAdapter(itemAdapter2);
        itemAdapter.setDropDownViewResource(R.layout.dept_list);
        spinner3.setAdapter(itemAdapter3);



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String value1 = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity10.this, value1, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String value1 = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity10.this, value1, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String value1 = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity10.this, value1, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iPtnt = new Intent(getApplicationContext(), MainActivity11.class);
                startActivity(iPtnt);
            }
        });
    }
}
package com.example.akash.studenthelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText g1;
    EditText w1;
    EditText g2;
    EditText w2;
    EditText g3;
    EditText w3;
    EditText g4;
    EditText w4;
    EditText g5;
    EditText w5;
    EditText g6;
    EditText w6;
    EditText g7;
    EditText w7;
    EditText g8;
    EditText w8;
    Button add;
    int sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        g1 = (EditText)findViewById(R.id.editText4);
        String gr1 = g1.getText().toString();
        w1 = (EditText)findViewById(R.id.editText13);
        String we1 = w1.getText().toString();
        g2 = (EditText)findViewById(R.id.editText5);
        String gr2 = g2.getText().toString();
        w2 = (EditText)findViewById(R.id.editText25);
        String we2 = w2.getText().toString();
        g3 = (EditText)findViewById(R.id.editText6);
        String gr3 = g3.getText().toString();
        w3 = (EditText)findViewById(R.id.editText18);
        String we3 = w3.getText().toString();
        g4 = (EditText)findViewById(R.id.editText7);
        String gr4 = g4.getText().toString();
        w4 = (EditText)findViewById(R.id.editText19);
        String we4 = w4.getText().toString();
        g5 = (EditText)findViewById(R.id.editText8);
        String gr5 = g5.getText().toString();
        w5 = (EditText)findViewById(R.id.editText20);
        String we5 = w5.getText().toString();
        g6 = (EditText)findViewById(R.id.editText9);
        String gr6 = g6.getText().toString();
        w6 = (EditText)findViewById(R.id.editText22);
        String we6 = w6.getText().toString();
        g7 = (EditText)findViewById(R.id.editText10);
        String gr7 = g7.getText().toString();
        w7 = (EditText)findViewById(R.id.editText23);
        String we7 = w7.getText().toString();
        g8 = (EditText)findViewById(R.id.editText12);
        String gr8 = g8.getText().toString();
        w8 = (EditText)findViewById(R.id.editText24);
        String we8 = w8.getText().toString();
        add = (Button)findViewById(R.id.button);
        add.setOnClickListener(new AddButtonClickHandler());
    }
    public static double GPA(String b, String a){
        double gp = 0;
        if(!a.equals("HAP")){
            if(a.equalsIgnoreCase("R")){
                switch(b){
                    case "A":
                        gp = 4*5;
                        break;
                    case "A-":
                        gp = 3.67*5;
                        break;
                    case "B+":
                        gp = 3.33*5;
                        break;
                    case "B":
                        gp = 3*5;
                        break;
                    case "B-":
                        gp = 2.67*5;
                        break;
                    case "C+":
                        gp = 2.33*5;
                        break;
                    case "C":
                        gp = 2*5;
                        break;
                    case "C-":
                        gp = 1.67*5;
                        break;
                    case "D":
                        gp = 1*5;
                        break;
                    case "F":
                        gp = 0;
                        break;
                }
            }
            else if(a.equalsIgnoreCase("H")){
                switch(b){
                    case "A":
                        gp = 4.5*5;
                        break;
                    case "A-":
                        gp = 4.17*5;
                        break;
                    case "B+":
                        gp = 3.83*5;
                        break;
                    case "B":
                        gp = 3.50*5;
                        break;
                    case "B-":
                        gp = 3.17*5;
                        break;
                    case "C+":
                        gp = 2.83*5;
                        break;
                    case "C":
                        gp = 2.50*5;
                        break;
                    case "C-":
                        gp = 2.17*5;
                        break;
                    case "D":
                        gp = 1*5;
                        break;
                    case "F":
                        gp = 0*5;
                        break;
                }
            }
            else if(a.equalsIgnoreCase("AP")){
                switch(b){
                    case "A":
                        gp = 5*5;
                        break;
                    case "A-":
                        gp = 4.67*5;
                        break;
                    case "B+":
                        gp = 4.33*5;
                        break;
                    case "B":
                        gp = 4*5;
                        break;
                    case "B-":
                        gp = 3.67*5;
                        break;
                    case "C+":
                        gp = 3.33*5;
                        break;
                    case "C":
                        gp = 3*5;
                        break;
                    case "C-":
                        gp = 2.67*5;
                        break;
                    case "D":
                        gp = 1*5;
                        break;
                    case "F":
                        gp = 0*5;
                        break;
                }
            }
            return gp;
        }
        else
            return 0;
    }

    public class AddButtonClickHandler implements View.OnClickListener {
        public void onClick(View view) {
            int counter  = 0;
            String gr1 = g1.getText().toString();
            String we1 = w1.getText().toString();
            String gr2 = g2.getText().toString();
            String we2 = w2.getText().toString();
            String gr3 = g3.getText().toString();
            String we3 = w3.getText().toString();
            String gr4 = g4.getText().toString();
            String we4 = w4.getText().toString();
            String gr5 = g5.getText().toString();
            String we5 = w5.getText().toString();
            String gr6 = g6.getText().toString();
            String we6 = w6.getText().toString();
            String gr7 = g7.getText().toString();
            String we7 = w7.getText().toString();
            String gr8 = g8.getText().toString();
            String we8 = w8.getText().toString();
            counter+=GPA(gr1,we1);
            counter+=GPA(gr2,we2);
            counter+=GPA(gr3,we3);
            counter+=GPA(gr4,we4);
            counter+=GPA(gr5,we5);
            counter+=GPA(gr6,we6);
            counter+=GPA(gr7,we7);
            counter+=GPA(gr8,we8);
            double  gpa = counter/40;
            Intent explicitIntent = new Intent(MainActivity.this,
                    SecondActivity.class);
            explicitIntent.putExtra("SUM", gpa);
            startActivity(explicitIntent);

        }
    }
}

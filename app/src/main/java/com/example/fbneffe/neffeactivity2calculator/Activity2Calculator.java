package com.example.fbneffe.neffeactivity2calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity2Calculator extends AppCompatActivity {

    Button bttn1,bttn2,bttn3,bttn4,bttn5,bttn6,bttn7,bttn8,bttn9,bttn0,bttnP,bttnE;
    TextView txtview, txtview2;
    boolean newValue = false;
    ArrayList<Integer> inList = new ArrayList<Integer>();

    String prev="";
    String text="";
    String number="";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_calculator);

        //buttons
        bttn1 = findViewById(R.id.button1);
        bttn2 = findViewById(R.id.button2);
        bttn3 = findViewById(R.id.button3);
        bttn4 = findViewById(R.id.button4);
        bttn5 = findViewById(R.id.button5);
        bttn6 = findViewById(R.id.button6);
        bttn7 = findViewById(R.id.button7);
        bttn8 = findViewById(R.id.button8);
        bttn9 = findViewById(R.id.button9);
        bttn0 = findViewById(R.id.button0);
        bttnP = findViewById(R.id.buttonplus);
        bttnE = findViewById(R.id.buttonequal);

        //view
        txtview = findViewById(R.id.textView);
        txtview2 = findViewById(R.id.textView2);

        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(newValue == true)
                    txtview2.setText("1");
                else
                    txtview2.setText(txtview2.getText().toString() +  "1");

                newValue = false;

            }
        });

        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(newValue == true)
                    txtview2.setText("1");
                else
                    txtview2.setText(txtview2.getText().toString() +  "1");

                newValue = false;

            }
        });

        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(newValue == true)
                    txtview2.setText("2");
                else
                    txtview2.setText(txtview2.getText().toString() +  "2");

                newValue = false;

            }
        });

        bttn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(newValue == true)
                    txtview2.setText("3");
                else
                    txtview2.setText(txtview2.getText().toString() +  "3");

                newValue = false;

            }
        });

        bttn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(newValue == true)
                    txtview2.setText("4");
                else
                    txtview2.setText(txtview2.getText().toString() +  "4");

                newValue = false;

            }
        });

        bttn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(newValue == true)
                    txtview2.setText("5");
                else
                    txtview2.setText(txtview2.getText().toString() +  "5");

                newValue = false;

            }
        });

        bttn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(newValue == true)
                    txtview2.setText("6");
                else
                    txtview2.setText(txtview2.getText().toString() +  "6");

                newValue = false;

            }
        });

        bttn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(newValue == true)
                    txtview2.setText("7");
                else
                    txtview2.setText(txtview2.getText().toString() +  "7");

                newValue = false;

            }
        });

        bttn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(newValue == true)
                    txtview2.setText("8");
                else
                    txtview2.setText(txtview2.getText().toString() +  "8");

                newValue = false;

            }
        });

        bttn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(newValue == true)
                    txtview2.setText("9");
                else
                    txtview2.setText(txtview2.getText().toString() +  "9");

                newValue = false;

            }
        });

        bttn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(newValue == true)
                    txtview2.setText("0");
                else
                    txtview2.setText(txtview2.getText().toString() +  "0");

                newValue = false;

            }
        });



        bttnP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if (prev == "+" || prev == "=" || prev == ""){

                    txtview.setText("");
                    txtview2.setText("");
                    prev ="+";


                }
                else {
                    inList.add(Integer.parseInt(number));
                    number="+";
                    text = txtview.getText().toString();
                    txtview2.setText(text + "+");
                    prev="+";
                }



            }
        });

        bttnE.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if (prev == "=" || prev == "" || prev == "+"){

                    txtview.setText("");
                    txtview2.setText("");
                    prev ="=";


                }
                else {
                    inList.add(Integer.parseInt(number));
                    number="";
                    text = txtview.getText().toString();
                    prev="+";
                    //txtview.setText(String.valueOf(sum));
                    prev="=";
                    //
                }



            }
        });







}


    }

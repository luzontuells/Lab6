package com.example.a5alumno.lab6;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button startService, startBoundService,startIntentService,displayInfo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // final Button startService = () findView

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnStartService){

        } else if (view.getId() == R.id.btnStartBoundService) {

        } else if (view.getId() == R.id.btnStartIntentService){

        } else if (view.getId() == R.id.btnDispInfo){

        }

    }
}

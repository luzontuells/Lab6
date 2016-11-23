package com.example.a5alumno.lab6;

import android.app.Service;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button startService, startBoundService,startIntentService,displayInfo;
    private EditText editText;
    private static final int BUTTON_REQUEST = 200;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout mainLayout = (LinearLayout) this.findViewById(R.id.activity_main);

        final Button startService = (Button) this.findViewById(R.id.btnStartService);
        startService.setOnClickListener(this);

        final Button startBoundService = (Button) this.findViewById(R.id.btnStartBoundService);
        startBoundService.setOnClickListener(this);

        final Button startIntentService = (Button) this.findViewById(R.id.btnStartIntentService);
        startIntentService.setOnClickListener(this);

        final Button displayInfo = (Button) this.findViewById(R.id.btnDispInfo);
        displayInfo.setOnClickListener(this);

        final EditText editText = (EditText) this.findViewById(R.id.edtTxtInputInfo);
        editText.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnStartService){
            Intent intent = new Intent(this, MSrv.class);
            startService(intent);
        } else if (view.getId() == R.id.btnStartBoundService) {
//            Intent intent = new Intent(this, MBSrv.class);
//            startService(intent);
        } else if (view.getId() == R.id.btnStartIntentService){
            Intent intent = new Intent(this, MIntSrv.class);
            startService(intent);
        } else if (view.getId() == R.id.btnDispInfo){
            Log.d("Hola","unclick");
        }

    }
}

package com.example.a5alumno.lab6;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
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
    private Intent intentBind;

    ServiceConnection mBSrvConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {

        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

        }
    };

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
            this.startService(intent);
        } else if (view.getId() == R.id.btnStartBoundService) {
            this.intentBind= new Intent(this, MBSrv.class);
            this.startService(intentBind);
            this.bindService(intentBind, mBSrvConnection, Context.BIND_AUTO_CREATE);
        } else if (view.getId() == R.id.btnStartIntentService){
            Intent intent = new Intent(this, MIntSrv.class);
            this.startService(intent);

        } else if (view.getId() == R.id.btnDispInfo){
            Log.e("Hola","unclick");
            this.stopService(new Intent(this, MBSrv.class));
            this.unbindService(mBSrvConnection);
        } //TODO: Reemplazar por una estructura SWITCH

    }


}

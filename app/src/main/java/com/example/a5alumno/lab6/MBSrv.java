package com.example.a5alumno.lab6;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MBSrv extends Service {
    public MBSrv() {

    }

    public int onStartCommand(Intent intent, int flags, int startID){

        long currentTime = System.currentTimeMillis();
        long endTime = currentTime + 2000;
        while (currentTime<endTime){
            currentTime=System.currentTimeMillis();
        }
        return Service.START_NOT_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

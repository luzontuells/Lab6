package com.example.a5alumno.lab6;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

import java.io.FileDescriptor;

public class MBSrv extends Service {

    private IBinder myBinder = new MyBinder();

    public MBSrv() {}

    @Override
    public IBinder onBind(Intent intent) {
        Log.e("TestService","onBind done");
        long currentTime = System.currentTimeMillis();
        long endTime = currentTime + 2000;
        while (currentTime<endTime){
            currentTime=System.currentTimeMillis();
        }
        Log.e("TestService","Process done");
        return myBinder;
    }

    @Override
    public boolean onUnbind(Intent intent){return false;}

    public class MyBinder extends Binder {
        MBSrv getService() {return MBSrv.this;}
    }
}

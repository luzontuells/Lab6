package com.example.a5alumno.lab6;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MBSrv extends Service {
    public MBSrv() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

package com.example.a5alumno.lab6;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.content.Context;
import android.transition.Explode;
import android.util.Log;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * helper methods.
 */
public class MIntSrv extends IntentService {


    public MIntSrv() {
        super(MIntSrv.class.getCanonicalName());
    }




    @Override
    protected void onHandleIntent(Intent intent) {

        long currentTime = System.currentTimeMillis();
        long endTime = currentTime + 5000;
        while (currentTime<endTime){
            currentTime=System.currentTimeMillis();

        }
        Log.e("Servicio","Servicio Acabado");
    }
}

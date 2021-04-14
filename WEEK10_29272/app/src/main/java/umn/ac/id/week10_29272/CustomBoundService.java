package umn.ac.id.week10_29272;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class CustomBoundService extends Service {
    public CustomBoundService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
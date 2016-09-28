package meetup.droid.miidroid.service;

import android.app.IntentService;
import android.content.Intent;
import android.nfc.Tag;
import android.util.Log;

/**
 * TODO add class comment
 * <p/>
 * Created by Triforce on 9/27/16.
 */
public class MyIntentService extends IntentService {

    public  static final String TAG = MyIntentService.class.getSimpleName();


    public MyIntentService() {
        super("MyService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        for (int i = 0; i < 5; i++) {

            try {
                Log.d(TAG, "Sleeping for 0.5 seconds " + i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}

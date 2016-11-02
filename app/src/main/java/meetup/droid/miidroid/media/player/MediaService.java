package meetup.droid.miidroid.media.player;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;


public class MediaService extends Service {

    private static final String ACTION_PLAY = "com.meetup.droid.miidroid.play";

    private MediaPlayer mMediaPlayer = null;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        if (intent.getAction().equals(ACTION_PLAY)) {

        }

        return startId;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}

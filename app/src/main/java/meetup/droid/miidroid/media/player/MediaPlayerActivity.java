package meetup.droid.miidroid.media.player;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.IOException;

import meetup.droid.miidroid.R;

public class MediaPlayerActivity extends AppCompatActivity implements View.OnClickListener {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);

        findViewById(R.id.btn_play_foreground).setOnClickListener(this);
        findViewById(R.id.btn_stop).setOnClickListener(this);
        findViewById(R.id.btn_pause).setOnClickListener(this);

        mMediaPlayer = MediaPlayer.create(this, R.raw.viviq);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_play_foreground:
                playMusic();
                break;
            case R.id.btn_pause:
                pauseMusic();
                break;
            case R.id.btn_stop:
                stopMusic();
                break;
        }
    }

    private void stopMusic() {
        mMediaPlayer.stop();
        try {
            //This is a blocking operation, avoid calling it on UI thread
            mMediaPlayer.prepare();
        } catch (IOException e) {
            Log.e("MediaPlayerActivity", "Prepare exception", e);
        }
    }

    private void pauseMusic() {
        mMediaPlayer.pause();

    }

    private void playMusic() {
        mMediaPlayer.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
        }
    }
}

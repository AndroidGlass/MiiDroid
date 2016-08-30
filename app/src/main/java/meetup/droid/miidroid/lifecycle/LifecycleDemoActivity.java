package meetup.droid.miidroid.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import meetup.droid.miidroid.R;

public class LifecycleDemoActivity extends AppCompatActivity {

    private TextView mTextView;

    private static StringBuilder eventLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle_demo);

        mTextView = (TextView) findViewById(R.id.tv_events);
        intialize();
        eventLog.append("onCreate()\n");
    }

    private void intialize() {
        if (eventLog == null) {
            eventLog = new StringBuilder();
        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        eventLog.append("onStart()\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        eventLog.append("onResume()\n");
        mTextView.setText(eventLog.toString());
    }

    @Override
    protected void onStop() {
        super.onStop();
        eventLog.append("onStop()\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        eventLog.append("onDestroy()\n");
    }
}

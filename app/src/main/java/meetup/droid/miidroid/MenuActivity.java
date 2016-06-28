package meetup.droid.miidroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Contains a list of buttons for launching a new activity
 */
public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
}

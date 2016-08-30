package meetup.droid.miidroid.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import meetup.droid.miidroid.R;
import meetup.droid.miidroid.implicit.intents.CameraIntentActivity;
import meetup.droid.miidroid.lifecycle.LifecycleDemoActivity;

/**
 * Contains a list of buttons for launching a new activity
 */
public class MenuActivity extends AppCompatActivity {

    private static MenuItem[] menuItems = new MenuItem[] {
            //todo create a class to start
            new MenuItem(LifecycleDemoActivity.class, "Lifecycle Demo"),
            new MenuItem(CameraIntentActivity.class, "Camera Intent Demo")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager linearLayout = new LinearLayoutManager(this);
        MenuRecyclerAdapter adapter = new MenuRecyclerAdapter(menuItems);
        recyclerView.setLayoutManager(linearLayout);
        recyclerView.setAdapter(adapter);

    }
}

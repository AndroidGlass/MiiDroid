package meetup.droid.miidroid.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import meetup.droid.miidroid.R;

/**
 * Contains a list of buttons for launching a new activity
 */
public class MenuActivity extends AppCompatActivity {

    private static String[] menuItems = new String[] {
            "Item1",
            "Item2",
            "Item3",
            "Item4",
            "Item5",
            "Item6",
            "Item10",
            "Item21",
            "Item32",
            "Item43",
            "Item54",
            "Item65"};

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

package meetup.droid.miidroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import meetup.droid.miidroid.menu.MenuActivity;

public class MainActivity extends AppCompatActivity {

    private static final String EXPECTED_USERNAME = "userOne";

    private static final String EXPECTED_PASSWORD = "password";

    /**
     * Define variables for mapping UI elements
     */
    private EditText mEtUsername;

    private EditText mEtPassword;

    private Button mBtnLogin;

    private TextView mTvErrorMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*
         * Map UI elements
         */
        mEtUsername = (EditText) findViewById(R.id.et_username);
        mEtPassword = (EditText) findViewById(R.id.et_password);
        mBtnLogin = (Button) findViewById(R.id.btn_login);
        mTvErrorMessage = (TextView) findViewById(R.id.tv_error);

        //Set click listener to receive a call back whenever user presses this
        //button
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleClick();
            }
        });
    }

    private void handleClick() {
        String username = mEtUsername.getText().toString();
        String password = mEtPassword.getText().toString();

        if (username.equals(EXPECTED_USERNAME) && password.equals(EXPECTED_PASSWORD)) {
            mTvErrorMessage.setVisibility(View.GONE);
            //Log user in
            Intent intent = new Intent(this, MenuActivity.class);
            startActivity(intent);
        } else {
            mTvErrorMessage.setVisibility(View.VISIBLE);
        }
    }
}

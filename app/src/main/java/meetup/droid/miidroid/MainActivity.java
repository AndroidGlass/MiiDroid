package meetup.droid.miidroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String EXPECTED_USERNAME = "userOne";

    private static final String EXPECTED_PASSWORD = "password";

    private EditText etUsername;

    private EditText etPassword;

    private Button btnLogin;

    private TextView tvErrorMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etUsername = (EditText) findViewById(R.id.et_username);
        etPassword = (EditText) findViewById(R.id.et_password);
        btnLogin = (Button) findViewById(R.id.btn_login);
        tvErrorMessage = (TextView) findViewById(R.id.tv_error);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleClick();
            }
        });
    }

    private void handleClick() {
        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();

        if (username.equals(EXPECTED_USERNAME) && password.equals(EXPECTED_PASSWORD)) {
            tvErrorMessage.setVisibility(View.GONE);
            //Log user in
            Intent intent = new Intent(this, MenuActivity.class);
            startActivity(intent);
        } else {
            tvErrorMessage.setVisibility(View.VISIBLE);
        }
    }
}

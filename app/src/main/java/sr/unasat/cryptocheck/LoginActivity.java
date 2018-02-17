package sr.unasat.cryptocheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void onLoginClick(View view) {
        EditText username = (EditText)findViewById(R.id.username_text);
        String usernameValue = String.valueOf(username.getText());
        EditText password = (EditText)findViewById(R.id.password_text);
        String passwordValue = String.valueOf(password.getText());
        String notifcation = "";

        if (usernameValue.equals("admin") && passwordValue.equals("admin")) {
            loadMainActivity();
        } else {
            notifcation = "Login Failed.\n" +
                    "Please make sure you have correctly entered in your username and password.";
            Toast.makeText(this, notifcation, Toast.LENGTH_SHORT).show();
        }
    }

    public void loadMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

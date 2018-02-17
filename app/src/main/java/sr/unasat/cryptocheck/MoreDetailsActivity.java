package sr.unasat.cryptocheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class MoreDetailsActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_details);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        String message = getIntent().getExtras().get(EXTRA_MESSAGE).toString();
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(message);
    }
}

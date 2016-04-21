package me.emmano.daggertestexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

  @Inject String text;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ((DaggerApplication) getApplication()).getApplicationComponent().inject(this);
  }

  @Override protected void onResume() {
    super.onResume();
    TextView textView = (TextView) findViewById(R.id.hello_text_view);
    textView.setText(text);
  }
}

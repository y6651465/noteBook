package kr.co.mlec.java94;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void move(View view) {
        Intent intent = new Intent(
                getApplicationContext(), SubActivity.class);
        startActivity(intent);
    }
}













package kr.co.mlec.java94;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class SubActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }

    public void back(View view) {
        finish();
    }
}













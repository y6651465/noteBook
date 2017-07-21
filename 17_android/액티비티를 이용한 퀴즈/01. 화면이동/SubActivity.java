package kr.co.mlec.java94;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SubActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = getIntent();
        String type = intent.getStringExtra("type");
        ImageView imgVw = (ImageView)findViewById(R.id.imgVw);
        imgVw.setImageResource(type.equals("S") ? R.drawable.kara_1 : R.drawable.sunny);
    }

    public void exitAction(View v) {
        finish();
    }
}












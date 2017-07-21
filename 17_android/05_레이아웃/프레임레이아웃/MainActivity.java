package kr.co.mlec.java94;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    int[] imgs = new int[]{
            R.id.img1, R.id.img2, R.id.img3, R.id.img4
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void imgChange(View view) {
        for (int img : imgs) {
            ((ImageView) findViewById(img)).setVisibility(View.INVISIBLE);
        }
        int index = 0;
        switch (view.getId()) {
            case R.id.btn1: index = 0; break;
            case R.id.btn2: index = 1; break;
            case R.id.btn3: index = 2; break;
            case R.id.btn4: index = 3; break;
        }

        ((ImageView) findViewById(imgs[index])).setVisibility(View.VISIBLE);
    }
}
















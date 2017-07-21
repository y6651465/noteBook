package kr.co.mlec.java94;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends Activity {
    private ImageView imgView;

    private int[] imgs = {
            R.drawable.kara_1,
            R.drawable.kara_2,
            R.drawable.kara_3,
            R.drawable.kara_4,
            R.drawable.kara_5,
            R.drawable.so,
            R.drawable.so1
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView = (ImageView)findViewById(R.id.img1);
    }

    public void imgChange(View v) {
        /*
        Toast.makeText(
                MainActivity.this,
                v.getId() + "", Toast.LENGTH_SHORT).show();
        */

        imgView.setImageResource(
                imgs[new Random().nextInt(imgs.length)]);
    }
}
















package kr.co.mlec.java94;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    class MyTouchListener implements View.OnTouchListener {
        @Override
        public boolean onTouch(View view, MotionEvent event) {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                Toast.makeText(MainActivity.this,
                        "리스너 이벤트 발생",
                        Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnTouchListener listener = new MyTouchListener();

        Button btn = (Button)findViewById(R.id.btn);
        btn.setOnTouchListener(listener);
    }
}















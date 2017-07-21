package kr.co.mlec.java94;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    class MyView extends View {
        public MyView(Context context) {
            super(context);
        }
        public boolean onTouchEvent(MotionEvent event) {
            super.onTouchEvent(event);

            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                Toast.makeText(
                        MainActivity.this,
                        "콜백 터치 이벤트 발생",
                        Toast.LENGTH_SHORT).show();

            }

            return true;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = new MyView(this);
        setContentView(view);
    }
}















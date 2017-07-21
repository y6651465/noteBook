package kr.co.mlec.java94;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn1 = (Button)findViewById(R.id.btn1);
        final Button btn2 = (Button)findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                /*
                Toast.makeText(
                        MainActivity.this, "버튼1이 클릭되었습니다.", Toast.LENGTH_SHORT
                ).show();

                btn1.setEnabled(false);
                btn2.setEnabled(true);
                */

                process(btn2, btn1, "버튼1이 클릭되었습니다.");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                /*
                Toast.makeText(
                        MainActivity.this, "버튼2이 클릭되었습니다.", Toast.LENGTH_SHORT
                ).show();
                btn1.setEnabled(true);
                btn2.setEnabled(false);
                */
                process(btn1, btn2, "버튼2이 클릭되었습니다.");
            }
        });

    }

    private void process(
            Button enableBtn, Button disableBtn, String msg) {
        Toast.makeText(
                MainActivity.this, msg, Toast.LENGTH_SHORT
        ).show();
        enableBtn.setEnabled(true);
        disableBtn.setEnabled(false);
    }
}
















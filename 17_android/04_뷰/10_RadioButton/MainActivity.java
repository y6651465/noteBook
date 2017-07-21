package kr.co.mlec.java94;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioButton email1 = (RadioButton)findViewById(R.id.email1);
        final RadioButton email2 = (RadioButton)findViewById(R.id.email2);
        final RadioGroup emailGroup = (RadioGroup)findViewById(R.id.emailGroup);

        emailGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int id) {
                String msg = "";
                switch (id) {
                    case R.id.email1:
                        msg = "수신 선택";
                        break;

                    case R.id.email2:
                        msg = "수신하지 않음 선택";
                        break;
                }
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
















package kr.co.mlec.java94;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch btn1 = (Switch)findViewById(R.id.btn1);
        ToggleButton btn2 = (ToggleButton)findViewById(R.id.btn2);
        btn1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(
                        MainActivity.this,
                        b ? "체크됨" : "체크 해제됨",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(
                        MainActivity.this,
                        b ? "체크됨" : "체크 해제됨",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
















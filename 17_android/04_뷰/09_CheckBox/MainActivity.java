package kr.co.mlec.java94;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button confirmBtn = (Button)findViewById(R.id.confirmBtn);

        final CheckBox cb1 = (CheckBox)findViewById(R.id.cb1);
        final CheckBox cb2 = (CheckBox)findViewById(R.id.cb2);
        final CheckBox cb3 = (CheckBox)findViewById(R.id.cb3);
        final TextView result = (TextView)findViewById(R.id.result);

        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String msg = compoundButton.getText() + " : "
                           + (b ? "체크 상태" : "체크 해제 상태");
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });

        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String msg = compoundButton.getText() + " : "
                           + (b ? "체크 상태" : "체크 해제 상태");
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });

        cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String msg = compoundButton.getText() + " : "
                           + (b ? "체크 상태" : "체크 해제 상태");
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });



        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "";
                msg = cb1.getText() + " : " + cb1.isChecked() + "\n" +
                      cb2.getText() + " : " + cb2.isChecked() + "\n" +
                      cb3.getText() + " : " + cb3.isChecked();
                // 텍스트 뷰에 체크박스 상태정보 출력
                result.setText(msg);
            }
        });

    }
}
















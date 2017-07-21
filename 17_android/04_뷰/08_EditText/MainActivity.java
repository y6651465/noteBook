package kr.co.mlec.java94;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button confirmBtn = (Button)findViewById(R.id.confirmBtn);
        final EditText msgEt = (EditText)findViewById(R.id.msgEt);

        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = msgEt.getText().toString();
                Toast.makeText(
                        MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
















package kr.co.mlec.java94;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioGroup rdoGroup = (RadioGroup)findViewById(R.id.rdoGroup);

        Button btnNewActivity = (Button) findViewById(R.id.btnNewActivity);
        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String type = "S";
                if (rdoGroup.getCheckedRadioButtonId() == R.id.movie)
                    type = "M";
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);
                intent.putExtra("type", type);
                startActivity(intent);
            }
        });
    }
}

















package kr.co.mlec.java94;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void process(View view) {
        Uri uri = null;
        Intent intent = null;
        switch (view.getId()) {
            case R.id.dial:
                uri = Uri.parse("tel:01011112222");
                intent = new Intent(Intent.ACTION_DIAL, uri);
                break;
            case R.id.homepage:
                uri = Uri.parse("http://www.naver.com");
                intent = new Intent(Intent.ACTION_VIEW, uri);
                break;
            case R.id.photo:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setType("image/*");
                break;
            case R.id.sms:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.putExtra("sms_body", "내용 입력...");
                intent.setType("vnd.android-dir/mms-sms");
                break;
        }
        startActivity(intent);

    }

}

















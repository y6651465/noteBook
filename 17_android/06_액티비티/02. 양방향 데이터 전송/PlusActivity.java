package kr.co.mlec.java94;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class PlusActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // MainActivity에서 전송된 num1, num2의 값을 추출한 다음
        // 두수의 더한 결과값을 전송
        Intent intent = getIntent();
        int num1 = intent.getIntExtra("num1", 0);
        int num2 = intent.getIntExtra("num2", 0);

        Intent result = new Intent();
        result.putExtra("result", num1 + num2);
        // 결과값을 MainActivity에서 전송
        setResult(200, result);

        finish();
    }
}












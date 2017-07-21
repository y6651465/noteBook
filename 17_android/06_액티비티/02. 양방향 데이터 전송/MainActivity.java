package kr.co.mlec.java94;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText num1, num2;
    private TextView resultTv;

    private static final int PLUS = 1;
    private static final int MINUS = 2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
        resultTv = (TextView)findViewById(R.id.result);
    }

    public void callActivity(View view) {
        int num1Val = Integer.parseInt(num1.getText().toString());
        int num2Val = Integer.parseInt(num2.getText().toString());

        int requestCode = -1;
        Class<?> clz = null;
        switch (view.getId()) {

            case R.id.plus:   // 더하기 기능 액티비티 호출
                clz = PlusActivity.class;
                requestCode = MainActivity.PLUS;
                break;
            case R.id.minus:  // 빼기 기능 액티비티 호출
                clz = MinusActivity.class;
                requestCode = MainActivity.MINUS;
                break;
        }

        Intent intent = new Intent(getApplicationContext(), clz);
        intent.putExtra("num1", num1Val);
        intent.putExtra("num2", num2Val);
        // 액티비티 호출 : 호출한 액티비티로부터 결과를 받기
        startActivityForResult(intent, requestCode);
    }

    // 호출된 액비티비가 종료된 다음 실행되는 콜백메서드
    @Override
    public void onActivityResult(
            int requestCode, int resultCode, Intent data) {

        // 인텐트에 담긴 결과 데이터 추출
        int result = data.getIntExtra("result", 0);
        String type = "";
        switch (requestCode) {
            case MainActivity.PLUS:   // PlusActivity가 종료
                type = "더하기 : ";
                break;
            case MainActivity.MINUS:  // MinusActivity가 종료
                type = "빼기 : ";
                break;
        }
        resultTv.setText(type + result);
    }
}

















package kr.co.mlec.java94;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText edit1, edit2;
    Button add, sub, mul, div;
    TextView textResult;
    String num1, num2;
    Integer result;

    // 10개 숫자 버튼 배열
    Button[] numBtns = new Button[10];

    // 10개 숫자 버튼의 id 값 배열
    Integer[] nums = { R.id.num0, R.id.num1, R.id.num2,
            R.id.num3, R.id.num4, R.id.num5, R.id.num6,
            R.id.num7, R.id.num8, R.id.num9 };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);

        textResult = (TextView) findViewById(R.id.textResult);

        // 숫자 버튼 10개를 대입
        for (int i = 0; i < nums.length; i++) {
            numBtns[i] = (Button) findViewById(nums[i]);
        }

        // 숫자 버튼 10개에 대해서 클릭이벤트 처리
        for (int i = 0; i < nums.length; i++) {

            final int index; // 주의! 꼭 필요함..
            index = i;

            numBtns[index].setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // 포커스가 되어 있는 에디트텍스트에 숫자 추가
                    if (edit1.isFocused() == true) {
                        num1 = edit1.getText().toString()
                                + numBtns[index].getText().toString();
                        edit1.setText(num1);
                    } else if (edit2.isFocused() == true) {
                        num2 = edit2.getText().toString()
                                + numBtns[index].getText().toString();
                        edit2.setText(num2);
                    } else {
                        Toast.makeText(getApplicationContext(),
                                "먼저 에디트텍스트를 선택하세요",Toast.LENGTH_SHORT).show();

                    }
                }
            });
        }
    }

    public void calculate(View v) {
        num1 = edit1.getText().toString();
        num2 = edit2.getText().toString();
        if (num1.equals("") || num2.equals("")) {
            Toast.makeText(MainActivity.this, "값을 입력하세요",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        switch (v.getId()) {
            case R.id.add:
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                break;
            case R.id.sub:
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                break;
            case R.id.mul:
                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                break;
            case R.id.div:
                result = Integer.parseInt(num1) / Integer.parseInt(num2);
                break;
        }

        textResult.setText("계산 결과 : " + result.toString());
    }
}













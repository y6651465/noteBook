package kr.co.mlec.java94;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends Activity {
    String addData;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<String> actiors = new ArrayList<>();
        actiors.add("황정민");
        actiors.add("손예진");
        actiors.add("김민구");
        actiors.add("이동하");
        actiors.add("전지현");
        actiors.add("김태희");
        actiors.add("유해진");
        actiors.add("강우석");
        actiors.add("정찬우");

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_multiple_choice, actiors );

        // list 가져오기
        final  ListView list = (ListView)findViewById(R.id.list);
        list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        // 리스트 뷰에 어뎁터 클래스 설정
        list.setAdapter(adapter);

        // 리스트뷰 아이템에 이벤트 설정
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), actiors.get(position) + " 배우를 선택", Toast.LENGTH_SHORT).show();
            }
        });
        Button add = (Button)findViewById(R.id.add);
        final EditText data = (EditText)findViewById(R.id.data);
        // 추가 버튼 클릭시 리스트에 입력된 데이터를 추가
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addData = data.getText().toString();
                if (TextUtils.isEmpty(addData)){
                    Toast.makeText(getApplicationContext(), "배우를 입력하세요", Toast.LENGTH_SHORT).show();
                }
                else {
                    adapter.add(addData);
                    data.setText("");
                    // 추가된 데이터를 리스트에 보이도록
                    list.smoothScrollToPosition(adapter.getCount() - 1);
                }
            }
        });
        // 삭제버튼 이벤트 처리하기
        Button del = (Button)findViewById(R.id.del);
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(addData)){
                    Toast.makeText(getApplicationContext(), "삭제할 배우를 입력하세요", Toast.LENGTH_SHORT).show();
                }
                else{

                    // 리스트뷰에서 선택된 아이템 위치 가져오기
                    int delPos = list.getCheckedItemPosition();
                /*
                String item = (String)list.getItemIdAtPosition(delPos);
                adapter.remove(item);
                */
                    actiors.remove(delPos);
                    // 리스트뷰가 삭제된 데이터를 인지 못한 경우
                    adapter.notifyDataSetChanged();
                }
            }
        });
    }
}
















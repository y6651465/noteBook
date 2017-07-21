package kr.co.mlec.java94;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Singer> data = new ArrayList<>();
        data.add(new Singer("니콜", "1990-10-10", R.drawable.kara_1));
        data.add(new Singer("강지영", "1991-09-10", R.drawable.kara_2));
        data.add(new Singer("구하라", "1992-12-12", R.drawable.kara_3));
        data.add(new Singer("한승연", "1993-11-15", R.drawable.kara_4));

        final MyAdapter adapter =
                new MyAdapter(
                        getApplicationContext(),
                        R.layout.list_row,
                        data
                );

        // ListView 가져오기
        final ListView list = (ListView)findViewById(R.id.list);

        // 리스트뷰에 어뎁터 클래스 설정
        list.setAdapter(adapter);

        // 리스트뷰 아이템 이벤트 설정
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(
                    AdapterView<?> adapterView, View view, int position, long id) {
                /*
                TextView nameTv = (TextView)view.findViewById(R.id.name);
                TextView birthTv = (TextView)view.findViewById(R.id.birth);
                Toast.makeText(
                        MainActivity.this,
                        nameTv.getText() + ", " + birthTv.getText(),
                        Toast.LENGTH_SHORT).show();
                 */

                Singer singer = (Singer)adapter.getItem(position);
                Toast.makeText(
                        MainActivity.this,
                        singer.getName() + ", " + singer.getBirth(),
                        Toast.LENGTH_SHORT).show();

            }
        });
    }
}
















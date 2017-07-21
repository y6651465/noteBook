package kr.co.mlec.java94;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017-07-20.
 */
public class MyAdapter extends BaseAdapter {

    private Context context;
    private int rowLayout;
    private ArrayList<Singer> data;
    private LayoutInflater inflater;

    public MyAdapter(Context context, int rowLayout, ArrayList<Singer> data) {
        this.context = context;
        this.rowLayout = rowLayout;
        this.data = data;
        inflater = (LayoutInflater)context.getSystemService(
                                Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int index) {
        return data.get(index);
    }

    @Override
    public long getItemId(int index) {
        return index;
    }

    @Override
    public View getView(int index, View view, ViewGroup viewGroup) {

        // list_row.xml 파일의 내용을 메모리에 객체로 변환해서 처리
        // 인플레이션 작업 진행...
        if (view == null) {
            view = inflater.inflate(rowLayout, null);
        }
        Singer singer = data.get(index);

        TextView nameTv = (TextView)view.findViewById(R.id.name);
        TextView birthTv = (TextView)view.findViewById(R.id.birth);
        ImageView img = (ImageView)view.findViewById(R.id.img);

        nameTv.setText(singer.getName());
        birthTv.setText(singer.getBirth());
        img.setImageResource(singer.getImg());

        return view;
    }
}













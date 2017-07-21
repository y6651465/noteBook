package kr.co.mlec.java94;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017-07-20.
 */
public class MyAdapter extends BaseAdapter {

    private Context context;
    private int rowLayout;
    private ArrayList<Singer> data;

    public MyAdapter(Context context, int rowLayout, ArrayList<Singer> data) {
        this.context = context;
        this.rowLayout = rowLayout;
        this.data = data;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int index) {
        return data.get(index);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}

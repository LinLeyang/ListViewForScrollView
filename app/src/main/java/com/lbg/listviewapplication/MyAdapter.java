package com.lbg.listviewapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linyueyang on 4/22/16.
 */
public class MyAdapter extends BaseAdapter {

    private List<String> list;
    private Context mContext;

    public MyAdapter(Context context) {
        mContext = context;
        initData();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(mContext).inflate(R.layout.item, parent, false);

        TextView textView = (TextView) convertView.findViewById(R.id.tv);

        textView.setText(list.get(position));

        return convertView;
    }


    private void initData() {
        list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
    }

}

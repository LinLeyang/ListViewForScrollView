package com.lbg.listviewapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ScrollView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LayoutInflater.from(this).inflate(R.layout.activity_main,(ViewGroup)findViewById(android.R.id.content),true);
        //setContentView(R.layout.activity_main);

        MyAdapter adapter = new MyAdapter(this);

        ListViewForScrollView listView = (ListViewForScrollView) findViewById(R.id.list);

        listView.setAdapter(adapter);


        //弊端就是需要手动的把scrollView手动的移到第一行
        ScrollView scrollView = (ScrollView)findViewById(R.id.sv);

        scrollView.smoothScrollTo(0, 0);

    }

}

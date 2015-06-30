package com.company.android.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyAdapter adapter = new MyAdapter(this, getarraylist());
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }

    private ArrayList<holder> getarraylist() {
        ArrayList<holder> array = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            holder h = new holder();
            h.text1 = "Item: " + i;
            h.text2 = "fucker: " + i;
            array.add(h);
        }
        return array;
    }


}

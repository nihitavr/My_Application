package com.company.android.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Nihit on 30-06-2015.
 */
public class MyAdapter extends BaseAdapter {
    LayoutInflater inflater;
    Context context;
    ArrayList<holder> myData;
    static int counter =0;
    public MyAdapter(Context context, ArrayList<holder> myData) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.context = context;
        this.myData = myData;
    }

    @Override
    public int getCount() {
        return myData.size();
    }

    @Override
    public Object getItem(int position) {
        return myData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        String test = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_row, parent, false);
            counter ++;

        }
        test = Integer.toString(counter);
        TextView textView1 = (TextView) convertView.findViewById(R.id.textView);
        TextView textView2 = (TextView) convertView.findViewById(R.id.textView2);
        textView1.setText(myData.get(position).text1);
        textView2.setText(test);
        return convertView;
    }
}

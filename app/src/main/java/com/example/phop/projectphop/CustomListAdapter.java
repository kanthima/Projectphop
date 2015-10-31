package com.example.phop.projectphop;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by PHOP on 18/10/2558.
 */
public class CustomListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] list;
    private final Integer[] imgid;

    public CustomListAdapter(Activity context, String[] list, Integer[] imgid) {
        super(context, R.layout.activity_listview, list);
        this.context = context;
        this.list = list;
        this.imgid = imgid;
    }
    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.activity_listview, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

        txtTitle.setText(list[position]);
        imageView.setImageResource(imgid[position]);
        return rowView;

    };
}


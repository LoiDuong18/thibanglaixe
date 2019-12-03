package com.fithou.vanson.certificate_motor_a1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.fithou.vanson.certificate_motor_a1.R;
import com.fithou.vanson.certificate_motor_a1.model.Custom_Row_Navigation;

import java.util.ArrayList;

/**
 * Created by vanso on 4/7/2017.
 */

public class Custom_ListView_Navigation extends ArrayAdapter<Custom_Row_Navigation> {

    private ArrayList<Custom_Row_Navigation> res;

    public Custom_ListView_Navigation(Context context, int resource, ArrayList<Custom_Row_Navigation> objects) {
        super(context, resource, objects);
        this.res = objects;
    }

    @Override
    public View getView(int position,View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.custom_listview_navigation,parent,false);
        TextView textView = (TextView)view.findViewById(R.id.textView_custom_navigation);
        textView.setText(res.get(position).getTitle());
        if (res.get(position).isColor())
            view.setBackgroundResource(R.color.colorPrimary2);
        return view;
    }
}

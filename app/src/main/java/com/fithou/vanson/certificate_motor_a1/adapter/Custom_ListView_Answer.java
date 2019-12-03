package com.fithou.vanson.certificate_motor_a1.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import com.fithou.vanson.certificate_motor_a1.R;
import com.fithou.vanson.certificate_motor_a1.model.Custom_Row_Answer;

import java.util.ArrayList;

/**
 * Created by vanson on 3/22/2017.
 */

public class Custom_ListView_Answer extends ArrayAdapter<Custom_Row_Answer> {
    private ArrayList<Custom_Row_Answer> myArray;
    private Drawable drawable;

    public Custom_ListView_Answer( Context context, int resource, ArrayList<Custom_Row_Answer> objects) {
        super(context, resource, objects);
        this.myArray = objects;
    }

    public Custom_ListView_Answer( Context context, int resource, ArrayList<Custom_Row_Answer> objects, Drawable drawable) {
        super(context, resource, objects);
        this.myArray = objects;
        this.drawable = drawable;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.custom_listview_learning,parent,false);
        Button btn =(Button) view.findViewById(R.id.lear_cus_btn);
        TextView tv = (TextView) view.findViewById(R.id.lear_cus_txt);
        // set view
        final Custom_Row_Answer row = getMyArray().get(position);
        tv.setText(row.getText());
        // Doi mau button binh thuong
        btn.setBackgroundResource(row.isBit()?R.color.colorPrimary2:R.color.white);
//        // Thay bang dau tich
//        if (row.isBit())
//            btn.setBackground(drawable);
//        else
//            btn.setBackgroundResource(R.color.white);
        // hien thi dap an dung cua he thong
        if (row.isColorBackground()) view.setBackgroundResource(R.color.colorPrimary3);
        return view;
    }

    public ArrayList<Custom_Row_Answer> getMyArray() {
        return myArray;
    }

}

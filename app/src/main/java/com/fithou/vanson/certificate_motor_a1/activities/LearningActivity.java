package com.fithou.vanson.certificate_motor_a1.activities;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.fithou.vanson.certificate_motor_a1.R;

/**
 * Created by vanson on 3/22/2017.
 */

public class LearningActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);
        customActibar();
    }

    // Tùy chỉnh ActionBar
    private void customActibar(){
        ActionBar mActionBar = getSupportActionBar();
        mActionBar.setDisplayShowHomeEnabled(false);
        mActionBar.setDisplayShowTitleEnabled(false);
        LayoutInflater mInflater = LayoutInflater.from(this);

        View mCustomView = mInflater.inflate(R.layout.custom_actionbar, null);
        TextView mTitleTextView = (TextView) mCustomView.findViewById(R.id.title_text);
        mTitleTextView.setText("Học Luật");
        ImageButton imgbHome = (ImageButton) mCustomView.findViewById(R.id.actionbar_btnHome);

        imgbHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearningActivity.this,MainActivity.class);
                startActivity(intent);
                LearningActivity.this.overridePendingTransition( R.anim.righttoleft, R.anim.stable );
            }
        });

        mActionBar.setCustomView(mCustomView);
        mActionBar.setDisplayShowCustomEnabled(true);
    }

    @Override
    public void onClick(View v) {
        Intent intent=null;
        switch (v.getId()){
            case R.id.layout_learning_0:
                intent = new Intent(this,LearningDetail.class);
                intent.putExtra("begin","0");
                intent.putExtra("end","74");
                break;
            case R.id.layout_learning_1:
                intent = new Intent(this,LearningDetail.class);
                intent.putExtra("begin","75");
                intent.putExtra("end","79");
                break;
            case R.id.layout_learning_2:
                intent = new Intent(this,LearningDetail.class);
                intent.putExtra("begin","80");
                intent.putExtra("end","115");
                break;
            case R.id.layout_learning_3:
                intent = new Intent(this,LearningDetail.class);
                intent.putExtra("begin","116");
                intent.putExtra("end","149");
                break;
            case R.id.layout_learning_4:
                intent = new Intent(this,LearningDetail.class);
                intent.putExtra("begin","0");
                intent.putExtra("end","149");
                break;
            default:
                Toast.makeText(this, "Chức năng chưa được sử dụng", Toast.LENGTH_SHORT).show();
                break;
        }
        try{
            startActivity(intent);
        }catch (Exception e){}
    }
}

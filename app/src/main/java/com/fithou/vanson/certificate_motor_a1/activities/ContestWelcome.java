package com.fithou.vanson.certificate_motor_a1.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.fithou.vanson.certificate_motor_a1.R;

/**
 * Created by vanson on 3/23/2017.
 */

public class ContestWelcome extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contest_welcome);
        customActibar();
        Button btnStart = (Button) findViewById(R.id.contest_welcome_btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContestWelcome.this,ContestDetail.class);
                startActivity(intent);
            }
        });
    }

    // Tùy chỉnh ActionBar
    private void customActibar(){
        ActionBar mActionBar = getSupportActionBar();
        mActionBar.setDisplayShowHomeEnabled(false);
        mActionBar.setDisplayShowTitleEnabled(false);
        LayoutInflater mInflater = LayoutInflater.from(this);

        View mCustomView = mInflater.inflate(R.layout.custom_actionbar, null);
        TextView mTitleTextView = (TextView) mCustomView.findViewById(R.id.title_text);
        mTitleTextView.setText("Quá trình thi");
        ImageButton imgbHome = (ImageButton) mCustomView.findViewById(R.id.actionbar_btnHome);
        ImageButton imgSearch = (ImageButton) mCustomView.findViewById(R.id.actionbar_btnSearch);
        imgSearch.setVisibility(View.INVISIBLE); // Ẩn nút tìm kiếm
        imgbHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContestWelcome.this,MainActivity.class);
                startActivity(intent);
                ContestWelcome.this.overridePendingTransition( R.anim.righttoleft, R.anim.stable );
            }
        });

        mActionBar.setCustomView(mCustomView);
        mActionBar.setDisplayShowCustomEnabled(true);
    }
}

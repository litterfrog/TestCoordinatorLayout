package com.example.fuxinpeng.testcoordinatorlayout;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;

/**
 * Created by fuxinpeng on 2016/6/1.
 */
public class CustomBHActivity extends AppCompatActivity {
    private FloatingActionButton fab;
    private AppCompatImageView iv;
    private int translate=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_custombh);
        fab= (FloatingActionButton) findViewById(R.id.fabtn_custombh);
        iv= (AppCompatImageView) findViewById(R.id.iv_notoverlap);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,R.string.app_name,Snackbar.LENGTH_LONG).show();
//                translate=translate+10;
//                iv.setTranslationY(translate);
            }
        });
    }
}

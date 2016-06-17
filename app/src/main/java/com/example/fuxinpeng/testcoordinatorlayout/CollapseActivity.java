package com.example.fuxinpeng.testcoordinatorlayout;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by fuxinpeng on 2016/5/31.
 */
public class CollapseActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_collapse);
        Toolbar toolbar = (Toolbar) findViewById(R.id.tb_collapse);
        setSupportActionBar(toolbar);
    }
}

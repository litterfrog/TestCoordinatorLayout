package com.example.fuxinpeng.testcoordinatorlayout;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.example.fuxinpeng.Adatper.MyAdatper;
import com.jcodecraeer.xrecyclerview.ProgressStyle;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.ArrayList;

/**
 * Created by fuxinpeng on 2016/6/2.
 */
public class ScrollActivity extends BaseCompatActivity{
    private XRecyclerView mXRecyclerView;
    private MyAdatper myAdatper;
    private ArrayList<String> data;
    private int datasize=8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_rec_parent);
        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar_recycleview);
        setSupportActionBar(toolbar);
        data=new ArrayList<>();
        initData();
        myAdatper=new MyAdatper(data);
        initXRecyclerView();
        mXRecyclerView.setAdapter(myAdatper);
    }

    private void initData() {
        datasize=8;
        data.clear();
        for(int i=0;i<datasize;i++){
            data.add("快给朕跪下"+i);
        }

    }
    private void moreData(int newDatasize){
        for(int i=datasize-1;i<newDatasize;i++){
            data.add("再给朕跪下"+i);
        }
        datasize=newDatasize;
    }

    private void initXRecyclerView() {
        mXRecyclerView= (XRecyclerView) findViewById(R.id.xrecycleview);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mXRecyclerView.setLayoutManager(linearLayoutManager);

        mXRecyclerView.setRefreshProgressStyle(ProgressStyle.BallBeat);
        mXRecyclerView.setLaodingMoreProgressStyle(ProgressStyle.BallBeat);
//        mXRecyclerView.setArrowImageView();
//        mXRecyclerView.addHeaderView();
//        mXRecyclerView.addFootView();
        mXRecyclerView.setLoadingListener(new XRecyclerView.LoadingListener(){

            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        initData();
                        Log.i("test",data.size()+"");

                        myAdatper.notifyDataSetChanged();
                        mXRecyclerView.refreshComplete();
                    }
                },1000);
            }

            @Override
            public void onLoadMore() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        moreData(datasize + 5);
                        myAdatper.notifyDataSetChanged();
                        mXRecyclerView.loadMoreComplete();
                    }
                },1000);


            }
        });

    }
}

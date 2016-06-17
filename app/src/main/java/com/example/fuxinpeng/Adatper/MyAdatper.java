package com.example.fuxinpeng.Adatper;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fuxinpeng.testcoordinatorlayout.R;

import java.util.ArrayList;

/**
 * Created by fuxinpeng on 2016/6/2.
 */
public class MyAdatper extends RecyclerView.Adapter<MyAdatper.ViewHolder> {
    private ArrayList<String> data;

    public MyAdatper(ArrayList<String> data) {
        this.data = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycleview,parent,false);
        ViewHolder vh=new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTextView.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView mTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            mTextView= (TextView) itemView.findViewById(R.id.tv_item_recycleview);
        }
    }
}

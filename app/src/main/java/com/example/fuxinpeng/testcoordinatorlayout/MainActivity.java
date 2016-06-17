package com.example.fuxinpeng.testcoordinatorlayout;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> myString;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("ddd", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        }).show();
            }
        });
        initMyString();
        recyclerView = (RecyclerView) findViewById(R.id.list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new RecycleAdapter());
    }
    private class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder>{

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater=getLayoutInflater();
            View view=inflater.inflate(android.R.layout.simple_list_item_1, parent, false);
            ViewHolder viewHolder=new ViewHolder(view);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.item.setText(myString.get(position));
        }

        @Override
        public int getItemCount() {
            return (null!=myString?myString.size():0);
        }
        protected  class ViewHolder extends RecyclerView.ViewHolder{
            private TextView item;
            public ViewHolder(View itemView) {
                super(itemView);
                item= (TextView) itemView.findViewById(android.R.id.text1);
            }
        }
    }
    private void initMyString() {
        myString=new ArrayList<>();
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");
        myString.add("dsf");




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

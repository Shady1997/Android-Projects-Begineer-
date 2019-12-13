package com.shady191997.tourguid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {

    ListView list1;
    AppData data;
    MyListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String name = getIntent().getStringExtra("name");


        if (name.equals("restaurant")) {
            data = new AppData();
            adapter = new MyListAdapter(Main2Activity.this, data.getRestaurants_names(), data.getRestaurants_imgs(),1);
            list1 = (ListView) findViewById(R.id.ls1);
            list1.setAdapter(adapter);
            list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 0) {


                    }

                    else if(position==1)
                    {


                    }
                }
            });

        } else if (name.equals("mosque")) {
            data = new AppData();
            adapter = new MyListAdapter(Main2Activity.this, data.getMosques_names(), data.getMosques_imgs(),3);
            list1 = (ListView) findViewById(R.id.ls1);
            list1.setAdapter(adapter);
            list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 0) {


                    }
                    else if(position==1)
                    {


                    }
                }
            });
        }

        else if (name.equals("museum")) {
            data = new AppData();
            adapter = new MyListAdapter(Main2Activity.this, data.getMuseums_names(), data.getMuseums_imgs(),2);
            list1 = (ListView) findViewById(R.id.ls1);
            list1.setAdapter(adapter);
            list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 0) {


                    }
                }
            });
        }

        else if (name.equals("market")) {
            data = new AppData();
            adapter = new MyListAdapter(Main2Activity.this, data.getMarkets_names(), data.getMarkets_imgs(),4);
            list1 = (ListView) findViewById(R.id.ls1);
            list1.setAdapter(adapter);
            list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 0) {


                    }
                }
            });
        }


        getSupportActionBar().setTitle("Choose one of the following locations");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {

            onBackPressed();
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

}

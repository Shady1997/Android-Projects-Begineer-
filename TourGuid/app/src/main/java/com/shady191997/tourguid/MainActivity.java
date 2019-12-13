package com.shady191997.tourguid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    GridView list_locations;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AppData data = new AppData();
        MyListAdapter adapter = new MyListAdapter(MainActivity.this, data.getLocations_names(), data.getLocations_imgs(),0);
        list_locations = (GridView) findViewById(R.id.grid1);
        list_locations.setAdapter(adapter);
        getSupportActionBar().setTitle("Choose Your Prefered Locations");
        list_locations.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("name", "restaurant");
                    startActivity(intent);
                }

                else if (position == 1) {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("name", "mosque");
                    startActivity(intent);
                }

                else if (position == 2) {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("name", "museum");
                    startActivity(intent);
                }

                else if (position == 3) {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("name", "market");
                    startActivity(intent);
                }



            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {

            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }





}

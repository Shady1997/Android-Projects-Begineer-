package com.shady191997.facebook;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class Main2Activity extends AppCompatActivity
       implements NavigationView.OnNavigationItemSelectedListener
{
EditText reg_username;
EditText reg_pass;
EditText reg_rep_pass;
Button register;
TextView tlogin;
   private DrawerLayout drawer2;
    private NavigationView navigationView2;
    private ActionBarDrawerToggle toggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        reg_username=(EditText)findViewById(R.id.reg_username);
        reg_pass=(EditText)findViewById(R.id.reg_pass);
        reg_rep_pass=(EditText)findViewById(R.id.reg_rep_pass);
        register=(Button)findViewById(R.id.register);
        tlogin=(TextView)findViewById(R.id.tlogin);
        tlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tologin=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(tologin);
            }
        });

//        Toolbar toolbar2 = findViewById(R.id.toolbar2);
//        setSupportActionBar(toolbar2);
         drawer2 = findViewById(R.id.drawer_layout2);
         navigationView2 = findViewById(R.id.nav_view2);
         toggle = new ActionBarDrawerToggle(
                this, drawer2, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer2.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView2.setNavigationItemSelectedListener(this);
    }

    public void signup(View view) {
        Intent intent3=new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(intent3);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout2);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main3, menu);
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
        if(toggle.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout2);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

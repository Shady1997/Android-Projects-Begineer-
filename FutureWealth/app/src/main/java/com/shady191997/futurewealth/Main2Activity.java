package com.shady191997.futurewealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void back(View view) {
        Intent intent2=new Intent(this,MainActivity.class);
        startActivity(intent2);
    }

    public void exit(View view) {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }

    public void check(View view) {
        TextView tv=(TextView)findViewById(R.id.textView3);
        Bundle bundle2=getIntent().getExtras();
        String username=bundle2.getString("username");
        String pass=bundle2.getString("pass");
        tv.setText(getResources().getString(R.string.msg)+" "+(Math.random()*1000)+" $");

    }
}

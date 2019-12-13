package com.shady191997.truecaller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
EditText et1;
EditText et2;
EditText et3;
TextView tv1;
DBConnection mydb;
ArrayList<String> ar;
Intent intent1;
Intent intent2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
        et3=(EditText)findViewById(R.id.editText3);
        tv1=(TextView) findViewById(R.id.textView);
        mydb=new DBConnection(this);
        ar=new ArrayList<String>();
        intent1=new Intent(MainActivity.this,Main2Activity.class);
        intent2=new Intent(MainActivity.this,Main3Activity.class);
    }

    public void search(View view) {
        try {
            ar=mydb.getAllCotacts(et1.getText().toString());
            tv1.setText(ar.get(0));
            et1.setText("");
        }catch (Exception e)
        {
            tv1.setText("Not Found");
            et1.setText("");
        }
    }

    public void save(View view) {
        try {
            String name=et2.getText().toString();
            String phone= et3.getText().toString();
            mydb.insertContact(name,phone);
            et1.setText("");
            et2.setText("");
            et3.setText("");
            tv1.setText("Number Save");
        }catch (Exception e)
        {
            et1.setText("");
            et2.setText("");
            et3.setText("");
            tv1.setText("an error occure");
        }
    }

    public void update(View view) {
        startActivity(intent1);
    }

    public void delete(View view) {
        startActivity(intent2);
    }
}

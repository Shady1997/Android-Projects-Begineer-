package com.shady191997.truecaller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
EditText et4;
EditText et5;
EditText et6;
TextView tv5;
DBConnection mydb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et4=(EditText)findViewById(R.id.editText4);
        et5=(EditText)findViewById(R.id.editText5);
        et6=(EditText)findViewById(R.id.editText6);
        tv5=(TextView)findViewById(R.id.textView5);
        mydb=new DBConnection(this);

    }

    public void update(View view) {
        try{
     mydb.updateContact(Integer.parseInt(et4.getText().toString()),et5.getText().toString(),et6.getText().toString());
     tv5.setText("Success");
     et4.setText("");
     et5.setText("");
     et6.setText("");}
        catch (Exception e)
        {
            tv5.setText("an error occur");
            et4.setText("");
            et5.setText("");
            et6.setText("");
        }
    }
}

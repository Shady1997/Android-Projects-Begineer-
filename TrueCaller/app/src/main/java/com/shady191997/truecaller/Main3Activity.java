package com.shady191997.truecaller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    EditText et8;
    TextView tv8;
    DBConnection mydb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        et8=(EditText)findViewById(R.id.et54);
        tv8=(TextView)findViewById(R.id.textView7);
        mydb=new DBConnection(this);
    }

    public void delete(View view) {
        try {
            mydb.deleteContact(Integer.parseInt(et8.getText().toString()));
            tv8.setText("Success...");
            et8.setText("");
        }catch (Exception e)
        {
            tv8.setText("an error occur");
            et8.setText("");
        }
    }
}

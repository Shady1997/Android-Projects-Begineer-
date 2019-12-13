package com.shady191997.welcomeform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ok(View view)
    {
        EditText et1=(EditText)findViewById(R.id.et1);
        Intent intent1=new Intent(this,Main2Activity.class);
        Bundle bundle1=new Bundle();
        bundle1.putString("name",et1.getText().toString());
        intent1.putExtras(bundle1);
        startActivity(intent1);
    }


}

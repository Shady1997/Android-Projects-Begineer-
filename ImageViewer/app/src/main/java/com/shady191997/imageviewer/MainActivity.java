package com.shady191997.imageviewer;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signup(View view) {
        Intent intent1=new Intent(this,Main2Activity.class);
        startActivity(intent1);
    }

    public void login(View view) {
        EditText et1=(EditText)findViewById(R.id.editText);
        EditText et2=(EditText)findViewById(R.id.editText2);
        if(et1.getText().toString().equals("shadyahmed9719@gmail.com")&&et2.getText().toString().equals(".191997Shady"))
        {
        Intent intent2=new Intent(this,Main3Activity.class);
        Bundle bundle1=new Bundle();
        bundle1.putString("email",et1.getText().toString());
        bundle1.putString("pass",et2.getText().toString());
        intent2.putExtras(bundle1);
        startActivity(intent2);
    }
        else
            Toast.makeText(this,getResources().getString(R.string.msg1),Toast.LENGTH_LONG).show();
    }

    public void exit(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage(getResources().getString(R.string.alert))
                .setPositiveButton(getResources().getString(R.string.yes), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        moveTaskToBack(true);
                        android.os.Process.killProcess(android.os.Process.myPid());
                        System.exit(1);
                    }
                })
                .setNegativeButton(getResources().getString(R.string.no), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }
}

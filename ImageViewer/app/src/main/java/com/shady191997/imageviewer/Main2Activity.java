package com.shady191997.imageviewer;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void signup(View view) {
        EditText et4=(EditText)findViewById(R.id.editText4);
        EditText et5=(EditText)findViewById(R.id.editText5);
        EditText et6=(EditText)findViewById(R.id.editText6);
        EditText et7=(EditText)findViewById(R.id.editText7);
        if(et4.getText().toString().equals("")||et5.getText().toString().equals("")||et6.getText().toString().equals("")||et7.getText().toString().equals(""))
            Toast.makeText(this,getResources().getString(R.string.msg2),Toast.LENGTH_LONG).show();
        else
        {
            if(et6.getText().toString().equals(et7.getText().toString())&&(et5.getText().toString().contains("@gamil.com")||et5.getText().toString().contains("@yahoo.com")||et5.getText().toString().contains("@outlook.com")))
            {
                if(et5.getText().toString().equals("shadyahmed9719@gmail.com"))
                    Toast.makeText(this,getResources().getString(R.string.msg4),Toast.LENGTH_LONG).show();
                else{
                Intent intent4=new Intent(this,Main3Activity.class);
                Bundle bundle2=new Bundle();
                bundle2.putString("name",et4.getText().toString());
                bundle2.putString("email",et5.getText().toString());
                bundle2.putString("pass",et6.getText().toString());
                intent4.putExtras(bundle2);
                startActivity(intent4);}
            }
            else
                Toast.makeText(this,getResources().getString(R.string.msg3
                ),Toast.LENGTH_LONG).show();
        }
    }

    public void back(View view) {
        Intent intent3=new Intent(this,MainActivity.class);
        startActivity(intent3);
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

package com.shady191997.simpleform;

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
        Toast.makeText(this,"Create",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Start", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "restart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "resume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "pause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "stop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Destroy", Toast.LENGTH_LONG).show();
    }

    public void exit(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to exit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        moveTaskToBack(true);
                        android.os.Process.killProcess(android.os.Process.myPid());
                        System.exit(1);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }

    public void back(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void signup(View view) {
        EditText et1=(EditText)findViewById(R.id.editText);
        EditText et2=(EditText)findViewById(R.id.editText2);
        EditText et3=(EditText)findViewById(R.id.editText5);
        EditText et4=(EditText)findViewById(R.id.editText7);
        EditText et5=(EditText)findViewById(R.id.editText6);

        if(et1.getText().toString().equals("")||et2.getText().toString().equals("")||et3.getText().toString().equals("")||et4.getText().toString().equals("")||et5.getText().toString().equals(""))
        {
            Toast.makeText(this,getResources().getString(R.string.err_msg2),Toast.LENGTH_LONG).show();     }
        else
        {
            if(et4.getText().toString().equals(et5.getText().toString()))
            {

                if(et1.getText().toString().equals("Shady191997")&&et2.getText().toString().equals(".191997Shady"))
                   {
                       Toast.makeText(this,getResources().getString(R.string.err_msg3),Toast.LENGTH_LONG).show();
                   }
                   else
                   {
                       if(et4.getText().toString().contains("@gmail.com")||et4.getText().toString().contains("@yahoo.com")||et4.getText().toString().contains("@outlook.com"))
                       {Intent intent1=new Intent(this,Main3Activity.class);
                       Bundle bundle1=new Bundle();
                       bundle1.putString("fname",et1.getText().toString());
                       bundle1.putString("lname",et2.getText().toString());
                       bundle1.putString("email",et3.getText().toString());
                       bundle1.putString("pass",et4.getText().toString());
                       intent1.putExtras(bundle1);
                       startActivity(intent1);}
                       else
                           Toast.makeText(this,getResources().getString(R.string.err_msg4),Toast.LENGTH_LONG).show();
                   }

            }
            else
                Toast.makeText(this,getResources().getString(R.string.err_msg5),Toast.LENGTH_LONG).show();
        }
    }
    }


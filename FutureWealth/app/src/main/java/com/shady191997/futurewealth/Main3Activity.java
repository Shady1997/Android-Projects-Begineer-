package com.shady191997.futurewealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void signup(View view) {
        EditText et1=(EditText)findViewById(R.id.editText3);
        EditText et2=(EditText)findViewById(R.id.editText4);
        EditText et3=(EditText)findViewById(R.id.editText5);
        EditText et4=(EditText)findViewById(R.id.editText6);
        EditText et5=(EditText)findViewById(R.id.editText7);
        if(et1.getText().toString().equals("")||et2.getText().toString().equals("")||et3.getText().toString().equals("")||et4.getText().toString().equals("")||et5.getText().toString().equals(""))
            Toast.makeText(Main3Activity.this,getResources().getString(R.string.error_msg),Toast.LENGTH_LONG).show();
        else
        {
            if(et3.getText().toString().contains("@gmail.com")||et3.getText().toString().contains("@yahoo.com")||et3.getText().toString().contains("@outlook.com")&&et4.getText().toString().equals(et5.getText().toString())) {
                Intent intent3 = new Intent(this, Main2Activity.class);
                Bundle bundle2=new Bundle();
                bundle2.putString("username",et3.getText().toString());
                bundle2.putString("pass",et4.getText().toString());
                intent3.putExtras(bundle2);
                startActivity(intent3);
            }
            else
                Toast.makeText(this,getResources().getString(R.string.error_msg),Toast.LENGTH_LONG).show();
        }
    }

    public void back(View view) {
        Intent intent4=new Intent(this,MainActivity.class);
        startActivity(intent4);
    }

    public void exit(View view) {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}

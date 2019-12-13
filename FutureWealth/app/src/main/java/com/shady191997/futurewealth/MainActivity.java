package com.shady191997.futurewealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
            EditText et1=(EditText)findViewById(R.id.editText);
            EditText et2=(EditText)findViewById(R.id.editText2);
            if(et1.getText().toString().equals("Shady191997")&&et2.getText().toString().equals(".191997Shady")) {
                Intent intent1 = new Intent(this, Main2Activity.class);
                Bundle bundle1 = new Bundle();
                bundle1.putString("username", et1.getText().toString());
                bundle1.putString("pass", et2.getText().toString());
                intent1.putExtras(bundle1);

                                //database connection
                                try{
                                    String url="jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=UTF-8";
                                    Connection con;
                                    con= DriverManager.getConnection(url,"root","");
                                    Statement statement=con.createStatement();
                                    String query="insert into users values("+et1.getText().toString()+")"+","+et2.getText().toString()+" where username='root' and password=''";
                                    statement.execute(query);
                                }
                                catch (Exception ex)
                                {

                                }

                startActivity(intent1);
            }
            else
                Toast.makeText(MainActivity.this,getResources().getString(R.string.error_msg),Toast.LENGTH_LONG).show();
            }

    public void signup(View view) {
        Intent intent5=new Intent(this,Main3Activity.class);
        startActivity(intent5);
    }
}

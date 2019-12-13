package com.shady191997.palindromapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int num,temp1,temp2,inv=0;
    int i=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText et1=(EditText)findViewById(R.id.editText);
        final TextView tv1=(TextView)findViewById(R.id.textView);
        final Button btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this,"Enter number to be checked",Toast.LENGTH_LONG).show();
                }
                else {
                    num = Integer.parseInt(et1.getText().toString());
                    temp2=Integer.parseInt(et1.getText().toString());
                    inv=num%10;
                    num/=10;
                    while (num != 0) {
                        temp1=num%10;
                        inv*=10;
                        inv+=temp1;
                        num /= 10;
                        i++;
                    }
                    if (inv==temp2)
                    {
                        tv1.setText("palindrom");
                    }
                    else
                        tv1.setText("Not palindrom");

                    i = 0;
                    temp1=0;
                    temp2=0;
                    num=0;
                    inv=0;
                      }
            }
        });

    }
}

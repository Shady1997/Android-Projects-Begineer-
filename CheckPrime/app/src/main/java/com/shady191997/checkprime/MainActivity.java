package com.shady191997.checkprime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int num,count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv1=(TextView)findViewById(R.id.textView1);
        final TextView tv2=(TextView)findViewById(R.id.textView2);
        final Button btnclose=(Button)findViewById(R.id.btnclose);
        final Button btn=(Button)findViewById(R.id.btn);
        final Button btn0=(Button)findViewById(R.id.btn0);
        final Button btn1=(Button)findViewById(R.id.btn1);
        final Button btn2=(Button)findViewById(R.id.btn2);
        final Button btn3=(Button)findViewById(R.id.btn3);
        final Button btn4=(Button)findViewById(R.id.btn4);
        final Button btn5=(Button)findViewById(R.id.btn5);
        final Button btn6=(Button)findViewById(R.id.btn6);
        final Button btn7=(Button)findViewById(R.id.btn7);
        final Button btn8=(Button)findViewById(R.id.btn8);
        final Button btn9=(Button)findViewById(R.id.btn9);
        final Button btndel=(Button)findViewById(R.id.btndel);
        btnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
               num=Integer.parseInt(tv1.getText().toString());
               for(int i=1;i<=num;i++)
               {
                  if(num%i==0)
                      count++;
               }
               if(count==2)
                   tv2.setText("The Number is Prime");
               else if(count>2)
                   tv2.setText("The Number Not Prime");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString().concat("0"));
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString().concat("1"));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString().concat("2"));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString().concat("3"));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString().concat("4"));
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString().concat("5"));
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString().concat("6"));
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString().concat("7"));
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString().concat("8"));
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString().concat("9"));
            }
        });

        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv1.getText().toString().length()>1)
                tv1.setText(tv1.getText().toString().substring(0,tv1.getText().toString().length()-1));
                else if(tv1.getText().toString().length()<=1)
                    tv1.setText("");

            }
        });
    }
}

package com.shady191997.sumtwonumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText ed1=(EditText)findViewById(R.id.editText1);
        final EditText ed2=(EditText)findViewById(R.id.editText2);
        final TextView ed3=(TextView) findViewById(R.id.textView4);
        final Button btn1=(Button)findViewById(R.id.button1);
        final Button btn2=(Button)findViewById(R.id.button2);
        final Button btn3=(Button)findViewById(R.id.button3);
        final Button btn4=(Button)findViewById(R.id.button4);
        final Button btn5=(Button)findViewById(R.id.button5);
        try {
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    float num1, num2, result = 0;
                    num1 = Float.parseFloat(ed1.getText().toString());
                    num2 = Float.parseFloat(ed2.getText().toString());
                    result = num1 + num2;
                    ed3.setText(String.valueOf(result));
                    Toast.makeText(MainActivity.this,"The Result of Your Sum is : "+String.valueOf(result),Toast.LENGTH_LONG).show();
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    float num1, num2, result = 0;
                    num1 = Float.parseFloat(ed1.getText().toString());
                    num2 = Float.parseFloat(ed2.getText().toString());
                    result = num1 - num2;
                    ed3.setText(String.valueOf(result));
                    Toast.makeText(MainActivity.this,"The Result of Your Subtract is : "+String.valueOf(result),Toast.LENGTH_LONG).show();

                }
            });

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    float num1, num2, result = 0;
                    num1 = Float.parseFloat(ed1.getText().toString());
                    num2 = Float.parseFloat(ed2.getText().toString());
                    if (num2 == 0)
                        ed3.setText("Math Error");
                    else {
                        result = num1 / num2;
                        ed3.setText(String.valueOf(result));
                        Toast.makeText(MainActivity.this,"The Result of Your Division is : "+String.valueOf(result),Toast.LENGTH_LONG).show();

                    }
                }
            });

            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    float num1, num2, result = 0;
                    num1 = Float.parseFloat(ed1.getText().toString());
                    num2 = Float.parseFloat(ed2.getText().toString());
                    result = num1 * num2;
                    ed3.setText(String.valueOf(result));
                    Toast.makeText(MainActivity.this,"The Result of Your Multiply is : "+String.valueOf(result),Toast.LENGTH_LONG).show();

                }
            });

            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int num1, num2, result = 0;
                    if(ed1.getText().toString().contains(".")||ed2.getText().toString().contains("."))
                        ed3.setText("Math Error");
                    else {
                        num1 = Integer.parseInt(ed1.getText().toString());
                        num2 = Integer.parseInt(ed2.getText().toString());
                        result = num1 % num2;
                        ed3.setText(String.valueOf(result));
                        Toast.makeText(MainActivity.this,"The Result of Your Modulas is : "+String.valueOf(result),Toast.LENGTH_LONG).show();

                    }
                }
            });
        }
        catch (Exception exp1)
        {
            ed3.setText("Math Error");

        }
    }
}

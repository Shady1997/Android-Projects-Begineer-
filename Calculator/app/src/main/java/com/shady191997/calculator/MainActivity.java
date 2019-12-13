package com.shady191997.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
double num1,num2,result=0;
int sig,error_sign,error_sign2,dotcheck,signcheck=0;
int num3,num4=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv1=(TextView)findViewById(R.id.textView1);
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
        final Button btnadd=(Button)findViewById(R.id.btnadd);
        final Button btnsub=(Button)findViewById(R.id.btnsub);
        final Button btnac=(Button)findViewById(R.id.btnac);
        final Button btndiv=(Button)findViewById(R.id.btndiv);
        final Button btnmul=(Button)findViewById(R.id.btnmul);
        final Button btnmod=(Button)findViewById(R.id.btnmod);
        final Button btnpo=(Button)findViewById(R.id.btnpo);
        final Button btnco=(Button)findViewById(R.id.btnco);
        final Button btne=(Button)findViewById(R.id.btne);
        final Button btnsq=(Button)findViewById(R.id.btnsq);
        final Button btnclos=(Button)findViewById(R.id.btnclose);
        try {
            Toast.makeText(MainActivity.this,"ًWelcome in my Calculator Dear. ",Toast.LENGTH_LONG);
            btnclos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
            btn0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tv1.getText().toString().equals("0") || tv1.getText().toString().equals("+") || tv1.getText().toString().equals("-") || tv1.getText().toString().equals("/") || tv1.getText().toString().equals("*") || tv1.getText().toString().equals("%") || tv1.getText().toString().equals("^")) {
                        tv1.setText("0");
                    }
                    else {
                        tv1.setText(tv1.getText().toString().concat("0"));
                    }
                }
            });


            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tv1.getText().toString().equals("0") || tv1.getText().toString().equals("+") || tv1.getText().toString().equals("-") || tv1.getText().toString().equals("/") || tv1.getText().toString().equals("*") || tv1.getText().toString().equals("%") || tv1.getText().toString().equals("^")) {
                        tv1.setText("1");
                    } else {
                        tv1.setText(tv1.getText().toString().concat("1"));
                    }
                }
            });


            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tv1.getText().toString().equals("0") || tv1.getText().toString().equals("+") || tv1.getText().toString().equals("-") || tv1.getText().toString().equals("/") || tv1.getText().toString().equals("*") || tv1.getText().toString().equals("%") || tv1.getText().toString().equals("^")) {
                        tv1.setText("2");
                    } else {
                        tv1.setText(tv1.getText().toString().concat("2"));
                    }
                }
            });


            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tv1.getText().toString().equals("0") || tv1.getText().toString().equals("+") || tv1.getText().toString().equals("-") || tv1.getText().toString().equals("/") || tv1.getText().toString().equals("*") || tv1.getText().toString().equals("%") || tv1.getText().toString().equals("^")) {
                        tv1.setText("3");
                    } else {
                        tv1.setText(tv1.getText().toString().concat("3"));
                    }
                }
            });


            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tv1.getText().toString().equals("0") || tv1.getText().toString().equals("+") || tv1.getText().toString().equals("-") || tv1.getText().toString().equals("/") || tv1.getText().toString().equals("*") || tv1.getText().toString().equals("%") || tv1.getText().toString().equals("^")) {
                        tv1.setText("4");
                    } else {
                        tv1.setText(tv1.getText().toString().concat("4"));
                    }
                }
            });


            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tv1.getText().toString().equals("0") || tv1.getText().toString().equals("+") || tv1.getText().toString().equals("-") || tv1.getText().toString().equals("/") || tv1.getText().toString().equals("*") || tv1.getText().toString().equals("%") || tv1.getText().toString().equals("^")) {
                        tv1.setText("5");
                    } else {
                        tv1.setText(tv1.getText().toString().concat("5"));
                    }
                }
            });


            btn6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tv1.getText().toString().equals("0") || tv1.getText().toString().equals("+") || tv1.getText().toString().equals("-") || tv1.getText().toString().equals("/") || tv1.getText().toString().equals("*") || tv1.getText().toString().equals("%") || tv1.getText().toString().equals("^")) {
                        tv1.setText("6");
                    } else {
                        tv1.setText(tv1.getText().toString().concat("6"));
                    }
                }
            });


            btn7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tv1.getText().toString().equals("0") || tv1.getText().toString().equals("+") || tv1.getText().toString().equals("-") || tv1.getText().toString().equals("/") || tv1.getText().toString().equals("*") || tv1.getText().toString().equals("%") || tv1.getText().toString().equals("^")) {
                        tv1.setText("7");
                    } else {
                        tv1.setText(tv1.getText().toString().concat("7"));
                    }
                }
            });


            btn8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tv1.getText().toString().equals("0") || tv1.getText().toString().equals("+") || tv1.getText().toString().equals("-") || tv1.getText().toString().equals("/") || tv1.getText().toString().equals("*") || tv1.getText().toString().equals("%") || tv1.getText().toString().equals("^")) {
                        tv1.setText("8");
                    } else {
                        tv1.setText(tv1.getText().toString().concat("8"));
                    }
                }
            });


            btn9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tv1.getText().toString().equals("0") || tv1.getText().toString().equals("+") || tv1.getText().toString().equals("-") || tv1.getText().toString().equals("/") || tv1.getText().toString().equals("*") || tv1.getText().toString().equals("%") || tv1.getText().toString().equals("^")) {
                        tv1.setText("9");
                    } else {
                        tv1.setText(tv1.getText().toString().concat("9"));
                    }
                }
            });


            btnco.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tv1.getText().toString().equals("0") || tv1.getText().toString().equals("+") || tv1.getText().toString().equals("-") || tv1.getText().toString().equals("/") || tv1.getText().toString().equals("*") || tv1.getText().toString().equals("%") || tv1.getText().toString().equals("^")) {
                        tv1.setText(".");
                    } else {
                        tv1.setText(tv1.getText().toString().concat("."));
                    }
                    dotcheck+=1;
                }
            });


            btnadd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(signcheck!=1)
                    {num1 = Double.parseDouble(tv1.getText().toString());
                    tv1.setText("+");
                    sig = 1;
                    dotcheck=0;
                    signcheck=1;}
                }
            });

            btnsub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(signcheck!=1)
                    {
                    num1 = Double.parseDouble(tv1.getText().toString());
                    tv1.setText("-");
                    sig = 2;
                    dotcheck=0;
                    signcheck=1;}
                }
            });


            btndiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(signcheck!=1)
                    {
                    num1 = Double.parseDouble(tv1.getText().toString());
                    tv1.setText("/");
                    sig = 4;
                    dotcheck=0;
                    signcheck=1;}
                }
            });

            btnmul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(signcheck!=1)
                    {
                    num1 = Double.parseDouble(tv1.getText().toString());
                    tv1.setText("*");
                    sig = 3;
                    dotcheck=0;
                    signcheck=1;}
                }
            });


            btnmod.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(signcheck!=1)
                    {
                    if (tv1.getText().toString().contains(".")) {
                        if (tv1.getText().toString().contains(".0")) {
                            num3 = Integer.parseInt(tv1.getText().toString());
                            error_sign = 0;
                            tv1.setText("%");
                        } else
                        { error_sign = 1;
                        tv1.setText("%");
                    }
                    }
                    else{

                        num3 = Integer.parseInt(tv1.getText().toString());
                    tv1.setText("%");
                    sig = 6;
                    dotcheck=0;
                    signcheck=1;}}
                }
            });

            btnpo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(signcheck!=1)
                    {
                    num1 = Double.parseDouble(tv1.getText().toString());
                    tv1.setText("^");
                    sig = 5;
                    dotcheck=0;
                    signcheck=1;}
                }
            });

            btnsq.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(signcheck!=1)
                    {
                    if(Double.parseDouble(tv1.getText().toString())<0.0)
                    {   error_sign2=1;
                        tv1.setText("Math Error");
                        sig=7;
                    signcheck=0;}
                    else{
                    result =Math.sqrt(Double.parseDouble(tv1.getText().toString()));
                    tv1.setText(String.valueOf(Math.sqrt(Double.parseDouble(tv1.getText().toString()))));
                    sig=7;}
                    dotcheck=0;
                        signcheck=0;}
                }
            });


            btnac.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tv1.setText("0");
                    num1 = 0;
                    num2 = 0;
                    num3 = 0;
                    num4 = 0;
                    result = 0;
                    sig = 0;
                    error_sign = 0;
                    error_sign2=0;
                    dotcheck=0;
                    signcheck=0;
                }
            });


            btne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    signcheck=0;
                    if(dotcheck>1)
                    {tv1.setText("Math Error"); }
                    else{
                    num2 = Double.parseDouble(tv1.getText().toString());
                    switch (sig) {
                        case 1:
                        {result = num1 + num2;
                            tv1.setText(String.valueOf(result));
                            Toast.makeText(MainActivity.this,"The Result of your operation is : "+String.valueOf(result),Toast.LENGTH_LONG);
                            break;}
                        case 2:
                        {  result = num1 - num2;
                            tv1.setText(String.valueOf(result));
                            Toast.makeText(MainActivity.this,"The Result of your operation is : "+String.valueOf(result),Toast.LENGTH_LONG);
                            break;}
                        case 3:
                        {result = num1 * num2;
                            tv1.setText(String.valueOf(result));
                            Toast.makeText(MainActivity.this,"The Result of your operation is : "+String.valueOf(result),Toast.LENGTH_LONG);
                            break;}
                        case 4:
                            if (num2 == 0.0)
                            {tv1.setText("Math Error");
                            break;}
                            else
                            {result = num1 / num2;
                            tv1.setText(String.valueOf(result));
                            Toast.makeText(MainActivity.this,"The Result of your operation is : "+String.valueOf(result),Toast.LENGTH_LONG);
                            break;}
                        case 5:
                        {result = Math.pow(num1, num2);
                            tv1.setText(String.valueOf(result));
                            Toast.makeText(MainActivity.this,"The Result of your operation is : "+String.valueOf(result),Toast.LENGTH_LONG);
                            break;}
                        case 6:
                                if (tv1.getText().toString().contains(".")) {
                                    if (tv1.getText().toString().contains(".0")) {
                                        num3 = Integer.parseInt(tv1.getText().toString());
                                        error_sign = 0;
                                    } else
                                    { error_sign = 1; }
                                }
                            if (error_sign == 1)
                            { tv1.setText("Math Error");
                                break;}
                            else {
                                num4 = Integer.parseInt(tv1.getText().toString());
                                result = num3 % num4;
                                tv1.setText(String.valueOf(result));
                                Toast.makeText(MainActivity.this,"The Result of your operation is : "+String.valueOf(result),Toast.LENGTH_LONG);
                                dotcheck=0;
                                break;
                                 }
                        case 7:
                            if(error_sign2==1)
                            {tv1.setText("Math Error");
                            break;}
                            else{
                            tv1.setText(String.valueOf(result));
                            Toast.makeText(MainActivity.this,"The Result of your operation is : "+String.valueOf(result),Toast.LENGTH_LONG);
                            break;}
                        default:
                            tv1.setText("0");

                    }
                }}
            });

        }
        catch (Exception exp1)
        {
            tv1.setText("Math Error");
        }




    }
}

 package com.shady191997.stopwatch;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {
TextView tv;
stopwatch stpw;
EditText et;
Button btnstr;
Button btnstp;
Button btnsres;
long count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textView2);
        et=(EditText)findViewById(R.id.editText);
        btnstr=(Button)findViewById(R.id.button);
        btnstp=(Button)findViewById(R.id.button2);
        btnsres=(Button)findViewById(R.id.button3);


    }

     public void start(View view) {
        et.setEnabled(false);
        btnsres.setEnabled(false);
        btnstr.setEnabled(false);
        imp();
     }

     public void stop(View view) {
    stpw.cancel();
    et.setEnabled(true);
    btnstr.setEnabled(true);
    btnsres.setEnabled(true);
     }
      void imp()
     {
         count=Long.parseLong(et.getText().toString())*1000;
         stpw=new stopwatch(Long.parseLong(et.getText().toString())*1000,1000);
         stpw.start();
     }

     public void resume(View view) {
         et.setEnabled(false);
         btnsres.setEnabled(false);
         btnstr.setEnabled(false);
         stpw=new stopwatch((Long.parseLong(tv.getText().toString()))*1000,1000);
         stpw.start();
     }

     public class stopwatch extends CountDownTimer
     {
         /**
          * @param millisInFuture    The number of millis in the future from the call
          *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
          *                          is called.
          * @param countDownInterval The interval along the way to receive
          *                          {@link #onTick(long)} callbacks.
          */
         public stopwatch(long millisInFuture, long countDownInterval) {
             super(millisInFuture, countDownInterval);
         }


         @Override
         public void onTick(long millisUntilFinished) {
             tv.setText(String.valueOf(millisUntilFinished/1000));
         }

         @Override
         public void onFinish() {
            tv.setText("Done");
            count=0;
            et.setEnabled(true);
            btnsres.setEnabled(false);
            btnstr.setEnabled(true);
         }
     }
 }

package com.shady191997.calcul_age;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Calc_Age(View view)
    {
        EditText obj1=(EditText)findViewById(R.id.editText1);
        int YearOfBirth=Integer.parseInt(obj1.getText().toString());
        int Currentyear = Calendar.getInstance().get(Calendar.YEAR);
        int age=Currentyear-YearOfBirth;
        Toast.makeText(this, "Now your age is "+String.valueOf(age), Toast.LENGTH_SHORT).show();
    }
}

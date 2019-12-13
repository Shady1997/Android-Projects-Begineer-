package com.shady191997.imageviewer;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }

    public void next(View view)
    {
        ImageView imgv=(ImageView)findViewById(R.id.imageView);
        switch (count)
        {
            case 0:
                imgv.setImageResource(R.drawable.image1);
                break;
            case 1:
                imgv.setImageResource(R.drawable.image2);
                break;
            case 2:
                imgv.setImageResource(R.drawable.image3);
                break;
            case 3:
                imgv.setImageResource(R.drawable.image4);
                break;
            case 4:
                imgv.setImageResource(R.drawable.image5);
                break;
            default:
                imgv.setImageResource(R.drawable.image1);
        }
        count++;
        if(count>4)
            count=0;
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

    public void back(View view) {
        Intent intent5=new Intent(this,MainActivity.class);
        startActivity(intent5);
    }
}

package com.shady191997.resturantmeal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.security.acl.Group;

public class MainActivity extends AppCompatActivity {
    GridView list;
   // SQLiteDatabase db;
    String[] maintitle ={
            "Title 1","Title 2",
            "Title 3","Title 4",
            "Title 5",
    };

    String[] subtitle ={
            "Sub Title 1","Sub Title 2",
            "Sub Title 3","Sub Title 4",
            "Sub Title 5",
    };

    Integer[] imgid={
            R.drawable.download1,R.drawable.download2,
            R.drawable.download3,R.drawable.download4,
            R.drawable.download5
    };
    ImageView imgv;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle,imgid);
        list=(GridView)findViewById(R.id.ls);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    //code specific to first list item
                    Toast.makeText(getApplicationContext(),"Facebook",Toast.LENGTH_SHORT).show();
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),"Youtube",Toast.LENGTH_SHORT).show();
                }

                else if(position == 2) {

                    Toast.makeText(getApplicationContext(),"Google",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {

                    Toast.makeText(getApplicationContext(),"Twitter",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {

                    Toast.makeText(getApplicationContext(),"Instgram",Toast.LENGTH_SHORT).show();
                }

            }
        });

//        Uri otherPath = Uri.parse("android.resource://com.shady191997.resturantmeal/drawable/download5");
//        String path = otherPath .toString();
//        try{
//            Resources res = getResources();
//            Drawable drawable = res.getDrawable(R.drawable.download1);
//            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
//            ByteArrayOutputStream stream = new ByteArrayOutputStream();
//            bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
//            byte[] bitMapData = stream.toByteArray();
//            tv=(TextView)findViewById(R.id.textView);
//            FileInputStream fileInputStream=new FileInputStream(Integer.toBinaryString(R.drawable.download1));
//            byte[] img=new byte[fileInputStream.available()];
//            fileInputStream.read(img);
//            db=this.openOrCreateDatabase("img.db", Context.MODE_PRIVATE,null);
//            db.execSQL("create table if not exists tb(a blob)");
//            ContentValues contentValues=new ContentValues();
//            contentValues.put("a",bitMapData);
//            db.insert("tb",null,contentValues);
//            fileInputStream.close();
//            Toast.makeText(MainActivity.this,"insert successfulluy",Toast.LENGTH_LONG).show();
//            tv.setText("insert Successfully");
//            Cursor res=db.rawQuery("select * from tb",null);
//            while (res.moveToNext())
//            {
//                byte[] im=res.getBlob(0);
//                Bitmap bmp= BitmapFactory.decodeByteArray(im,0,im.length);
//                imgv.setImageBitmap(bmp);
//            }
            // Load image
//            Glide.with(patientProfileImageView.getContext())
//                    .load(imageUrl)
//                    .into(patientProfileImageView);
                    }
//        catch (Exception e)
//        {
//            Toast.makeText(MainActivity.this,"not insert successfulluy",Toast.LENGTH_LONG).show();
//            tv.setText("Not insert Successfully");
//
//        }}


    public class MyListAdapter extends ArrayAdapter<String> {

        private final Activity context;
        private final String[] maintitle;
        private final String[] subtitle;
        private final Integer[] imgid;

        public MyListAdapter(Activity context, String[] maintitle,String[] subtitle,Integer[] imgid) {
            super(context, R.layout.listmeals, maintitle);
            // TODO Auto-generated constructor stub

            this.context=context;
            this.maintitle=maintitle;
            this.subtitle=subtitle;
            this.imgid=imgid;


        }

        public View getView(int position,View view,ViewGroup parent) {
            LayoutInflater inflater=context.getLayoutInflater();
            View rowView=inflater.inflate(R.layout.listmeals, null,true);
            TextView titleText = (TextView) rowView.findViewById(R.id.name);
            TextView subtitleText = (TextView) rowView.findViewById(R.id.desc);
            imgv=(ImageView)rowView.findViewById(R.id.ico);
            titleText.setText(maintitle[position]);
            subtitleText.setText(subtitle[position]);
            imgv.setImageResource(imgid[position]);

            return rowView;

        }
    }
}



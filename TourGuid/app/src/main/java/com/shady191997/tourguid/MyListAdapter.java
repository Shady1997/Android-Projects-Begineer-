package com.shady191997.tourguid;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class MyListAdapter extends ArrayAdapter<String> {
    //assign custom data stored in appdata class through Mainactivity
    private final Activity context;
    int state;
    // data to use in app include location names and pictures in cairo
    private  String[] locations_names;
    private  Integer[] locations_imgs;

    //restaurants
    private  String[] restaurants_names;
    private  Integer[] restaurants_imgs;

    //museums
    private  String[] museums_names;
    private  Integer[] museums_imgs;

    //mosques
    private  String[] mosques_names;
    private  Integer[] mosques_imgs;

    //markets
    private  String[] markets_names;
    private  Integer[] markets_imgs;


    public MyListAdapter(@NonNull Activity context, String[] locations_names, Integer[] locations_imgs,int state) {
        super(context, R.layout.choose_location, locations_names);

        this.context = context;
        this.state=state;
        if(state==0) {
            this.locations_names = locations_names;
            this.locations_imgs = locations_imgs;
        }

        if(state==1) {
            this.restaurants_names = locations_names;
            this.restaurants_imgs = locations_imgs;
        }

        else if(state==2) {
            this.museums_names = locations_names;
            this.museums_imgs = locations_imgs;
        }

        else if(state==3) {
            this.mosques_names = locations_names;
            this.mosques_imgs = locations_imgs;
        }

        else if(state==4) {
            this.markets_names = locations_names;
            this.markets_imgs = locations_imgs;
        }
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        if(state==0) {
            View rowView = inflater.inflate(R.layout.choose_location_item, null, true);
            ImageView img = (ImageView) rowView.findViewById(R.id.img1);
            TextView txt = (TextView) rowView.findViewById(R.id.txt1);
            img.setImageResource(locations_imgs[position]);
            txt.setText(locations_names[position]);
            return rowView;
        }
        else if(state==1) {
            View rowView = inflater.inflate(R.layout.choose_location, null, true);
            ImageView img = (ImageView) rowView.findViewById(R.id.img1);
            TextView txt = (TextView) rowView.findViewById(R.id.txt1);
            img.setImageResource(restaurants_imgs[position]);
            txt.setText(restaurants_names[position]);
            return rowView;
        }
        else if(state==2) {
            View rowView = inflater.inflate(R.layout.choose_location, null, true);
            ImageView img = (ImageView) rowView.findViewById(R.id.img1);
            TextView txt = (TextView) rowView.findViewById(R.id.txt1);
            img.setImageResource(museums_imgs[position]);
            txt.setText(museums_names[position]);
            return rowView;
        }
        else if(state==3) {
            View rowView = inflater.inflate(R.layout.choose_location, null, true);
            ImageView img = (ImageView) rowView.findViewById(R.id.img1);
            TextView txt = (TextView) rowView.findViewById(R.id.txt1);
            img.setImageResource(mosques_imgs[position]);
            txt.setText(mosques_names[position]);
            return rowView;
        }
        else if(state==4) {
            View rowView = inflater.inflate(R.layout.choose_location, null, true);
            ImageView img = (ImageView) rowView.findViewById(R.id.img1);
            TextView txt = (TextView) rowView.findViewById(R.id.txt1);
            img.setImageResource(markets_imgs[position]);
            txt.setText(markets_names[position]);
            return rowView;
        }
        else
            return null;
    }
}

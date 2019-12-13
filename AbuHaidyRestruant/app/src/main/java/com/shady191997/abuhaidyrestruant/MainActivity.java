package com.shady191997.abuhaidyrestruant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import Fragments.pageFragment1;
import Fragments.pageFragment2;
import Fragments.pageFragment3;

public class MainActivity extends AppCompatActivity {
    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    List<Fragment> list;

    Button next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       list= new ArrayList<>();
        list.add(new pageFragment1());
        list.add(new pageFragment2());
        list.add(new pageFragment3());
        pager = findViewById(R.id.pager);
        pagerAdapter = new slidePagerAdapter(getSupportFragmentManager(), list);
        pager.setAdapter(pagerAdapter);
    }
}

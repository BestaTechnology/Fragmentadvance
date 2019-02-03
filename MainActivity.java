package com.example.fragmentadvance;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    TabLayout tabLayout;
    AppBarLayout appBarLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout =(TabLayout)findViewById(R.id.tablayout_id);
        appBarLayout =(AppBarLayout)findViewById(R.id.appbarlayout);
        viewPager =(ViewPager)findViewById(R.id.viewpage);


        ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager());

        adapter.addFragments(new FragmentName(),"Name");
        adapter.addFragments(new FragmentCity(),"City");
        adapter.addFragments(new Fragmentcourse(),"Course");

        viewPager.setAdapter(adapter);

         tabLayout.setupWithViewPager(viewPager);
    }
}

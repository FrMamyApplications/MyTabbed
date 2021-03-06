package com.example.mytabbed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
//https://www.youtube.com/watch?v=HHd-Fa3DCng
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        TabLayout tabLayout=findViewById(R.id.tablayout);

        TabItem tabChats=findViewById ((R.id.tabChats));
        TabItem tabcall=findViewById ((R.id.tabCall));
        TabItem tabStatus=findViewById ((R.id.tabStatus));

        final ViewPager viewPager=findViewById ((R.id.viewPager));

        PagerAdapter pagerAdapter =new
                PagerAdapter (getSupportFragmentManager (),
                tabLayout.getTabCount ());
        viewPager.setAdapter (pagerAdapter);

        tabLayout.addOnTabSelectedListener (new TabLayout.OnTabSelectedListener()

        {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
              viewPager.setCurrentItem (tab.getPosition ());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }


        });

    }
}
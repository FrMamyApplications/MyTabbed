package com.example.mytabbed;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs)
    {
        super (fm);
        this.numOfTabs=numOfTabs;

    }

    @Override
    public Fragment getItem(int position) {
Log.d("www","angekommen");
        switch (position)
        {
            case 0:
                Log.d("www","return new ChatFragment");
                return new ChatFragment ();
            case 1:
                Log.d("www","return new StatusFragment");
                return new StatusFragment ();
            case 2:
                Log.d("www","return new CallFragment");
                return new CallFragment ();
            default: return null;
        }
    }

    @Override
    public int getCount( ) {
        return numOfTabs;
    }



}

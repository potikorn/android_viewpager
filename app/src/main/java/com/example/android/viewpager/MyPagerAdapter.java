package com.example.android.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by potik on 08-Dec-16.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {

    private final int PAGE_NUM = 3;

    public MyPagerAdapter (FragmentManager fm){
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_NUM;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0)
            return new OneFragment();
        else if(position == 1)
            return new TwoFragment();
        else if(position == 2)
            return new ThreeFragment();
        return null;
    }
}

package com.example.arturmusayelyan.dialogfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by artur.musayelyan on 26/12/2017.
 */

public class MyAdapter extends FragmentPagerAdapter{
    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return MyPagerFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return 4;
    }
}

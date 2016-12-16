package com.chen.news;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chen on 2016-12-16.
 */

public class MyFragmentAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragment;
    public MyFragmentAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        mFragment=new ArrayList<>();
        mFragment=fragments;

    }

    @Override
    public Fragment getItem(int position) {
        return mFragment.get(position);
    }

    @Override
    public int getCount() {
        return mFragment.size();
    }
}


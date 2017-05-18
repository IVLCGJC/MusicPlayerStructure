package com.example.android.musicplayerstructure;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by sarokkar on 2017.05.04..
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PlaylistFragment();
        } else if (position == 1){
            return new LibraryFragment();
        } else {
            return new SearchFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}

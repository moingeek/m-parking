package com.example.azamali.m_parking;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by azam ali on 2/10/2016.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Top Rated fragment activity
                return new Home();
            case 1:
                // Games fragment activity
                return new getMap();
            default:
                return null;
        }

    }
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 2;
    }


}

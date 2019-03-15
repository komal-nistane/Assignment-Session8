package com.example.nevigationdrawerdemo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.nevigationdrawerdemo.fragments.ApplicationInfoTab;
import com.example.nevigationdrawerdemo.fragments.ApplicationVersionTab;
import com.example.nevigationdrawerdemo.fragments.DeviceInformationTab;

public class PagerAdapter extends FragmentStatePagerAdapter {

    /**
     * Holds no of tabs present in the application
     */
    private int mNoOfTabs;

    /**
     *
     * @param fm
     * @param mNoOfTabs
     */
    public PagerAdapter(FragmentManager fm, int mNoOfTabs) {
        super(fm);
        this.mNoOfTabs = mNoOfTabs;
    }

    /**
     *
     * @param position
     * @return
     */
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ApplicationInfoTab applicationInfoTab = new ApplicationInfoTab();
                return  applicationInfoTab ;
            case 1:
                DeviceInformationTab deviceInformationTab = new DeviceInformationTab();
                return  deviceInformationTab;
            case 2:
                ApplicationVersionTab applicationVersionTab = new ApplicationVersionTab();
                return  applicationVersionTab;
            default:
                return null;
        }
    }

    /**
     *
     * @return
     */
    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}

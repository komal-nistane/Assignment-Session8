package com.example.nevigationdrawerdemo;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.nevigationdrawerdemo.adapter.PagerAdapter;
import com.example.nevigationdrawerdemo.fragments.ApplicationInfoTab;
import com.example.nevigationdrawerdemo.fragments.ApplicationVersionTab;

public class AboutActivity extends BaseActivity
     {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = findViewById(R.id.toolbarAboutActivity);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TabLayout tab1 = (TabLayout)findViewById(R.id.tablayout);
        tab1.addTab(tab1.newTab().setText("Application Information"));
        tab1.addTab(tab1.newTab().setText("Device Information"));
        tab1.addTab(tab1.newTab().setText("Application Version"));
        tab1.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager)findViewById(R.id.view_pager_about);
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(),tab1.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab1));
        tab1.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
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

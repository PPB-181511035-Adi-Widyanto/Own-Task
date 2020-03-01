package com.example.owntask;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;
import java.util.ArrayList;


public class ViewPageAdapter extends FragmentPagerAdapter {


    private final List<Fragment> lstFragment = new ArrayList<>();
    private final List<String> lstTitle = new ArrayList<>();

    public ViewPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return lstFragment.get(position);
    }

    @Override
    public int getCount() {

        return lstTitle.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return lstTitle.get(position);
    }


    public void AddFragment (Fragment fragment, String title) {
        lstFragment.add(fragment);
        lstTitle.add(title);
    }
}

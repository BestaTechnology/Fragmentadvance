package com.example.fragmentadvance;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPageAdapter extends FragmentPagerAdapter {


    private final ArrayList<Fragment> fragmentList = new ArrayList<>();

    private final ArrayList<String> fragmentTitleList = new ArrayList<>();
    public ViewPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return fragmentTitleList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitleList.get(position);

    }

    public void addFragments(Fragment fragment, String Title){

        fragmentList.add(fragment);
        fragmentTitleList.add(Title);

    }
}

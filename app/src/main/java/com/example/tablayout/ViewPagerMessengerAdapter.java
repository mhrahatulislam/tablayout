package com.example.tablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/** @noinspection ALL*/
public class ViewPagerMessengerAdapter extends FragmentPagerAdapter {

    public ViewPagerMessengerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ChatFragment();
        } else if (position == 1) {
            return new StatusFragment();
        } else {//2
           return new CallsFragment();
       }
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return "chat";
        } else if (position==1)
        {
            return "Status";
        }else {
            return "Call";
        }
    }
}

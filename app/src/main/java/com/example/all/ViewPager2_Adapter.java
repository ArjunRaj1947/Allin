package com.example.all;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPager2_Adapter extends FragmentStateAdapter {

    public ViewPager2_Adapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @Override
    public Fragment createFragment(int position) {
        if(position==0){
            return new Cat_Fragment();
        }
        else if(position==1){
            return new Dog_Fragment();
        }
        else{
            return new Lion_Fragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

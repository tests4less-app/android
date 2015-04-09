package com.example.tests4less.adapter;

import com.example.tests4less.CheapestFragment;
import com.example.tests4less.ClosestFragment;
import com.example.tests4less.TopRatedFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new TopRatedFragment();
		case 1:
			// Games fragment activity
			return new CheapestFragment();
		case 2:
			// Movies fragment activity
			return new ClosestFragment();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}

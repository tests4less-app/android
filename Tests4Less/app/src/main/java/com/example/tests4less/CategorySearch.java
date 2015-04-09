package com.example.tests4less;

import com.example.tests4less.adapter.TabsPagerAdapter;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;

@SuppressLint("NewApi")
public class CategorySearch extends FragmentActivity implements
		ActionBar.TabListener {

	private ViewPager viewPager;
	private TabsPagerAdapter mAdapter;
	private ActionBar actionBar;
    private ArrayList <ResultItem> fetched;
    private ResultItemArrayAdapter topRatedAdapter,closestAdapter,cheapestAdapter;
	// Tab titles
	private String[] tabs = { "Top Rated", "Cheapest", "Closest" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search);

        fetchdata();//fetches data and stores them in fetched[] Array

        // Initilization
		viewPager = (ViewPager) findViewById(R.id.pager);
		actionBar = getActionBar();
		mAdapter = new TabsPagerAdapter(getSupportFragmentManager());

		viewPager.setAdapter(mAdapter);
		actionBar.setHomeButtonEnabled(false);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);		

		// Adding Tabs
		for (String tab_name : tabs) {
			actionBar.addTab(actionBar.newTab().setText(tab_name)
					.setTabListener(this));
		}

		/**
		 * on swiping the viewpager make respective tab selected
		 * */
		viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

			@Override
			public void onPageSelected(int position) {
				// on changing the page
				// make respected tab selected
				actionBar.setSelectedNavigationItem(position);
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
			}
		});

        fetchdata();//fetches data and stores them in fetched[] Array
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// on tab selected
		// show respected fragment view

		viewPager.setCurrentItem(tab.getPosition());
        // now loading Results i.e. loading Listview
        if(tab.getPosition()==1){
                // load
            topRatedSort();
            ResultItem []array = new ResultItem[fetched.size()];
            fetched.toArray(array);
            topRatedAdapter=new ResultItemArrayAdapter(this, R.layout.listview_item_row, array);

        }
        else if (tab.getPosition()==2){
            cheapestSort();
            ResultItem []array = new ResultItem[fetched.size()];
            fetched.toArray(array);
            cheapestAdapter=new ResultItemArrayAdapter(this, R.layout.listview_item_row, array);
        }
        else{
            closestSort();
            ResultItem []array = new ResultItem[fetched.size()];
            fetched.toArray(array);
            closestAdapter=new ResultItemArrayAdapter(this, R.layout.listview_item_row, array);
        }

	}
    public void cheapestSort(){
        //sort fetched in cheapest order
    }
    public void closestSort(){
        //sort fetched in closest order
    }
    public void topRatedSort(){
        //sort fetched in toprated order
    }

    public void fetchdata(){
        //fetch data from server and store it in fetched
        fetched=new ArrayList<ResultItem>();
        //sample input
        ResultItem temp;

        temp= new ResultItem(R.drawable.ic_launcher, "ABC","place",9000,700,40, (float) 3.8,0,0,"abcd\nefgh\njkl");





        fetched.add(temp);
        temp= new ResultItem(R.drawable.ic_launcher, "Patha2","place2",3000,900,60, (float) 4.5,0,0,"abcllld\nefglkjh\njkl");
        fetched.add(temp);
        temp= new ResultItem(R.drawable.ic_launcher, "Path3","place3",8000,5000,20, (float) 2.8,0,0,"efgh\njkl");
        fetched.add(temp);
        temp=new ResultItem(R.drawable.ic_launcher, "Path4","place4",8000,2000,50, (float) 4.8,0,0,"abcd\nefgh\njkl");
        fetched.add(temp);

    }

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
	}

}

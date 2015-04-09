package com.example.tests4less;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;


public class MainActivity extends Activity implements AnimationListener {
	Animation animSideDown;
	ListView list;
	String[] web = {
		"example 1",
			"example 2",
			"example 3",
			"example 4",
			"example 5",
			"example 6",
			"example 7",
			"example 8",
			"example 9",
			"example 10",
			"example 11",
			"example 12",
			"example 13",
			"example 14",
			"example 15",
			"example 16"
			
	} ;
	Integer[] imageId = {
			R.drawable.image5,
			R.drawable.image5,
			R.drawable.image5,
			R.drawable.image5,
			R.drawable.image5,
			R.drawable.image5,
			R.drawable.image5,
			R.drawable.image5,
			R.drawable.image5,
			R.drawable.image5,
			R.drawable.image5,
			R.drawable.image5,
			R.drawable.image5,
			R.drawable.image5,
			R.drawable.image5,
			R.drawable.image5,
			
			
			
			
			
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// load the animation
				animSideDown = AnimationUtils.loadAnimation(getApplicationContext(),
						R.anim.slide_down);
				
				// set animation listener
				animSideDown.setAnimationListener(this);
				
		CustomList adapter = new
				CustomList(MainActivity.this, web, imageId);
		list=(ListView)findViewById(R.id.list);
		list.setVisibility(View.INVISIBLE);
				list.setAdapter(adapter);
				list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

		            @Override
		            public void onItemClick(AdapterView<?> parent, View view,
		                                    int position, long id) {
		                Intent category = new Intent(MainActivity.this,CategorySearch.class);
		                startActivity(category);

		            }
		        });
				
		
				

				
				
				
	}
	
	public void showSearch(View v){
		list= (ListView) findViewById(R.id.list);
		list.setVisibility(View.VISIBLE);
		list.startAnimation(animSideDown);
		
	}

	@Override
	public void onAnimationEnd(Animation arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAnimationRepeat(Animation arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAnimationStart(Animation arg0) {
		// TODO Auto-generated method stub
		
	}
			
}

package com.example.tests4less;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Esehi extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_esehi);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.esehi, menu);
		return true;
	}

}

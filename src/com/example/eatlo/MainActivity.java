package com.example.eatlo;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TabHost;

 
import android.widget.TabHost.TabSpec;
import android.app.Activity;
import android.app.TabActivity;
import android.util.Log;
import android.view.Menu;





public class MainActivity extends TabActivity {
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("ss","inside");
     
      	TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);  
    	TabSpec spec1,spec2,spec3; 
    	 
    	//tabHost.clearAllTabs();
    	// create an intent for the tab which points at the class file for that tab
    	//intent = new Intent().setClass(this,places.class);

    	//give the tab a name and set the icon for the tab
    	spec1 = tabHost.newTabSpec("places");
    	spec1.setIndicator("Places");
    	spec1.setContent(new Intent(MainActivity.this,places.class));
    	tabHost.addTab(spec1);

    	//intent = new Intent().setClass(this, dish.class);
    	spec2 = tabHost.newTabSpec("dishes");
    	spec2.setIndicator("Dishes");
    	spec2.setContent( new Intent(MainActivity.this, dish.class));
    	tabHost.addTab(spec2);

    	//intent = new Intent().setClass(this, order.class);
    	spec3 = tabHost.newTabSpec("placeOrder");
    	spec3.setIndicator("Place Order");
    	spec3.setContent(new Intent(MainActivity.this, order.class));
    	tabHost.addTab(spec3);

    	tabHost.setCurrentTab(0);
    	
    }


 /*   private TabHost getTabHost() {
		// TODO Auto-generated method stub
		return null;
	}*/
   
	protected void onDestroy() {
        
        super.onDestroy();
         
    }

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

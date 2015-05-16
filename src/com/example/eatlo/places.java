package com.example.eatlo;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import android.view.View.OnClickListener;


import android.app.Activity;
import android.content.Intent;


public class places extends Activity {
	 public void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.places);
	 
	
		 
		         // Inflate the menu; this adds items to the action bar if it is present.
		 
		        // getMenuInflater().inflate(R.menu.main, menu);
		 
		         Button button1 = (Button) findViewById(R.id.Button01);
		         Button button2 = (Button) findViewById(R.id.Button02);
		         Button button3 = (Button) findViewById(R.id.Button03);
		         Button button4 = (Button) findViewById(R.id.Button04);
		         Button button5 = (Button) findViewById(R.id.Button05);
		         Button button6 = (Button) findViewById(R.id.Button06);
		         Button button7 = (Button) findViewById(R.id.Button07);
		 
		  
		 
		         button7.setOnClickListener(new OnClickListener() {
		             @Override
		 
		             public void onClick(View view) {
		            	 Intent i=new Intent(getApplicationContext(),Menu1Activity.class);
		                    startActivity(i);}
	});
		 

		         button6.setOnClickListener(new OnClickListener() {
		             @Override

		             
		             public void onClick(View view1) {
		            	 Intent i1=new Intent(getApplicationContext(),Menu2Activity.class);
		                    startActivity(i1);}
	});
		 

		         button5.setOnClickListener(new OnClickListener() {
		             @Override
		 
		             public void onClick(View view2) {
		            	 Intent i2=new Intent(getApplicationContext(),Menu3Activity.class);
		                    startActivity(i2);
		                    		}
	});
		         button4.setOnClickListener(new OnClickListener() {
		             @Override

		             
		             public void onClick(View view1) {
		            	 Intent i1=new Intent(getApplicationContext(),Menu4Activity.class);
		                    startActivity(i1);}
	});
		         button3.setOnClickListener(new OnClickListener() {
		             @Override

		             
		             public void onClick(View view1) {
		            	 Intent i1=new Intent(getApplicationContext(),Menu5Activity.class);
		                    startActivity(i1);}
	});
		         button2.setOnClickListener(new OnClickListener() {
		             @Override

		             
		             public void onClick(View view1) {
		            	 Intent i1=new Intent(getApplicationContext(),Menu6Activity.class);
		                    startActivity(i1);}
	});
		         button1.setOnClickListener(new OnClickListener() {
		             @Override

		             
		             public void onClick(View view1) {
		            	 Intent i1=new Intent(getApplicationContext(),Menu7Activity.class);
		                    startActivity(i1);}
	});
		 
		         // return true;
		 
	 }
		 
		  

	
	

}

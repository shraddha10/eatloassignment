package com.example.eatlo;
import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;

import android.app.Activity;


public class Menu1Activity  extends Activity{
	
  TextView t1;
	 Button button1,button2;
	 
   
	
public void onCreate(Bundle savedInstanceState) {
	         super.onCreate(savedInstanceState);
	         setContentView(R.layout.menu1);
	         
	          button1 = (Button) findViewById(R.id.button1);
	          button2 = (Button) findViewById(R.id.button2);
	                 t1=(TextView)findViewById(R.id.textView1);
	                 
		 
}
}


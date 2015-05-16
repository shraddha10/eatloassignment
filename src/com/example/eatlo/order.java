package com.example.eatlo;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class order extends Activity {
	 
         
         EditText editTextUserName,number,address;
     	Button proceed;

     	DBclass h;
     	@Override
     	protected void onCreate(Bundle savedInstanceState) 
     	{
     		super.onCreate(savedInstanceState);
     		setContentView(R.layout.order);

     		// get Instance  of Database Adapter
     		h=new DBclass(this);
     		h.open();

     		// Get Refferences of Views
     		editTextUserName=(EditText)findViewById(R.id.e1);
     		number=(EditText)findViewById(R.id.e2);
     		address=(EditText)findViewById(R.id.e4);

     		proceed=(Button)findViewById(R.id.button11);
     	proceed.setOnClickListener(new View.OnClickListener() {

     		public void onClick(View v) {
     			// TODO Auto-generated method stub

     			String  userName=editTextUserName.getText().toString();
     			String  Address=address.getText().toString();
     			String  Number=number.getText().toString();

     			// check if any of the fields are vaccant
     			if(userName.equals("")||Address.equals("")||Number.equals(""))
     			{
     					Toast.makeText(getApplicationContext(), "Field Vaccant", Toast.LENGTH_LONG).show();
     					return;
     			}
     			// check if both password matches
     			
     			else
     			{    
     			    // Save the Data in Database
     			   h.insertEntry(userName, Number ,Address);
     			    Toast.makeText(getApplicationContext(), "Entered Successfully Created ", Toast.LENGTH_LONG).show();
     			    
     			}
     		}
     	});
     }
     	@Override
     	protected void onDestroy() {
     		// TODO Auto-generated method stub
     		super.onDestroy();

     		h.close();
     	}
}
	 
	



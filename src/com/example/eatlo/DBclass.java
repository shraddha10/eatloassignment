package com.example.eatlo;

import android.content.ContentValues;
import android.content.Context;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
 
public class DBclass 
{
		static final String DATABASE_NAME = "user.db";
		static final int DATABASE_VERSION = 1;
		public static final int NAME_COLUMN = 1;
		// TODO: Create public field for each column in your table.
		// SQL Statement to create a new database.
		static final String DATABASE_CREATE = "create table "+"LOGIN"+
		                             "( " +"contact"+" VARCHAR(15),"+ "name  text,address text); ";
		// Variable to hold the database instance
		public  SQLiteDatabase db;
		// Context of the application using the database.
		private final Context context;
		// Database open/upgrade helper
		private DataBaseHelper dbHelper;
		public  DBclass(Context _context) 
		{
			context = _context;
			dbHelper = new DataBaseHelper(context, DATABASE_NAME, null, DATABASE_VERSION);
		}
		public DBclass open() throws SQLException 
		{
			db = dbHelper.getWritableDatabase();
			return this;
		}
		public void close() 
		{
			db.close();
		}
 
		public  SQLiteDatabase getDatabaseInstance()
		{
			return db;
		}
 
		public  void insertEntry(String username,String num,String address)
		{
	       ContentValues newValues = new ContentValues();
			// Assign values for each row.
			newValues.put("name", username);
			newValues.put("contact",num);
			newValues.put("address",address);
 
			// Insert the row into your table
			 db.insert("LOGIN", null, newValues);
			
			///Toast.makeText(context, "Reminder Is Successfully Saved", Toast.LENGTH_LONG).show();
		}
		public int deleteEntry(String UserName)
		{
			//String id=String.valueOf(ID);
		    String where="USERNAME=?";
		    int numberOFEntriesDeleted= db.delete("LOGIN", where, new String[]{UserName}) ;
	       // Toast.makeText(context, "Number fo Entry Deleted Successfully : "+numberOFEntriesDeleted, Toast.LENGTH_LONG).show();
	        return numberOFEntriesDeleted;
		}	
		
		public void  updateEntry(String username,String num,String address)
		{
			// Define the updated row content.
			ContentValues updatedValues = new ContentValues();
			// Assign values for each row.
			updatedValues.put("USERNAME", username);
			updatedValues.put("contact",num);
			updatedValues.put("address",address);
 
	        String where="USERNAME = ?";
		    db.update("LOGIN",updatedValues, where, new String[]{username});			   
		}		
}
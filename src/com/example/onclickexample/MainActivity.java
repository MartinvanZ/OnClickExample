package com.example.onclickexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
		findViewById(R.id.button2).setOnClickListener(mGlobal_OnClickListener);
		findViewById(R.id.button3).setOnClickListener(mGlobal_OnClickListener);
		findViewById(R.id.button4).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
		    	//Inform the user the button has been clicked
		    	Toast.makeText(MainActivity.this, "Button 4 clicked.", Toast.LENGTH_SHORT).show();            					
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    //On click event for button1
    public void button1OnClick(View v) {
    	//Inform the user the button 1 has been clicked
    	Toast.makeText(this, "Button 1 clicked.", Toast.LENGTH_SHORT).show();            	
    }
    
	//Global On click listener for all views
	final OnClickListener mGlobal_OnClickListener = new OnClickListener() {
		@Override
	    public void onClick(final View v) {
	        switch(v.getId()) {
				case R.id.button2:
					//Inform the user the button2 has been clicked
					Toast.makeText(MainActivity.this, "Button 2 clicked.", Toast.LENGTH_SHORT).show();         		
				break;
				case R.id.button3:
					//Inform the user the button3 has been clicked
					Toast.makeText(MainActivity.this, "Button 3 clicked.", Toast.LENGTH_SHORT).show();         		
				break;
	        }
	    }

	};
    
}

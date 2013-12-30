package com.example.cardmanager;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.TextView;

public class CardFragmentActivity extends Activity {

	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_cardfragment);

	    //to allow Up navigation with the app icon in the action bar
	    getActionBar().setDisplayHomeAsUpEnabled(true);
	    
	    //receive bundle input
	    Bundle extras = getIntent().getExtras();
	    if (extras != null) {
	     String receivedName = extras.getString("FRAGMENT_NAME");
	     if (receivedName != null) {
	    	//adds title
	 	    TextView fragmentName = (TextView)findViewById(R.id.fragmentName);
	 	    fragmentName.setText(receivedName + " information (location? tel number? winner code?)");
	 	    this.setTitle(receivedName);
	     }
	    }
	    
	    //adds images (stamps)
	    GridView gridview = (GridView) findViewById(R.id.fragmentGridview);
	    gridview.setAdapter(new ImageAdapter(this));

	   }
	  
		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			switch (item.getItemId()) {
			case android.R.id.home:
				// This ID represents the Home or Up button. In the case of this
				// activity, the Up button is shown. Use NavUtils to allow users
				// to navigate up one level in the application structure. For
				// more details, see the Navigation pattern on Android Design:
				//
				// http://developer.android.com/design/patterns/navigation.html#up-vs-back
				//
				NavUtils.navigateUpFromSameTask(this);
				return true;
			}
			return super.onOptionsItemSelected(item);
		}
}

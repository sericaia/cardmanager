package com.example.cardmanager;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

public class CardViewActivity extends ListActivity {
	
	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    //to allow Up navigation with the app icon in the action bar
	    getActionBar().setDisplayHomeAsUpEnabled(true);
	    
	    //change background color programmatically
	    getWindow().getDecorView().setBackgroundColor(getResources().getColor(R.color.beige));
	    
	    //TODO ir buscar a base de dados, bem como as imagens
	    String[] card_values = new String[] { "H3", "Chimarrão", "Restaurante da Sé" };
	    String[] card_description = new String[] { "H3 description", "Chimarrão description", "Restaurante da Sé description" };
		
	    // Define a new Adapter
	 	//Context, voucher name, voucher description
	 	MyCardAdapter adapter = new MyCardAdapter(this, card_values, card_description);

	 	// Assign adapter to ListView
	 	setListAdapter(adapter); 	 			   
	  } 
	  
	  /*
	   * onListItemClick calls openCardData
	   */
		@Override
		public void onListItemClick(ListView list, View view, int position, long id) {
			try{		
				final String itemName = (String) list.getItemAtPosition(position);
		        openCardData(view, itemName);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	  
	  /*
	   * openCardData creates new activities for each card, showing stamps achieved
	   */
	  public void openCardData(View view, String itemName) {
		    Intent intent = new Intent(this, CardFragmentActivity.class);
		    intent.putExtra("FRAGMENT_NAME", itemName);
		    startActivity(intent);
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

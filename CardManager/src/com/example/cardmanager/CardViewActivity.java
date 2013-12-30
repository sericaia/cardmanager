package com.example.cardmanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class CardViewActivity extends Activity {
	
	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_cardlistview);
	    
	    final ListView listview = (ListView) findViewById(R.id.cardlistview);
	    
	    //TODO ir buscar a base de dados, bem como as imagens
	    String[] values = new String[] { "H3", "Chimarrão", "Resturante da Sé" };

	    final ArrayList<String> list = new ArrayList<String>();
	    for (int i = 0; i < values.length; ++i) {
	      list.add(values[i]);
	    }
	    
	    //set new font
	    final Typeface fontsStyle = CustomFontsLoader.getTypeface(this.getBaseContext(), 
    			CustomFontsLoader.FONT_NAME_4_ELLIANAPATH);
	 	
	    final StableArrayAdapter adapter = new StableArrayAdapter(this,
	        android.R.layout.simple_list_item_1, list){	    
	    /*	@Override
	        public View getView(int position, View convertView, ViewGroup parent) {
	            ViewGroup view = (ViewGroup) super.getView(position, convertView, parent);
	            if(convertView == null) CardViewActivity.setAppFont(view, fontsStyle);
	            return view;
	        }*/
	    };
	    listview.setAdapter(adapter);
	   
	    listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

	      @Override
	      public void onItemClick(AdapterView<?> parent, final View view,
	          int position, long id) {
	        final String itemName = (String) parent.getItemAtPosition(position);
	        
	        openCardData(view, itemName);
	      }
	    });
	  }  
	  
	  /*
	   * Set font to views
	   */
	  public static final void setAppFont(ViewGroup mContainer, Typeface mFont)
	  {
	      if (mContainer == null || mFont == null) return;

	      final int mCount = mContainer.getChildCount();

	      // Loop through all of the children.
	      for (int i = 0; i < mCount; ++i)
	      {
	          final View mChild = mContainer.getChildAt(i);
	          if (mChild instanceof TextView)
	          {
	              // Set the font if it is a TextView.
	              ((TextView) mChild).setTypeface(mFont);
	          }
	          else if (mChild instanceof ViewGroup)
	          {
	              // Recursively attempt another ViewGroup.
	              setAppFont((ViewGroup) mChild, mFont);
	          }
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

	  private class StableArrayAdapter extends ArrayAdapter<String> {

	    HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

	    public StableArrayAdapter(Context context, int textViewResourceId,
	        List<String> objects) {
	      super(context, textViewResourceId, objects);
	      for (int i = 0; i < objects.size(); ++i) {
	        mIdMap.put(objects.get(i), i);
	      }
	    }

	    @Override
	    public long getItemId(int position) {
	      String item = getItem(position);
	      return mIdMap.get(item);
	    }

	    @Override
	    public boolean hasStableIds() {
	      return true;
	    }

	  }

	
}

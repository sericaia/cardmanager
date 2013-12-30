package com.example.cardmanager;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

public class ImageAdapter extends BaseAdapter {

	    private Context mContext;

	    public ImageAdapter(Context c) {
	        mContext = c;
	    }

	    public int getCount() {
	        return stampIDs.length;
	    }

	    public Object getItem(int position) {
	        return null;
	    }

	    public long getItemId(int position) {
	        return 0;
	    }

	    // create a new ImageView for each item referenced by the Adapter
	    public View getView(int position, View convertView, ViewGroup parent) {
	        ImageView imageView;
	        if (convertView == null) {  // if it's not recycled, initialize some attributes
	            imageView = new ImageView(mContext);
	            imageView.setLayoutParams(new GridView.LayoutParams(150, 150));
	            
	            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
	            imageView.setPadding(10, 10, 10, 10);
	            imageView.computeScroll(); 
	         
	        } else {
	            imageView = (ImageView) convertView;
	        }

	        //TODO
	        //IF position < numberOfStampsAchieved THEN stampPreenchido
	        //ELSE stampNaoPreenchido
	        imageView.setImageResource(stampIDs[position]);
	        
	        //TODO
	        //Set stamp date
	        
	        return imageView;
	    }

	    // references to our images
	    //TODO depends on our domain -> number of stamps achieved
	    private Integer[] stampIDs = {
	            R.drawable.stampconfirmed, 
	            R.drawable.stampconfirmed, 
	            R.drawable.stampconfirmed, 
	            R.drawable.stampconfirmed, 
	            R.drawable.stampconfirmed, 
	            R.drawable.stampnotconfirmed,
	            R.drawable.stampnotconfirmed,
	            R.drawable.stampnotconfirmed,
	            R.drawable.stampnotconfirmed
	     };
	

}

package com.example.cardmanager;

import com.example.cardmanager.R.color;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyCardAdapter extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;
	private final String[] description;

	public MyCardAdapter(Context context, String[] values, String[] description) {
		super(context, android.R.layout.two_line_list_item, values);
		this.context = context;
		this.values = values;
		this.description = description;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(android.R.layout.two_line_list_item, parent, false);
		
		rowView.setPadding(15, 15, 15, 15);
		
		//search for name and description
		TextView textName = (TextView) rowView.findViewById(android.R.id.text1);
		TextView textDescription = (TextView) rowView.findViewById(android.R.id.text2);
		
		//set name style
		Typeface cupcakeFontsStyle = CustomFontsLoader.getTypeface(context, CustomFontsLoader.FONT_NAME_3_CUPCAKES);
		textName.setTextAppearance(context, R.style.UiCardTitleTextView);
		textName.setTypeface(cupcakeFontsStyle, Typeface.BOLD);	
		textName.setText(values[position]);
		
		//set description style
	    Typeface arialFontsStyle = CustomFontsLoader.getTypeface(context, CustomFontsLoader.FONT_NAME_1_ARIAL);
	    textDescription.setTextAppearance(context, R.style.UiNormalTextView);		
	    textDescription.setTypeface(arialFontsStyle);	
	    textDescription.setText(description[position]);
		
		// TODO -> add "1 stamp left", etc.	>>> fazer isto de forma mais inteligente.
		String s = values[position];		
		if(s.startsWith("H3")){
			textDescription.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_launcher, 0);
		}		
		return rowView;
	}
} 

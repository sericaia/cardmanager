package com.example.cardmanager;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.widget.TextView;

public class CustomFontsLoader {

	public static final int FONT_NAME_1_ARIAL =   0;
	public static final int FONT_NAME_2_GILLSANS =   1;
	public static final int FONT_NAME_3_CUPCAKES =   2;
	public static final int FONT_NAME_4_ELLIANAPATH =   3;
	
	private static final int NUM_OF_CUSTOM_FONTS = 4;
	
	private static boolean fontsLoaded = false;
	
	private static Typeface[] fonts = new Typeface[NUM_OF_CUSTOM_FONTS];
	
	//TODO - Add fonts
	private static String[] fontPath = {
	    "fonts/arial.ttf",
	    "fonts/GLSNECB.TTF",	
	    "fonts/JellykaCuttyCupcakes.ttf",
	    "fonts/EllianarellesPath.ttf"
	};
		
	/**
	 * Returns a loaded custom font based on it's identifier. 
	 * 
	 * @param context - the current context
	 * @param fontIdentifier = the identifier of the requested font
	 * 
	 * @return Typeface object of the requested font.
	 */
	public static Typeface getTypeface(Context context, int fontIdentifier) {
	    if (!fontsLoaded) {
	        loadFonts(context);
	    }
	    return fonts[fontIdentifier];
	}
	
	
	static void loadFonts(Context context) {
	    for (int i = 0; i < NUM_OF_CUSTOM_FONTS; i++) {
	        fonts[i] = Typeface.createFromAsset(context.getAssets(), fontPath[i]);
	    }
	    fontsLoaded = true;
	}
	
}
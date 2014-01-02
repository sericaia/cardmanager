package com.example.cardmanager;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//disable actionbar in the first activity
		ActionBar actionBar = getActionBar();
	    actionBar.hide();
	    
	    //add style to app name textbox
	    TextView app_name = (TextView) findViewById(R.id.appWelcomeLogo);
	    Typeface cupcakeFontsStyle = CustomFontsLoader.getTypeface(getBaseContext(), CustomFontsLoader.FONT_NAME_3_CUPCAKES);
	    app_name.setTypeface(cupcakeFontsStyle, Typeface.BOLD);
	   
	    //add style to 'newsignup' textbox
	    TextView newsignUp = (TextView) findViewById(R.id.newsignUp);
	    Typeface arialFontsStyle = CustomFontsLoader.getTypeface(getBaseContext(), CustomFontsLoader.FONT_NAME_1_ARIAL);
	    newsignUp.setTypeface(arialFontsStyle);
	    
		//Sign In button
		Button signInBtn = (Button) findViewById(R.id.signInButton);
		signInBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {			
            	startActivity(new Intent("com.example.cardmanager.CARDLIST"));		  
			}
		});
		
		//Sign In with google account
		Button signInGoogleBtn = (Button) findViewById(R.id.signIn_google_Button);
		signInGoogleBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {			
            	Toast.makeText(getApplicationContext(), "Failed to sign in with Google account. Not implemented yet!", 
            			Toast.LENGTH_SHORT).show();	  
			}
		});
		
		//Sign In with google account
		Button signInFacebookBtn = (Button) findViewById(R.id.signIn_facebook_Button);
		signInFacebookBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {			
            	Toast.makeText(getApplicationContext(), "Failed to sign in with Facebook account. Not implemented yet!", 
            			Toast.LENGTH_SHORT).show();	  
			}
		});
		
		//Sign Up 
		Button signUpBtn = (Button) findViewById(R.id.signUpButton);
		signUpBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {			
            	Toast.makeText(getApplicationContext(), "Under construction!", 
            			Toast.LENGTH_SHORT).show();	  
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

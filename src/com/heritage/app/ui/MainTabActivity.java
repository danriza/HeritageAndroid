package com.heritage.app.ui;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

import com.heritage.app.R;

public class MainTabActivity extends TabActivity{
	 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_tab);
 
        TabHost tabHost = getTabHost();
        
        // Tab for Home
        TabSpec homespec = tabHost.newTabSpec("Home");
        // setting Title and Icon for the Tab
        homespec.setIndicator(getString(R.string.BTN_HOME_TAB), getResources().getDrawable(R.drawable.icon));
        Intent homeIntent = new Intent(this, HomeActivity.class);
        homespec.setContent(homeIntent);
        
        // Tab for Locate Us
        TabSpec locateUsspec = tabHost.newTabSpec("Locate Us");
        // setting Title and Icon for the Tab
        locateUsspec.setIndicator(getString(R.string.BTN_LOCATE_US_TAB), getResources().getDrawable(R.drawable.icon));
        Intent locateUsIntent = new Intent(this, LocateUsActivity.class);
        locateUsspec.setContent(locateUsIntent);
 
        // Tab for Mobile Banking
        TabSpec mobileBankingspec = tabHost.newTabSpec("Mobile Banking");
        mobileBankingspec.setIndicator(getString(R.string.BTN_MOBILE_BANKING_TAB), getResources().getDrawable(R.drawable.icon));
        Intent mobileBankingIntent = new Intent(this, MobileBankingActivity.class);
        mobileBankingspec.setContent(mobileBankingIntent);
 
        // Tab for Feedback
        TabSpec feedbackspec = tabHost.newTabSpec("Feedback");
        feedbackspec.setIndicator(getString(R.string.BTN_FEEDBACK_TAB), getResources().getDrawable(R.drawable.icon));
        Intent feedbackIntent = new Intent(this, FeedbackActivity.class);
        feedbackspec.setContent(feedbackIntent);
        
     // Tab for Contact
        TabSpec contactspec = tabHost.newTabSpec("Contact");
        contactspec.setIndicator(getString(R.string.BTN_CONTACT_TAB), getResources().getDrawable(R.drawable.icon));
        Intent contactIntent = new Intent(this, ContactActivity.class);
        contactspec.setContent(contactIntent);
 
        // Adding all TabSpec to TabHost
        tabHost.addTab(homespec); // Adding home tab
        tabHost.addTab(locateUsspec); // Adding locateUs tab
        tabHost.addTab(mobileBankingspec); // Adding mobileBanking tab
        tabHost.addTab(feedbackspec);// Adding feedback tab
        tabHost.addTab(contactspec);//Adding contact tab
    }

}

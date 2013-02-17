package com.heritage.app.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.heritage.app.R;

public class HomeActivity extends Activity {
	
	private static enum SearchType {TYPE_ATM, TYPE_BRANCH};
	
	private Button mButtonLogin;
	private Button mAtmButton;
	private Button mBranchButton;
	private Button mSearchButton;
	private EditText mPostcodeEditText;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_screen);
		
		initViews();
		
		setSearchType(SearchType.TYPE_BRANCH);
		
		mAtmButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				setSearchType(SearchType.TYPE_ATM);
			}
		});
		mBranchButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				setSearchType(SearchType.TYPE_BRANCH);
			}
		});
		mSearchButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				MainTabActivity activity = (MainTabActivity) HomeActivity.this.getParent();
				activity.getTabHost().setCurrentTab(1);
				
			}
		});
	}
	
	/**Initializes all views from the screen (buttons, texts ...) */
	private void initViews(){
		//init edit text
		mPostcodeEditText = (EditText) findViewById(R.id.edittext_enter_postcode);
		//init buttons
		mButtonLogin = (Button) findViewById(R.id.button_mobile_banking);
		mAtmButton = (Button) findViewById(R.id.button_atm);
		mBranchButton = (Button) findViewById(R.id.button_branch);
		mSearchButton = (Button) findViewById(R.id.button_search);
	}
	
	private void setSearchType (SearchType searchType){
		if (searchType == SearchType.TYPE_ATM){
			mAtmButton.setPressed(true);
			mAtmButton.setEnabled(false);
			mBranchButton.setPressed(false);
			mBranchButton.setEnabled(true);
		} else {
			mBranchButton.setPressed(true);
			mBranchButton.setEnabled(false);
			mAtmButton.setPressed(false);
			mAtmButton.setEnabled(true);
		}
	}

}

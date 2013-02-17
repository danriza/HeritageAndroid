package com.heritage.app.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.heritage.app.R;

public class FeedbackActivity extends Activity{
	
	private EditText mEditTextName;
	private EditText mEditTextEmail;
	private EditText mEditTextComments;
	private Button mSendButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.feedback_screen);
		
		initViews();
		
		if (mSendButton != null) {
			mSendButton.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("message/rfc822");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"zumazum_2005@yahoo.com"});
					i.putExtra(Intent.EXTRA_SUBJECT, "subject of email");
					i.putExtra(Intent.EXTRA_TEXT   , "body of email");
					try {
					    startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
					    Toast.makeText(FeedbackActivity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
					
				}
			});//clickListener
			
		}
	}
	
	/**Initializes all views from the screen (buttons, texts ...) */
	private void initViews(){
		//init edit texts
		mEditTextName = (EditText) findViewById(R.id.edittext_enter_name);
		mEditTextEmail = (EditText) findViewById(R.id.edittext_enter_email);
		mEditTextComments = (EditText) findViewById(R.id.edittext_enter_comments);
		//init send button
		mSendButton = (Button) findViewById(R.id.button_send);
	}

}

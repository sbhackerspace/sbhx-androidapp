package com.handbanana.sbhx;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

@SuppressLint({ "NewApi", "ShowToast" })
public class MainActivity extends Activity {
	final public static String EXTRA_MESSAGE = "com.handbanana.sbhx.MESSAGE";
	private static final int DIALOG_YES_NO_LONG_MESSAGE = 2;
	



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		
		// This Button opens sbhackerspace via the default system web browser	
		Button btn = (Button) findViewById(R.id.homeButton1);
		btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
				myWebLink.setData(Uri.parse("http://www.sbhackerspace.com"));
				startActivity(myWebLink);
					
				}
			});
		
		// This Button opens the wiki page
		Button btn2 = (Button) findViewById(R.id.homeButton3);
		btn2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
				myWebLink.setData(Uri.parse("http://sbhackerspace.com/wiki/index.php?title=Main_Page"));
				startActivity(myWebLink);
					
				}
			});

		//Calendar Button
		Button btn3 = (Button) findViewById(R.id.homeButton2);
		btn3.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
				myWebLink.setData(Uri.parse("http://sbhackerspace.com/calendar/"));
				startActivity(myWebLink);
				
			}
		});
		
		//Map Button
		Button btn4 = (Button) findViewById(R.id.homeButtonMap);
		btn4.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
				myWebLink.setData(Uri.parse("http://goo.gl/zizzT"));
				startActivity(myWebLink);
				
				/** This opens the calendar app.
					This button needs to be reconfigured to open the sbhackerspace calendar in some way. */
//				Intent myWebLink = new Intent("android.intent.action.MAIN");
//				myWebLink.setComponent(ComponentName.unflattenFromString("com.android.calendar.mytracks"));
//				myWebLink.addCategory("android.intent.category.LAUNCHER");
//				startActivity(myWebLink);
				}
			});
		
		/** Took this functionality out but left the code in as a reference*/
		
/*		Display a long text message with yes/no buttons and handle each message
		//This button works with a popup to deliver info about sbhx
		Button btn4 = (Button) findViewById(R.id.homeButton4);
		btn4.setOnClickListener(new OnClickListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog(DIALOG_YES_NO_LONG_MESSAGE);
				}
			});
		
		//This button opens a webview and links to WebView1.java
		Button btn5 = (Button) findViewById(R.id.webViewTestBtn);
		btn5.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent webView1 = new Intent(MainActivity.this, WebView1.class);
				MainActivity.this.startActivity(webView1);
			}
		});*/
		
	}
	
	// This bit of code makes the popup work...
	@Override
	protected Dialog onCreateDialog(int id) {
		switch (id) {
		case DIALOG_YES_NO_LONG_MESSAGE:
			return new AlertDialog.Builder(MainActivity.this)
			.setIconAttribute(android.R.attr.alertDialogIcon)
			.setTitle(R.string.alert_dialog_two_buttons_msg)
			.setMessage(R.string.alert_dialog_two_buttons2_msg)
			.setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int whichButton) {
					
					/*user clicked ok */
				}
			})
			
			/** THIS BIT ADDS BUTTONS TO THE POPUP*/
//			.setNeutralButton(R.string.alert_dialog_something, new DialogInterface.OnClickListener() {
//				public void onClick(DialogInterface dialog, int whichButton) {
//					
//					/*use clicked something*/
//				}
//			})
//			.setNegativeButton(R.string.alert_dialog_cancel, new DialogInterface.OnClickListener() {
//				public void onClick(DialogInterface dialog, int whichButton) {
//					
//					/*user clicked cancel*/
//				}
//			})
			/**TO HERE*/
			.create();
				
		}
		return null;
	}
	

	@Override
		public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.activity_main, menu);
		return true;
	}
	
	@SuppressWarnings("deprecation")
	@SuppressLint("ShowToast")
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()) {
		case R.id.item_about_us:
            showDialog(DIALOG_YES_NO_LONG_MESSAGE);
            break;
		case R.id.menu_settings:
			//Add another intent here...
			break;
	default:
		return super.onOptionsItemSelected(item);
		}
		
		return true;
	}

}
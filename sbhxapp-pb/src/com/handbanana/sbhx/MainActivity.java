package com.handbanana.sbhx;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

@SuppressLint("NewApi")
public class MainActivity extends Activity {
	final public static String EXTRA_MESSAGE = "com.handbanana.sbhx.MESSAGE";
	private static final int DIALOG_YES_NO_LONG_MESSAGE = 2;

//The x and y position of the button on screen.
//Point p;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	Button btn = (Button) findViewById(R.id.homeButton1);
	btn.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
			myWebLink.setData(Uri.parse("http://www.sbhackerspace.com"));
				startActivity(myWebLink);
				
			}
		});
	Button btn2 = (Button) findViewById(R.id.homeButton3);
	btn2.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
			myWebLink.setData(Uri.parse("http://sbhackerspace.com/wiki/index.php?title=Main_Page"));
				startActivity(myWebLink);
				
			}
		});
	Button btn3 = (Button) findViewById(R.id.homeButton2);
	btn3.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent myWebLink = new Intent("android.intent.action.MAIN");
			myWebLink.setComponent(ComponentName.unflattenFromString("com.android.calendar.mytracks"));
			myWebLink.addCategory("android.intent.category.LAUNCHER");
				startActivity(myWebLink);
			}
		});
	
	/*Display a long text message with yes/no buttons and handle each message*/
	Button btn4 = (Button) findViewById(R.id.homeButton4);
	btn4.setOnClickListener(new OnClickListener() {
		
		@SuppressWarnings("deprecation")
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			showDialog(DIALOG_YES_NO_LONG_MESSAGE);
		}
	});
	
//	Button btn_show = (Button) findViewById(R.id.homeButton4);
//	btn_show.setOnClickListener(new OnClickListener() {
//		
//		@Override
//		public void onClick(View arg0) {
//			// TODO Auto-generated method stub
//			if (p != null)
//			showPopup(MainActivity.this, p);	
//		}
//	});
//	
//	}
//	
//	@Override
//	public void onWindowFocusChanged(boolean hasFocus) {
//		int[] location = new int[2];
//		Button button = (Button) findViewById(R.id.homeButton4);
//		
//		//Get the x, y location and store it in the location[] array
//		//location[0] =x location[1] = y
//		p = new Point();
//		p.x = location[0];
//		p.y = location[1];
//	}
//	
//	//The method that displays the popup
//	@SuppressWarnings("deprecation")
//	private void showPopup(final Activity context, Point p) {
//		int popupWidth = 200;
//		int popupHeight = 150;
//		
//		//Inflate the popup.xml
//		LinearLayout viewGroup = (LinearLayout) context.findViewById(R.id.popup1);
//		LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//		View layout = layoutInflater.inflate(R.layout.activity_show_pop_up, viewGroup);
//		
//		//Create the popup window
//		final PopupWindow popup = new PopupWindow(context);
//		popup.setContentView(layout);
//		popup.setWidth(popupWidth);
//		popup.setHeight(popupHeight);
//		popup.setFocusable(true);
//		
//		//Offest to align popup
//		int OFFSET_X = 30;
//		int OFFSET_Y = 30;
//		
//		//Clear translucent background
//		popup.setBackgroundDrawable(new BitmapDrawable());
//		
//		//Display the popup at specific location
//		popup.showAtLocation(layout, Gravity.NO_GRAVITY, p.x + OFFSET_X, p.y + OFFSET_Y);
//		
//		//Close the popup when clicked
//		Button close = (Button) layout.findViewById(R.id.homeButton4);
//		close.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				popup.dismiss();
//				
//			}
//		});
		
		
	}
	
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
			.create();
				
		}
		return null;
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
}
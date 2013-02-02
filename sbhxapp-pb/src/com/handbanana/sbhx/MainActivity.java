package com.handbanana.sbhx;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	final public static String EXTRA_MESSAGE = "com.handbanana.sbhx.MESSAGE";

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
	Button btn3 = (Button) findViewById(R.id.homebutton2);
	btn3.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
			myWebLink.setData(Uri.parse("http://www.sbhackerspace.com/calendar"));
				startActivity(myWebLink);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
}
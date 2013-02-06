package com.handbanana.sbhx;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebView1 extends Activity {
	
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		
		setContentView(R.layout.webview);
		
//		final String mimeType = "text/html";
		
		WebView wv;
		
		wv = (WebView) findViewById(R.id.webView1);
//		wv.loadData("<a href='x'>Google</a>", mimeType, null);
		wv.loadUrl("http://example.com");
	}
}

package com.SpinnerDemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerDemoActivity extends Activity implements OnItemSelectedListener {
    /** Called when the activity is first created. */
	private TextView selection;
	private Spinner sp;
	private static final String[] list = {"php", "python", "django", "ruby","mysql"};
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        selection=(TextView)findViewById(R.id.selection);
        
        sp=(Spinner)findViewById(R.id.spinner);
        sp.setOnItemSelectedListener(this);
        
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(aa);
        
        
    }

	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		int position = 0;
		selection.setText(list[position]);
		
	}

	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		selection.setText("");
		
	}
}
package com.example.lab_7;

import com.example.lab_7.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {
	private final String TAG = "lab-7";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_message);
		
		//Display the message that was passed in the Intent
		Intent intent = getIntent();
		String message = intent.getStringExtra("MESSAGE");
		TextView textView1 = (TextView) findViewById(R.id.textView1);
		textView1.setText(message);
		Log.d(TAG, "Second Activity onCreate() Fired.");
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		Log.d(TAG, "Second Activity onStart() Fired.");
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		Log.d(TAG, "Second Activity onResume() Fired.");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		Log.d(TAG, "Second Activity onPause() Fired.");
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		Log.d(TAG, "Second Activity onStop() Fired.");
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d(TAG, "Second Activity onRestart() Fired.");
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(TAG, "Second Activity onDestroy() Fired.");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_message, menu);
		return true;
	}

}

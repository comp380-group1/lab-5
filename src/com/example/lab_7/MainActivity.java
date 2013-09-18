package com.example.lab_7;

import com.example.lab_7.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	private final String TAG = "lab-7";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d(TAG, "Main Activity onCreate() Fired.");
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		Log.d(TAG, "Main Activity onStart() Fired.");
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		Log.d(TAG, "Main Activity onResume() Fired.");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		Log.d(TAG, "Main Activity onPause() Fired.");
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		Log.d(TAG, "Main Activity onStop() Fired.");
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d(TAG, "Main Activity onRestart() Fired.");
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(TAG, "Main Activity onDestroy() Fired.");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void button1_onClick(View view) {
		Intent intent = new Intent(this, DisplayMessageActivity.class);
		EditText editText1 = (EditText) findViewById(R.id.editText1);
		String message = editText1.getText().toString();
		intent.putExtra("MESSAGE", message);
		startActivity(intent);
		Log.d(TAG,"Main Activity button1_onClick() Fired. Launching New Activity.");
	}
	
	public void button2_onClick(View view){
		this.finish();
	}
	

}

package com.geo.myrecicler;


import java.util.List;

import com.geo.myrecicler.model.Material;
import com.geo.myrecicler.repository.material.MaterialDAO;
import com.geo.myrecicler.util.ClassList;
import com.geo.myreciclerlib.data.DatabaseManager;
import com.geo.myreciclerlib.util.ClassFinder;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	 
	private TextView txtInfo;
	   
	@Override
	protected void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		txtInfo = (TextView) findViewById(R.id.info_hello);
		List<Class<?>> classes = ClassList.getModelClasses();
		DatabaseManager.init(this, classes);
		MaterialDAO.getInstance(this.getApplicationContext()).createOrUpdate(new Material("Alumi", 5, "Lbs"));
		txtInfo.setText(MaterialDAO.getInstance(this.getApplicationContext()).findAll().toString());
		hola
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

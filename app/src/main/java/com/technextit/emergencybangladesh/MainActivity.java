package com.technextit.emergencybangladesh;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.technextit.emergencybangladesh.data.DataUtils;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // set first view page after app installed
        setContentView(R.layout.home);

        // as the first page is a listView so we set this listView
        ListView serviceListView = (ListView) findViewById(R.id.serviceList);

        // adapter is used to show custom listView.
        HomeAdapter adapter = new HomeAdapter(MainActivity.this, DataUtils.serviceList());

        serviceListView.setAdapter(adapter);


       // for fragment (ex: getSupportFragmentManager().beginTransaction().add(R.id.frame_layout, new MyFragment()).commit(); )
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

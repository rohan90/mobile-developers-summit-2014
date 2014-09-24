package com.example.rohan.materialpoc;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class Start extends ListActivity {

    String demos[] = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        demos = getResources().getStringArray(R.array.demos);
        setListAdapter(new ArrayAdapter<String>(Start.this, android.R.layout.simple_list_item_1, demos));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String demo = demos[position];
        try {
            Class demoClass = Class.forName("com.example.rohan.materialpoc." + demo);

            Intent i = new Intent(Start.this, demoClass);
            startActivity(i);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.start, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_exit){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

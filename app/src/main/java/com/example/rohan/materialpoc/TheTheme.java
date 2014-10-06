package com.example.rohan.materialpoc;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.transition.Explode;


public class TheTheme extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);

        // inside your activity
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);

        // set an exit transition
        getWindow().setExitTransition(new Explode());

        setContentView(R.layout.activity_thetheme);
    }



}

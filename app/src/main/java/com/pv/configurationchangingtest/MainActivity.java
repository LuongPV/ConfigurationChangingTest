package com.pv.configurationchangingtest;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w(this.toString(), "onCreate() savedInstanceState = " + savedInstanceState);

        getFragmentManager().beginTransaction().replace(R.id.content, new MyFragment()).commit();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.w(this.toString(), "onSaveInstanceState() outState = " + outState);
        outState.putLong("activity", 6969696969696L);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.w(this.toString(), "onCreate() onRestoreInstanceState = " + savedInstanceState);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.w(this.toString(), "onConfigurationChanged() -----------------------------------------");
    }
}

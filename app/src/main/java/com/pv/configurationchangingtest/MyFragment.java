package com.pv.configurationchangingtest;

import android.app.Fragment;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

public class MyFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.w(this.toString(), "onCreate() savedInstanceState = " + savedInstanceState);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.w(this.toString(), "onSaveInstanceState() outState = " + outState);
        outState.putLong("fragment", 969696969696L);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.w(this.toString(), "onConfigurationChanged() -----------------------------------------");
    }
}

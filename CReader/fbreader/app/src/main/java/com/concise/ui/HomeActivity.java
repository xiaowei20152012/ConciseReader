package com.concise.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import org.geometerplus.zlibrary.ui.android.R;


public class HomeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}

package com.example.locomwo;

import android.app.Activity;

/**
 * Created by rnishant on 11/25/2015.
 */
public class TakeARide extends Activity {
    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.takeride);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}

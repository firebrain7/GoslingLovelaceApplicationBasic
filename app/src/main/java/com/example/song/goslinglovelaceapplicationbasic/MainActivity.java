package com.example.song.goslinglovelaceapplicationbasic;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
/*
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.landscape_activity);
            Log.i("changed", "landscape"); // 横屏
        }

        else if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.portrait_activity);
            Log.i("changed", "portrait"); // 竖屏
        }
        else{
            Log.i("changed", "NO"); // 竖屏
        }
    }
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity);

        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.landscape_activity);
            Log.i("info", "landscape"); // 横屏
        }

        else if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.portrait_activity);
            Log.i("info", "portrait"); // 竖屏
        }
        else{
            Log.i("info", "NO"); // 竖屏
        }

    }
}

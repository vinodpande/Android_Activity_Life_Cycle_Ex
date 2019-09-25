package com.tutorial.androidactivitylifecycleex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
/*
 Android Activity Lifecycle is controlled by 7 methods of android.app.Activity class.
 An activity is the single screen in android. It is like window or frame of Java.
 By the help of activity, you can place all your UI components or widgets in a single screen.
 The 7 lifecycle method of Activity describes how activity will behave at different states.
 onCreate()-> called when activity is first created.
 onStart()-> called when activity is becoming visible to the user.
 onResume()-> called when activity will start interacting with the user.
 onPause()->called when activity is not visible to the user.
 onRestart()-> called after your activity is stopped, prior to start.
 onStop()-> called when activity is no longer visible to the user.
 onDestroy()-> called before the activity is destroyed.

 */
public class MainActivity extends AppCompatActivity {
    String TAG="MainActivity";

    /*
    onCreate()-> called when activity is first created.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate method called");
    }
    /*
    onStart()-> called when activity is becoming visible to the user.
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart method called");
    }

    /*
    onRestart()-> called after your activity is stopped, prior to start.
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart method called");
    }

    /*
    onResume()-> called when activity will start interacting with the user.
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume method called");
    }

    /*
    onPause()->called when activity is not visible to the user.
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause method called");
    }

    /*
    onStop()-> called when activity is no longer visible to the user.
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop method called");
    }

    /*
    onDestroy()-> called before the activity is destroyed.
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy method called");
    }
}

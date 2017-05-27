package com.example.adybrown.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static String logtag = "TwoButtonApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonStart = (Button)findViewById(R.id.buttonStart);
        buttonStart.setOnClickListener(startListener);

        Button buttonStop = (Button)findViewById(R.id.buttonStop);
        buttonStop.setOnClickListener(stopListener);
    }

    private OnClickListener startListener = new OnClickListener() {
        public void onClick(View v){
            Log.d(logtag, "onClick() called - start button");
            Toast.makeText(MainActivity.this, "The Start button was clicked.", Toast.LENGTH_LONG).show();
            Log.d(logtag, "OnClick() ended - start button");
        }
    };

    private OnClickListener stopListener = new OnClickListener() {
        public void onClick(View v){
            Log.d(logtag, "onClick() called - stop button");
            Toast.makeText(MainActivity.this, "The Stop button was clicked.", Toast.LENGTH_LONG).show();
            Log.d(logtag, "OnClick() ended - stop button");
        }
    };

    @Override
    protected void onStart(){
        Log.d(logtag, "onStart() called");
        super.onStart();
    }

    @Override
    protected void onResume(){
        Log.d(logtag, "onResume() called");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(logtag, "onPause() called");
        super.onPause();
    }

    @Override
    protected void onStop(){
        Log.d(logtag, "onStop() called");
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        Log.d(logtag, "onDestroy() called");
        super.onDestroy();
    }
}

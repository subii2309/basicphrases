package com.example.subin.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonTapped(View view) { //this way can be done to avoid writing 8 different methods for each button

        int id = view.getId(); //when seen the logs u get big numbers for each id, so assign it to a variable
        String ourId = ""; //this will the id that we have given initially it ll be null

        ourId = view.getResources().getResourceEntryName(id); //now our id will consist of the real id by using this method.

        int resourceId = getResources().getIdentifier(ourId, "raw","com.example.subin.basicphrases" ); //this is to find the resource based on our id

        MediaPlayer mPlayer = MediaPlayer.create(this, resourceId); //play the song with that particular resource id matched
        mPlayer.start();
        //Log.i("Button tapped", ourId);
    }
}

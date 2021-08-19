package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //sound will play only if you are inside the app
        //creating a media player playing the notification sound
//        MediaPlayer player = MediaPlayer.create(this, Settings.System.DEFAULT_NOTIFICATION_URI);
//        player.setLooping(true);
//        player.start();

        //to to play in background even in another app above code is moved to MyServices.java
    }

    public void start(View view){
        startService(new Intent(MainActivity.this, MyServices.class));
    }

    public void stop(View view){
        stopService(new Intent(MainActivity.this, MyServices.class));
    }
}
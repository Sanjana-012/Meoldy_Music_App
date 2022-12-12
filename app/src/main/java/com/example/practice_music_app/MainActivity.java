package com.example.practice_music_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hide action bar
        if( getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }
    }

    //redirects to PlaylistActivity
    public void playlistExo (View view){
        Intent intent = new Intent(MainActivity.this, PlaylistActivity.class);
        startActivity(intent);
    }

    //redirects to PlaylistActivity2
    public void playlistWeeklyMix2 (View view){
        Intent intent = new Intent(MainActivity.this, PlaylistActivity2.class);
        startActivity(intent);
    }


    //redirects to settingsActivity
    public void settingsPage(View view) {
        Intent intent = new Intent(this,SettingActivity.class);
        startActivity(intent);
    }

    //redirects to TimerActivity
    public void timerPage(View view) {
        Intent intent = new Intent(this,TimerActivity.class);
        startActivity(intent);
    }

    //redirects to ProfileActivity
    public void profilePage(View view) {
        Intent intent = new Intent(this,ProfileActivity.class);
        startActivity(intent);
    }

    //redirects to FolderActivity
    public void folderPage(View view) {
        Intent intent = new Intent(this,FolderActivity.class);
        startActivity(intent);
    }


    //redirects to PlaylistActivity3
    public void playlistLikedSongs(View view) {
        Intent intent = new Intent(this,PlaylistActivity3.class);
        startActivity(intent);
    }

    //redirects to SearchActivity
    public void searchPage(View view) {
        Intent intent = new Intent(this,SearchActivity.class);
        startActivity(intent);
    }
}
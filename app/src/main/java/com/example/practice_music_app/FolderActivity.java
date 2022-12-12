package com.example.practice_music_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FolderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folder);

        //hide action bar
        if( getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }
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
    //redirects to MainActivity
    public void homePage(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    //redirects to PlaylistActivity3(liked songs)
    public void playlistLikedSongs(View view) {
        Intent intent = new Intent(this,PlaylistActivity3.class);
        startActivity(intent);
    }
    //redirects to PlaylistActivity4(downloaded files)
    public void playlistDownloadedFiles(View view) {
        Intent intent = new Intent(this,PlaylistActivity4.class);
        startActivity(intent);
    }

    //redirect to SearchActivity
    public void searchPage(View view) {
        Intent intent = new Intent(this,SearchActivity.class);
        startActivity(intent);
    }

    //redirect to YourPlaylistsActivity
    public void yourPlaylistPage(View view) {
        Intent intent = new Intent(this,YourPlaylistsActivity.class);
        startActivity(intent);
    }
    //redirect to AddToPlaylistActivity
    public void addToPlaylist(View view) {
        Intent intent = new Intent(this,AddToPlaylistActivity.class);
        startActivity(intent);
    }

}
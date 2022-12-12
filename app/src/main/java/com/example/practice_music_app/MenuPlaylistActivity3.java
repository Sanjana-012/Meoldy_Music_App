package com.example.practice_music_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuPlaylistActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_playlist3);

        //hide action bar
        if( getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }

    }

    //redirects to PlaylistActivity3
    public void down(View view) {
        Intent intent = new Intent(this,PlaylistActivity3.class);
        startActivity(intent);
    }

    //redirects to FolderActivity
    public void back(View view) {
        Intent intent = new Intent(this,FolderActivity.class);
        startActivity(intent);
    }

    //redirects to AddToPlaylistActivity
    public void addToPlaylist(View view) {
        Intent intent = new Intent(this,AddToPlaylistActivity.class);
        startActivity(intent);
    }

}
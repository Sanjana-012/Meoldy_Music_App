package com.example.practice_music_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class YourPlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_playlists);


        if( getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }

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

    //redirect to MainActivity
    public void homePage(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    //redirects to MainActivity
    public void back(View view) {
        Intent intent = new Intent(this,FolderActivity.class);
        startActivity(intent);
    }

    //redirects to SearchActivity
    public void searchPage(View view) {
        Intent intent = new Intent(this,SearchActivity.class);
        startActivity(intent);
    }
}
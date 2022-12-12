package com.example.practice_music_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class PlaylistActivity2 extends AppCompatActivity {

    //declare songCollection2 variable
    SongCollection2 songCollection2 = new SongCollection2();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist2);

        //hide action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    public void handleSelection(View view) {
        //get id of the selected song
        String resourceId = getResources().getResourceEntryName(view.getId());
        int currentArrayIndex = songCollection2.searchSongById(resourceId);
       // Log.d("music", "the current array position is " + currentArrayIndex);
        sendDataToActivity(currentArrayIndex);
    }

    //will receive the array index position of the image button and will send it over to PlaySongActivity
    public void sendDataToActivity(int index) {
        Intent intent = new Intent(this, PlaySongActivity2.class);
        intent.putExtra("index", index);
        startActivity(intent);
    }

    //redirects to MainActivity
    public void back(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
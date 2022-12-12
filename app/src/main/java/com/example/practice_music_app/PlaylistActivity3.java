package com.example.practice_music_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class PlaylistActivity3 extends AppCompatActivity {

    //declare songCollection3 variable
    SongCollection3 songCollection3 = new SongCollection3();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist3);

        //hide action bar
        if( getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }

    }

    public void handleSelection(View view) {
        //get id of the selected song
        String resourceId = getResources().getResourceEntryName(view.getId());
        int currentArrayIndex = songCollection3.searchSongById(resourceId);
      //  Log.d("music", "the current array position is " + currentArrayIndex);
        sendDataToActivity(currentArrayIndex);
    }

    //will receive the array index position of the image button and will send it over to PlaySongActivity
    public void sendDataToActivity(int index) {
        Intent intent = new Intent(this, PlaySongActivity3.class);
        intent.putExtra("index", index);
        startActivity(intent);
    }

    //redirect to ProfileActivity
    public void profilePage(View view) {
        Intent intent = new Intent(this,ProfileActivity.class);
        startActivity(intent);
    }

    //redirect to FolderActivity
    public void folderPage(View view) {
        Intent intent = new Intent(this,FolderActivity.class);
        startActivity(intent);
    }

    //redirect to MainActivity
    public void homePage(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    //redirect to MainActivity
    public void back(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    //shows the options when the 3 button menu is clicked
    public void menu(View view) {
        Intent intent = new Intent(this,MenuPlaylistActivity3.class);
        startActivity(intent);
    }

    //redirects to SearchActivity
    public void searchPage(View view) {
        Intent intent = new Intent(this,SearchActivity.class);
        startActivity(intent);
    }

}
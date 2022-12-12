package com.example.practice_music_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddToPlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_playlist);

        //hide action bar
        if( getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }
    }

    //creating backBtn method
    public void backBtn(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
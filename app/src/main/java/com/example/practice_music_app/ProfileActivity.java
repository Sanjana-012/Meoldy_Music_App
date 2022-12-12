package com.example.practice_music_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

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

    //redirects to settingsActivity
    public void settingsPage(View view) {
        Intent intent = new Intent(this,SettingActivity.class);
        startActivity(intent);
    }

    //redirects to HomeActivity
    public void homePage(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    //redirects to FolderActivity
    public void folderPage(View view) {
        Intent intent = new Intent(this,FolderActivity.class);
        startActivity(intent);
    }

    //redirects to SearchActivity
    public void searchPage(View view) {
        Intent intent = new Intent(this,SearchActivity.class);
        startActivity(intent);
    }
}
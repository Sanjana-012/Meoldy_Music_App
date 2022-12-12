package com.example.practice_music_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SearchActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search2);

        if( getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }

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

    //redirects to ProfileActivity
    public void profilePage(View view) {
        Intent intent = new Intent(this,ProfileActivity.class);
        startActivity(intent);
    }


}
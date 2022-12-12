
package com.example.practice_music_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

//import com.squareup.picasso.Picasso;

public class PlaylistActivity extends AppCompatActivity {

    //declare songCollection variable
    SongCollection songCollection = new SongCollection();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        //hide action bar
        if( getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }
    }

    //when the song is selected it gives the current array position
    public void handleSelection(View view) {
        //get id of the selected song
        String resourceId = getResources().getResourceEntryName(view.getId());
        int currentArrayIndex = songCollection.searchSongById(resourceId);
       // Log.d("music","the current array position is "+ currentArrayIndex);
        sendDataToActivity(currentArrayIndex);
    }

    //will receive the array index position of the image button and will send it over to PlaySongActivity
    public void sendDataToActivity(int index){
        Intent intent = new Intent(this,PlaySongActivity.class);
        intent.putExtra("index",index);
        startActivity(intent);
    }

    //redirects to MainActivity
    public void back(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}

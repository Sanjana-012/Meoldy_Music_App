package com.example.practice_music_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlaySongActivity extends AppCompatActivity {
    //declare variables
    private String title = "";
    private String artiste = "";
    private String fileLink = "";
    private int drawable;
    private int currentIndex = -1;

    private MediaPlayer player = new MediaPlayer();
    private ImageButton btnPlayPause = null;
    SeekBar seekbar;
    Handler handler = new Handler();
    private SongCollection songCollection = new SongCollection();
    private SongCollection originalSongCollection = new SongCollection();

    List<Song> shuffleList = Arrays.asList(songCollection.songs);


    ImageButton repeatBtn;
    Boolean repeatFlag = false;

    ImageButton shuffleBtn;
    Boolean shuffleFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //remove the action bar
        if( getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);
        btnPlayPause = findViewById(R.id.btnPlayPause);

        repeatBtn = findViewById(R.id.repeatBtn);
        shuffleBtn = findViewById(R.id.shuffleBtn);

        seekbar = findViewById(R.id.seekBar);
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (player != null && player.isPlaying()) {
                    player.seekTo(seekBar.getProgress());

                }
            }
        });
        //Log.d("temasek","we rx"+ btnPlayPause);
        //to import data from the other class
        Bundle songData = this.getIntent().getExtras();
        currentIndex = songData.getInt("index");

        displaySongBasedOnIndex(currentIndex);
        playSong(fileLink);


    }


    Runnable p_bar = new Runnable() {
        @Override
        public void run() {
            if (player != null && player.isPlaying()) {
                seekbar.setProgress(player.getCurrentPosition());

            }
            handler.postDelayed(this, 1000);
        }
    };


    public void displaySongBasedOnIndex(int selectIndex){

        Song song = songCollection.getCurrentSong(selectIndex);
        title = song.getTitle();
        artiste=song.getArtiste();
        fileLink=song.getFileLink();
        drawable=song.getDrawable();

        TextView txtTitle= findViewById(R.id.txtSongTitle);
        txtTitle.setText(title);

        TextView txtArtist= findViewById(R.id.txtArtist);
        txtArtist.setText(artiste);

        ImageView coverArt= findViewById(R.id.imgCoverArt);
        coverArt.setImageResource(drawable);
    }

    public void playSong(String songUrl){

        try{
            player.reset();
            player.setDataSource(songUrl);
            player.prepare();
            player.start();
            seekbar.setMax(player.getDuration());
            handler.removeCallbacks(p_bar);
            handler.postDelayed(p_bar, 1000);
            setTitle(title);
            gracefullyStopsWhenMusicEnds();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }


    public void playOrPauseMusic(View view) {

        if(player.isPlaying()){
            player.pause();
            btnPlayPause.setImageResource(R.drawable.play);
        }else{
            player.start();
            btnPlayPause.setImageResource(R.drawable.pause);
        }

    }

    public void gracefullyStopsWhenMusicEnds(){
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                if(repeatFlag){
                    playOrPauseMusic(null);
                }else{
                    btnPlayPause.setImageResource(R.drawable.play);
                   // Toast.makeText(PlaySongActivity.this, "Song ended", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }

    public void playNext(View view) {
        currentIndex = songCollection.getNextSong(currentIndex);
        //Toast.makeText(this, "The current index is now " + currentIndex, Toast.LENGTH_LONG).show();
        displaySongBasedOnIndex(currentIndex);
        playSong(fileLink);
        btnPlayPause.setImageResource(R.drawable.pause);
    }

    public void playPrevious(View view) {
        currentIndex = songCollection.getPrevSong(currentIndex);
        //Toast.makeText(this, "The current index is now " + currentIndex, Toast.LENGTH_LONG).show();
        displaySongBasedOnIndex(currentIndex);
        playSong(fileLink);
        btnPlayPause.setImageResource(R.drawable.pause);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (player != null) {
            handler.removeCallbacks(p_bar);
            player.stop();
            super.onBackPressed();
            player.release();
            player = null;
        }
    }

    public void repeatSong(View view) {

        if(repeatFlag){
            repeatBtn.setBackgroundResource(R.drawable.repeat_off);

        }else{
            //change graphic to the repeat on
            repeatBtn.setBackgroundResource(R.drawable.repeat_on);
        }
        repeatFlag = !repeatFlag;
    }


    public void shuffleSong(View view) {

        if(shuffleFlag){
            shuffleBtn.setBackgroundResource(R.drawable.shuffle_off);
            songCollection = new SongCollection();

        }else{
            //change graphic to the shuffle on
            shuffleBtn.setBackgroundResource(R.drawable.shuffle_on);
            Collections.shuffle(shuffleList);
            shuffleList.toArray(songCollection.songs);

        }
        shuffleFlag = !shuffleFlag;
    }


    public void menu(View view) {
        Intent intent = new Intent(this,MenuPlaySongActivity.class);
        startActivity(intent);
    }


}
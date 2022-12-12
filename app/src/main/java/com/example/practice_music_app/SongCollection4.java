package com.example.practice_music_app;

public class SongCollection4 {

    //created an array of songs
    public Song songs[] = new Song[2];
    //creating collection of songs
    public SongCollection4() {

        Song obsession = new Song("S1001",
                "Obsession",
                "EXO",
                "https://p.scdn.co/mp3-preview/609a0a4fd0beed7e140d269969ec5cec3e61f6c1?cid=2afe87a64b0042dabf51f37318616965",
                3.99,
                R.drawable.exo1);

        Song fakeLove = new Song("S1002",
                "Fake Love",
                "BTS",
                "https://p.scdn.co/mp3-preview/ba2f6a0afc23bf9f804c233d3e587009e52a14c2?cid=2afe87a64b0042dabf51f37318616965\n",
                4.04,
                R.drawable.fake_love);


        //pushes each song into an array
        songs[0]= obsession;
        songs[1]= fakeLove;


    }

    //return a song object to the caller based on the given string
    public int searchSongById(String id){

        for (int index = 0; index < songs.length; index++) {
            Song tempSong = songs[index];
            if (tempSong.getId().equals(id)){
                return index;
            }
        }
        return -1;
    }

    public Song getCurrentSong(int currentSongId) {
        return songs[currentSongId];
    }

    public int getNextSong(int currentSongIndex){
        if (currentSongIndex >= songs.length-1){
            return currentSongIndex;
        }
        else{
            return currentSongIndex +1;
        }
    }

    public int getPrevSong(int currentSongIndex){
        if (currentSongIndex <= 0){
            return currentSongIndex;
        }
        else{
            return currentSongIndex -1;
        }
    }


}

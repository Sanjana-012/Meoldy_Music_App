package com.example.practice_music_app;

public class SongCollection {

    //created an array of songs
    public Song songs[] = new Song[6];
    //creating collection of songs
    public SongCollection() {

        Song obsession = new Song("S1001",
                "Obsession",
                "EXO",
                "https://p.scdn.co/mp3-preview/609a0a4fd0beed7e140d269969ec5cec3e61f6c1?cid=2afe87a64b0042dabf51f37318616965",
                3.99,
                R.drawable.exo1);

        Song trouble = new Song("S1002",
                "Trouble",
                "EXO",
                "https://p.scdn.co/mp3-preview/013f9d7b8a2c823e98a8bf1821a1cda214164e6f?cid=2afe87a64b0042dabf51f37318616965\n",
                3.29,
                R.drawable.exo1);

        Song sign = new Song("S1003",
                "Sign",
                "EXO",
                "https://p.scdn.co/mp3-preview/d546dbf75ffe43dcc145705db4aa603e7f7572f7?cid=2afe87a64b0042dabf51f37318616965\n",
                3.34,
                R.drawable.exo2);

        Song theEve = new Song("S1004",
                "The Eve",
                "EXO",
                "https://p.scdn.co/mp3-preview/1df2fbfcc227ddd6cb54e4c5273fbbd61d31617a?cid=2afe87a64b0042dabf51f37318616965\n",
                2.25,
                R.drawable.exo3);

        Song forever = new Song("S1005",
                "Forever",
                "EXO",
                "https://p.scdn.co/mp3-preview/f3ae9f4bd18b8fa8de209df4096bafbdc1f30ca9?cid=2afe87a64b0042dabf51f37318616965",
                3.91,
                R.drawable.exo3);

        Song tempo = new Song("S1006",
                "Tempo",
                "EXO",
                "https://p.scdn.co/mp3-preview/c18730b77aebf6d947ccc5d5bf9bfcbc83aa85e2?cid=2afe87a64b0042dabf51f37318616965\n",
                3.75,
                R.drawable.exo2);

        //pushes each song into an array
        songs[0]= obsession;
        songs[1]= trouble;
        songs[2]= sign;
        songs[3]= theEve;
        songs[4]= forever;
        songs[5]= tempo;

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

package com.example.practice_music_app;

public class SongCollection2 {

    //created an array of songs
    public Song songs[] = new Song[6];
    //creating collection of songs
    public SongCollection2() {

        Song billieJean = new Song("S1001",
                "Billie Jean",
                "Michael Jackson",
                "https://p.scdn.co/mp3-preview/71638a1eac196a5daa9fbf152693585e323d8558?cid=2afe87a64b0042dabf51f37318616965\n",
                4.9,
                R.drawable.billie_jean);

        Song howLong = new Song("S1002",
                "How Long",
                "Charlie Puth",
                "https://p.scdn.co/mp3-preview/2e3c2595984f1beef0c621672469359157e98d3c?cid=2afe87a64b0042dabf51f37318616965\n",
                3.35,
                R.drawable.how_long);

        Song smoothCriminal = new Song("S1003",
                "Smooth Criminal",
                "Michael Jackson",
                "https://p.scdn.co/mp3-preview/9935079cbd61d8c6e2d6a17054b0960d7148ff4f?cid=2afe87a64b0042dabf51f37318616965\n",
                4.3,
                R.drawable.smooth_criminal);

        Song theEve = new Song("S1004",
                "The Eve",
                "EXO",
                "https://p.scdn.co/mp3-preview/1df2fbfcc227ddd6cb54e4c5273fbbd61d31617a?cid=2afe87a64b0042dabf51f37318616965\n",
                2.25,
                R.drawable.exo3);

        Song leftAndRight = new Song("S1005",
                "Left and Right",
                "Charlie Puth (ft.Jungkook)",
                "https://p.scdn.co/mp3-preview/7b872d741e9af03f02569b2f1f5b7e738c573d34?cid=2afe87a64b0042dabf51f37318616965\n",
                2.57,
                R.drawable.left_and_right);

        Song fakeLove = new Song("S1006",
                "Fake Love",
                "BTS",
                "https://p.scdn.co/mp3-preview/ba2f6a0afc23bf9f804c233d3e587009e52a14c2?cid=2afe87a64b0042dabf51f37318616965\n",
                4.04,
                R.drawable.fake_love);

        //pushes each song into an array
        songs[0]= billieJean;
        songs[1]= howLong;
        songs[2]= smoothCriminal;
        songs[3]= theEve;
        songs[4]= leftAndRight;
        songs[5]= fakeLove;

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

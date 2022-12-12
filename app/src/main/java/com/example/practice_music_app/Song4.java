package com.example.practice_music_app;

public class Song4 {

    //creating variables to store items in
    private String id;
    private String title;
    private String artiste;
    private String fileLink;
    private double songLength;
    private int drawable;

    //creating getter & setter methods to read attributes of instance w/o directly accessing the attribute
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public String getFileLink() {
        return fileLink;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }

    public double getSongLength() {
        return songLength;
    }

    public void setSongLength(double songLength) {
        this.songLength = songLength;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    //create song constructor
    public Song4(String id, String title, String artiste, String fileLink, double songLength, int drawable) {
        this.id = id;
        this.title = title;
        this.artiste = artiste;
        this.fileLink = fileLink;
        this.songLength = songLength;
        this.drawable = drawable;
    }
}

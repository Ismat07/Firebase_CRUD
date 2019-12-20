package com.example.ismatkhanam.crud_oper;

public class Track {
    private String trackId;
    private String trackName;
    private int rating;

    public Track() {}

    public Track(String trackId, String trackName, int rating) {
        this.trackName = trackName;
        this.rating = rating;
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public String getTrackId() {
        return trackId;
    }

    public int getRating() {
        return rating;
    }
}

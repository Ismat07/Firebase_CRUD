package com.example.ismatkhanam.crud_oper;

public class Artist {
    String artistName,artistId,artistGenres;

    public Artist(){

    }
     public Artist(String artistId, String artistName, String artistGenres){
         this.artistId = artistId;
         this.artistName = artistName;
         this.artistGenres = artistGenres;
     }

    public String getArtistGenre() {return artistGenres;}

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }
}

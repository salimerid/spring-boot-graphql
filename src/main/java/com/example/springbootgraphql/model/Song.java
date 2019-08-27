package com.example.springbootgraphql.model;

import javax.persistence.*;

@Entity
@Table(name="song")
public class Song{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private Integer duration;
    @ManyToOne
    @JoinColumn(name = "artist_id", nullable = false)
    private Artist artist;

    public Song() {
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

}

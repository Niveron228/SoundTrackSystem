package com.library.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "soundtracks")
public class SoundTrack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String soundtrack;
    private String author;
    private Integer duration;
    private Integer yearOfPublication;

    public Long getId() {
        return id;
    }

    public String getSoundtrack() {
        return soundtrack;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getDuration() {
        return duration;
    }

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSoundtrack(String soundtrack) {
        this.soundtrack = soundtrack;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setYearOfPublication(Integer yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}

package com.library.demo.repository;

import com.library.demo.entity.SoundTrack;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface SoundTrackRepository extends JpaRepository<SoundTrack, Long> {

    List<SoundTrack> findByAuthor(String author);


    SoundTrack findBySoundtrack(String soundtrack);

    List<SoundTrack> findByYearOfPublication(Integer year);

}
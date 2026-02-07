package com.library.demo.controller;

import com.library.demo.entity.SoundTrack;
import com.library.demo.repository.SoundTrackRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/library")
@CrossOrigin(origins = "*")
public class SoundTrackController {

    @Autowired
    private SoundTrackRepository soundTrackRepository;


    @GetMapping
    public List<SoundTrack> getAllSoundTracks() {
        return soundTrackRepository.findAll();
    }

    @GetMapping("/year/{year}")
    public List<SoundTrack> getByYear(@PathVariable Integer year){
        return soundTrackRepository.findByYearOfPublication(year);
    }

    @PostMapping
    public SoundTrack addSoundTrack(@RequestBody SoundTrack soundTrack) {
        return soundTrackRepository.save(soundTrack);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SoundTrack> updateTrack(@PathVariable Long id,@RequestBody SoundTrack trackDetails) {
        SoundTrack track = soundTrackRepository.findById(id).orElse(null);
        if(track == null){
            return ResponseEntity.notFound().build();
        }
        track.setSoundtrack(trackDetails.getSoundtrack());
        track.setAuthor(trackDetails.getAuthor());
        track.setDuration(trackDetails.getDuration());
        track.setYearOfPublication(trackDetails.getYearOfPublication());

        SoundTrack updatedTrack = soundTrackRepository.save(track);
        return ResponseEntity.ok(updatedTrack);
    }

    @GetMapping("/search/{author}")
    public List<SoundTrack> getByAuthor(@PathVariable String author) {
        return soundTrackRepository.findByAuthor(author);
    }
}
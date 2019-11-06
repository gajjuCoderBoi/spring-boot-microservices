package com.example.songsapi.controller;

import com.example.songsapi.model.Song;
import com.example.songsapi.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SongController {

    @Autowired
    private SongService songService;

    @GetMapping
    public List<Song> list(){
        return songService.list();
    }

    @PostMapping
    public Song createSong(Song song){
        return songService.createSong(song);
    }

    @PutMapping("/{songId}")
    public Song updateSong(Song song,@PathVariable Long songId){
        return songService.updateSong(song, songId);
    }

    @GetMapping("/{id}")
    public Song getSongById(@PathVariable Long id){
        return songService.getSongById(id);
    }

    @GetMapping("/title/{title}")
    public Song getSongByName(@PathVariable String title){
        return songService.getSongByName(title);
    }

    @DeleteMapping("{songId}")
    public Long deleteSong(@PathVariable Long songId) {
        return songService.deleteSong(songId);
    }
}

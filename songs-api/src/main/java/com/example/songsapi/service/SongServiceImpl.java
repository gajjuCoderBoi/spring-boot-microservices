package com.example.songsapi.service;

import com.example.songsapi.model.Song;
import com.example.songsapi.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService{

    @Autowired
    private SongRepository songRepository;

    @Override
    public List<Song> list() {
        return (List<Song>) songRepository.findAll();
    }

    @Override
    public Song createSong(Song song) {
        return songRepository.save(song);
    }

    @Override
    public Song updateSong(Song song, Long songId) {
        Song savedSong = songRepository.findById(songId).orElse(null);
        savedSong.setTitle(song.getTitle());
        savedSong.setLength(song.getLength());
        songRepository.save(savedSong);
        return savedSong;
    }

    @Override
    public Song getSongById(Long id) {
        return songRepository.findById(id).orElse(null);
    }

    @Override
    public Song getSongByName(String title) {
        return songRepository.findSongByTitle(title);
    }

    @Override
    public Long deleteSong(Long songId) {
        Song savedSong = songRepository.findById(songId).orElse(null);
        songRepository.delete(savedSong);
        return savedSong.getSongId();
    }
}

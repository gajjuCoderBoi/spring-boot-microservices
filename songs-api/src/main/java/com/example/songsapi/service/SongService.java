package com.example.songsapi.service;

import com.example.songsapi.model.Song;
import java.util.List;

public interface SongService {

    public List<Song> list();

    public Song createSong(Song song);

    public Song updateSong(Song song, Long songId);

    public Song getSongById(Long id);

    public Song getSongByName(String title);

    public Long deleteSong(Long songId);

}

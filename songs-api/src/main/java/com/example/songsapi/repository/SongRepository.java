package com.example.songsapi.repository;

import com.example.songsapi.model.Song;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends CrudRepository<Song, Long> {
    @Query("From Song s where s.title like %:title%")
    public Song findSongByTitle(String title);
}

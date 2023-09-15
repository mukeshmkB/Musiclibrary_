
package com.example.song.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.example.song.model.Song;
import com.example.song.service.SongJpaService;

@RestController
public class SongController {

   @Autowired
   public SongJpaService  service;

    @GetMapping("/songs")
    public ArrayList<Song> getAllSongs(){
        return service.getAllSongs();
    }

    @GetMapping("/songs/{songId}")
    public Song getSongById(@PathVariable("songId") int songId) {
        return service.getSongById(songId);
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song) {
        return service.addSong(song);
    } 

    @PutMapping("/songs/{songId}")
    public Song updateSong(@PathVariable("songId") int songId, @RequestBody Song song) {
        return service.updateSong(songId, song);
    }  

    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable("songId") int songId){
      service.deleteSong(songId);
    }

}
package com.example.demo.service.song;

import com.example.demo.model.Song;
import com.example.demo.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ISongService implements SongService {
    @Autowired
    SongRepository songRepository;
    @Override
    public Iterable<Song> findAllByUserId(Long idUser) {
        return songRepository.findAllByUserId(idUser);
    }

    @Override
    public Iterable<Song> findAllByNameContains(String name) {
        return songRepository.findAllByNameContains(name);
    }

    @Override
    public Iterable<Song> findAllByCreationTimeOrderByCreateTime() {
        return songRepository.findAllByCreationTimeOrderByCreateTime();
    }

    @Override
    public Iterable<Song> findAllByNumberOfViewOrOrderByNumberOfView() {
        return songRepository.findAllByNumberOfViewOrOrderByNumberOfView();
    }

    @Override
    public Optional<Song> findById(Long id) {
        return songRepository.findById(id);
    }

    @Override
    public Iterable<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public void remove(Long id) {
songRepository.deleteById(id);
    }

    @Override
    public Song save(Song song) {
        return songRepository.save(song);
    }
}

package com.example.demo.service.song;

import com.example.demo.model.Song;
import com.example.demo.service.IGeneralService;

public interface SongService extends IGeneralService<Song> {
    Iterable<Song> findAllByUserId(Long idUser);
    Iterable<Song> findAllByNameContains(String name);
    Iterable<Song> findAllByCreationTimeOrderByCreateTime();
    Iterable<Song> findAllByNumberOfViewOrOrderByNumberOfView();
}

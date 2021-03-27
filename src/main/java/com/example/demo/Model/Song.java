package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String file;
    @Column(nullable = false)
    private Long numberOfView;
    @Column(nullable = false)
    private String author;
    @Column(nullable = false)
    private String avatar;
    @Column(length = 6000)
    private String lyric;
    @ManyToOne
    private Album album;
    @ManyToOne
    private User user;
    @ManyToMany(mappedBy = "songs")
    private List<Singer> singers;



}

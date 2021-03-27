package com.example.demo.Model;

import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader;
import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

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

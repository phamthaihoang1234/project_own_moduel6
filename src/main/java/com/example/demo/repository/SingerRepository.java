package com.example.demo.repository;

import com.example.demo.Model.Singer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SingerRepository extends CrudRepository<Singer,Long> {
}

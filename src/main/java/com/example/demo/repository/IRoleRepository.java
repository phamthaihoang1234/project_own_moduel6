package com.example.demo.repository;

import com.example.demo.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IRoleRepository extends CrudRepository<Role,Long> {
}

package com.example.demo.repository;

import com.example.demo.Model.User;
import org.springframework.data.repository.CrudRepository;

import javax.jws.soap.SOAPBinding;

public interface IUserRepository extends CrudRepository<User,Long> {
    User findAllByUsername(String username);
}

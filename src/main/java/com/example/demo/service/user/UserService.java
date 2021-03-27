package com.example.demo.service.user;

import com.example.demo.model.User;
import com.example.demo.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends IGeneralService<User>, UserDetailsService {
    User findAllByUsername(String username);
}

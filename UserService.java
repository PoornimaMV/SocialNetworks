package com.example.courseapi.service;

import com.example.courseapi.model.User;
import com.example.courseapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    public User getUserById(long id) {
        return null;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}

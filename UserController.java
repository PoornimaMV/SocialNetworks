package com.example.courseapi.web;

import com.example.courseapi.model.User;
import com.example.courseapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value="/users",method= RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<User> createUser(@RequestBody User user)
    {
        User createdUser=userService.createUser(user);
        return Optional.ofNullable(createdUser)
                .map(u-> ResponseEntity.ok().body(u))
                .orElse(ResponseEntity.notFound().build());
    }

    @RequestMapping(value="/users",method= RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<User> createuser(@RequestBody User user)
    {
        User createduser=userService.createUser(user);
        return Optional.ofNullable(createduser)
                .map(u-> ResponseEntity.ok().body(u))
                .orElse(ResponseEntity.notFound().build());
    }

/*
    @RequestMapping(value="/users",method= RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<User> createusers(@RequestBody User user)
    {
        User createduser=userService.createUser(user);
        return Optional.ofNullable(createduser)
                .map(u-> ResponseEntity.ok().body(u))
                .orElse(ResponseEntity.notFound().build());
    }*/



    @RequestMapping(value="/users",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<User> getUsers()
    {
        return userService.getAllUsers();
    }
    @RequestMapping(value="/users/{id}",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public User getUserById(@PathVariable long id)
    {
        return userService.getUserById(id);
    }

}

package com.example.courseapi.service;


import com.example.courseapi.model.Posts;
import com.example.courseapi.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsService {

    @Autowired
    private PostsRepository postsRepository;



    public List<Posts> getAllPosts() {
        return (List<Posts>) postsRepository.findAll();
    }
    public Posts createPost(Posts posts) {

        return postsRepository.save(posts);
    }

    public Posts getPostsById(long id) {return  null;
    }

    public Posts createPosts(Posts posts) {
        return postsRepository.save(posts);
    }
}

package com.example.courseapi.service;


import com.example.courseapi.model.Post;
import com.example.courseapi.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsService {

    @Autowired
    private PostsRepository postsRepository;



    public List<Post> getAllPosts() {
        return (List<Post>) postsRepository.findAll();
    }
    public Post createPost(Post posts) {

        return postsRepository.save(posts);
    }

    public Post getPostsById(Long postId) {return  postsRepository.findById(postId).orElse(null);
    }

    public Post createPosts(Post posts) {
        return postsRepository.save(posts);
    }


    public void deletePostssbypostd(Long postId) {

        postsRepository.deleteById(postId);
    }
}

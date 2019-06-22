package com.example.courseapi.web;

import com.example.courseapi.model.Post;
import com.example.courseapi.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PostsContorller {

    @Autowired
    private PostsService postsService;

    @CrossOrigin
    @RequestMapping(value = "/posts", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Post> createdPosts(@RequestBody Post posts) {
        Post createdPosts = postsService.createPost(posts);
        return Optional.ofNullable(createdPosts)
                .map(u -> ResponseEntity.ok().body(u))
                .orElse(ResponseEntity.notFound().build());
    }
    @CrossOrigin
    @RequestMapping(value="/posts",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Post> getPosts()
    {
        return postsService.getAllPosts();
    }

    @CrossOrigin
    @RequestMapping(value="/posts/{id}",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Post getPostsById(@PathVariable long id)
    {
        return postsService.getPostsById(id);
    }


    @RequestMapping(value="/posts/{postId}",method= RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Post> deletePostsbypostId(@PathVariable("postId") Long postId){
        System.out.println(postId);
        postsService.deletePostssbypostd(postId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
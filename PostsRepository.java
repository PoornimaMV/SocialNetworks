package com.example.courseapi.repository;

import com.example.courseapi.model.Posts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepository extends CrudRepository<Posts, Long>   {


}

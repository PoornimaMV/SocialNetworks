package com.example.courseapi.repository;

import com.example.courseapi.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByMailIdAndPassword(String mailId,String password);


}

package com.example.courseapi.repository;

import com.example.courseapi.model.Reactions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactionsRepository extends CrudRepository<Reactions, Long> {
}

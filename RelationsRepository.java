package com.example.courseapi.repository;

import com.example.courseapi.model.Relations;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelationsRepository extends CrudRepository<Relations,Long> {
}

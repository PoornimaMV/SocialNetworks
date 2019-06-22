package com.example.courseapi.repository;

import com.example.courseapi.model.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestsRepository extends CrudRepository<Request,Long> {
}

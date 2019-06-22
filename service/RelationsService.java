package com.example.courseapi.service;

import com.example.courseapi.model.Relation;
import com.example.courseapi.repository.RelationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RelationsService {

    @Autowired
    private RelationsRepository relationsRepository;



    public List<Relation> getAllRelations() {
        return (List<Relation>) relationsRepository.findAll();
    }


    public Relation createRelations(Relation relations) {
        return relationsRepository.save(relations);
    }

    public Relation getRelationsById(long relationId) {
        return relationsRepository.findById(relationId).get();
    }
}

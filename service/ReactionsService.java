package com.example.courseapi.service;



import com.example.courseapi.model.Reaction;
import com.example.courseapi.repository.ReactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReactionsService {
    @Autowired
    private ReactionsRepository reactionsRepository;


    public List<Reaction> getAllReactions() {
        return (List<Reaction>) reactionsRepository.findAll();
    }
    public Reaction createReactions(Reaction reaction) {

        return reactionsRepository.save(reaction);
    }


    public Reaction getReactionsById(long id) {

        return null;
    }
}

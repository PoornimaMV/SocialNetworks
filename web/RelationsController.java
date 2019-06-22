package com.example.courseapi.web;

import com.example.courseapi.model.Relation;
import com.example.courseapi.service.RelationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

public class RelationsController {



    @Autowired
    private RelationsService relationsService;

    @RequestMapping(value = "/relations", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Relation> createdPosts(@RequestBody Relation relations) {
        Relation createdRelations = relationsService.createRelations(relations);
        return Optional.ofNullable(createdRelations)
                .map(u -> ResponseEntity.ok().body(u))
                .orElse(ResponseEntity.notFound().build());
    }


    @RequestMapping(value="/relations",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Relation> getRelations()
    {
        return relationsService.getAllRelations();
    }
    @RequestMapping(value="/relations/{id}",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Relation getRelationsById(@PathVariable long id)
    {
        return relationsService.getRelationsById(id);
    }

}

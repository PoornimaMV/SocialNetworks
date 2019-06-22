package com.example.courseapi.web;


import com.example.courseapi.model.Reaction;
import com.example.courseapi.service.ReactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RestController
@RequestMapping("/api")
public class ReactionsController {

    @Autowired
    private ReactionsService reactionsService;

    @RequestMapping(value = "/reaction", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Reaction> createdPosts(@RequestBody Reaction reaction) {
        Reaction createdReaction = reactionsService.createReactions(reaction);
        return Optional.ofNullable(createdReaction)
                .map(u -> ResponseEntity.ok().body(u))
                .orElse(ResponseEntity.notFound().build());
    }


    @RequestMapping(value="/reactions",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Reaction> getReactions()
    {
        return reactionsService.getAllReactions();
    }
    @RequestMapping(value="/reactions/{id}",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Reaction getReactionsById(@PathVariable long id)
    {
        return reactionsService.getReactionsById(id);
    }

}

package com.example.demo.controller;

import com.example.demo.dto.PersonDTO;
import com.example.demo.service.VoteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/vote")
public class VoteController {

    private final VoteService voteService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    @ResponseStatus(HttpStatus.CREATED)
    public void addVote(@RequestBody final PersonDTO request){
        voteService.getVote(request);
    }
}

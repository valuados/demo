package com.example.demo.service;

import com.example.demo.dto.PersonDTO;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VoteServiceTest {

    @Test
    void getVote() {
        final VoteService voteService = new VoteService();
        PersonDTO personDTO = fillPerson(1, "Vladislav Nikonov", 2);
        voteService.getVote(personDTO);
        assertTrue(voteService.getList()
                .stream()
                .anyMatch(s -> s.equals(personDTO)));
    }

    @Test
    void getVotes() {
        final VoteService voteService = new VoteService();
        PersonDTO person1 = fillPerson(1, "Vladislav Nikonov", 2);
        PersonDTO person2 = fillPerson(2, "Petr Smirnov", 1);
        voteService.getVote(person1);
        voteService.getVote(person2);
        assertTrue(voteService.getList().size() == 2);
    }

    public static PersonDTO fillPerson (final int id, final String name, final int candidateId){
        return PersonDTO.builder()
                .id(id)
                .fullName(name)
                .candidateId(candidateId)
                .build();
    }
}
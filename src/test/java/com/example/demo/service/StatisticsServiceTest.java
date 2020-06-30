package com.example.demo.service;

import com.example.demo.dto.CandidateScoreDTO;
import com.example.demo.dto.PersonDTO;
import org.junit.jupiter.api.Test;

import static com.example.demo.helper.CandidateStatisticsDataFiller.fillCandidateScore;
import static com.example.demo.helper.PersonDataFiller.fillPerson;
import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void getScoreList() {
        CandidatesService candidatesService = new CandidatesService();
        VoteService voteService = new VoteService();
        StatisticsService statisticsService = new StatisticsService(candidatesService, voteService);

        //init candidates list
        candidatesService.getList();

        //init 2 votes
        PersonDTO person1 = fillPerson(1, "Vladislav Nikonov", 2);
        PersonDTO person2 = fillPerson(2, "Petr Smirnov", 1);
        voteService.getVote(person1);
        voteService.getVote(person2);

        //check result
        CandidateScoreDTO candidateScore = fillCandidateScore(1, "Babarik", 1);

        assertEquals(3, statisticsService.getScoreList().size());
        assertTrue(statisticsService.getScoreList()
                .stream()
                .anyMatch(s -> s.equals(candidateScore)));



    }
}
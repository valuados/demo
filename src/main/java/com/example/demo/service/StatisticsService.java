package com.example.demo.service;

import com.example.demo.controller.VoteController;
import com.example.demo.dto.CandidateDTO;
import com.example.demo.dto.CandidateScoreDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StatisticsService {

    private List<CandidateScoreDTO> candidatesScore= new ArrayList<>();
    private final CandidatesService candidatesService;
    private final VoteService voteService;



    public List<CandidateScoreDTO> getScoreList(){
        Map<Integer, Integer> statistics = voteService.getStatistics(candidatesService.initStatistics());
        combineStatistics(candidatesService.getList(), statistics);
        return candidatesScore;
    }

    private void combineStatistics(List<CandidateDTO> candidates, Map<Integer, Integer> statistics) {
        for(CandidateDTO candidate : candidates){
            candidatesScore.add(
                    CandidateScoreDTO
                            .builder()
                            .id(candidate.getId())
                            .name(candidate.getName())
                            .score(statistics.get(candidate.getId()))
                            .build()
            );
        }
    }
}

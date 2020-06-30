package com.example.demo.helper;

import com.example.demo.dto.CandidateScoreDTO;
import com.example.demo.dto.PersonDTO;

public class CandidateStatisticsDataFiller {

    public static CandidateScoreDTO fillCandidateScore (final int id, final String name, final int score){
        return CandidateScoreDTO.builder()
                .id(id)
                .name(name)
                .score(score)
                .build();
    }
}

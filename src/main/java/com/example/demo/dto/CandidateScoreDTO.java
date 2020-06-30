package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CandidateScoreDTO {
    private int id;
    private String name;
    private int score = 0;
}

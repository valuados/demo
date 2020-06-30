package com.example.demo.controller;

import com.example.demo.dto.CandidateDTO;
import com.example.demo.dto.CandidateScoreDTO;
import com.example.demo.service.CandidatesService;
import com.example.demo.service.StatisticsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/results")
public class StatisticsController {

    private StatisticsService statisticsService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    @ResponseStatus(HttpStatus.OK)
    public List<CandidateScoreDTO> getList(){
        return statisticsService.getScoreList();
    }
}

package com.example.demo.service;

import com.example.demo.dto.CandidateDTO;
import com.example.demo.dto.PersonDTO;
import com.google.gson.Gson;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.util.*;

@Service
public class CandidatesService {

    private List<CandidateDTO> candidates = new ArrayList<>();

    @SneakyThrows
    public List<CandidateDTO> getList(){
        Gson gson = new Gson();
        candidates = Arrays.asList(gson.fromJson(new FileReader(getClass().getClassLoader().getResource("candidates.json").getFile()), CandidateDTO[].class));

        return candidates;
    }

    public Map<Integer, Integer> initStatistics() {
        Map<Integer, Integer> voteStatistics = new HashMap<>();
        for(CandidateDTO person : candidates){
            voteStatistics.put(person.getId(),0);
        }
        return voteStatistics;
    }
}

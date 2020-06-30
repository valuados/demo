package com.example.demo.service;

import com.example.demo.dto.CandidateDTO;
import com.example.demo.dto.PersonDTO;
import com.google.gson.Gson;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.util.*;

@Service
public class VoteService {

    private List<PersonDTO> persons = new ArrayList<>();

    public void getVote(PersonDTO person){
        persons.add(person);
    }

    public List<PersonDTO> getList(){
        return persons;
    }

    public Map<Integer, Integer> getStatistics(Map<Integer, Integer> statistics) {
        for(PersonDTO person : persons){
            statistics.put(person.getCandidateId(),
                    statistics.getOrDefault(person.getCandidateId(), 0) + 1);
        }
        return statistics;
    }
}

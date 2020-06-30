package com.example.demo.service;

import com.example.demo.dto.CandidateDTO;
import com.example.demo.dto.PersonDTO;
import com.google.gson.Gson;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class VoteService {

    private List<PersonDTO> persons = new ArrayList<>();

    public void getVote(PersonDTO person){
        persons.add(person);
    }

    public List<PersonDTO> getList(){
        return persons;
    }
}

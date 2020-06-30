package com.example.demo.service;

import com.example.demo.dto.CandidateDTO;
import com.google.gson.Gson;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CandidatesService {

    private List<CandidateDTO> candidates = new ArrayList<>();

    @SneakyThrows
    public List<CandidateDTO> getList(){
        Gson gson = new Gson();
        candidates = Arrays.asList(gson.fromJson(new FileReader(getClass().getClassLoader().getResource("candidates.json").getFile()), CandidateDTO[].class));

        return candidates;
    }
}

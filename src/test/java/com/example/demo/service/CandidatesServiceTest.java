package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class CandidatesServiceTest {



    @Test
    void getList() {
    final int response = 3;

    final CandidatesService candidateService = new CandidatesService();
    assertEquals(response, candidateService.getList().size());
    }

    @Test
    void checkAG() {
        final String name = "3%";

        final CandidatesService candidateService = new CandidatesService();
        assertTrue(candidateService.getList()
                .stream()
                .anyMatch(s -> s.getName().equals(name)));
    }
}
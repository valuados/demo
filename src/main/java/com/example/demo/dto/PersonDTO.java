package com.example.demo.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(access = AccessLevel.PUBLIC)
public class PersonDTO {
    private int id;
    private String fullName;
    private int candidateId;
}

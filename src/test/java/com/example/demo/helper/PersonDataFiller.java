package com.example.demo.helper;

import com.example.demo.dto.PersonDTO;

public class PersonDataFiller {

    public static PersonDTO fillPerson (final int id, final String name, final int candidateId){
        return PersonDTO.builder()
                .id(id)
                .fullName(name)
                .candidateId(candidateId)
                .build();
    }
}

package com.jorgeyh7.apirestperson.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;
    private String ubication;
    private String position;
    private String fullName;
    private String image;
}

package com.bihan.boilerplate.rest.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class NewStudentDetails {
    private String name;
    private String email;
    private LocalDate birthDate;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String country;
}
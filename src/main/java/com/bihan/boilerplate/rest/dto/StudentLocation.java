package com.bihan.boilerplate.rest.dto;

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
public class StudentLocation {
    Long id;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String country;
}

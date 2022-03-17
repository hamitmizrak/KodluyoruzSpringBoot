package com.hamitmizrak.business.dto;
//DTO:Data Transfer Object

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
public class EmployeeDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String emailId;
}

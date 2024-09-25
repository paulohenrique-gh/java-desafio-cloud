package com.tcc.desafiocloud.employee;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private Long employeeId;
    private String name;
    private String department;
    private Double salary;
}

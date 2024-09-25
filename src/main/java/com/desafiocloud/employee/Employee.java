package com.desafiocloud.employee;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

    @NotNull
    private Long employeeId;

    @NotNull
    private String name;

    @NotNull
    private String department;

    @NotNull
    private Double salary;
}

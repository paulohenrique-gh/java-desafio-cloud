package com.tcc.desafiocloud.employee;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final List<Employee> employees = List.of(
            new Employee(1L, "John Doe", "Sales", 2000.0),
            new Employee(2L, "Mary May", "IT", 12000.0),
            new Employee(3L, "Richard Lisboa", "HR", 4000.0)
    );

    public List<Employee> getEmployees() {
        return this.employees;
    }
}

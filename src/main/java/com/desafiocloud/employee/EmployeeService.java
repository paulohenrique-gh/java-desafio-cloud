package com.desafiocloud.employee;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employees;

    public EmployeeService() {
        this.employees = new ArrayList<>();
        this.employees.add(new Employee(1L, "John Doe", "Sales", 2000.0));
        this.employees.add(new Employee(2L, "Mary May", "IT", 12000.0));
        this.employees.add(new Employee(3L, "Richard Lisboa", "HR", 4000.0));
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }

    public Employee getEmployee(Long id) {
        return this.employees.stream().filter(employee -> employee.getEmployeeId().equals(id)).findFirst().orElse(null);
    }

    public Employee createEmployee(Employee employee) {
        this.employees.add(employee);
        return employee;
    }

    public Employee updateEmployee(Long id, Employee employee) {
        Employee updatedEmployee = this.getEmployee(id);
        if (updatedEmployee == null) {
            return null;
        }

        updatedEmployee.setName(employee.getName());
        updatedEmployee.setDepartment(employee.getDepartment());
        updatedEmployee.setSalary(employee.getSalary());
        return updatedEmployee;
    }

    public void deleteEmployee(Long id) {
        this.employees.removeIf(employee -> employee.getEmployeeId().equals(id));
    }
}

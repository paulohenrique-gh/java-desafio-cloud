package com.desafiocloud.employee;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(this.employeeService.getEmployees());
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long employeeId) {
        Employee foundEmployee = this.employeeService.getEmployee(employeeId);
        if (foundEmployee == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(this.employeeService.getEmployee(employeeId));
    }

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody @Valid Employee employee) {
        Employee newEmployee = this.employeeService.createEmployee(employee);
        return ResponseEntity.ok(newEmployee);
    }

    @PutMapping("/{employeeId}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long employeeId, @RequestBody @Valid Employee employee) {
        Employee updatedEmployee = this.employeeService.updateEmployee(employeeId, employee);
        if (updatedEmployee == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedEmployee);
    }

    @DeleteMapping("/{employeeId}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long employeeId) {
        this.employeeService.deleteEmployee(employeeId);
        return ResponseEntity.noContent().build();
    }
}

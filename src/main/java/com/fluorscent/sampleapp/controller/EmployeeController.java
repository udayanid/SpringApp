package com.fluorscent.sampleapp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fluorscent.sampleapp.model.Employee;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @GetMapping
    public List<Employee> getEmployee() {
        return Arrays.asList(new Employee("Rajan", "123", 23));
    }
}

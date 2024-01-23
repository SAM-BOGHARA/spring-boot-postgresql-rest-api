package com.group.rest_api_postgres.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.group.rest_api_postgres.entities.CountryEntity;
import com.group.rest_api_postgres.entities.Employee;
import com.group.rest_api_postgres.repositories.CountryRepository;
import com.group.rest_api_postgres.repositories.EmployeeRepository;
import com.group.rest_api_postgres.services.EmployeeService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("employees/")
@Validated
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    CountryRepository countryRepository;

    @GetMapping("all")
    public List<Employee> getAllEmployees() {
        return employeeService.findAllEmployees();
    }

    @PostMapping("all")
    public List<Employee> addAllEmployees(@RequestBody List<Employee> employees) {
        return employeeService.saveAllEmployees(employees);
    }

    @PostMapping("add-employee")
    public Employee addEmployee(@Valid @RequestBody Employee employee) {

        return employeeService.addEmployee(employee);
    }

    @GetMapping("employee-with-name")
    public List<Employee> getAllEmployeesWithName(@RequestParam String employeename) {
        return employeeService.findEmployeesByName(employeename);
    }

    @GetMapping("employee-by-id")
    public Employee getEmployeeById(
            @RequestParam @Min(value = 1, message = "Employee ID should be greater than 0.") int id) {
        return employeeService.findEmployeeById(id);
    }

    @GetMapping("employee-by-ids")
    public List<Employee> getEmployeesByids(@RequestBody List<Integer> ids) {
        return employeeService.findAllEmployeesByIds(ids);
    }

    @GetMapping("emp-by-dept-and-age")
    public List<Employee> getEmpByDeptAndAge(@RequestParam String department, @RequestParam int age) {
        return employeeRepository.findByDepartmentAndAgeLessThanEqual(department, age);
    }

    @GetMapping("leftjob")
    public List<Employee> getEmployeesLeftJob(@RequestParam boolean leftjob) {
        return employeeRepository.findByLeftjob(leftjob);
    }

    @GetMapping("get-country-by-name-id")
    public CountryEntity getCountryByNameAndId(@RequestParam String countryname, @RequestParam int id) {
        return countryRepository.getByIdAndCountryname(countryname, id);
    }

    @GetMapping("get-total-employees")
    public int getTotalEmployees() {
        return employeeService.getTotalEmployees();
    }

    @GetMapping("get-employee-age")
    public int getEmployeeAge(@RequestParam int employeeid) {
        return employeeService.getEmployeeAge(employeeid);
    }


    

}

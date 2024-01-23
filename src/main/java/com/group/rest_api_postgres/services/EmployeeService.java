package com.group.rest_api_postgres.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group.rest_api_postgres.entities.Employee;
import com.group.rest_api_postgres.repositories.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    // @Autowired EmployeeRequest employeeRequest;

    public EmployeeService() {

    }

    public List<Employee> saveAllEmployees(List<Employee> employees) {
        return employeeRepository.saveAll(employees);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    public List<Employee> findAllEmployeesByIds(List<Integer> employees) {
        return employeeRepository.findAllById(employees);
    }

    public Employee findEmployeeById(int id) {
        return employeeRepository.findById(id);
    }

    public List<Employee> findEmployeesByName(String employeename) {
        return employeeRepository.findByEmployeename(employeename);
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public int getTotalEmployees() {
        return employeeRepository.ProcgetTotalEmployees();
    }

    public int getEmployeeAge(int employeeid) {
        return employeeRepository.NqgetEmployeeAge(employeeid);
    }

}

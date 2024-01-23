package com.group.rest_api_postgres.entities;

import java.time.ZonedDateTime;
import java.util.Date;

//import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import jakarta.persistence.Temporal;
//import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "employees")
public class Employee {

    @Id

    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int id;

    @Column(name = "employee_name")
    @NotNull(message = "Employee Name is required")
    private String employeename;

    @NotNull(message = "Department is required")
    @Pattern(regexp = "^[0-9A-Z]*$", message = "Department accepts only alphanumeric value.")
    @Size(min = 10, max = 50, message = "Department accepts upto 50 characters and minimum 10 characters.")
    @Column(name = "department")
    private String department;

    @NotNull(message = "Joining Date is required")
    // Method 1 to format dates
    // @Temporal(TemporalType.DATE)
    // @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss")
    @Column(name = "joining_date")
    private Date joiningdate;

    @NotNull(message = "Age is required")
    @Column(name = "age")
    @Min(value = 18, message = "Minimum age requirement is 18.")
    private int age;

    @NotNull(message = "Address is required")
    @Column(name = "address")
    private String address;

    @NotNull(message = "Salary is required")
    @Column(name = "salary")
    private Float salary;

    @Column(name = "lefton")
    private ZonedDateTime lefton;

    @NotNull(message = "Leftjob is required")
    @Column(name = "leftjob")
    private Boolean leftjob;

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getjoiningdate() {
        return joiningdate;
    }

    public void setjoiningdate(Date joiningdate) {
        this.joiningdate = joiningdate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public ZonedDateTime getLefton() {
        return lefton;
    }

    public void setLefton(ZonedDateTime lefton) {
        this.lefton = lefton;
    }

    public boolean isLeftjob() {
        return leftjob;
    }

    public void setLeftjob(boolean leftjob) {
        this.leftjob = leftjob;
    }

}

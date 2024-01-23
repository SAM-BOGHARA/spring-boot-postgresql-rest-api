package com.group.rest_api_postgres.pojos;

import java.time.ZonedDateTime;
import java.util.Date;



public class EmployeeRequest {
    
    public int id;
    public String employeename;
    public String department;
    public Date joiningdate;
    public int age;
    public String address;
    public float salary;
    public ZonedDateTime lefton;
    public boolean leftjob;
}

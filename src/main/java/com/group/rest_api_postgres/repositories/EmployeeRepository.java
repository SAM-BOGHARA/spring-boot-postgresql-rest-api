package com.group.rest_api_postgres.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.group.rest_api_postgres.entities.Employee;

import java.util.Date;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Employee findById(int id);

    List<Employee> findByEmployeename(String employeename);

    List<Employee> findByDepartmentAndAgeLessThanEqual(String department, int age);

    List<Employee> findTop5ByAge(int age);

    List<Employee> findByAgeBetween(int startage, int endage);

    List<Employee> findByAgeIn(List<Integer> agegroup);

    List<Employee> findByJoiningdateAfter(Date date);

    List<Employee> findByJoiningdateBefore(Date date);

    List<Employee> findByJoiningdateBetween(Date startdate, Date enddate);

    List<Employee> findByJoiningdateBetweenAndDepartment(Date startdate, Date enddate, String department);

    List<Employee> findByLeftonIsNull();

    List<Employee> findByEmployeenameEquals(String employeename);

    List<Employee> findByEmployeenameIsNot(String employeename);

    List<Employee> findByEmployeenameIsNull();

    List<Employee> findByEmployeenameIsNotNull();

    List<Employee> findByEmployeenameOrderByJoiningdateAsc(String employeename);

    List<Employee> findByEmployeenameOrderByJoiningdateDesc(String employeename);

    List<Employee> findByLeftjobTrue();

    List<Employee> findByLeftjobFalse();

    List<Employee> findByLeftjob(boolean leftjob);

    @Query(value = "Select getTotalEmployees()",nativeQuery = true)
    int NqgetTotalEmployees();

    @Query(value = "Select getEmployeeAge(?1)", nativeQuery = true)
    int NqgetEmployeeAge(int employeeid);


    @Procedure(procedureName = "procgettotalemployees")
    int ProcgetTotalEmployees();

    @Procedure(procedureName = "getEmployeeAge")
    int ProcGetEmployeeAge(int employeeid);
}

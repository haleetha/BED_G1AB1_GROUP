package com.greatlearning.EmployeeManagementGrPr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.EmployeeManagementGrPr.entity.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
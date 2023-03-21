package com.greatlearning.EmployeeManagementGrPr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.EmployeeManagementGrPr.entity.Role;


public interface RoleRepository extends JpaRepository<Role, Integer> {

}
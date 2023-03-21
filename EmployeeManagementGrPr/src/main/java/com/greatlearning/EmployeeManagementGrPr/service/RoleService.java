package com.greatlearning.EmployeeManagementGrPr.service;

import java.util.List;

import com.greatlearning.EmployeeManagementGrPr.entity.Role;


public interface RoleService {

	public void addRole(Role role);

	public List<Role> getRoles();

}

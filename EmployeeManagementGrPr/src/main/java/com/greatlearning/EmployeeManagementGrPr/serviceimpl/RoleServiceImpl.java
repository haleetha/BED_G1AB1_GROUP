package com.greatlearning.EmployeeManagementGrPr.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.EmployeeManagementGrPr.entity.Role;
import com.greatlearning.EmployeeManagementGrPr.repository.RoleRepository;
import com.greatlearning.EmployeeManagementGrPr.service.RoleService;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository roleRepository;

	@Override
	public void addRole(Role role) {
		// TODO Auto-generated method stub

		roleRepository.saveAndFlush(role);
	}

	@Override
	public List<Role> getRoles() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

}
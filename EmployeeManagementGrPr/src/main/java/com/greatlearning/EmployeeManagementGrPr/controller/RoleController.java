package com.greatlearning.EmployeeManagementGrPr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/roles")
public class RoleController {

	@Autowired
	RoleServiceImpl roleServiceImpl;

	@PostMapping("/add")
	public String addRole(@RequestBody Role role) {

		roleServiceImpl.addRole(role);
		return role.getRoleName();
	}

	@GetMapping("/list")
	public List<Role> getRoles() {
		return roleServiceImpl.getRoles();
	}

}
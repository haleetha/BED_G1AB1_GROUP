package com.greatlearning.EmployeeManagementGrPr.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.EmployeeManagementGrPr.entity.User;
import com.greatlearning.EmployeeManagementGrPr.repository.UserRepository;
import com.greatlearning.EmployeeManagementGrPr.service.UserService;



@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userRepository.saveAndFlush(user);

	}

}
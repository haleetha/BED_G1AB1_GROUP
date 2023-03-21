package com.greatlearning.EmployeeManagementGrPr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

@RestController
public class HomeController {

	// Fetching values from app properties for the general app
	// Login Details
	@Value("${app.version}")
	private String appVersion;

	@Value("${info.logincredentialsuser1}")
	private String credInfo;

	@Value("${info.logincredentialsuser2}")
	private String credInfo2;

	@Value("${info.project.name}")
	private String projectName;

	@Value("${info.project.type}")
	private String prjectType;

	@Value("${info.project.environment}")
	private String projectEnv;

	// Putting the application properties in to Generic Map object for display
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping("/")
	public Map appDetails() {
		Map map = new HashMap<String, String>();
		map.put("app-version", appVersion);
		map.put("ADMIN-username2/password2", credInfo);
		map.put("NONADMIN-username1/password1", credInfo2);
		map.put("Project-Name", projectName);
		map.put("Project-Type", prjectType);
		map.put("Environment", projectEnv);
		return map;
	}

}
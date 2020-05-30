package com.operation.operation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.operation.operation.entity.User;
import com.operation.operation.service.UserService;

@RestController
@RequestMapping(value = "/api/users")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping(value = "/createUser")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);

	}

	@GetMapping(value = "/findUserBySalaryAndDepartment")
	public List<User> getUserSlaryDepartmentwise(@RequestParam Integer departmentId) {
		return userService.getUserBySalaryAndDepartment(departmentId);

	}
	

	@GetMapping(value = "/deleteUser")
	public Object deleteUser(@RequestParam Integer userId) {
		String message=userService.deleteUser(userId);
		return message;

	}
	
	@GetMapping(value = "/findAllUserBySalary")
	public List<User> getUserSlaryWise() {
		return userService.getUserBySalary();

	}

}

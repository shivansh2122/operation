package com.operation.operation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.operation.operation.entity.User;

@Service
public interface UserService {
	
	public User createUser(User user);
	
	public List<User> getUserBySalaryAndDepartment(Integer department);
	public List<User> getUserBySalary();
	public String deleteUser(Integer userId);

}

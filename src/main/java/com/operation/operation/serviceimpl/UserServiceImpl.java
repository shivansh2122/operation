package com.operation.operation.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operation.operation.entity.User;
import com.operation.operation.repositories.UserRepository;
import com.operation.operation.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public User createUser(User user) {
		
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public List<User> getUserBySalaryAndDepartment(Integer departmentId) {
		List<User> users=userRepo.findAllByDepartmentIdOrderBySalaryAsc(departmentId);
		return users;
	
	}

	@Override
	public String deleteUser(Integer userId) {
		// TODO Auto-generated method stub
		 userRepo.deleteById(userId);
		return "deleted Successfully";
	}

	@Override
	public List<User> getUserBySalary() {
		// TODO Auto-generated method stub
		return userRepo.findAllByOrderBySalaryAsc();
	}

}

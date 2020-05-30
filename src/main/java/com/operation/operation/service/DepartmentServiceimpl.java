package com.operation.operation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operation.operation.entity.Department;
import com.operation.operation.repositories.DepartmentRepository;
import com.operation.operation.serviceimpl.DepartmentService;

@Service
public class DepartmentServiceimpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepo;
	@Override
	public Department createDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepo.save(department);
	}

}

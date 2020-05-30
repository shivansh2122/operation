package com.operation.operation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.operation.operation.entity.Department;
import com.operation.operation.serviceimpl.DepartmentService;

@RestController
@RequestMapping(value = "/api/department/")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	@PostMapping(value = "createDepartment")
	private Department createDepartment(@RequestBody Department department)
	{
		return departmentService.createDepartment(department);
		
	}

}

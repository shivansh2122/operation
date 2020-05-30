package com.operation.operation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.operation.operation.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}

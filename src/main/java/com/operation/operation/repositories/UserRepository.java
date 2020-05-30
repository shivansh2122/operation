package com.operation.operation.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.operation.operation.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	public List<User> findAllByDepartmentIdOrderBySalaryAsc(Integer departmentId);
	public List<User> findAllByOrderBySalaryAsc();

}

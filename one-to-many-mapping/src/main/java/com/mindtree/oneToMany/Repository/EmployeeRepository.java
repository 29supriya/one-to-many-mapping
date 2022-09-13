package com.mindtree.oneToMany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.oneToMany.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}

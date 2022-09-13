package com.mindtree.oneToManyController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.oneToMany.Repository.DepartmentRepository;
import com.mindtree.oneToMany.Repository.EmployeeRepository;
import com.mindtree.oneToMany.dto.OrganisationData;
import com.mindtree.oneToMany.dto.OrganisationResponse;
import com.mindtree.oneToMany.entity.Department;

@RestController
public class OrganisationController {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping("/save") 
	public Department placeOrder(@RequestBody OrganisationData request) {
		return departmentRepository.save(request.getDepartment());
	}
	
	@GetMapping("/findAllDept")
	public List<Department> findAllDepartment()
	{
		return departmentRepository.findAll();
		
	}
	@GetMapping("/getinfo")
	
		public List<OrganisationResponse> getJoinInformation()
		{
		return departmentRepository.getJoinInformation();
	}

}

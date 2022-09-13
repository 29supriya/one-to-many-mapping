package com.mindtree.oneToMany.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mindtree.oneToMany.dto.OrganisationResponse;
import com.mindtree.oneToMany.entity.Department;

public interface DepartmentRepository  extends JpaRepository<Department, Integer>{
	
	@Query("SELECT new com.mindtree.oneToMany.dto.OrganisationResponse(d.name , e.name) FROM Department d JOIN d.employee e")
	public List<OrganisationResponse> getJoinInformation();

}

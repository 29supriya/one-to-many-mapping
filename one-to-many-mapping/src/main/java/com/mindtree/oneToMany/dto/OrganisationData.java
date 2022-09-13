package com.mindtree.oneToMany.dto;

import com.mindtree.oneToMany.entity.Department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrganisationData {
	
	private Department department;
	
	public Department getDepartment() {
	return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
}

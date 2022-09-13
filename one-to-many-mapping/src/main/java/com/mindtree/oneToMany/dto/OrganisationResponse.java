package com.mindtree.oneToMany.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrganisationResponse {
	
	private String name;
	private String ename;
	
	public OrganisationResponse(String name, String ename) {
		super();
		this.name = name;
		this.ename = ename;
	}

}

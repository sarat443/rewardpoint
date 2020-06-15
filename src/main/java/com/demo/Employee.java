package com.demo;

import java.io.Serializable;

public class Employee implements Serializable{
	int empId ;
	String name;
	Address add;
	
	Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
		
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
	
	

}

package com.service;

import java.util.List;

import com.dto.Employee;

public interface MyService {
	List addEmployee(Employee e);
	List readAllEmployees();
	List updateEmployee(Employee e );
	List deleteEmployee(int id );
	List update(int id,String name);
	

}

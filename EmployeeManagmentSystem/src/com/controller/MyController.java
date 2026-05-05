package com.controller;

import com.dto.Employee;
import com.service.MyService;
import com.service.MyServiceImple;
import java.util.List;

public class MyController {
	
	MyService myService ;
	
    public	MyController(){
	myService = new MyServiceImple();
		
	}

	public List addEmployee(Employee e) {
		return myService.addEmployee(e);
		
	}
	public List readAllEmployees() {
		
		return myService.readAllEmployees();
	}
	public List deleteEmployee(int id) {
		return myService.deleteEmployee(id);
		
	}

	public List update(int id,String name) {
		return myService.update(id,name);
	}

}

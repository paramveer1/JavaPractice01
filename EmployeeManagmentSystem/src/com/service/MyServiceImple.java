package com.service;
import java.util.ArrayList;
import java.util.List;

import com.dto.Employee;
import dao.Dao;

public class MyServiceImple implements MyService {
	
	 List al = new ArrayList();
	
	 Dao dao = new Dao();
	
	 public List addEmployee(Employee e) {
		 if(validation(e).isEmpty()) {
			 
			
			  
			 return dao.insert(e);
		 }
		 else {
			 return al;
		 }
	}
	 
	 List validation(Employee e) {
		 if(e.getAge()<18||e.getAge()>50) {
			 
			  al.add("Invalid Age");
			  return al;
		 }
		 else if(e.getEmployeeId()<1||e.getEmployeeId()>10000) {
			 
			 al.add("Invalid Employee Id");
			 return al;
		 }
//		 else if(e.getMobile()<1000000000l ||e.getMobile()>9999999999l) {
//			
//			  al.add("Invalid Contact number");
//			  return al;
//		 }
		 else
//			al.add("Validation Passed");
		 return al;
	 
	}
public List readAllEmployees() {
	
	return dao.readAllEmployees();
	
}

public List updateEmployee(Employee e) {
	return null;
}
public List deleteEmployee(int id) {
	return dao.deleteEmployee(id);
	
	
}

@Override
public List update(int id,String name) {
	// TODO Auto-generated method stub
	return dao.update(id,name);
}

}

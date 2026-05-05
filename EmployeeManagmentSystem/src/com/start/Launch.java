package com.start;

import java.util.Iterator;

import java.util.List;
import java.util.Scanner;

import com.controller.MyController;
import com.dto.Employee;

public class Launch {

	public static void main(String[] args) {
		System.out.println("**********************   Welcome to Employee Management System   ***********************\n");
		
		MyController myController = new MyController();
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("1.Add an Employee");
		System.out.println("2.Read all Employee");
		System.out.println("3.Update an Employee");
		System.out.println("4.Delete an Employee");
		System.out.println("5.Exit \n");
		
		System.out.println("Choose One Option\n");
		
		
		int choice = sc.nextInt();
		if(choice == 5) {
			System.out.println("Thanks for using ");
			break;
		}
		
		switch(choice) {
		case 1:System.out.println("Enter Employee id");
		int employeeId = sc.nextInt();
			System.out.println("Enter Employee Name");
			sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Enter Employee Age");
		int age = sc.nextInt();
		System.out.println("Enter Employee number");
		long number = sc.nextLong();
		Employee e = new Employee(employeeId,name,age,number);
		System.out.println(myController.addEmployee(e));
		break;
		case 2:System.out.println(" Employee Details :\n");
		
	List list = 	myController.readAllEmployees();
	if(list.isEmpty()) {
		System.out.println ("No Employee Details found");
		break;
	}
	Iterator itr = list.iterator();
	while(itr.hasNext()) {
	Employee dto = 	(Employee)itr.next();
	 System.out.println("Employee id: "+dto.getEmployeeId());
	 System.out.println("Name: "+dto.getName());
	 System.out.println("Contact details:" + dto.getMobile());
	 System.out.println("Age:"+dto.getAge());
	 
	 System.out.println("\n");


	 
	
	}
		break;
		case 3:System.out.println("You are on Update page \n");
		System.out.println("Enter Employee Id ");
		int id = sc.nextInt();
				System.out.println("Enter Updated Name ");
				String updatedName = sc.next();

		System.out.println(myController.update(id,updatedName));
		break;
		case 4:System.out.println(" Enter Employee id to delete \n");
		
		System.out.println(myController.deleteEmployee(sc.nextInt()));
		break;
		default :System.out.println("Invalid Input try again,\n");

		}
		
		

		}//end of while loop
	}

}

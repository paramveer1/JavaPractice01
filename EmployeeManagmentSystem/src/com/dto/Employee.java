package com.dto;

public class Employee {
	private int employeeId;
	private String name;
	private int age;
	private long mobile;
	
	
	public Employee(int employeeId,String name,int age,long number) {
		this.employeeId = employeeId;
		this.name = name;
		this.age = age;
		this.mobile = number;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	

}

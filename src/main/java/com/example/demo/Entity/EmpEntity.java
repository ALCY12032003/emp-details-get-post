package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp")
public class EmpEntity {
	@Id
	private int id;
	private String employeename;
	private int employeeage;
	private long salary;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public int getEmployeeage() {
		return employeeage;
	}

	public void setEmployeeage(int employeeage) {
		this.employeeage = employeeage;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public EmpEntity(int id, String employeename, int employeeage, long salary) {
		super();
		this.id = id;
		this.employeename = employeename;
		this.employeeage = employeeage;
		this.salary = salary;
	}

	public EmpEntity()
	{
		
	}
}
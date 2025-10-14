package com.hw1.model.vo;

public class Employee extends Person{
	private int salary;
	private String dept;
	private Person p = new Person();
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param age
	 * @param height
	 * @param weight
	 * @param salary
	 * @param dept
	 */
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name, age, height, weight);
		this.salary = salary;
		this.dept = dept;
		p.setAge(age);
		p.setHeight(height);
		p.setName(name);
		p.setWeight(weight);
	}
	
	public String informatio() {
		return p.information() + ", 급여 : " + salary + ", 부서 : " + dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}

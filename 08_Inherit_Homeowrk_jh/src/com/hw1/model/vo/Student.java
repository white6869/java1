package com.hw1.model.vo;

public class Student extends Person{
	private int grade;
	private String major;
	private Person p = new Person();
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param age
	 * @param height
	 * @param weight
	 * @param grade
	 * @param major
	 */
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, height, weight);
		this.grade = grade;
		this.major = major;
		p.setAge(age);
		p.setHeight(height);
		p.setName(name);
		p.setWeight(weight);
		
	}
	
	public String information() {
		return  p.information() +", 학년 : " +grade + ", 학과 : " + major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
}

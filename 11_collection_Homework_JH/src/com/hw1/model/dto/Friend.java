package com.hw1.model.dto;

public class Friend {
	private String name;
	
	public Friend() {
		// TODO Auto-generated constructor stub
	}

	public Friend(String name) {
		super();
		this.name = name;
	}
	
	public void pickLeader() {
		System.out.println("가 떡잎방범대 대장이다!"); 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

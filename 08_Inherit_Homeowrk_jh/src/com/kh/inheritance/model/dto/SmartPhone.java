package com.kh.inheritance.model.dto;

public class SmartPhone extends Phone {

	private String operatingSystem;
	private int storageCapacity;
	
	public SmartPhone() {
		// TODO Auto-generated constructor stub
		printInfo();
	}

	public SmartPhone(String brand, String model, int year, int price, String operatingSystem, int storageCapacity) {
		super(brand, model, year, price);
		this.operatingSystem = operatingSystem;
		this.storageCapacity = storageCapacity;
		
		
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.printf("Operating System : %s\nStorage Capacity : %dGB\n", operatingSystem, storageCapacity);
		System.out.println("================================================================================");
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public int getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	
	
}

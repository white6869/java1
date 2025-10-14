package com.kh.inheritance.model.dto;

public class BasicPhone extends Phone {
	private boolean hasPhysicalKeyboard;
	
	public BasicPhone() {
		// TODO Auto-generated constructor stub
		
	}

	
	
	/**
	 * @param brand
	 * @param model
	 * @param year
	 * @param price
	 * @param hasPhysicalKeyboard
	 */
	public BasicPhone(String brand, String model, int year, int price, boolean hasPhysicalKeyboard) {
		super(brand, model, year, price);
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
		printInfo();
		checkKeyboard();
		
	}



	public void checkKeyboard() {
		if(hasPhysicalKeyboard == true) {
			System.out.println("이 휴대폰은 물리적 키보드가 있습니다.");
		} else {
			System.out.println("이 휴대폰은 물리적 키보드가 없습니다.");
		}
		
	}

	public boolean isHasPhysicalKeyboard() {
		return hasPhysicalKeyboard;
	}

	public void setHasPhysicalKeyboard(boolean hasPhysicalKeyboard) {
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}
	
	
	
	
	

}

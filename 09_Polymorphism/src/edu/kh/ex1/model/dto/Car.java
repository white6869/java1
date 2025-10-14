package edu.kh.ex1.model.dto;

public class Car {
	// 속성
	private String engline; // 엔진
	private String fuel;	// 연료
	private int wheel; 		// 바퀴 갯수
	
	// 기능(메서드 + 생성자)
	public Car() {
		// TODO Auto-generated constructor stub
	}


	public Car(String engline, String fuel, int wheel) {
		super();
		this.engline = engline;
		this.fuel = fuel;
		this.wheel = wheel;
	}

	public String getEngline() {
		return engline;
	}

	public void setEngline(String engline) {
		this.engline = engline;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWhell(int wheel) {
		this.wheel = wheel;
	}

	
	//Object.toString()  오버라이딩
	// 오버라이딩?
	// -> 부모클래스에서 정의된 메서드를 자식클래스가 재졍의하는것
	
	@Override
	public String toString() {
		return  engline +" /" + fuel + " / "  + wheel;
	}
	
	
	
	
}

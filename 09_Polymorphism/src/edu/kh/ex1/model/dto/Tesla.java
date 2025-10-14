package edu.kh.ex1.model.dto;

public class Tesla  extends Car {//전기차
	
	private int berryCapacitv; // 배터리 용량
	public Tesla() {}

	// 매개변수생성자 + 상속받은것도 포함
	public Tesla(String engline, String fuel, int wheel, int berryCapacitv) {
		super(engline, fuel, wheel);
		this.berryCapacitv = berryCapacitv;
	}
	public int getBerryCapacitv() {
		return berryCapacitv;
	}
	public void setBerryCapacitv(int berryCapacitv) {
		this.berryCapacitv = berryCapacitv;
	}

	// Car.toString() 오버라이딩
	@Override
	public String toString() {
		return super.toString() + " / " + berryCapacitv;
	}
	
	
	
	

}

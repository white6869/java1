package edu.kh.ex1.model.dto;

public class Spark extends Car { //경차
	
	public double discountOffer;
	
	public Spark() {}

	public Spark(String engline, String fuel, int whell, double discountOffer) {
		super(engline, fuel, whell);
		this.discountOffer = discountOffer;
	}

	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}

	// Car.toString() 오버라이딩
	@Override
	public String toString() {
		return super.toString() + " / " + discountOffer;
	}
	
	
	

}

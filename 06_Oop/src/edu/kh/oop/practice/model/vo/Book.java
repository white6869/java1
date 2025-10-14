package edu.kh.oop.practice.model.vo;

public class Book {
	private String title;
	private int price;
	private double DiscountRate;
	private String author;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(String title, int price, double DiscountRate, String author) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.price = price;
		this.DiscountRate = DiscountRate;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + " / " + price + " / " + DiscountRate + " / "
				+ author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return DiscountRate;
	}

	public void setDiscountRate(double discountRate) {
		DiscountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}

package com.hw3.model.dto;

public class Book {
	private int bookNum;
	private String title;
	private String author;
	private int price;
	private String ch;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int bookNum, String title, String author, int price, String ch) {
		super();
		this.bookNum = bookNum;
		this.title = title;
		this.author = author;
		this.price = price;
		this.ch = ch;
	}
	
//	public void bookMenu() {
//		
//	}

	@Override
	public String toString() {
		return bookNum + "번 도서 : [도서제목 : " + title + " / 도서저자 : " + author + " / 도서가격 : " + price + " / 출판사 :"
				+ ch + "]";
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCh() {
		return ch;
	}

	public void setCh(String ch) {
		this.ch = ch;
	}
	
	
	
	
	
	
}

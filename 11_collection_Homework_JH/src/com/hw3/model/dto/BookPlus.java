package com.hw3.model.dto;

import java.util.ArrayList;
import java.util.List;

public class BookPlus extends Book {

	public BookPlus() {
		// TODO Auto-generated constructor stub
		
		List<Book> bpList = new ArrayList<>();
	}

	public BookPlus(int bookNum, String title, String author, int price, String ch) {
		super(bookNum, title, author, price, ch);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
}

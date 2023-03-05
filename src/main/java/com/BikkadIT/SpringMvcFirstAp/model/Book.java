package com.BikkadIT.SpringMvcFirstAp.model;

public class Book {
	
	private int bookid;
	
	private String bookName;
	
	private double bookPrice;

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	
	
	
	
	
	
}

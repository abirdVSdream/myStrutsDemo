package com.mystrutsdemo.cai.app.dao.test;

public class Book 
{
	private String bookName;
	private String author;
	
	public Book()
	{
	}

	public Book(String bookName,String author)
	{
		this.bookName = bookName;
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAthod() {
		return author;
	}
	public void setAthod(String author) {
		this.author = author;
	}
	
}
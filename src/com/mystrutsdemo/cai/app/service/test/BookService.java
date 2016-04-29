package com.mystrutsdemo.cai.app.service.test;

import com.mystrutsdemo.cai.app.dao.test.Book;

public class BookService 
{
	public Book [] getBooks()
	{
		return  new Book[]{
		new Book("cainiao","z"),
		new Book("cai","zl"),
		new Book("niao","zlin")};
	}
}

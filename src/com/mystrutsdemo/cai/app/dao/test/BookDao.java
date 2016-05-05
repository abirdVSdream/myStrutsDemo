package com.mystrutsdemo.cai.app.dao.test;

import com.mystrutsdemo.cai.app.bean.test.Book;

public class BookDao 
{
	public Book [] getBooks()
	{
		return  new Book[]{
		new Book("cainiao","z"),
		new Book("cai","zl"),
		new Book("niao","zlin")};
	}
}

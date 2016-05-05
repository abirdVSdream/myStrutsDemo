package com.mystrutsdemo.cai.app.bean.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate 
{
	private Date myDate=new Date(System.currentTimeMillis());
	
	
	public Date getMyDate() {
		return myDate;
	}

	public void setMyDate(Date myDate) {
		this.myDate = myDate;
	}
	
//	public static void main( String [] srgs)
//	{
//		Date nowTime = new Date(System.currentTimeMillis());
//		  SimpleDateFormat sdFormatter = new SimpleDateFormat("yyyy-MM-dd");
//		  String retStrFormatNowDate = sdFormatter.format(nowTime);
//
//		  System.out.println(retStrFormatNowDate);
//
//
//	}
	
}

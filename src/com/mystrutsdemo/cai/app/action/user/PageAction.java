package com.mystrutsdemo.cai.app.action.user;

import com.mystrutsdemo.cai.app.service.user.UserServices;
import com.opensymphony.xwork2.ActionSupport;

public class PageAction extends ActionSupport
{
	private int pageNumber;
	private int totalPage;
	private int pageSize;
	private  UserServices userServices = new UserServices();
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public UserServices getUserServices() {
		return userServices;
	}
	public void setUserServices(UserServices userServices) {
		this.userServices = userServices;
	}
	
	public String execute() throws Exception
	{
		pageSize = 10;
		
		int userAmount = userServices.getUserAmount();
		this.totalPage =userAmount % pageSize ==0 ? 
				(userAmount/pageSize):((userAmount/pageSize)+1);
				
				if(pageNumber == 0)
				{
					pageNumber = 1;
				}
				if(this.pageNumber <1)
				{
					pageNumber = 1;
				}
				if(this.pageNumber > totalPage)
				{
					this.pageNumber = totalPage;
				}
				return SUCCESS;
	}
}

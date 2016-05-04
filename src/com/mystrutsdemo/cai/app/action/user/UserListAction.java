package com.mystrutsdemo.cai.app.action.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mystrutsdemo.cai.app.dao.user.User;
import com.mystrutsdemo.cai.app.service.user.UserServices;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport
{
	private int pageNumber;
	private int pageSize;
	private int totalPage;
	private String username;
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String execute() throws Exception
	{
		UserServices userServices = new UserServices();
		List <User> userList = new ArrayList<User>();
		userList = userServices.getUserList(pageNumber, pageSize);
		Map<String,List <User>> listMap = new HashMap<String,List <User>>();
		
		return SUCCESS;
	}
}

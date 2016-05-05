package com.mystrutsdemo.cai.app.action.user;

import java.util.ArrayList;
import java.util.List;

import com.mystrutsdemo.cai.app.bean.user.User;
import com.mystrutsdemo.cai.app.dao.user.UserDao;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport
{
	private int pageNumber;
	private int pageSize;
	private int totalPage;
	private String username;
	List <User> userList = new ArrayList<User>();
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
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String execute() throws Exception
	{
		UserDao userServices = new UserDao();
		userList = userServices.getUserList(pageNumber, pageSize);
		return SUCCESS;
	}
}

package com.mystrutsdemo.cai.app.action.user;

import com.mystrutsdemo.cai.app.bean.user.User;
import com.mystrutsdemo.cai.app.dao.user.UserDao;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	private User userBean;
	
	public User getUserBean() {
		return userBean;
	}

	public void setUserBean(User userBean) {
		this.userBean = userBean;
	}

//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}

	public String execute() throws Exception
	{
		UserDao userDao = new UserDao();
		User userB =userDao.serchByusername(userBean.getUsername());
		this.setUserBean(userB);
		return SUCCESS;
	}

	public String Update() throws Exception
	{
		UserDao userDao = new UserDao();
		userDao.update(userBean);
		this.setUserBean(userBean);
		return SUCCESS;
	}
}

package com.mystrutsdemo.cai.app.action.manager;

import com.mystrutsdemo.cai.app.bean.user.Manager;
import com.mystrutsdemo.cai.app.dao.manager.ManagerDao;
import com.mystrutsdemo.cai.app.dao.user.UserDao;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ManagerLoginAction extends ActionSupport 
{
	//private LoginService loginService;
	private Manager userBean;
	private int pageNumber;
	private int pageSize;
	private String username;
	private String uid;
	
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public Manager getUserBean() {
		return userBean;
	}
	public void setUserBean(Manager userBean) {
		this.userBean = userBean;
	}
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}


	public String execute() throws Exception
	{
		ActionContext ctx = ActionContext.getContext();
		if((getUserBean().getUsername().equals("")||getUserBean().getUsername().equals(null))||(getUserBean().getPassword().equals("")||getUserBean().getPassword().equals(null)))
		{
			ctx.put("tip", "用户名或者密码不能为空");
			return LOGIN;
		}
		else
		{
			ManagerDao managerServices = new ManagerDao();
			String username = managerServices.serchByusername(getUserBean().getUsername()).getUsername();
			String password = managerServices.serchByusername(getUserBean().getUsername()).getPassword();
		 	if(username==null)
			{
				ctx.put("tip", "用户不存在");
				return LOGIN;
			}
			else if(!(password.equals(getUserBean().getPassword())))
			{
				ctx.put("tip", "用户名与者密码不匹配");
				return LOGIN;
			}
			else if(!username.equals("admin"))
		 	{
				ctx.put("tip", "不好意思。你不是管理员");
				return LOGIN;
		 	}
			else
			{
				this.setPageNumber(1);
				this.setPageSize(5);
				this.setUsername(username);
				return SUCCESS;
			}
		}
		
	}
	
	public String delete() throws Exception
	{
		UserDao userServices = new UserDao();
		int result = userServices.deleteByuid(getUid());
		this.setPageNumber(1);
		this.setPageSize(5);
//		this.setUsername(username);
		return SUCCESS;
		
	}

}

package com.mystrutsdemo.cai.app.action.manager;

import com.mystrutsdemo.cai.app.dao.user.User;
import com.mystrutsdemo.cai.app.dao.user.UserBean;
import com.mystrutsdemo.cai.app.service.user.UserService;
import com.mystrutsdemo.cai.app.service.user.UserServices;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ManagerLoginAction extends ActionSupport 
{
	//private LoginService loginService;
	private User userBean;
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
	public User getUserBean() {
		return userBean;
	}
	public void setUserBean(User userBean) {
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
			UserServices userServices = new UserServices();
			String username = userServices.serchByusername(getUserBean().getUsername()).getUsername();
			String password = userServices.serchByusername(getUserBean().getUsername()).getPassword();
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
			else if(!username.equals("cai"))
		 	{
				ctx.put("tip", "不好意思。你不是管理员");
				return LOGIN;
		 	}
			else
			{
				this.setPageNumber(1);
				this.setPageSize(10);
				this.setUsername(username);
				return SUCCESS;
			}
		}
		
	}
	
	public String delete() throws Exception
	{
		UserServices userServices = new UserServices();
		int result = userServices.deleteByuid(getUid());
		this.setPageNumber(1);
		this.setPageSize(10);
//		this.setUsername(username);
		return SUCCESS;
		
	}

}

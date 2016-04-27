package com.mystrutsdemo.cai.app.action.user;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport 
{
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute() throws Exception
	{
		ActionContext ctx = ActionContext.getContext();
		username = getUsername();
		password = getPassword();
		if((username == null ||username=="") &&(password == null ||password==""))
		{
			ctx.put("Tip", "用户名或者密码不能为空");
			return ERROR;
		}
		else
		{
			ctx.put("Tip", new String []{username});
			return SUCCESS;
		}
	}

}

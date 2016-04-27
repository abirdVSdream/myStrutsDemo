package com.mystrutsdemo.cai.app.action.user;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RegistAction extends ActionSupport
{
	private String username;
	private String mail;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute() throws Exception
	{
		ActionContext act = ActionContext.getContext();
		System.out.print(getUsername());
		if(getUsername()==null)
		{
			act.put("tip", "你输入的用户名为空。请输入非空的用户名");
			return ERROR;
		}
		else if(getPassword()==null)
		{
			act.put("tip", "你输入的密码为空。请输入非空的密码");
			return ERROR;
		}
		else 
		{
			act.put("tip", "恭喜您。注册成功");
			return SUCCESS;
		}
	}
	
}

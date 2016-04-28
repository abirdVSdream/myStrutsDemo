package com.mystrutsdemo.cai.app.action.user;

import com.mystrutsdemo.cai.app.dao.user.UserBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RegistAction extends ActionSupport
{
	
	public String execute() throws Exception
	{
		ActionContext act = ActionContext.getContext();
		UserBean userBean = new UserBean();
		if(userBean.getUsername().equals("") || userBean.getUsername().equals(null))
		{
			act.put("tip", "你输入的用户名为空。请输入非空的用户名");
			return ERROR;
		}
		else if(userBean.getPassword().equals("") || userBean.getPassword().equals(null))
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

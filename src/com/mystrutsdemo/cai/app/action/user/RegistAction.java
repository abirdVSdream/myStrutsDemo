package com.mystrutsdemo.cai.app.action.user;

import java.sql.Timestamp;
import java.util.Date;

import com.mystrutsdemo.cai.app.dao.user.User;
import com.mystrutsdemo.cai.app.dao.user.UserBean;
import com.mystrutsdemo.cai.app.service.user.UserService;
import com.mystrutsdemo.cai.app.service.user.UserServices;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RegistAction extends ActionSupport
{
	private User userBean;
	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public User getUserBean() {
		return userBean;
	}

	public void setUserBean(User userBean) {
		this.userBean = userBean;
	}

	public String execute() throws Exception
	{
		ActionContext act = ActionContext.getContext();
		String uname = getUserBean().getUsername();
		String upass = getUserBean().getPassword();
		if(uname.equals("") || uname.equals(null))
		{
			act.put("tip", "你输入的用户名为空。请输入非空的用户名");
			return ERROR;
		}
		else if(upass.equals("") || upass.equals(null))
		{
			act.put("tip", "你输入的密码为空。请输入非空的密码");
			return ERROR;
		}
		else 
		{
			UserServices userService = new UserServices();
			String username = userService.serchByusername(uname).getUsername();
			
			if(uname.equals(username))
			{
				act.put("tip", "你输入的用户名已存在。请重新输入的用户名");
				return ERROR;
			}
			else 
			{
				userService.insert(userBean);
				act.put("tip", getText("succTip",new String[]{uname}));
				return SUCCESS;
			}
			
		}
	}
	
}

package com.mystrutsdemo.cai.app.action.user;

import java.util.Map;

import com.mystrutsdemo.cai.app.dao.user.UserBean;
import com.mystrutsdemo.cai.app.service.user.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RegistAction extends ActionSupport
{
	private String uname;
	private String upass;
	private String email;
	

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String execute() throws Exception
	{
		ActionContext act = ActionContext.getContext();
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
			UserService userService = new UserService();
			String username = userService.serchByusername(uname).getUsername();
			
			if(uname.equals(username))
			{
				act.put("tip", "你输入的用户名已存在。请重新输入的用户名");
				return ERROR;
			}
			else 
			{
				UserBean userBean = new UserBean();
				userBean.setUsername(uname);
				userBean.setPassword(upass);
				userBean.setMail(email);
				userService.insert(userBean);
				act.put("tip", getText("succTip",new String[]{getUname()}));
				return SUCCESS;
			}
			
		}
	}
	
}

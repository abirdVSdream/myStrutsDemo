package com.mystrutsdemo.cai.app.action.user;

import com.mystrutsdemo.cai.app.dao.user.UserBean;
import com.mystrutsdemo.cai.app.service.user.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RegistAction extends ActionSupport
{
	private UserBean userBean;
	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}


	public String execute() throws Exception
	{
		ActionContext act = ActionContext.getContext();
		String uname = getUserBean().getUsername();
		String upass = getUserBean().getPassword();
		String email = getUserBean().getMail();
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
				userService.insert(userBean);
				act.put("tip", getText("succTip",new String[]{uname}));
				return SUCCESS;
			}
			
		}
	}
	
}

package com.mystrutsdemo.cai.app.action.user;

import com.mystrutsdemo.cai.app.dao.user.UserBean;
import com.mystrutsdemo.cai.app.service.user.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport 
{
	//private LoginService loginService;
	private UserBean userBean;
	
	
	public UserBean getUserBean() {
		return userBean;
	}
	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}
	
	public String execute() throws Exception
	{
		ActionContext ctx = ActionContext.getContext();
//		UserService userService = new UserService();
	/*	if((uname.equals("")||uname.equals(null))||(upass.equals("")||upass.equals(null)))
		{
			ctx.put("tip", "用户名或者密码不能为空");
			return ERROR;
		}
		else
		{
			UserService userService = new UserService();
			String username = userService.serchByusername(uname).getUsername();
			String password = userService.serchByusername(uname).getPassword();
		 	if(username==null)
			{
				ctx.put("tip", "用户不存在");
				return ERROR;
			}
			else if(!(password.equals(upass)))
			{
				ctx.put("tip", "用户名与者密码不匹配");
				return ERROR;
			}
			else
			{
				ctx.put("tip", getText("succTip",new String[]{getUname()}));
				return SUCCESS;
			}
		*/
		
		if((getUserBean().getUsername().equals("")||getUserBean().getUsername().equals(null))||(getUserBean().getPassword().equals("")||getUserBean().getPassword().equals(null)))
		{
			ctx.put("tip", "用户名或者密码不能为空");
			return ERROR;
		}
		else
		{
			UserService userService = new UserService();
			String username = userService.serchByusername(getUserBean().getUsername()).getUsername();
			String password = userService.serchByusername(getUserBean().getUsername()).getPassword();
		 	if(username==null)
			{
				ctx.put("tip", "用户不存在");
				return ERROR;
			}
			else if(!(password.equals(getUserBean().getPassword())))
			{
				ctx.put("tip", "用户名与者密码不匹配");
				return ERROR;
			}
			else
			{
				System.out.println(getUserBean().getUsername());
				ctx.put("tip", getText("succTip",new String[]{getUserBean().getUsername()}));
				return SUCCESS;
			}
		}
		
	}

}

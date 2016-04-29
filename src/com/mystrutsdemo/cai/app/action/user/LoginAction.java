package com.mystrutsdemo.cai.app.action.user;

import com.mystrutsdemo.cai.app.dao.user.UserBean;
import com.mystrutsdemo.cai.app.service.user.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport 
{
	//private LoginService loginService;
	private String uname;
	private String upass;
	
	
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
	
	public String execute() throws Exception
	{
		ActionContext ctx = ActionContext.getContext();
//		UserService userService = new UserService();
		if((uname.equals("")||uname.equals(null))||(upass.equals("")||upass.equals(null)))
		{
			ctx.put("tip", "用户名或者密码不能为空");
			return ERROR;
		}else
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
		}
		
	}

}

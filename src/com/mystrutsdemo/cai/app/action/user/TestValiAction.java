package com.mystrutsdemo.cai.app.action.user;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TestValiAction extends ActionSupport{

	/**
	 * 
	 */
	private String uname;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	public String execute() throws Exception
	{
		//return INPUT;
		return SUCCESS;
	}
	
}

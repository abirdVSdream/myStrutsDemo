package com.mystrutsdemo.cai.app.interceptor;

import java.util.Map;

import com.mystrutsdemo.cai.app.dao.user.Manager;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class ManagerLoginCheck extends AbstractInterceptor{
	
public String intercept(ActionInvocation ai) throws Exception
{
	Map session = ai.getInvocationContext().getSession();
	Manager manager = (Manager)session.get("cai");
	if(manager != null)
	{
		return ai.invoke();
	}
	else
	{
		return "login";
	}
}
}

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="regist"/></title>
</head>
<body>
<s:text name="registText"/><br/>
<s:form action="regist" method="post" theme="simple"><br/>
您的登录名:<s:textfield cssClass="input" name="userBean.username" key="user"/><br/>
&nbsp;&nbsp;&nbsp;&nbsp;登陆密码:<s:password cssClass="input"  id="password" name="userBean.password" maxlength="16"/><br/>
&nbsp;&nbsp;&nbsp;&nbsp;确认密码:<s:password cssClass="input" id="password2" name="" maxlength="16"/><br/>
&nbsp;&nbsp;&nbsp;&nbsp;电子邮箱:<s:textfield name="userBean.email" maxlength="50"/><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;性别：<s:select list="#{'男':'男','女':'女'}" name="userBean.gender" label="请选择您的书籍" listKey="key" listValue="value"/><br/>
<s:bean name="com.mystrutsdemo.cai.app.dao.test.MyDate"><br/>
&nbsp;&nbsp;&nbsp;生日<s:date name="myDate" format="yyyy-MM-dd"/><br/>
</s:bean>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;qq:<s:textfield name="userBean.qq" maxlength="12"/><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;电话:<s:textfield name="userBean.phone" maxlength="12"/><br/>
&nbsp;自我介绍：<s:textarea cols="40" rows="5" name="userBean.description"/>
<s:submit key="regist"/>
</s:form>
</body>
</html>
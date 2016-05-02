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
<s:form action="regist" method="post">
<s:textfield name="userBean.username" key="user"/>
<s:textfield name="userBean.password" key="pass"/>
<s:textfield name="userBean.email" key="mail"/>
<s:submit key="regist"/>
</s:form>
</body>
</html>
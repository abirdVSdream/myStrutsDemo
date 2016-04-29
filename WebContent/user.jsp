<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page import="com.mystrutsdemo.cai.app.dao.test.Book,java.util.*"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息页面</title>
</head>
<body>
<s:form>
<s:textfield name="use" key="username"/>
<s:textfield name="pass" key="password"/>
<s:checkboxlist name="ch1" label="请选择您的书" labelposition="top"
list="#{'疯狂java':'java','疯狂PHP':'php','疯狂c':'c'}" 
listKey="key" listVale="value"/>
<s:bean name="com.mystrutsdemo.cai.app.service.test.BookService" id="bea"/>
<s:checkboxlist name="test" label="请选择您的" labelposition="top"
list="#bea.books" listKey="bookName" listVale="author"/>
</s:form>

</body>
</html>
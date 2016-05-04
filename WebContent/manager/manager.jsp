<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户维护界面</title>
</head>
<body>
<ul>
	<li>ID</li>
	<li>用户名</li>
	<li>性别</li>
	<li>操作</li>
</ul>
<s:iterator value="userList">
	<ul>
	<li><s:property value="uid"/></li>
	<li><s:property value="username"/></li>
	<li><s:property value="gender"/></li>
	<li><a href="deleteUser.action?uid=<s:property value="uid"/>"></a></li>
	</ul>
	<span>邮箱：<s:property value="email"/></span>
	<span>QQ:<s:property value="qq"/></span>
	<span>电话：<s:property value="phone"/></span>
	<span>自我介绍：<s:property value="description"/></span>
</s:iterator>
<s:url id="firstPage" action="page">
<s:param name="pageNumber">1</s:param>
</s:url>
<s:a href ="%{firstPage}">首页</s:a>
<s:url id="prePage" action="page">
<s:param name="pageNumber">
<s:property value="pageNumber-1"/>
</s:param>
</s:url>
<s:a href="%{prePage}">上一页</s:a>
<s:url id ="nextPage" action="page">
<s:param name="pageNumber">
<s:property value="pageNumber+1"/>
</s:param>
</s:url>
<s:a href="%{nextPage}">下一页</s:a>
<s:url id ="nextPage" action="page">
<s:param name="pageNumber">
<s:property value="totalPage"/>
</s:param>
</s:url>
<s:a href="%{lastPage}">末页</s:a>
</body>
</html>
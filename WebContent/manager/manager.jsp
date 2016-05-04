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
<table border="1">
	<tr>
	<th>ID</th>
	<th>用户名</th>
	<th>性别</th>
	<th>邮箱</th>
	<th>QQ</th>
	<th>电话</th>
	<th>自我介绍</th>
	<th>操作</th>
	</tr>
<s:iterator id="u" value="userList">
	<tr>
	<td><s:property value="#u.uid"/></td>
	<td><s:property value="#u.username"/></td>
	<td><s:property value="#u.gender"/></td>
	<td><s:property value="#u.email"/></td>
	<td><s:property value="#u.qq"/></td>
	<td><s:property value="#u.phone"/></td>
	<td><s:property value="#u.description"/></td>
	<td><a href="deleteUser.action?uid=<s:property value="#u.uid"/>">删除</a></td>
	</tr>
	</s:iterator>
	</table>

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
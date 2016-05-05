<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息维护</title>
</head>
<body>
<div align="center"><h2>用户信息</h2></div>
<div align="center">
<form action="updateUser">
<table>
<tr>
	<td>用户名:</td>
	<td><input type="text" name="userBean.username" value="${userBean.username}" readonly="readonly"/></td>
</tr>
<tr>
	<td>密码:</td>
	<td><input type="text" name="userBean.password" value="${userBean.password}"/></td>
</tr>
<tr>
	<td>email:</td>
	<td><input type="text"  name="userBean.email"  value="${userBean.email}"/></td>
</tr>
<tr>
	<td>gender:</td>
	<td><input type="radio"  name="userBean.gender" value="男" checked='${userBean.gender}=="男"?true:false'/>男
		<input type="radio" name="userBean.gender" value="女" checked="${userBean.gender}=='女'?true:false"/>女</td>
</tr>
<tr>
	<td>qq:</td>
	<td><input type="text" name="userBean.qq" value="${userBean.qq}"/></td>
</tr>
<tr>
	<td>phone:</td>
	<td><input type="text" name="userBean.phone" value="${userBean.phone}"/></td>
</tr>
<tr>
	<td>description:</td>
	<td><textarea rows="10" cols="10" name="userBean.description" >${userBean.description}</textarea></td>
	<!--  <td><input type= name="userBean.description" value="${userBean.description}"/></td>-->
</tr>
<tr>
	<td></td>
	<td><input type="submit" value="修改"/></td>
</tr>
</table>
</form>
</div>
</body>
</html>
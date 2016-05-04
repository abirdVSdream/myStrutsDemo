<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="loginPage"/></title>
</head>
<body>
<s:form action="managerlogin">
	<s:textfield name="userBean.username" key="user"/>
	<s:textfield name="userBean.password" key="pass"/>
	${requestScope.tip}<br/>
	<s:submit key="login"/><s:reset value="重置"/><br/>
	<!--<s:submit key="regist"/>-->
</s:form>



<script type="text/javascript">
</script>
</body>
</html>
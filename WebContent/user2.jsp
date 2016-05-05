<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page import="com.mystrutsdemo.cai.app.bean.test.Book,java.util.*"  %>
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
list="#bea.books" listKey="bookName" listValue="bookName"/>
<s:optiontransferselect 
label="请选择您喜欢的书" name="cnbook" leftTitle="中文书" rightTitle="外文书" 
list="{'疯狂java','struts','javaee'}" 
multiple="true"
addToLeftLabel="<-" 
selectAllLabel="全部选择移动"
addAllToRightLabel="->>"
headerKey="cnkey"  headerValue="--选择中文书--" emptyOption="true"
doubleList="{'lalal','lala'}"
doubleName="enbook"
doubleHeaderKey="enKey" doubleHeaderValue="--选择英文书--"
doubleEmptyOption="true"
doubleMultiple="true"/>
<s:select list="#bea.books" name="a" label="请选择您的书籍" listKey="bookName" listValue="author"></s:select>
<s:select list="#{'lal':'cai','lalal':'nianio'}" name="b" label="请选择您的书籍la" listKey="key" listValue="value"/>
<s:radio list="#bea.books" name="radio" label="请选择您的书籍" listKey="bookName" listValue="author"></s:radio>
<s:token/>
</s:form>

</body>
</html>
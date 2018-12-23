<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="test2.action"  method="post">
		username:<input type="text" name="username"> 
		password:<input type="text" name="password"> 
		<input type="submit" value="提交">
	</form>
	<s:debug></s:debug>
</body>
</html>
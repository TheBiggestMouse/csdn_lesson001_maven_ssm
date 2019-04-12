<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Hello World!</h2>
	<a href="<%=request.getContextPath()%>/login/loginPage.action">测试链接</a>
	
	
	<form action="<%=request.getContextPath()%>/login/loginPage.action" method="post">
		<span>用户 名:  </span><input name="userName" type="text">
		<span>密码:  </span><input name="userPassword" type="password" >
		<input type="submit" value="提交" >
	</form>
	
	
	
</body>
</html>
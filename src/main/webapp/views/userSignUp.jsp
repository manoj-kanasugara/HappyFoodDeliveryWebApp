<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
welcome to sign up 
<form:form method="POST" action="/signUpUser" modelAttribute="user">
<tr>Name:
<form:input path="name"/>
</tr><br>

<tr>
Email
<form:input path="email"/>
</tr><br>
<tr>Mobile Number
<form:input path="mobileNumber"/>
</tr><br>
<tr>Password:
<form:input path="password"/><br>

<input type="submit"/>
</tr>


</form:form>
<tr></tr>

</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter home</title>
</head>
<body>

Welcome home
<br>
<br>
<a href="http://localhost:8080/SpringMvcdemo/emp/Abhishek?addr=Pune&dept=xyz">Abhishek</a>
<br>
<a href="http://localhost:8080/SpringMvcdemo/emp/Ketaki?addr=Ngp&dept=abc">Ketaki</a>

<b>Employee Registration form</b><br>

<sf:form modelAttribute="employee" method="POST" >

		ID :: <sf:input path="id"/><br>
		Name :: <sf:input path="name"/><br>
		
		<input type="submit" value="register"/>
		
</sf:form>

<br>
<br>
Employee List:
<br>

<c:forEach items="${elist }" var="e">
${e.id } :: ${e.name } <br>
</c:forEach>
</body>
</html>
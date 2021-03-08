<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employees</title>
</head>
<body>
<form method = "post" action = "employeeNavServlet"> 
<table> 
<c:forEach items="${requestScope.allEmployees}" var="currentEmployee"> 
<tr> 
	<td> <input type = "radio" name="id" value="${currentEmployee.id}"></td>
	<td> ${currentEmployee.name}</td>
	<td> ${currentEmployee.hireDate}</td>
</tr>
</c:forEach>
</table>

<input type = "submit" value = "delete" name="doThisToItem"> 

</form>
<br />

	<form action = "createEmployeeServlet" method="post">
	name: <input type = "text" name = "name">

	<input type = "submit" value= "Add Employee">
	</form>
						<br />
														<a href = "index.html">to index</a>
</body>
</html>
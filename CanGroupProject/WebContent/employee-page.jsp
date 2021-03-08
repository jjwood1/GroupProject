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
<form method = "post" action = "navigationServlet"> 
<table> 
<c:forEach items="${requestScope.allItems}" var="currentEmployee"> 
<tr> 
	<td> <input type = "radio" name="id" value="${currentEmployee.id}"></td>
	<td> ${currentEmployee.name}</td>
	<td> ${currentEmployee.hireDate}</td>
</tr>
</c:forEach>
</table>
<input type = "submit" value = "edit" name="doThisToItem"> 
<input type = "submit" value = "delete" name="doThisToItem"> 
<input type = "submit" value = "add" name = "doThisToItem"> 
</form>
</body>
</html>
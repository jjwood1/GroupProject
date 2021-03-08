<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Purchase</title>
</head>
<body>
<form method = "post" action = "purchaseServlet"> 
<table> 
<c:forEach items="${requestScope.allEmployees}" var="currentEmployee"> 
<tr> 
	<td> <input type = "radio" name="id" value="${currentEmployee.id}"></td>
	<td> ${currentEmployee.name}</td>
	<td> ${currentEmployee.hireDate}</td>
</tr>
</c:forEach>
</table>


		Company: ${canToEdit.company} <br />
		Content: ${canToEdit.content}
		<br />
		<input type ="hidden" name ="canid" value="${canToEdit.id}">


Quantity: <input type = "text" name = "amountSold"> 
	<input type = "submit" value= "Sell can(s)">
</form>
		<br />
		<a href = "index.html">to index</a>
</body>
</html>
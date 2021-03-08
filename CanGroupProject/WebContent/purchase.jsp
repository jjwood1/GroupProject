<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Purchase</title>
</head>
<body>
<form methd = "post" action = "purchaseServlet"> 
<c:forEach items="${requestScope.allItems}" var ="currentCan"> 
<tr> 
	<td> <input type = "radio" name = "id" value="${currentCan.id}"></td>
	<td> ${currentCan.company}</td>
	<td> ${currentCan.content}</td>
</tr>
</c:forEach>
Quantity: <input type = "number" name = "amountSold"> 
</form>
</body>
</html>
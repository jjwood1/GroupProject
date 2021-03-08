<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method = "post" action = "canNavigation">
	<table>
	<c:forEach items="${requestScope.allCans}" var="currentcan">
	<tr>
		<td><input type="radio" name="id" value="${currentcan.id}"></td>
		<td>${currentcan.company}</td>
		<td>${currentcan.content}</td>
		 <td>${currentcan.price}</td>
		<td>${currentcan.quantity}</td>
		</tr>
	</c:forEach>
	</table>
	<input type = "submit" value = "edit or add cans" name="doThisToItem">
	<input type = "submit" value = "delete" name="doThisToItem">

	<input type = "submit" value = "sell cans" name="doThisToItem">
	<br />
	</form>
	<form action = "createCanServlet" method="post">
	Company: <input type = "text" name = "company">
	Content: <input type = "text" name = "content">
	Price: <input type = "text" name = "price">
	<input type = "submit" value= "Add Can">
			<br />
		<a href = "index.html">to index</a>
	</form><br />
</body>
</html>
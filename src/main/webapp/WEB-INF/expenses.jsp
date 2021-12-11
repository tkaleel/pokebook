<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Expenses</title>
</head>
<body>
	<div class="container mt-5">
		<table class="table table-striped">
			<tr>
				<th>Expense</th>
				<th>Vendor</th>
				<th>Cost</th>
			</tr>
			<c:forEach var="pokebook" items="${pokebooks }">
				<tr>
					<td>${pokebook.name }</td>
					<td>${pokebook.vendor }</td>
					<td>${pokebook.cost }</td>
				</tr>
			</c:forEach>
		
		</table>
	
	
	
	
	</div>
</body>
</html>
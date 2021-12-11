<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Show One</title>
</head>
<body>
	<div class="container mt-5">
		<table class="table table-striped">
			<tr>
				<th>ID</th>
				<th>Expense</th>
				<th>Vendor</th>
				<th>Cost</th>
				<th>Description</th>
			</tr>
			<tr>
				<td>${pokebook.id }</td>
				<td>${pokebook.name }</td>
				<td>${pokebook.vendor }</td>
				<td>$${pokebook.cost }</td>
				<td>${pokebook.description }</td>
			</tr>

		</table>

		<form action="/expenses/${pokebook.id }/edit" method="get">
			 <input type="submit" class="btn-sm btn-primary" value="Edit">
		</form>
		<form action="/expenses/${pokebook.id}" method="post">
			<input type="hidden" name="_method" value="delete"> <input
				type="submit" class="btn-sm btn-danger" value="Delete">
		</form>


	</div>

</body>
</html>
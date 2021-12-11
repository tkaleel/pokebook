<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Create Entry</title>
</head>
<body>
<div class="container mt-5">
	<form:form action="/create" method="post" modelAttribute="newPokebook">
		<form:label path="name" class="form-label">Expense Name</form:label>
		<form:input path="name" type="text" class="form-control" />
		<p><form:errors path="name" class="text-danger" /></p>
		
		<form:label path="vendor" class="form-label">Vendor</form:label>
		<form:input path="vendor" type="text" class="form-control" />
		<p><form:errors path="vendor" class="text-danger" /></p>
		
		<form:label path="cost" class="form-label">Cost</form:label>
		<form:input path="cost" type="number" step="0.01" class="form-control" />
		<p><form:errors path="cost" class="text-danger" /></p>
		
		<form:label path="description" class="form-label">Description</form:label>
		<form:textarea path="description" class="form-control" />
		<p><form:errors path="description" class="text-danger" /></p>
		<button class="btn btn-primary">Submit</button>
	
	
	</form:form>

</div>

</body>
</html>
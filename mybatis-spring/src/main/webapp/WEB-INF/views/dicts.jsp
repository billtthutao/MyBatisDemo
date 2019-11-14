<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="path" value="${pageContext.request.contextPath}"/>	
	<table>
		<tr>
			<th colspan="4">Dictonary Management</th>
		</tr>
		<tr>
			<th>Type</th>
			<th>Name</th>
			<th>Value</th>
			<th>Action[<a href="${path}/dicts/add">ADD</a>]</th>
		</tr>
		<c:forEach items="${dicts}" var="dict">
			<tr id="dict-${dict.id}">
				<td>${dict.code}</td>
				<td>${dict.name}</td>
				<td>${dict.value}</td>
				<td>
					[<a href="${path}/dicts/add?id=${dict.id}">Edit</a>]
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
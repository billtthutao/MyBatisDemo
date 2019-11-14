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
	<form action="${path}/dicts/add" method="post">
		<input type="hidden" name="id" value="${dict.id}">
		<table>
			<tr>
				<th colspan="2">Dictionary Management</th>
			</tr>
			<tr>
				<th>Type</th>
				<td><input type="text" name="code" value="${dict.code}"></td>
			</tr>
			<tr>
				<th>Name</th>
				<td><input type="text" name="name" value="${dict.name}"></td>
			</tr>
			<tr>
				<th>Value</th>
				<td><input type="text" name="value" value="${dict.value}"></td>
			</tr>
			<tr>
				<th colspan="2">
					<input type="submit" value="Save">
					<input type="button" onclick="backToList()" value="Cancel">
				</th>
			</tr>
		</table>
	</form>
	<script type="text/javascript">
		function backToList(){
			location.href = '${path}/dicts';
		}
	</script>
</body>
</html>
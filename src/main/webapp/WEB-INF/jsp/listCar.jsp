<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="by.htp.carparking.domain.Car"
	import="java.util.ArrayList" import="java.util.Iterator"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value="${readAll}" />
	<table border="Cars">
		<td align="center" , bgcolor="#C0C0C0">id</td>
		<td align="center" , bgcolor="#C0C0C0">model</td>
		<td align="center" , bgcolor="#C0C0C0">brand</td>
		<c:forEach var="car" items="${readAll}">
			<tr>
				<td align="center"><c:out value="${car.id}" /></td>
				<td align="center"><c:out value="${car.model}" /></td>
				<td align="center"><c:out value="${car.brand}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
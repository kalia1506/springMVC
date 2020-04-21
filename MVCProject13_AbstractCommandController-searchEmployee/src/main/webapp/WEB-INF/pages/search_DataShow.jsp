<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<style type="text/css">
#header1 {
	background-color: orange;
	color: black;
	border: 1;
}

#card-header2 {
	background-color: darkcyan;
	color: red;
}
</style>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="card-header" id="card-header2">
			<h1 align="center">Employee Details</h1>
		</div>
		<c:choose>
			<c:when test="${!empty listRDTO }">
				<table class="card-table table" id="header1" border="1">
					<thead>
						<tr>
							<th>EMPNO</th>
							<th>ENAME</th>
							<th>JOB</th>
							<th>MGR</th>
							<th>HIREDATE</th>
							<th>SAL</th>
							<th>COMM</th>
							<th>DEPTNO</th>
						</tr>
					</thead>
					<c:forEach var="emp" items="${listRDTO}">
						<tbody>
							<tr>
								<td><c:out value="${emp.empno }" /></td>
								<td><c:out value="${emp.ename}" /></td>
								<td><c:out value="${emp.ejob }" /></td>
								<td><c:out value="${emp.mgr}" /></td>
								<td><c:out value="${emp.hireDate }" /></td>
								<td><c:out value="${emp.esal}" /></td>
								<td><c:out value="${emp.comm}" /></td>
								<td><c:out value="${emp.deptno}" /></td>
							</tr>
						</tbody>
					</c:forEach>
				</table>
			</c:when>
			<c:otherwise>
	no student found
	</c:otherwise>
		</c:choose>
	</div>
	<div>
		<a href="searchPage.py" class="btn btn-danger">Back</a>
		<a href="home.py" class="btn btn-danger">Home</a>
	</div>
</body>
</html>
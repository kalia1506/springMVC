<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Student RegisterPage</title>
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
		<form:form modelAttribute="stdModel">
			<div class="card text-center text-white bg-success mb-3">
				<div class="card-body ">
					<h2 class="card-title"><spring:message
								code="from.std.title" /></h2>
					<!-- Patient Name -->
					<div class="form-group row">
						<label class="col-sm-2 "><spring:message
								code="from.std.name" /></label>
						<div class="col-sm-6">
							<form:input path="name" placeholder="Name" />
						</div>
					</div>
					<!-- Date of Birth -->
					<div class="form-group row">
						<label class="col-sm-2 "><spring:message
								code="from.std.gender" /></label>
						<div class="col-sm-6">
							<form:input path="gender" placeholder="gender" />
						</div>
					</div>

					<!-- Gender -->
					<div class="form-group row">
						<label class="col-sm-2 "><spring:message
								code="from.std.age" /></label>
						<div class="col-sm-6">
							<form:input path="age" placeholder="age" />
						</div>
					</div>

					<!-- Mobile No-->
					<div class="form-group row">
						<label class="col-sm-2 "><spring:message
								code="from.std.mobile" /></label>
						<div class="col-sm-6">
							<form:input path="mobile" placeholder="mobile number" />
						</div>
					</div>

					<!-- Patient Address -->
					<div class="form-group row">
						<label class="col-sm-2 "><spring:message
								code="from.std.address" /></label>
						<div class="col-sm-6">
							<form:input path="address" placeholder="address" />
						</div>
					</div>

					<div>
						<form:button type="submit" class="btn btn-outline-danger">
							<spring:message code="from.std.submit" />
						</form:button>
					</div>

				</div>
			</div>
		</form:form>
	</div>
	<div>
		<a href="?language=de_GE" class="btn btn-outline-primary">german</a>
		<a href="?language=fa_FR" class="btn btn-outline-info">French</a>
		<a href="?language=hi_IN" class="btn btn-outline-warning">Hindi</a>
		<a href="?language=it_IT" class="btn btn-outline-danger">Italian</a>
		<a href="?language=od_IN" class="btn btn-outline-link">odia</a>
		<a href="?language=zh_CN" class="btn btn-outline-secondary">chinese</a>
	</div>
	
</body>
</html>
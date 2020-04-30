<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Patient RegisterPage</title>
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
	<!--validatation logic  -->
	<script type="text/javascript" src="validationLogic.js"></script>
	<div class="container">
		<form:form modelAttribute="patientDetails" method="post"
			onsubmit="return validation(this)">
			<%-- <div>
				<li><form:errors path="*" /></li>
			</div> --%>
			<div class="card text-center text-white bg-success mb-3">
				<div class="card-body ">
					<h2 class="card-title">Patient Registration From</h2>
					<!-- Patient Name -->
					<div class="form-group row">
						<label class="col-sm-2 ">Patient Name::</label>
						<div class="col-sm-6">
							<form:input path="pName" placeholder="Name" />
							<form:errors path="pName" />
						</div>
					</div>
					<!-- Date of Birth -->
					<div class="form-group row">
						<label class="col-sm-2 ">Patient Age::</label>
						<div class="col-sm-6">
							<form:input path="age" placeholder="Age"  />
							<form:errors path="age" />
						</div>
					</div>

					<!-- Gender -->
					<div class="form-group row">
						<label class="col-sm-2 ">Gender::</label>
						<div class="col-sm-6">
							<form:input path="gender" placeholder="Gender"  />
							<form:errors path="gender" />
						</div>
					</div>

					<!-- Mobile No-->
					<div class="form-group row">
						<label class="col-sm-2 ">Mobile No::</label>
						<div class="col-sm-6">
							<form:input path="phoneNo" placeholder="mobile number"
								id="phoneno" />
							<form:errors path="phoneNo" />
						</div>
					</div>

					<!-- Patient Address -->
					<div class="form-group row">
						<label class="col-sm-2 ">Patient Address::</label>
						<div class="col-sm-6">
							<form:input path="address" placeholder="address" id="address" />
							<form:errors path="address" />
						</div>
					</div>

					<div>
						<button type="submit" class="btn btn-outline-danger">Insert
							Patient</button>
					</div>

				</div>
			</div>
		</form:form>
	</div>
</body>
</html>
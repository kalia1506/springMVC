<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
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
		<form:form modelAttribute="StdCmd" method="post">
			<div class="card text-center text-white bg-dark mb-3">
				<div class="card-body ">
					<h2 class="card-title">Student Ragist0r Page</h2>
					<!-- Student Name -->
					<div class="form-group row">
						<label class="col-sm-2 ">Student Name::</label>
						<div class="col-sm-6">
							<form:input path="name" placeholder="Name" />
						</div>
					</div>
					<!--RollNo -->
					<div class="form-group row">
						<label class="col-sm-2 ">Student RollNo::</label>
						<div class="col-sm-6">
							<form:input path="rollNo" placeholder="rollNo" />
						</div>
					</div>

					<!-- Address -->
					<div class="form-group row">
						<label class="col-sm-2 ">Address::</label>
						<div class="col-sm-6">
							<form:input path="address" placeholder="address" />
						</div>
					</div>

					<!-- Mobile No-->
					<div class="form-group row">
						<label class="col-sm-2 ">Total mark::</label>
						<div class="col-sm-6">
							<form:input path="totalMark" placeholder="totalMark" />
						</div>
					</div>

					<!-- student Address -->
					<div class="form-group row">
						<label class="col-sm-2 ">student result::</label>
						<div class="col-sm-6">
							<form:input path="result" placeholder="result" />
						</div>
					</div>

					<!-- student Address -->
					<div class="form-group row">
						<label class="col-sm-2 ">student AverageMark::</label>
						<div class="col-sm-6">
							<form:input path="avgMark" placeholder="avgMark" />
						</div>
					</div>
					<div>
						<button type="submit" class="btn btn-outline-danger">Insert
						</button>
						<button type="reset" class="btn btn-outline-danger">reset
						</button>
					</div>

				</div>
			</div>
		</form:form>
		<div><h1>${insertMsg}</h1></div>
		<div>
			<a href="liststudent.py" class="btn btn-success">Student Details page</a>
		</div>
	</div>
</body>
</html>
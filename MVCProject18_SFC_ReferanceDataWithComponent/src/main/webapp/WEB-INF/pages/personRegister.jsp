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
<body class="container">
	<div>
		<form:form modelAttribute="personDetails" method="post">
			<div class="card text-center text-white bg-warning mb-3">
				<div class="card-body ">
					<h2 class="card-title">Person Profile Register</h2>
					<!--  -->
					<table class="table table-success table-bordered">
						<tbody>
							<tr>
								<td>Person Name::</td>
								<td><form:input path="pName" class="form-control" /></td>
							</tr>


							<tr>
								<td>Person Age::</td>
								<td><form:input path="pAge" class="form-control" /></td>
							</tr>


							<tr>
								<td>Person Gender::</td>
								<td>
									<div class="form-check form-check-inline">
										<form:radiobuttons path="gender" items="${genderList}"
											class="form-check-input" />
									</div>
								</td>
							</tr>


							<tr>
								<td>Hobbies::</td>
								<td>
									<div
										class="custom-control custom-checkbox custom-control-inline">
										<form:checkboxes path="hobies" items="${hobiesList}" />
									</div>
								</td>
							</tr>


							<tr>
								<td>Courses::</td>
								<td>
									<div class="col-md-6 select-outline">
										<form:select path="courses" multiple="multiple"
											class="mdb-select md-form">
											<form:options items="${coursesList}" />
										</form:select>
									</div>
								</td>
							</tr>


							<tr>
								<td>Qualification::</td>
								<td>
									<div class="col-md-6 select-outline">
										<form:select path="qlfy" multiple="no"
											class="mdb-select md-form md-outline colorful-select dropdown-primary">
											<form:options items="${qulfyList}" />
										</form:select>
									</div>
								</td>
							</tr>

							<tr>
								<td colspan="2">
									<div>
										<button type="submit" class="btn btn-outline-danger">Insert
										</button>
										<button type="reset" class="btn btn-outline-danger">reset
										</button>
									</div>
								</td>
							</tr>
						</tbody>
					</table>
					<!--  -->

				</div>
			</div>
		</form:form>


	</div>
</body>
</html>
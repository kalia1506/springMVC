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
		<form:form modelAttribute="upload_download" enctype="multipart/form-data" method="post">
			<div class="card text-center text-white bg-warning mb-3">
				<div class="card-body ">
					<h2 class="card-title">Student Profile Register</h2>
					<!--  -->
					<table class="table table-success table-bordered">
						<tbody>
							<tr>
								<td>Student Name::</td>
								<td><form:input path="name" class="form-control" /></td>
							</tr>


							<tr>
								<td>Address::</td>
								<td><form:input path="address" class="form-control" /></td>
							</tr>

							<tr>
								<td>Upload photo::</td>
								<td>
									<div class="custom-file">
										<form:input path="photo" type="file" class="custom-file-input" />
										<label class="custom-file-label" for="customFile">Choose
											file</label>
									</div>
								</td>
							</tr>
							<tr>
								<td>Upload resume::</td>
								<td>
									<div class="custom-file">
										<form:input path="resume" type="file"
											class="custom-file-input" />
										<label class="custom-file-label" for="customFile">Choose
											file</label>
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
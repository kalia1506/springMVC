<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/login.css">
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
		<div class="row">
			<div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
				<div class="card card-signin my-5">
					<div class="card-body">
						<h5 class="card-title text-center">Sign In</h5>
						<form:form class="form-signin" modelAttribute="userCMD"
							method="post">
							<div class="form-label-group">
								<label for="inputEmail">Email address</label>
								<form:input type="text" path="uName" id="inputEmail"
									class="form-control" placeholder="Email address"
									required="required" autofocus="autofocus" />

							</div>

							<div class="form-label-group">
								<label for="inputPassword">Password</label>
								<form:input path="uPwd" type="password" id="inputPassword"
									class="form-control" placeholder="Password" required="required" />

							</div>
							<form:button
								class="btn btn-lg btn-primary btn-block text-uppercase"
								type="submit">Sign in</form:button>
							<hr class="my-4">
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	
	<div>
		<h1>${msg}</h1>
	</div>
</body>
</html>
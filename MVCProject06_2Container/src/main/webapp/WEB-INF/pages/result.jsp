<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
#success {
	background-color:orange;
	color:black;
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
		<div class="card-header">
			<h1>Wel-come to Home Page</h1>
		</div>
		<div class="card" id="success">
			<div class="card-body">
				<h3 class="card-title">WishMessage page</h3>
				<b></b>
				<p class="card-text">
					<b>${message}</b>
				</p>
				</b> <a href="home.py" class="btn btn-primary">Home</a>
			</div>
		</div>
	</div>
</body>
</html>
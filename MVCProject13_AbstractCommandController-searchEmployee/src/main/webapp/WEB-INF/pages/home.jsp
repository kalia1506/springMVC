<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<style type="text/css">
#success {
	background-color: yellow;
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
		<div class="card-header">
			<h1>Wel-come to Home page</h1>
		</div>
		<div class="card" id="success">
			<div class="card-body">
				<h3 class="card-title">CURD Operation(Employee)</h3>
				<a href="searchPage.py" class="btn btn-danger">Get Data</a>
                <a href="#" class="btn btn-danger">Insert</a> 
                <a href="#" class="btn btn-danger">Update</a>
                <a href="#" class="btn btn-danger">Delete</a>
			</div>
		</div>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
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
		<form action="insertdata.py">
			<div class="card">
				<div class="card-body ">
					<h3 class="card-title">Insert Employee</h3>

					<div class="form-group row">
						<label class="col-sm-2 ">Employee No::</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="empno"
								placeholder="Employee number">
						</div>
					</div>

					<div class="form-group row">
						<label class="col-sm-2 "> Enter Name::</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="ename"
								placeholder="Name">
						</div>
					</div>

					<div class="form-group  row">
						<label class="col-sm-2 "> Employee job::</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="ejob"
								placeholder=" employee Job">
						</div>
					</div>

					<div class="form-group  row">
						<label class="col-sm-2 "> Manager No::</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="mgr"
								placeholder=" mgr N0.">
						</div>
					</div>

					<div class="form-group  row">
						<label class="col-sm-2 "> Hiredate::</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="hireDate"
								placeholder=" hiredate">
						</div>
					</div>

					<div class="form-group row">
						<label class="col-sm-2 "> Salary::</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="esal"
								placeholder="Salary">
						</div>
					</div>

					<div class="form-group row">
						<label class="col-sm-2 ">comm::</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="comm"
								placeholder="comm">
						</div>
					</div>

					<div class="form-group row">
						<label class="col-sm-2 ">Department No::</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="deptno"
								placeholder="department No">
						</div>
					</div>

					<button type="submit" class="btn btn-primary btn-lg">Insert</button>
				
				</div>
			</div>
		</form>
	</div>
</body>
</html>
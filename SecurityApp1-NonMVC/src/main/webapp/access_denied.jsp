<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>error</title>
</head>
<h1 style="color:red;text-align:center">Access Denied Page</h1>
<body>
   <h2 style="color:red">User ::<%=request.getUserPrincipal().getName() %>  is unauthorized to access this page</h2>
   <br><br>
   <a  href="../index.jsp">home</a>
</body>
</html>
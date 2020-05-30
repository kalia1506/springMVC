<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
  <h1 style="color:red;text-align:center">Admin  Page</h1>
  
 <b style="color:blue">Current User Name is ::</b><b style="color:red"><%=request.getUserPrincipal().getName()%></b><br>
 
 <a href="../index.jsp">home</a>
 <a href="../logout">logout</a>
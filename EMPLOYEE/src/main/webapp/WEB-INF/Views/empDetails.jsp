<%@page import="com.technoelevate.EMPLOYEECONTROLLER.DTO.EmployeeDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html> 
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMPLOYEES DETAILS</title>
<%
EmployeeDetails empd=(EmployeeDetails)request.getAttribute("empd");
String empid=empd.getEmpid();
String first_name=empd.getFirst_name();
String last_name=empd.getLast_name();
String user=empd.getUser();
String passkey=empd.getPasskey();
String number=empd.getNumber();
%>
</head>
<body>
<h2>ACCOUNT SUCCESSFULLY CREATED</h2><br>
EMPLOYEE ID :<%=empid %><br><br>
FIRST NAME :<%=first_name %><br><br>
LAST NAME :<%=last_name %><br><br>
USERNAME :<%=user %><br><br>
PASSWORD :<%=passkey %><br><br>
MOBILE NO. :<%=number %><br><br>
<form action="./login">
<input type="submit"  value="LOGIN">
</form>
</body>
</html>
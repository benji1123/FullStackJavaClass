<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get Data</title>
</head>
<body>
<jsp:useBean id="user" class="beans.User" scope="session"></jsp:useBean>
Given Name: <jsp:getProperty property="fName" name="user"/> <br/>
Surname: <jsp:getProperty property="lName" name="user"/>
</body>
</html>
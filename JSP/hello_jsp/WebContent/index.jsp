<%@ page import="java.util.Date" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<%= new Date() %>
<br>

<%-- static content --%>
<%@ include file="tf1.txt" %>
<br>

<%-- dynamic content --%>
<jsp:include page="tf2.txt"></jsp:include>

</body>
</html>
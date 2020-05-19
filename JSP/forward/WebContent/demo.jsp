<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DEMO</title>
</head>
<body>
demo.jsp
<%
	// request.getRequestDispatcher("forward.jsp").forward(request, response); // use content from forward.jsp
	response.sendRedirect("redirect.jsp"); // redirect user to redirect.jsp
%>
</body>
</html>
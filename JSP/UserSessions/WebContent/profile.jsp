<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>
</head>
<body>

	<%
		String username = null, sessionID = null;
		if(request.getSession().getAttribute("username") == null){
			response.sendRedirect("index.jsp");
		} else{
			username = request.getSession().getAttribute("username").toString();
			sessionID = request.getSession().getId();
		}
	%>
	Name: <%=username %> <br>
	JESESSIONID: <%=sessionID%>
	
	<form action="<%=request.getContextPath()%>/MemberAreaController" method="get">
	<input type="hidden" name="action" value="destroy">
	<input type="submit" value="logout">
	</form>
	
	<form action="<%=request.getContextPath()%>/MemberAreaController" method="get">
	<input type="submit" name="action" value="settings">
	
	</form>

</body>
</html>
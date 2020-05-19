<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form demo</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/Controller" method="post"> 
<%-- `method=get` passes data through URL-params; `method=post` uses hidden channel --%>
	Full name: <input required type="text" name="name"><br/>
	Gender: <input checked=True type="radio" value="female" name="gender">Female
			<input type="radio" value="male" name="gender">Male<br/>
			<input type="submit" value="Submit">
</form>

</body>
</html>
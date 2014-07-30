<%@page import="java.util.Date"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<title>The Structure Page</title>
</head>
<body>
	<%-- not visible to client --%>
	<%
		/* not visiable, just a java comment*/
		// comment
	%>
	<%=new Date().toString()%><br>
	<%@ include file="index.html"%>
	<br>-----------------------<br>
	<%!String ageString = null;%>
	<%!int age = 0;%>
	<%
		ageString = request.getParameter("age");
		if (ageString != null) {
			age = Integer.valueOf(ageString);
		}
		out.print("age:" + ageString );
		if (age > 18) {
	%>
	Your are an adult!
	<%
		}
	%>
</body>
</html>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<title>The Implicit Page</title>
</head>
<body>
	<%-- not visible to client --%>
    out:<%out.print("name");%><br>
    request:<%=request.getContextPath()%><br>
    response:<%=response.getContentType()%><br>
    session:<%=session.getAttribute("name")%><br>
    application:<%=application.getAttribute("name")%><br>

    config:<%=config.getServletName()%><br>
    page:<%=page%><br>
    pageContext:<%=pageContext%><br>

</body>
</html>
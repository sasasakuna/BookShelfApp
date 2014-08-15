<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL Example</title>
</head>
<body>
Hello:
<br>
<%
    String name=request.getParameter("name");
    request.setAttribute("name",name);
    List students=new ArrayList();
    for (int i=0;i<20;i++){
        students.add("student"+i);
    }
    request.setAttribute("students",students);
%>
<br>
${10+10}
<br>
c:out:<c:out value="${name}"/>
<br>
el:${name}
<br>
<c:forEach var="who" items="${students}">
    <c:out value="${who}"/><br>
</c:forEach>
</body>
</html>

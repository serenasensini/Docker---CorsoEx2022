<%--STEP 0 - DEFINIRE JSP --%>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<p>
    Questa è la mia prima servlet.
</p>
<%--Qui vengono definiti i contesti a cui punteranno i link: "hello-servlet" e "hello-json-servlet"--%>
<a href="hello-servlet">Hello Servlet</a>
<a href="hello-json-servlet">Hello JSON Servlet</a>
</body>
</html>
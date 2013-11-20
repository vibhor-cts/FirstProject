<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Entry Form</title>
</head>
<body>
	<form:form id="entry" action="entry" method="post" commandName="user">
		<label>Age</label>
		<form:input id="age" type="text" path="age"/>
		<form:errors path="age"/>
		<br/>
		<input type="submit" value="Submit"/>
	</form:form> 
</body>
</html>
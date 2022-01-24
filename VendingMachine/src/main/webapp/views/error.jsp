<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
table td{
vertical-align:top;
border:solid 1px #888;
padding:10px;
}
</style>
<meta charset="ISO-8859-1">
<title>Error Occurred</title>
</head>
<body>
    
  
	<form:form method="post" action="/home">
		<table style="width: 100%" border="2">
			<tr>
				<th>
				<h1>Something went wrong! </h1>
				<h2>Our Engineers are on it</h2>
				</th>
			</tr>
			<tr>
				<th>
					<button type="submit">Return to Home</button>
				</th>
			</tr>
		</table>

	</form:form>
    
    
    
</body>
</html>
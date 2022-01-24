<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Re stock</title>
</head>
<body>


	<form:form method="post" action="/home">


		<table style="width: 100%" border="2">
			<tr>
				<th><h2><label title="testing">Machine has been Restocked</label></h2></th>
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
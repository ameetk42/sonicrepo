<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Result</title>
</head>
<body>


	<form:form method="post" action="/home">


		<table style="width: 100%" border="2">
			<tr>
				<th><c:choose>
						<c:when test="${available==false}">
							<h2><label>UnSuccessful, the item is out of Stock</label></h2>
							<br />
						</c:when>
						<c:otherwise>
							<h2><label>Payment Successful</label></h2>

							<br />
						</c:otherwise>
					</c:choose></th>
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
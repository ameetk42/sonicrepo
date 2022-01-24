<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment</title>
</head>
<body>
	

	<form:form method="post" action="/result">


		<table style="width: 100%" border="2">
		
		<tr>
		<th>
		<h2>Payment</h2>
		</th>
		
		</tr>
			<tr>
				<th><c:if test="${paymentMethod==1}">
						<div id="mDiv">
							 <label>Card Details</label> Card Number: <input type="text"
								name="cardNumber"> Expire Date: <input type="text"
								name="expiryDate"> CCV: <input type="text" name="ccv">
						</div>
					</c:if> <c:if test="${paymentMethod==2}">
						<div id="mDiv">
							 <label>Please Enter Cash </label> <input
								type="text" name="coins">

						</div>
					</c:if></th>
			</tr>

			<tr>
				<th>
					<button type="submit" style="" class="btn btn-success">Pay</button>

				</th>
			</tr>

		</table>

	</form:form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sonic Vending Machine</title>
<style>
.center {
	display: flex;
	justify-content: center;
	align-items: flex-start;
	height: 200px;
	border: 3px solid green;
}
</style>

</head>
<body>

	<h2 style="text-align: center">Welcome to Sonic Vending Machine</h2>

	<form:form method="post" action="/payment">
	
	
	

 
		<table style="width: 100%" border="2">
		
		<tr>
				<th>
				<label title="money"> Money Available in Machine ${moneyInMachine} </label>
				</th>
			</tr>
				<tr>
				<th>
				<label title="money"> Card Payment ${cardPayment} </label>
				</th>
			</tr>
			
				<tr>
				<th>
				<label title="money"> Cash Payments ${cashPayment} </label>
				</th>
			</tr>
			
					<tr>
				<th>
				<label title="money"> Number of Cans Sold ${numOfCansSold} </label>
				</th>
			</tr>
			<tr>
				<th><label title="testing">Please Select the product</label> <select
					name="product">

						<c:forEach var="item" items="${listOfItems}">
							<option value="${item.key}">${item.value}</option>
						</c:forEach>

				</select></th>

			</tr>

			<tr>
				<th><label title="testing">Please Select the Payment
						Method</label> <select name="paymentMethod">

						<option value=1>Credit/Debit Card</option>
						<option value=2>Cash</option>
				</select></th>

			</tr>

			<tr>
				<th>

					<button type="submit" style="" class="btn btn-success">Proceed
						to Payment</button>

				</th>

			</tr>
			
			
		</table>
	</form:form>
	
	
		<table style="width: 100%" border="2">
		
		<tr>
			<th>
			<form:form method="post" action="/restock">
	
	<button type="submit" style="" class="btn btn-success">Restock</button>
	
	</form:form>
			</th>
			</tr>
	
		
	</table>
	
	
	
	
	
</body>

</html>
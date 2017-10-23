<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Ordered Name</title>
	</head>
	<body>
	<h2>Enter Name</h2>
	<c:url var="orderedNameUrl" value="/orderedNameResult"/>
	<form method="GET" action="${orderedNameUrl}">
		
		<div>
			<label for="firstName">First Name:</label>
			<input type="text" name="firstName" id="name" />
		</div>
		
		<div>
			<label for="middleInitial">Middle initial:</label>
			<input type="text" name="middleInitial" id="middleName" />
		</div>
		
		<div>
			<label for="lastName">Last Name:</label>
			<input type="text" name="lastName" id="lastName" />
		</div>
	
	<h2>Choose Order</h2>	
		<div>
			<label for="firstMLast">First MI Last</label>
			<input type="radio" value="firstMLast" name="orderSelection" />
	
			<label for="firstLast">First Last</label>
			<input type="radio" value="firstLast" name="orderSelection" />
		
			<label for="lastFirstM">Last, First MI</label>
			<input type="radio" value="lastFirstM" name="orderSelection" />
		
			<label for="lastFirst">Last, First</label>
			<input type="radio" value="lastFirst" name="orderSelection" />
		</div>
		<div>
			<label></label>
			<input type="submit" value="Submit"/>	
		</div>
	</form>	
	
	</body>
</html>
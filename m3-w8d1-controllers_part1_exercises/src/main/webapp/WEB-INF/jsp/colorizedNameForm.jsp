<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
	<head>
		<title></title>
	</head>	
	<body>
		<c:url var="formAction" value="/colorizedResult"/>
		<form method="GET" action="${formAction}">
			<h2>Enter Name</h2>
			<div>
			<label for="firstName">First Name:</label>
			<input type="text" name="firstName" id="firstName">
			</div>
			<div>
			<label for="lastName">Last Name:</label>
			<input type="text" name="lastName" id="lastName"/>
			</div>	
	
		<h2>Choose Colors</h2>
		<div>
			<input type="checkbox" name="red" value="true">	Red	
		</div>	
		<div>
			<input type="checkbox" name="blue" value="true"> Blue		
		</div>	
		<div>
			<input type="checkbox" name="green" value="true"> Green		
		</div>	
		<input type="submit" value="Submit">
		</form>	
	</body>


<div>
			<input type="radio" name="color" value="red">	Red	
		</div>	
		<div>
			<input type="radio" name="color" value="blue"> Blue		
		</div>	
		<div>
			<input type="radio" name="color" value="green"> Green		
		</div>	
		<input type="submit" value="Submit">
		</form>	
	</body>

</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>FizzBuzz Revisited</title>
	</head>
	<body>
	<h2>FizzBuzz Revisited</h2>
	
	<c:url var="fizzBuzzRevisited" value="/fizzBuzzResult"/>
	<form method="GET" action="${fizzBuzzRevisited}">
		
		<div>
			<label for="divisableBy1">Divisable By:</label>
			<input type="number" name="divisableBy1" id="divisable1" />
		</div>
		
		<div>
			<label for="divisibleBy2">Divisable By:</label>
			<input type="number" name="divisibleBy2" id="divisable2" />
		</div>
		
		<div>
			<label for="alternativeFizz">Alternative Fizz:</label>
			<input type="text" name="fizz" id="fizz" />
		</div>
		
		<div>
			<label for="alternativeBuzz">Alternative Buzz:</label>
			<input type="text" name="buzz" id="buzz" />
		</div>
		
		<div> 
			<label for="number1">Number 1:</label>
			<input type="number" name="number1" id="divisable1" />
		</div>
		
		<div> 
			<label for="number2">Number 2:</label>
			<input type="number" name="number2" id="divisable2" />
		</div>
		
		<div> 
			<label for="number3">Number 3:</label>
			<input type="number" name="number3" id="divisable3" />
		</div>
		
		<div> 
			<label for="number4">Number 4:</label>
			<input type="number" name="number4" id="divisable4" />
		</div>
		
		<div> 
			<label for="number5">Number 5:</label>
			<input type="number" name="number5" id="divisable5" />
		</div>
		
		<div>
			<label></label>
			<input type="submit" value="Submit"/>	
		</div>
		
	</form>
		
	</body>
</html>
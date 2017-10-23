<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Ordered Name</title>
	</head>
	<body>
	<h2>Reverse Last Two Characters</h2>
	<c:url var="lastTwoUrl" value="/lastTwoResult"/>
	<form method="GET" action="${lastTwoUrl}">
		
		<div>
			<label for="word1">Word 1:</label>
			<input type="text" name="word1"/>
		</div>
		<div>
			<label for="word2">Word 2:</label>
			<input type="text" name="word2"/>
		</div>
		<div>
			<label for="word3">Word 3:</label>
			<input type="text" name="word4"/>
		</div>
		<div>
			<label for="word4">Word 4:</label>
			<input type="text" name="word4"/>
		</div>
		<div>
			<label for="word5">Word 5:</label>
			<input type="text" name="word5"/>
		</div>
		<div>
			<label for="word6">Word 6:</label>
			<input type="text" name="word6"/>
		</div>
		<div>
			<label for="word7">Word 7:</label>
			<input type="text" name="word7"/>
		</div>
		<div>
			<label for="word8">Word 8:</label>
			<input type="text" name="word8"/>
		</div>
		<div>
			<label for="word9">Word 9:</label>
			<input type="text" name="word9"/>
		</div>
		<div>
			<label for="word10">Word 10:</label>
			<input type="text" name="word10"/>
		</div>
		
		<div>
			<label></label>
			<input type="submit" value="Submit"/>	
		</div>
	</form>	
	
	</body>
</html>
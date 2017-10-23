<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>FizzBuzz Revisited</title>
	</head>
	<body>
	<h2>FizzBuzz Revisited</h2>
	Divisable By: <c:out value="${fizzBuzzOrderer.divisibleBy1}"/><br>
	Divisable By: <c:out value="${fizzBuzzOrderer.divisibleBy2}"/><br>
	Divisable By Both: <c:out value="${fizzBuzzOrderer.divisibleBy1}"/> and <c:out value="${fizzBuzzOrderer.divisibleBy2}"/><br> 
	
	Alternative Fizz: <c:out value="${fizzBuzzOrderer.altFizz}"/><br>
	Alternative Buzz: <c:out value="${fizzBuzzOrderer.altBuzz}"/><br>
	
	<c:if test= "${fizzBuzzOrderer.num1 % fizzBuzzOrderer.divisibleBy1 == 0}">
	<c:out value="${fizzBuzzOrderer.divisibleBy1}"/>
	</c:if>
	
	</body>
</html>
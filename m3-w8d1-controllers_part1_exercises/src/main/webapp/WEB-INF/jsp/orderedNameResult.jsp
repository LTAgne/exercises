<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Ordered Name</title>
	</head>
	<body>
	<h2>Ordered Name</h2>
	First Name: <c:out value="${order.firstName}"/><br>
	Middle Initial: <c:out value="${order.middleInitial}"/><br>
	Last Name: <c:out value="${order.lastName}"/><br>
	
	
	<c:out value="${order.orderStrings[order.orderSelection]}"/>
	
	
	</body>
</html>
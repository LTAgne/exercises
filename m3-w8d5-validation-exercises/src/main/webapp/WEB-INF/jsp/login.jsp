<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<c:set var="pageTitle" value="Home Page"/>
<%@include file="common/header.jspf" %>
		
<h2>Login</h2>
<c:url var="loginUrl" value="/login"/>
<form:form method="POST" action="${loginUrl}" modelAttribute="login">
	
	<div>
	<label for="email">Email</label>
	<form:input path="email"/>
	<form:errors path="email" cssClass="error"></form:errors>
	
	</div>
	
	<div>
	<label for="password">Password</label>
	<form:input path="password"/>
	<form:errors path="password" cssClass="error"></form:errors>
	</div>
	
	<div>
		<label></label>
		<input type="submit" value="Submit"/>	
	</div>
</form:form>
<%@include file="common/footer.jspf" %>
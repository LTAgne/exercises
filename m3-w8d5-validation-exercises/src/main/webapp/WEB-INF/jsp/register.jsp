<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<c:set var="pageTitle" value="register"/>
<%@include file="common/header.jspf" %>
		
<h2>New Registration Page</h2>
<c:url var="registerUrl" value="/register"/>
<form:form method="POST" action="${registerUrl}" modelAttribute="registration">
	
			<div>
				<label for="firstName">First Name</label>
				<form:input path="firstName"/>
				<form:errors path="firstName" cssClass="error"></form:errors>
			</div>
			<div>
				<label for="lastName">Last Name</label>
				<form:input path="lastName"/>
				<form:errors path="lastName" cssClass="error"></form:errors>
			</div>
			<div>
				<label for="email">Email Address</label>
				<form:input path="email"/>
				<form:errors path="email" cssClass="error"></form:errors>
			</div>
			<div>
				<label for="confirmEmail">Confirm Email</label>
				<form:input path="confirmEmail"/>
				<form:errors path="confirmEmail" cssClass="error"></form:errors>
			</div>
			<div>
				<label for="birthDate">Birthday</label>
				<form:input path="birthDate"/>
				<form:errors path="birthDate" cssClass="error"></form:errors>
			</div>
			<div>
				<label for="tickets"># of Tickets</label>
				<form:input path="tickets"/>
				<form:errors path="tickets" cssClass="error"></form:errors>
			</div>
	<div>
		<label></label>
		<input type="submit" value="Submit"/>	
	</div>
</form:form>
<%@include file="common/footer.jspf" %>
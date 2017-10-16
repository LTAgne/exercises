<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<c:set var="pageTitle" value="Table Layout View"/>

<%@ include file="common/header.jspf" %>
    
    <section id="main-content">

		<h2>Toy Department</h2>
       	<table id="toyDepartment">
       		<tr>
			 <th class="toy"> &nbsp;</th>
					<c:forEach items="${products}" var= "product">
						<td> <a href="productDetail?productId=${product.productId}" > <img src="img/${product.imageName}" class="profile"/> </a> 
						<c:if test="${product.topSeller == 'true'}"> BEST SELLER!</c:if>
						</td>
					</c:forEach>
			</tr>
			
			<tr class="shaded">
				<th>Name</th>
					<c:forEach items="${products}" var= "product">
						<td> <c:out value="${product.name}"/> </td>
					</c:forEach>
			</tr>	
			
			<tr>	
				<th class="rating">Rating</th>
					<c:forEach items="${products}" var= "product">
						<td>
							<fmt:formatNumber maxFractionDigits="0" value="${product.averageRating}" var="formattedRating"/>
							<img src="img/${formattedRating}-star.png" class="rating"/>		
						</td>		
			 		</c:forEach>
			</tr>	
			
			<tr class="shaded">
				<th>Mfr</th>
					<c:forEach items="${products}" var="product">
						<td> <c:out value="${product.manufacturer}"/></td>
					</c:forEach>
			</tr>
		
			<tr class="pricing">
				<th >Price</th>
					<c:forEach items="${products}" var="product">
						<td>$ <c:out value="${product.price}"/> </td>
					</c:forEach>
			</tr>
			
			<tr class="shaded">
				<th>wt. (in lbs)</th>
					<c:forEach items="${products}" var="product">
						<td> <c:out value="${product.weightInLbs}"/></td>
					</c:forEach>
			</tr>
			
		</table>	
    </section>
</body>
</html>
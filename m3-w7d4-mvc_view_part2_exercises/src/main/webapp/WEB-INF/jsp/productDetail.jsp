<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="Product Detail View"/>

<%@ include file="common/header.jspf" %>

    <section id="main-content">
    
    <div class="detail-main-container">
 		<div class="detail-image">
 			<c:url var="detailProduct" value="/img/${product.imageName}" />
 			<img src="${detailProduct}" id="productImage"/>
 		</div>
 		<div class="detailSummary">
 			<h3><c:out value="${product.name}"/> <c:if test="${product.topSeller == 'true'}"> BEST SELLER!</c:if> </h3>
 				<p> by <c:out value="${product.manufacturer}"/> </p>
 				<p class= "smallImage" > <fmt:formatNumber maxFractionDigits="0" value="${product.averageRating}" var="formattedRating"/>
					<img src="img/${formattedRating}-star.png" class="tile-rating"/> </p>
 				<p class="pricing"> $ <c:out value="${product.price}"/> </p>
 				<p> <strong>Weight</strong> <c:out value="${product.weightInLbs}"/> lbs </p>
 				<p> <strong>Description: </strong> <c:out value="${product.description}"/> </p>	
 		</div>
 	</div>	
    
      </section>
</body>
</html>
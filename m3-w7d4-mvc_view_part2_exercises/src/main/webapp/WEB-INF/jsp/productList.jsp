<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="List Layout View"/>

<%@ include file="common/header.jspf" %>

    <section id="main-content">

		<h2>Toy Department</h2>
    
       	<div class="productRow">
       			
       		<div class="productImage">
       				<c:forEach items="${products}" var= "product">
       					<td> <a href="productDetail?productId=${product.productId}" > <img src="img/${product.imageName}" class="profile"/> </a> </td>
					</c:forEach>
			</div>	
			<div class = "list">
				<div class="individualProduct">
					<ul>
					<c:forEach items="${products}" var= "product">
					<li> <c:out value="${product.name}"/> 
						<c:if test="${product.topSeller == 'true'}"> BEST SELLER!</c:if>
    				</li>
    				<li> by <c:out value="${product.manufacturer}"/> </li>		
    				<li class="pricing"> $ <c:out value="${product.price}"/> </li>
					<li><strong>Weight</strong> <c:out value="${product.weightInLbs}"/> lbs</li>
    				<li class= "ratingImage"> <fmt:formatNumber maxFractionDigits="0" value="${product.averageRating}" var="formattedRating"/>
					<img src="img/${formattedRating}-star.png" class="tile-rating"/>
    				</li>
    				</c:forEach>	
					</ul>
				</div>		
			</div>
		</div>
    </section>
</body>
</html>
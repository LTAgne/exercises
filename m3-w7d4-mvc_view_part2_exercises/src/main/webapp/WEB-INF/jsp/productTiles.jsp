<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="Tile Layout View"/>

<%@ include file="common/header.jspf" %>

    <section id="main-content">
	
	 <div class="container">
    	<c:forEach items="${products}" var="product">
    		<div class="product-container">
    			<table class="tile">
    				<tr>
    					<td>
    						<a href="productDetail?productId=${product.productId}" > <img src="img/${product.imageName}" class="tile-profile"/> </a>
    					</td>
    				</tr>
    				
    				<tr>
    					<td class="tile-name">
    						<c:out value="${product.name}"/>
    						<c:if test="${product.topSeller == 'true'}"> BEST SELLER!</c:if>
    					</td>
    				</tr>
    				
    				<tr>
    					<td> by <c:out value="${product.manufacturer}"/> </td>
    						
    				<tr class="pricing">
						<td>$ <c:out value="${product.price}"/> </td>
					</tr>		
    			
    				<tr>
    					<td><strong>Weight</strong> <c:out value="${product.weightInLbs}"/> lbs</td>
    				</tr>
    					
    				<tr>
    					<td>
    							<fmt:formatNumber maxFractionDigits="0" value="${product.averageRating}" var="formattedRating"/>
								<img src="img/${formattedRating}-star.png" class="tile-rating"/>
				
    					</td>
    				</tr>			
    			</table>
    		</div>
		</c:forEach>
    </div>
	
       

    </section>
</body>
</html>
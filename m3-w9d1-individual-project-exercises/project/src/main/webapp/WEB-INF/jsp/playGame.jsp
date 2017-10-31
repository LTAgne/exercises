<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Great Lakes Biomimicry Mix & Match Game</title>
	    <link rel="stylesheet" href="css/biomim.css" />
	
	<script
  src="https://code.jquery.com/jquery-3.2.1.min.js"
  integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
  crossorigin="anonymous"></script>
  
	</head>
	<body>
		<h1>Great Lakes Biomimicry Mix & Match Game</h1>
	
	<div class="container">
		<div class = "image">
		<c:url value="/img/${question.rightImage}" var="rightImage"/>
		<img src="${rightImage}"/>
		</div>
		
		<div class="answers">
			<div>
			<input type="button" value="${question.answer1}" name="1" class="buttonAnswer"/>	
			</div>
			
			<div>
			<input type="button" value="${question.answer2}" name="2" class="buttonAnswer"/>	
			</div>
			
			<div>
			<input type="button" value="${question.answer3}" name="3" class="buttonAnswer"/>	
			</div>
		</div>	
		
		<div class = "image">
		<c:url value="/img/${question.leftImage}" var="leftImage"/>
		<img src="${leftImage}"/>
		</div>
	</div>	
	<div class= "correctAnswer" style="display:none">
	<p>More Info here</p>
	<p><c:out value="${question.correctAnswerText}"/></p>
	</div>
	
	<div>
	
	</div>
	<script> 
	$(".buttonAnswer").on("click",function(e){
		if(this.name == ${question.correctAnswer}){
			$(".correctAnswer").show();
		} else {
			$(this).addClass("wrong");
		}
	})
	</script>
	</body>
</html>
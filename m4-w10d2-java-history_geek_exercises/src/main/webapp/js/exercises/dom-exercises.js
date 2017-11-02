/// <reference path="../jquery-3.1.1.js" />
//Locate all <div> elements and add the 'president' class.
function presentialDivs() {
	//	$('#presidents > div').addClass('president');
	//  }
		
	//	var presidentDivs = document.querySelectorAll('div#presidents > div');
	//	presidentDivs.forEach(function(element) {
	//		element.classList.add('president');
	//	});
	//}
	
	document.querySelectorAll('div#presidents > div').forEach(function(element) {
		element.classList.add('president');
	});
	}

//Locate George Washington and add the 'founding-father' class

	function georgeWashington() {
		$('div#presidents > div:first').addClass('founding-father');
		}
	
	//function georgeWashington() {
	//document.querySelector('div#presidents > div').classList.add('founding-father');
	//}

//Locate all Republican presidents and add the 'red' class.

	function republicanPresidents() {
		$('div#presidents >div.Republican').addClass('red');
	}

	
//Locate all Democrat presidents and add the 'blue' class.

	function democratPresidents() {
	$('div#presidents >div.Democratic').addClass('blue');
	}

//Locate all Federalist presidents and add the 'gold' class.

	function otherPresidents() {
	$('div#presidents >div').not('.Republican').not('.Democratic').addClass('gold');
	}

//Locate all presidents named 'James' and add the 'james' class.
	
	function presidentsNamedJames() {
		$("div#presidents h3:contains('James')").addClass('james');
	}

//Locate each president serving at the beginning of each century and add the 'beginningOfCentury' class.
	
	function turnOfTheCenturyPresidents() {
	 $('h2').next('div').addClass('beginningOfCentury');
	}

//Locate each president serving at the end of the century and add the 'endOfCentury' class.
	
	function endOfTheCenturyPresidents() {
	$('div').prev('h2').addClass('endOfCentury');
	}
	
//Locate all presidents serving in the 1900s who appear on currency and add the 'appearOnCurrency' class.
	function currencyPresidents() {
	$('h2:contains("1900s")').nextAll('.currency').addClass('appearOnCurrency');
	}
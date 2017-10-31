function sumDouble( x, y){
    var x;
    var y; 
    if(x === y){
        return 2 * (x+y);
    }else {
        return x+y;
    }
}

function hasTeen( number1 , number2, number3){
    var number1;
    var number2; 
    var number3;
return ((number1>12 && number1<20)||(number2>12 && number2<20)||(number3>12 && number3<20));
}

function lastDigit(value1, value2){
    var value1;
    var value2; 
    if(value1%10 === value2%10) {
        return true;
    }else {
        return false;
    }
}

function seeColor(string){
    if (string.substring(0,3) === 'red') {
        return "red";
    } else if (string.substring(0,4) === 'blue'){
        return "blue";
    } else {
        return ""; 
    }    
}

function middleThree(middleString){
    var newString = middleString.length
    
}

function frontAgain(string){
    var string; 
    return ((string.substring(0,2)) === (string.substring(string.length ,string.length-2)));
}

function alarmClock(dayOfWeek, onVacation){
    var dayOfWeekay;
    var onVacation;

    if((dayOfWeek == 0 || dayOfWeek == 6)&& (onVacation == true)){
        return "off";
    }else if((dayOfWeek > 0 && dayOfWeek <6)&& (onVacation == true)){
        return "10:00";
    } else if ((dayOfWeek > 0 && dayOfWeek <6)&& (onVacation == false)){
        return "7:00";
    }else {
        return "10:00";
    }
}

function makeMiddle(array){
    var array;
    var newArray = [];
    if (((array.length)%2==0) && (array.length >2)){
        newArray[0] = array[array.length/2];
        newArray[1] = array[(array.length/2)+1];
    } else {
        return newArray;
    }
}

function oddOnly(originalArray){
    var originalArray;
    var newArray = [];
    
}

function weave(array1, array2){
    var array1;
    var array2;
    var resultArray = [];
}

function cigarParty(cigarNumber, weekend){
    var cigarNumber;
    var weekend;
    return (((cigarNumber>=40 && cigarNumber<=60) && weekend == false) || (cigarNumber>=40 && weekend == true));
}

function stringSplosion(string){
    var string;
    var newString;

    for (var i=1; i<string.length; i++){
        newString = newString + string.substring(0,i);
    } return newString;
}

function fizzBuzz(fizzNum){
    var fizzNum;

    if (fizzNum % 3 == 0 && fizzNum % 5 == 0){
        return "FizzBuzz";
    } else if (fizzNum % 3 ==0){
        return "Fizz";
    } else if (fizzNum % 5==0){
        return "Buzz"
    } else {
        return fizzNum;
    }
}

function blackJack(jackNum1, jackNum2){
    var jackNum1;
    var jackNum2;


    if (jackNum1>21 || jackNum2>21){
        return 0;
    } else if (jackNum1 > jackNum2){
        return jackNum1;
    } else if (jackNum2 > jackNum1){
        return jackNum2;
    }
}
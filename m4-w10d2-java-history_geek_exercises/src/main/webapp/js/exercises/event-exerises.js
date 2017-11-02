﻿/// <reference path="../jquery-3.1.1.js" />

$(document).ready(function () {

$("#SameShipping").on('change',function(){

if(this.checked == true){
    $("#ShippingAddress1").val($("#BillingAddress1").val());
    $("#ShippingAddress2").val($("#BillingAddress2").val());
    $("#ShippingCity").val($("#BillingCity").val());
    $("#ShippingState").val($("#BillingState").val());
    $("#ShippingCity").val($("#BillingCity").val());
    $("#ShippingPostalCode").val($("#BillingPostalCode").val()); 
    }

});

$("input[name='ShippingType']").on('click',function(event){
    var checkBox = $(this); 
    var checkShipping = checkBox.attr('data-cost');
$('#shipping > .price').text('$'+ checkShipping); 


var subttl = $('#subtotal > .price').text().substring(1);
$('#grandtotal > .price').text('$' + (parseFloat(checkShipping) + parseFloat(subttl)).toFixed(2));
});

});

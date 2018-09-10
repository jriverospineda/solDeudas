//Opciones de plugin validation

$.validator.addMethod("combo", function (value, element) {
	return $.isNumeric( value );
});

	
$.validator.addMethod("validaEmail", function(value, element) {
   var pattern = /^([a-z\d!#$%&'*+\-\/=?^_`{|}~\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]+(\.[a-z\d!#$%&'*+\-\/=?^_`{|}~\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]+)*|"((([ \t]*\r\n)?[ \t]+)?([\x01-\x08\x0b\x0c\x0e-\x1f\x7f\x21\x23-\x5b\x5d-\x7e\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]|\\[\x01-\x09\x0b\x0c\x0d-\x7f\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]))*(([ \t]*\r\n)?[ \t]+)?")@(([a-z\d\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]|[a-z\d\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF][a-z\d\-._~\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]*[a-z\d\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])\.)+([a-z\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]|[a-z\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF][a-z\d\-._~\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]*[a-z\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])\.?$/i;
  
  return this.optional( element ) || pattern.test( value ); 
},"Email ingresado no valido");


function validaRut(campo){
	if ( campo.length == 0 ){ return false; }
	if ( campo.length < 8 ){ return false; }

	campo = campo.replace('-','');
	campo = campo.replace(/\./g,'');

	var suma = 0;
	var caracteres = "1234567890kK";
	var contador = 0;    
	for (var i=0; i < campo.length; i++){
		u = campo.substring(i, i + 1);
		if (caracteres.indexOf(u) != -1)
		contador ++;
	}
	if ( contador==0 ) { return false; }
	
	var rut = campo.substring(0,campo.length-1);
	var drut = campo.substring( campo.length-1 );
	var dvr = '0';
	var mul = 2;
	
	for (i= rut.length -1 ; i >= 0; i--) {
		suma = suma + rut.charAt(i) * mul;
                if (mul == 7) 	mul = 2;
		        else	mul++;
	}
	res = suma % 11;
	if (res==1)		dvr = 'k';
                else if (res==0) dvr = '0';
	else {
		dvi = 11-res;
		dvr = dvi + "";
	}
	if ( dvr != drut.toLowerCase() ) { return false; }
	else { return true; }
}

$.validator.addMethod("validaRut", function(value, element) { 
        return this.optional(element) || validaRut(value); 
}, "Rut ingresado no valido");

$.extend($.validator.messages, {
    required: "Campo obligatorio."
});



	
// Opciones de Format Plugin
var optionsMaskRut =  {
  reverse: true,
   translation: {
	'K': {pattern: /[kK0-9]/}
  },
  onKeyPress: function(cep, e, field, options) {
	var masks = ['0.000.000-K', '00.000.000-K'];
	$().mask(masks, options);
}};	
$('.rut_format').mask('00.000.000-K',optionsMaskRut);

$('.email_format').mask("A", {
	translation: {
		"A": { pattern: /^[a-zA-Z\s]*$/, recursive: true }
	}
});

$('.text_format').mask("A", {
	translation: {
		"A": { pattern: /[\w \-.+]/, recursive: true }
	}
});

$('.telefono_format').mask("+560 0000-0000", {
});

$('#reset').click(function() {
	console.log("CLICK RESET");


    $(this).closest('form').find("input[type=text], textarea").val("");
});







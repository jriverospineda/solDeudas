<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="../css/bootstrap.min.css" type="text/css"	media="screen" />
	<link rel="stylesheet" href="../css/bootstrap-habitat.css" type="text/css"	media="screen" />
	<link rel="stylesheet" href="../css/jquery-ui.min.css" type="text/css"	media="screen" />
	<link rel="stylesheet" href="../css/forms.css" type="text/css"	media="screen" />
	<link rel="stylesheet" href="../css/habitat_public.css" type="text/css"	media="screen" />	
<title>Emisi&oacute;n Certificado</title>
<script src="../scripts/jquery-1.11.0.min.js"></script>
<script src="../scripts/jquery.mask.min.js"></script>
<script src="../scripts/jquery.validate.min.js"></script>
<script src="../scripts/jquery.validate.habitat.js"></script>
<style>

	#formCertificado label.error {
		margin-left: 10px;
		width: auto;
		display: inline;
		color: red;
	}
</style>
</head>
<body >
	<div class="my-2 my-md-2">
		<div class="container">
		<form id="formCertificado" method="post" action=""> 
			<div class="row">
				<div class="col-12">
					<div class="p-1 mb-2 text-white bg-primary">
						<h5 class="card-title-2">Emisi&oacute;n Certificado</h5>
					</div>	
				<!-- Inicio tabla de resultados -->
						<div><label class="form-label">URL: ${url}</label>
							<center>

							<embed src="${url}" type="application/pdf" width="100%" height="100%">

<iframe src="/certificados/CertDeudaTotalEmpleador.pdf" width="100%" height="100%">
This browser does not support PDFs. Please download the PDF to view it: <a href="/certificados/CertDeudaTotalEmpleador.pdf">Download PDF</a>
</iframe>

<object data="/certificados/CertDeudaTotalEmpleador.pdf" type="application/pdf" width="100%" height="100%">
<iframe src="/certificados/CertDeudaTotalEmpleador.pdf" style="border: none;" width="100%" height="100%">
This browser does not support PDFs. Please download the PDF to view it: <a href="/certificados/CertDeudaTotalEmpleador.pdf">Download PDF</a>
</iframe>
</object>
							</center>
						</div> 
				<!-- Fin tabla de resultados -->											
			</div>
		</form>
		</div>
	</div>
<script>
 $(document).ready(function() { 
		$('.rut_format').mask('00.000.000-K',{'translation': { K: {pattern: /[kK0-9]/}}}, {reverse: true});
		$('#fechaInicio').mask('00/00/0000');
		$('#fechaFinal').mask('00/00/0000');
		var combb = / /;
		$.validator.addMethod("combo", function (value, element) {
			return $.isNumeric( value );
		});
		// validate signup form on keyup and submit
		$("#formCertificado").validate({
			rules: {
				rutEmpresa: "required",
				fechaInicio: "required",
				fechaFinal: "required",				
				tipoCertificado: {
					required: true,
					combo:true
				}
			},
			messages: {
				rutEmpresa: "Ingrese Rut de la empresa",
				fechaInicio: "Ingrese Fecha de inicio",
				fechaFinal: "Ingrese Fecha de fin",
				tipoCertificado: "Ingrese el Tipo de Certificado"
			}
		});

    });
</script>

</body>
</html>
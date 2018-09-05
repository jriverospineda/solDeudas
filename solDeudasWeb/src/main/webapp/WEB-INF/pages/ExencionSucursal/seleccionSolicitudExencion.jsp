<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="../css/bootstrap.min.css" type="text/css"	media="screen" />
	<link rel="stylesheet" href="../css/bootstrap-habitat.css" type="text/css"	media="screen" />
	<link rel="stylesheet" href="../css/jquery-ui.min.css" type="text/css"	media="screen" />
	<link rel="stylesheet" href="../css/forms.css" type="text/css"	media="screen" />
	<link rel="stylesheet" href="../css/habitat_public.css" type="text/css"	media="screen" />	
	<title>Solicitud de Exenci&oacute;n</title>
	<script src="../scripts/jquery-1.11.0.min.js"></script>
	<script src="../scripts/jquery.mask.min.js"></script>
	<script src="../scripts/jquery.validate.min.js"></script>
	<script src="../scripts/jquery.validate.habitat.js"></script>
	<script src="../scripts/jquery-ui.min.js"></script>
</head>
<body >
	<div class="my-2 my-md-2">
		<div class="container">
		<form id="formExencion" method="get" action=""> 
			<div class="row">
				<div class="col-12">
					<div class="p-1 text-white bg-primary">
						<h5 class="card-title-2">Solicitud Excenci&oacute;n PAC</h5>
					</div>
					<div class="row m-1">
						<div class="h7 col-lg-12">&nbsp;</div>
					</div>
					<div class="row m-1">
						<div class="h5  col-lg-12" ></div>
						<div class="row col-lg-12">
							<div class="col-md-4">
								<label class="form-label">&nbsp;</label>
							</div>
							<div class="col-md-4">
								<label class="form-label">¿Es Usted representante del afiliado?</label><br>
								<label class="form-label"><div><input type="radio" name="representante" id="representanteSi"checked/>Si
								<input type="radio" name="representante" id="representanteNo"/>No</div></label>
							</div>
							<div class="col-md-4">
								<label class="form-label ">&nbsp;</label>
							</div>
						</div>
					</div>
					
					<div class="row m-1">
						<div class="h7 col-lg-12">&nbsp;</div>
					</div>
					
					<div class="row m-1">
						<div class="h5  col-lg-12" ></div>
						<div class="row col-lg-12">
							<div class="col-md-4">
								<label class="form-label">&nbsp;</label>
							</div>
							<div class="col-md-4">
								<label class="form-label">¿Es Usted pensionado del antiguo sistema?</label><br>
								<label class="form-label"><div><input type="radio" name="antiguo" id="antiguoSi"checked/>Si
								<input type="radio" name="antiguo" id="antiguoNo"/>No</div></label>
							</div>
							<div class="col-md-4">
								<label class="form-label ">&nbsp;</label>
							</div>
						</div>
					</div>

							
					<div class="row m-1 pt-1">
						<div class="row col-lg-12">
							<div class="col-md-4">
								<label class="form-label">&nbsp;</label>
							</div>
							<div class="col-4">
								<div class="row pt-4">
									<div class="col-md-4 text-center">
										<button type="submit" class="btn">Siguiente</button>
									</div>
									<div class="col-md-4 text-center">
										<label class="form-label">&nbsp;</label>
									</div>
								</div>
							</div>
							<div class="col-md-4">
								<label class="form-label">&nbsp;</label>
							</div>
						</div>
					</div>
				</div>
			</div>
		</form>
		</div>
	</div>
<script>
 $(document).ready(function() { 
    	$('#idRepresentante').hide();
		$('#checkbox1').change(function(){
			if(this.checked)
				$('#idRepresentante').fadeIn();
			else
				$('#idRepresentante').fadeOut();

		});
		
		// validate signup form on keyup and submit
		$("#formExencion").validate({
			rules: {
				rutAfiliado: {
					required: true,
					validaRut: true
				},
				emailAfiliado: {
					required: true,
					validaEmail: true
					//email: true
				},
				rutEmpresa: {
					required: true,
					validaRut: true
				},
				emailEmpresa: {
					required: true,
					validaEmail: true
				},
				rutRepresentante: {
					validaRut: true
				},
				nombreRepresentante: "required",
				emailRepresentante: {
				required: true,
				email: true
				}
			},
			messages: {
				rutRepresentante: "Ingrese Rut del Representante",
				nombreRepresentante: "Ingrese nombre del Representante",
				emailRepresentante: "Ingrese Email del Representante",
				fechaInicio: "Ingrese fecha de Inicio"
			}
		});
		$( function() {
			$( "#fechaInicio" ).datepicker();
		} );

    });
</script>

</body>
</html>
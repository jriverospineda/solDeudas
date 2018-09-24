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
	<title>Ingreso Empleador y Representante Legal Web</title>
	<script src="../scripts/jquery-1.11.0.min.js"></script>
	<script src="../scripts/jquery.mask.min.js"></script>
	<script src="../scripts/jquery.validate.min.js"></script>
	<script src="../scripts/jquery.validate.habitat.js"></script>
	<script src="../scripts/jquery-ui.min.js"></script>
	<script src="../scripts/jquery.Rut.js"></script>	
</head>
<body >
	<div class="my-2 my-md-2">
		<div class="container">
		<form id="formIngresoRepresentante" method="get" action=""> 
			<div class="row">
				<div class="col-12">
					<div class="p-1 text-white bg-primary">
						<h5 class="card-title-2">Ingreso Empleador y Representante Legal Web</h5>
					</div>
					<div class="row m-1">
						<div class="h7 col-lg-12">&nbsp;</div>
					</div>
					<div class="row m-1">
						<div class="row col-lg-12">
							<div class="col-md-2">
								<label class="form-label">Rut Empresa</label>
								<input name="rutEmpresa" id="rutEmpresa" type="text" class="form-control rut_format"/>
							</div>
							<div class="col-md-6">
								<label class="form-label">Raz&oacute;n Social</label>
								<input name="razonSocial" id="razonSocial" type="text" class="text_format form-control"/>
							</div>
							<div class="col-md-4">
								<label class="form-label">Email</label>
								<input name="emailEmpresa" id="emailEmpresa" type="text" class="email_format form-control"/>
							</div>
						</div>
					</div>					
					<div class="row m-1">
						<div class="row col-lg-12">
							<div class="col-md-2">
								<label class="form-label">&nbsp;</label>
							</div>
							<div class="col-md-6">
								<label class="form-label">Direcci&oacute;n</label>
								<input name="direccionEmpleador" id="direccionEmpleador" type="text" class="text_format form-control"/>
							</div>
							<div class="col-md-4">
								<label class="form-label">Tel&eacute;fono</label>
								<input name="telefonoEmpleador" id="telefonoEmpleador" type="text" class="telefono_format form-control"/>
							</div>
						</div>
					</div >
					<div class="row m-1">
						<div class="col-md-12">
							<div><input id="checkbox1" type="checkbox" name="checkRepresentante" class="">Act&uacute;a como representante del Empleador</div>
						</div>
					</div>
					<div id="idRepresentante" class="row col-lg-12 mt-1 mb-2">
						<div class="col-md-2">
							<label class="form-label">Rut Representante</label>
							<input disabled name="rutRepresentante" id="rutRepresentante" type="text" class="rut_format form-control"/>
						</div>
						<div class="col-md-6">
							<label class="form-label">Nombre Representante</label>
							<input disabled name="nombreRepresentante" id="nombreRepresentante" type="text" class="text_format form-control"/>
						</div>
						<div class="col-md-4">
								<label class="form-label">Email</label>
								<input disabled name="emailRepresentante" id="emailRepresentante" type="text" class="email_format form-control"/>
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
										<button type="submit" class="btn">Ingresar</button>
									</div>
									<div class="col-md-4 text-center">
										<button type="reset" class="btn">Limpiar</button>
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
			</div>
		</form>
		</div>
	</div>
<script>
 $(document).ready(function() { 
		
		$('#checkbox1').change(function() {
			if($(this).is(":checked")) {
				$(this).attr("checked");				
				$("#rutRepresentante").prop( "disabled", false );
				$("#nombreRepresentante").prop( "disabled", false );
				$("#emailRepresentante").prop( "disabled", false );
				
			} else{
				$("#rutRepresentante").prop( "disabled", true );
				$("#nombreRepresentante").prop( "disabled", true );
				$("#emailRepresentante").prop( "disabled", true );	
				$('#rutRepresentante').val('');
				$('#nombreRepresentante').val('');
				$('#emailRepresentante').val('');
				$('#emailRepresentante-error').remove();
				$('#rutRepresentante-error').remove();
				$('#nombreRepresentante-error').remove();
				
					
			} 
		});
		
		// validate signup form on keyup and submit
		$("#formIngresoRepresentante").validate({
			rules: {
				razonSocial: "required",
				rutEmpresa: {
					required: true,
					validaRut: true
				},
				direccionEmpleador: "required",
				telefonoEmpleador:"required",
				emailEmpresa: {
					required: true,
					validaEmail: true
				},
				rutRepresentante: {
					required: true,
					validaRut: true
				},
				nombreRepresentante: "required",
				emailRepresentante: {
					required: true,
					validaEmail: true
				},
				fechaInicio:"required"
			},
			messages: {
				rutAfiliado: "Ingrese Rut del Afiliado",
				emailAfiliado: "Ingrese email del Afiliado",
				rutEmpresa: "Ingrese Rut de la Empresa",
				emailEmpresa: "Ingrese email de la Empresa",
				rutRepresentante: "Ingrese Rut del Representante",
				nombreRepresentante: "Ingrese nombre del Representante",
				emailRepresentante: "Ingrese Email del Representante",
				fechaInicio: "Ingrese fecha de Inicio"
			}
		});

    });
</script>

</body>
</html>
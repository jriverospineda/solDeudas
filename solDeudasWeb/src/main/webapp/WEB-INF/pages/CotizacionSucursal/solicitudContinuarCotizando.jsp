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
<title>Solicitud Continuar Cotizando</title>
<script src="../scripts/jquery-1.11.0.min.js"></script>
<script src="../scripts/jquery.mask.min.js"></script>
<script src="../scripts/jquery.validate.min.js"></script>
<script src="../scripts/jquery.validate.habitat.js"></script>
<style>


</style>
</head>
<body >
	<div class="my-2 my-md-2">
		<div class="container">
		<form id="formContinuarCotizando" method="get" action=""> 
			<div class="row">
				<div class="col-12">
					<div class="p-1 text-white bg-primary mb-2">
						<h5 class="card-title-2">Declaraci&oacute;n Pensionado que opta por continuar cotizando</h5>
					</div>
					
					<div class="row m-1">
						<div class="row col-lg-12">
							<div class="col-md-2">
								<label class="form-label">Rut Empleador</label>
								<input name="rutEmpleador" id="rutEmpleador" type="text" class="rut_format form-control"/>
							</div>
							<div class="col-md-6">
								<label class="form-label">Raz&oacute;n Social</label>
								<input name="razonSocial" id="razonSocial" type="text" class="form-control" readonly/>
							</div>
							<div class="col-md-4">
								<label class="form-label">Email</label>
								<input name="emailEmpleador" id="emailEmpleador" type="text" class="form-control"/>
							</div>
						</div>
					</div>						
					
					<div class="row m-1">
						<div class="row col-lg-12">
							<div class="col-md-2">
								<label class="form-label">Rut Afiliado</label>
								<input name="rutAfiliado" id="rutAfiliado" type="text" class="rut_format form-control"/>
							</div>
							<div class="col-md-6">
								<label class="form-label">Nombre Afiliado</label>
								<input name="nombreAfiliado" id="nombreAfiliado" type="text" class="form-control" readonly/>
							</div>
							<div class="col-md-4">
								<label class="form-label">Email</label>
								<input name="emailAfiliado" id="emailAfiliado" type="text" class="form-control"/>
							</div>
						</div>
					</div >

					<div class="row m-1">
						<div class="col-md-12">
							<div><input id="checkbox1" type="checkbox" name="checkRepresentante" class="">Act&uacute;a representante del Afiliado</div>
						</div>
					</div>
					<div id="idRepresentante" class="row col-lg-12 mt-1 mb-2">
						<div class="col-md-2">
							<label class="form-label">Rut representante</label>
							<input name="rutRepresentante" id="rutRepresentante" type="text" class="rut_format form-control"/>
						</div>
						<div class="col-md-6">
							<label class="form-label">Nombre</label>
							<input name="nombreRepresentante" id="nombreRepresentante" type="text" class="form-control"/>
						</div>
						<div class="col-md-4">
							<label class="form-label">Email</label>
							<input name="emailRepresentante" id="emailRepresentante" type="text" class="form-control"/>
						</div>
					</div>
					<div class="row m-1 pt-1">
						<div class="row col-lg-12">
							<div class="col-md-3">
								<label class="form-label">Fecha Inicio</label>
								<input type="text" name="fechaInicio" id="fechaInicio" class="form-control" placeholder="dd/mm/aaaa">
							</div>
							<div class="col-md-5">
								<label class="form-label">&nbsp;</label>
							</div>
							<div class="col-md-4">
								<label class="form-label">&nbsp;</label>
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
		</form>
		</div>
	</div>
<script>
 $(document).ready(function() { 
		$('.rut_format').mask('00.000.000-K',{'translation': { K: {pattern: /[kK0-9]/}}}, {reverse: true});
		$('#fechaCotizacion').mask('00/00/0000');
		
		// validate signup form on keyup and submit
		$("#formContinuarCotizando").validate({
			rules: {
				rutAfiliado: "required",
				fechaCotizacion: "required",
				rutEmpleador: "required"
			},
			messages: {
				rutAfiliado: "Ingrese Rut del Afiliado",
				fechaCotizacion: "Ingrese una fecha",
				rutEmpleador: "Ingrese Rut del Empleador",
			}
		});

    });
</script>

</body>
</html>
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
	<title>Movimiento Personal</title>
<script src="../scripts/jquery-1.11.0.min.js"></script>
<script src="../scripts/jquery.mask.min.js"></script>
<script src="../scripts/jquery.validate.min.js"></script>
<script src="../scripts/jquery.validate.habitat.js"></script>

<style>

	#formConsultaSolicitud label.error {
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
		<form id="formMovimientoPersonal" method="get" action=""> 
			<div class="row">
				<div class="col-12">
					<div class="p-1 text-white bg-primary">
						<h5 class="card-title-2">Movimiento Personal: Iniciaci&oacute;n servicios contrato a plazo</h5>
					</div>
				
					<div class="row m-1 pt-1">
						<div class="row col-lg-12">

							<div class="col-md-5">
								<label class="form-label">&nbsp;</label>
							</div>
							<div class="col-md-4">
								<label class="form-label">&nbsp;</label>
							</div>
							<div class="col-md-3">
								<label class="form-label">Fecha Solicitud</label>
								<input type="text" name="fechaSolicitud" id="fechaSolicitud" class="form-control" placeholder="dd/mm/aaaa" readonly>
							</div>							
						</div>
					</div>					
					<div class="row m-1">
						<div class="row col-lg-12">
							<div class="col-md-2">
								<label class="form-label">Rut Empleador</label>
								<input name="rutEmpresa" id="rutEmpleador" type="text" class="form-control rut_format"/>
							</div>
							<div class="col-md-6">
								<label class="form-label">Raz&oacute;n Social</label>
								<input name="razonSocial" id="razonSocial" type="text" class="form-control"/>
							</div>
							<div class="col-md-4">
								<label class="form-label">Email</label>
								<input name="emailEmpresa" id="emailEmpresa" type="text" class="form-control"/>
							</div>
						</div>
					</div>							

				<!-- Inicio tabla de resultados -->
				<br>
				<div class="row m-1">
						<div class="row col-lg-12">
							<table class="tabla-dos" width="100%">
								<tr>
									<th><center>Rut Afiliado</center></th>
									<th><center>Nombre</center></th>
									<th><center>Email</center></th>
									<th><center>Fecha Inicio</center></th>
									<th><center>Fecha Fin</center></th>
									<th><center>Contrato de Trabajo</center></th>
									<th><center>Declarac. Mov. Personal</center></th>								
								</tr>
								<tr>
									<td align="center"><input name="xx" id="xx" type="text" class="form-control"/></td>
									<td align="center">Perez y Comp.</td>
									<td align="center"><input name="razonSocial" id="razonSocial" type="text" class="form-control"/></td>
									<td align="center"><input type="text" name="fechaSolicitud" id="fechaSolicitud" class="form-control" placeholder="dd/mm/aaaa"></td>
									<td align="center"><input type="text" name="fechaSolicitud" id="fechaSolicitud" class="form-control" placeholder="dd/mm/aaaa"></td>
									<td>
										<center><button type="button" class="btn">Upload</button></center>
									</td>
									<td>
										<center><button type="button" class="btn">Upload</button></center>
									</td>																
								</tr>							
							</table>					
						</div>
				</div>
				<!-- Fin tabla de resultados -->
									<div class="row m-1">
						<div class="row col-lg-12">
							<div class="col-md-2">
								<label class="form-label">&nbsp;</label>
							</div>
							<div class="col-md-8">
								<div class="row pt-4">
									<div class="col-md-4">
										<button type="submit" class="btn">Agregar Afiliado</button>
									</div>
									<div class="col-md-4">
										<button type="button" class="btn">Ingresar</button>
									</div>
									<div class="col-md-4">
										<button type="button" class="btn">Cancelar</button>
									</div>									
								</div>
							</div>
							<div class="col-md-2">
								<label class="form-label">&nbsp;</label>
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
		$('#fechaInicio').mask('00/00/0000');
		$('#fechaFinal').mask('00/00/0000');
		
		// validate signup form on keyup and submit
		$("#formConsultaSolicitud").validate({
			rules: {
				idSolicitud: "required",
				rutEmpresa: "required",
				fechaInicio: "required",
				fechaFinal: "required",				
				tipoCertificado: {
					required: true,
					combo:true
				}
			},
			messages: {
				idSolicitud: "Ingrese Folio",
				rutEmpresa: "Ingrese Rut de la empresa",
				fechaInicio: "Ingrese Fecha de inicio",
				fechaFinal: "Ingrese Fecha de fin",
				tipoCertificado: "Ingrese el Tipo de Solicitud"
			}
		});

    });
</script>

</body>
</html>
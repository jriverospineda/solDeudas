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
	<title>Buscar Solicitud</title>
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
		<form id="formConsultaSolicitud" method="get" action=""> 
			<div class="row">
				<div class="col-12">
					<div class="p-1 text-white bg-primary">
						<h5 class="card-title-2">Consulta Solicitud</h5>
					</div>
					<div class="row m-1">
						<div class="row mb-3 col-lg-12">
							<div class="col-md-3">
								<label class="form-label">Folio Solicitud</label>
								<input name="idSolicitud" id="idSolicitud" type="text" class="form-control"/>
							</div>
							<div class="col-md-4">
								<label class="form-label">Tipo Solicitud</label>
								<select name="tipoCertificado" id="tipoCertificado" class="form-control">
									<option value="1">Exencion</option>
								</select>
							</div>
							<div class="col-md-4">
								<label class="form-label">&nbsp;</label>
							</div>						
						</div>
					</div>					
	
					<div class="row m-1">
						<div class="row col-lg-12">
							<div class="col-md-4">
								<label class="form-label">&nbsp;</label>
							</div>
							<div class="col-md-4">
								<div class="row pt-4">
									<div class="col-md-4">
										<button type="submit" class="btn">Consultar</button>
									</div>
									<div class="col-md-4">
										<button type="button" class="btn">Limpiar</button>
									</div>
								</div>
							</div>
							<div class="col-md-4">
								<label class="form-label">&nbsp;</label>
							</div>
						</div>
				</div>
				<!-- Inicio tabla de resultados -->
				<br>
				<div class="row m-1">
						<div class="row col-lg-12">
							<table class="tabla-dos" width="100%">
								<tr>
									<th><center>Folio</center></th>
									<th><center>Fecha Solicitud</center></th>
									<th><center>Rut Empleador</center></th>
									<th><center>Raz&oacute;n Social</center></th>
									<th><center>Rut Afiliado</center></th>
									<th><center>Nombre</center></th>
									<th><center>Fecha Inicial</center></th>
									<th><center>Fecha Final</center></th>
									<th><center>Estado</center></th>
									<th><center>&nbsp;</center></th>								
								</tr>
								<tr>
									<td align="center">7765</td>
									<td align="center">05/08/2018</td>
									<td align="center">96.989.675-0</td>
									<td align="center">El nuevo milenio</td>
									<td align="center">9.876.490-0</td>
									<td align="center">Juan P&eacute;rez</td>
									<td align="center">01/01/2018</td>
									<td align="center">01/01/2019</td>									
									<td align="center">Pendiente</td>
									<td>
										<center><button type="button" class="btn">Adjuntar</button></center>
									</td>									
								</tr>							
							</table>					
						</div>
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
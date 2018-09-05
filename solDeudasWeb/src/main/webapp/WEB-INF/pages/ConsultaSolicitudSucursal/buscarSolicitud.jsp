<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="lista"%>
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
		<form id="formBuscarSolicitud" method="post" action="" modelAttribute="consultarSolicitudVO"> 
			<div class="row">
				<div class="col-12">
					<div class="p-1 text-white bg-primary">
						<h5 class="card-title-2">Consulta Solicitud</h5>
					</div>
				
					<div class="row m-1">
						<div class="row col-lg-12">
							<div class="col-md-3">
								<label class="form-label">Rut Afiliado</label>
								<input type="text" name="rutAfiliado" id="rutAfiliado" class="rut_format form-control" value="${rutAfiliado}"/>
							</div>
							<div class="col-md-3">
								<label class="form-label">Fecha Inicio</label>
								<input type="text" name="fechaInicial" id="fechaInicial" class="form-control" placeholder="dd/mm/aaaa"  value="${fechaInicio}"/>
							</div>
							<div class="col-md-3">
								<label class="form-label">Fecha Final</label>
								<input type="text" name="fechaFinal" id="fechaFinal" class="form-control" placeholder="dd/mm/aaaa"  value="${fechaFinal}"/>
							</div>
						</div>
					</div >		
					<div class="row m-1">
						<div class="row mb-3 col-lg-12">
							<div class="col-md-3">
								<label class="form-label">Folio Solicitud</label>
								<input name="folio" id="folio" type="text" class="form-control" value="${folio}"/>
							</div>
							<div class="col-md-4">
								<label class="form-label">&nbsp;</label>
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
										<button type="submit" class="btn" name="boton" id="boton" value="${'submit'}">Consultar</button>
									</div>
									<div class="col-md-4">
										<button type="submit" class="btn" name="boton" id="boton" value="${'reset'}">Limpiar</button>
									</div>
								</div>
							</div>
							<div class="col-md-4">
								<label class="form-label">&nbsp;</label>
							</div>
						</div>
				</div>
				<!-- Inicio tabla de resultados -->
					<lista:if test="${not empty listaSolicitudVO}">
						<div>
							<center>
								<table width="100%" class="tabla-dos">
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
									<lista:forEach items="${listaSolicitudVO}" var="solicitud">
										<tr>
											<td align="center">${solicitud.folio}</td>
											<td align="center">${solicitud.fechaSolicitudString}</td>
											<td align="center">${solicitud.rutEmpleador}</td>	
											<td align="center">${solicitud.razonSocial}</td>
											<td align="center">${solicitud.rutAfiliado}</td>
											<td align="center">${solicitud.nombreCompleto}</td>	
											<td align="center">${solicitud.fechaInicialString}</td>	
											<td align="center">${solicitud.fechaFinalString}</td>
											<td align="center">${solicitud.estado}</td>
											<td align="center"><div><button type="button" class="btn">Adjuntos</button></div></td>																										
										</tr>
									</lista:forEach>
								</table>
							</center>
						</div> 
					</lista:if>
					<lista:if test="${empty listaSolicitudVO}">
					<div class="row m-1">
							<div class="row col-lg-12">
								<div class="col-md-1">
									<label class="form-label">&nbsp;</label>
								</div>
								<div class="col-md-10">
									<center><label class="form-label">No se han encontrado registros para el periodo consultado.</center>
								</div>
								<div class="col-md-1">
									<label class="form-label">&nbsp;</label>
								</div>							
							</div>
					</div> 
					</lista:if>	
				<!-- Fin tabla de resultados -->				
			</div>
		</form>
		</div>
	</div>
<script>
 $(document).ready(function() { 
		$('.rut_format').mask('00.000.000-K',{'translation': { K: {pattern: /[kK0-9]/}}}, {reverse: true});
		$('#fechaInicial').mask('00/00/0000');
		$('#fechaFinal').mask('00/00/0000');
		
		// validate signup form on keyup and submit
		/*$("#formBuscarSolicitud").validate({
			rules: {
				rutAfiliado: "required",
				fechaInicio: "required",
				fechaFinal: "required"
			},
			messages: {
				idSolicitud: "Ingrese Folio",
				rutEmpresa: "Ingrese Rut de la empresa",
				fechaInicio: "Ingrese Fecha de inicio",
				fechaFinal: "Ingrese Fecha de fin",
				tipoCertificado: "Ingrese el Tipo de Solicitud"
			}
		});*/

    });
</script>
</body>
</html>
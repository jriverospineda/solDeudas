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
	<title>Solicitud de Exenci&oacute;n</title>
	<script src="../scripts/jquery-1.11.0.min.js"></script>
	<script src="../scripts/jquery.mask.min.js"></script>
	<script src="../scripts/jquery.validate.min.js"></script>
	<script src="../scripts/jquery.validate.habitat.js"></script>
<style>

	#formExencion label.error {
		margin-left: 10px;
		width: auto;
		display: inline;
		color: red;
	}
</style>	
</head>
<body>
	<div class="my-2 my-md-2">
		<div class="container">
		<form id="formExencion" method="post" action="" modelAttribute="exencionVO"> 
			<div class="row">
				<div class="col-12">
					<div class="p-1 text-white bg-primary">
						<h5 class="card-title-2">Solicitud Excenci&oacute;n Web</h5>
					</div>
					<div class="row m-1">
						<div class="h7 col-lg-12">&nbsp;</div>
					</div>
					<div class="row m-1">
						<div class="row col-lg-12">
							<div class="col-md-2">
								<label class="form-label">Rut Afiliado</label>
								<input name="rutAfiliado" id="rutAfiliado" type="text" class="form-control" readonly value="${rutAfiliado}"/>
							</div>
							<div class="col-md-6">
								<label class="form-label">Nombre</label>
								<input name="nombreCompleto" id="nombreCompleto" type="text" class="form-control" value="${nombreCompleto}" readonly/>
							</div>
							<div class="col-md-4">
								<label class="form-label ">Email</label>
								<input name="emailAfiliado" id="emailAfiliado" type="text" class="form-control" value="${emailAfiliado}"/>
							</div>
						</div>
					</div >
					<div class="row col-lg-12 mt-1 mb-2">
						<div class="col-md-6">
							<div><input id="edadLegal" type="checkbox" name="edadLegal" value="${'SI'}">Cumplimiento Edad Legal</div>
							<div><input id="pensionadoDL3500" type="checkbox" name="pensionadoDL3500" class="" value="${'SI'}">Pensionado D.L. 3.500</div>
							<div><input id="pensionadosistemaAntiguo" type="checkbox" name="pensionadosistemaAntiguo" class="" value="${'SI'}">Pensionado Antiguo Sistema</div>
						</div>
						<div class="col-md-4">
							<label class="form-label">&nbsp;</label>
						</div>
						<div class="col-md-2">
							<label class="form-label">&nbsp;</label>
						</div>
					</div>
					<div class="row m-1">
						<div class="h7 col-lg-12">&nbsp;</div>
					</div>
					
					<div class="row m-1">
						<div class="row col-lg-12">
							<div class="col-md-2">
								<label class="form-label">Rut Empresa</label>
								<input name="rutEmpleador" id="rutEmpleador" type="text" class="rut_format form-control" value="${rutEmpleador}"/>
							</div>
							<div class="col-md-6">
								<label class="form-label">Raz&oacute;n Social</label>
								<input name="razonSocial" id="razonSocial" type="text" class="form-control" readonly value="${razonSocial}"/>
							</div>
							<div class="col-md-4">
								<label class="form-label">Email</label>
								<input name="emailEmpleador" id="emailEmpleador" type="text" class="form-control" value="${emailEmpleador}"/>
							</div>
						</div>
					</div>
					<div class="row m-1 pt-1">
						<div class="row col-lg-12">
							<div class="col-md-3">
								<label class="form-label">Fecha Inicio Exenci&oacute;n</label>
								<input type="text" name="fechaInicio" id="fechaInicio" class="form-control" placeholder="dd/mm/aaaa" value="${fechaInicio}">
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
										<button type="submit" class="btn" name="boton" id="boton" value="${'submit'}">Ingresar</button>
									</div>
									<div class="col-md-4 text-center">
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
					<lista:if test="${not empty exceptionVO}">
						<div class="row m-1">
								<div class="row col-lg-12">
									<div class="col-md-1">
										<label class="form-label">&nbsp;</label>
									</div>
									<div class="col-md-10">
										<center><label class="form-label">Se han encontrado problemas al momento de generar la solicitud de Exenci&oacute;n.</center>
									</div>
									<div class="col-md-1">
										<label class="form-label">&nbsp;</label>
									</div>							
								</div>
						</div> 
					</lista:if>	
					<!-- Fin tabla de resultados -->						
					
					
					
				</div>
			</div>
		</form>
		</div>
	</div>
<script>
 $(document).ready(function() { 
 		$('.rut_format').mask('00.000.000-K',{'translation': { K: {pattern: /[kK0-9]/}}}, {reverse: true});
		$('#fechaInicio').mask('00/00/0000');

		// validate signup form on keyup and submit
		$("#formExencion").validate({
			rules: {
				emailAfiliado: {
					required: true,
					email: true
				},
				rutEmpleador: "required",
				emailEmpleador: {
					required: true,
					email: true
				},
				fechaInicio:"required"
			},
			messages: {
				rutEmpleador: "Ingrese rut v&aacute;lido",
				emailAfiliado: "Ingrese email para el afiliado",
				emailEmpleador: "Ingrese email para el empleador",
				fechaInicio: "Ingrese fecha v&aacute;lida"
			}
		});
		
		function isValidRUT(rut) {
  			if (!rut | typeof rut !== 'string') return false;

  			var regexp = /^\d{7,8}-[k|K|\d]{1}$/;
  			return regexp.test(rut);
		}		
		
		
    });
</script>

</body>
</html>
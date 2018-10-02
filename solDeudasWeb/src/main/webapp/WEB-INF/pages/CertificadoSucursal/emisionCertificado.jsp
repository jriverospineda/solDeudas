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
<title>Emisi&oacute;n Certificado</title>
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
		<form id="formCertificado" method="post" action="" modelAttribute="solicitudCertificadoVO"> 
			<div class="row">
				<div class="col-12">
					<div class="p-1 mb-2 text-white bg-primary">
						<h5 class="card-title-2">Emisi&oacute;n Certificado</h5>
					</div>
					<div class="row m-1">
						<div class="row col-lg-12">
							<div class="col-md-4">
								<label class="form-label">Rut Empresa</label>
								<input name="rutEmpresa" id="rutEmpresa" path="rutEmpresa" type="text" class="rut_format form-control" value="${rutEmpresa}"/>
							</div>
							<div class="col-md-4">
								<label class="form-label">Fecha Inicio</label>
								<input type="text" name="fechaInicio" id="fechaInicio" class="form-control"  value="${fechaInicio}"/>
							</div>
							<div class="col-md-4">
								<label class="form-label">Fecha Final</label>
								<input type="text" name="fechaFinal" id="fechaFinal" class="form-control"  value="${fechaFinal}"/>
							</div>
						</div>
					</div >		
					<div class="row m-1">
						<div class="row col-lg-12">
							<div class="col-md-4">
								<label class="form-label">Tipo Certificado</label>
								<select name="tipoCertificado" id="tipoCertificado" class="form-control" path="tipoCertificado">
									<option>Seleccione un tipo de Certificado</option>
									<lista:if test="${empty tipoCertificado}">									
										<option value="1">Deuda Total del Empleador</option>
										<option value="2">Detalle de Deuda Empleador</option>
										<option value="3">Mora Presunta del Empleador</option>
										<option value="4">Dicom</option>	
									</lista:if>																			
									<lista:if test="${tipoCertificado == '1'}">
										<option value="1" selected>Deuda Total del Empleador</option>
										<option value="2">Detalle de Deuda Empleador</option>
										<option value="3">Mora Presunta del Empleador</option>
										<option value="4">Dicom</option>									
									</lista:if>
									<lista:if test="${tipoCertificado == '2'}">
										<option value="1">Deuda Total del Empleador</option>
										<option value="2" selected>Detalle de Deuda Empleador</option>
										<option value="3">Mora Presunta del Empleador</option>
										<option value="4">Dicom</option>									
									</lista:if>
									<lista:if test="${tipoCertificado == '3'}">
										<option value="1">Deuda Total del Empleador</option>
										<option value="2">Detalle de Deuda Empleador</option>
										<option value="3" selected>Mora Presunta del Empleador</option>
										<option value="4">Dicom</option>									
									</lista:if>
									<lista:if test="${tipoCertificado == '4'}">
										<option value="1">Deuda Total del Empleador</option>
										<option value="2">Detalle de Deuda Empleador</option>
										<option value="3">Mora Presunta del Empleador</option>
										<option value="4" selected>Dicom</option>									
									</lista:if>																			
								</select>
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
										<button type="submit" class="btn">Generar</button>
									</div>
									<div class="col-md-4">
										<button type="reset" class="btn">Limpiar</button>
									</div>
								</div>
							</div>
							<div class="col-md-4">
								<label class="form-label">&nbsp;</label>
							</div>
						</div>
				</div>
				<!-- Inicio tabla de resultados -->
				<lista:if test="${tipoCertificado == '1'}">
					<lista:if test="${not empty listaCertificadoVO}">
						<div>
							<center>
								<table width="100%" class="tabla-dos">
									<tr>
										<th><center>No.</center></th>
										<th><center>Periodo Cotizado</center></th>
										<th><center>Monto</center></th>
										<th><center>Origen</center></th>
									</tr>
									<lista:forEach items="${listaCertificadoVO}" var="certificado" varStatus="status">
										<tr>
											<td align="center">${status.count}</td>
											<td align="center">${certificado.periodoCotizacion}</td>
											<td align="center">${certificado.montoOriginalDeuda}</td>
											<td align="center">${certificado.origen}</td>			
										</tr>
									</lista:forEach>
								</table>
							</center>
						</div> 
					</lista:if>
					<lista:if test="${empty listaCertificadoVO}">
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
				</lista:if>
				<!-- Fin tabla de resultados -->
				<!-- Inicio tabla de resultados -->
				<lista:if test="${tipoCertificado == '2'}">
					<lista:if test="${not empty listaCertificadoVO}">
						<div>
							<center>
								<table width="100%" class="tabla-dos">
									<tr>
										<th><center>No.Deuda</center></th>
										<th><center>Periodo</center></th>
										<th><center>Origen</center></th>
										<th><center>RUT Afiliado</center></th>
										<th><center>Nombre Afiliado</center></th>													
										<th><center>Renta Imponible</center></th>
										<th><center>Cotizacion Obligatoria</center></th>		
										<th><center>Cotizacion Voluntaria</center></th>
										<th><center>Deposito Convenido</center></th>
										<th><center>Ahorro Voluntario</center></th>
										<th><center>APVC</center></th>
										<th><center>Aporte Indemnización</center></th>
										<th><center>Afiliado Voluntario</center></th>	
										<th><center>Trabajo Pesado</center></th>
										<th><center>SIS</center></th>	
										<th><center>Total</center></th>																																																																	
									</tr>
									<lista:forEach items="${listaCertificadoVO}" var="certificado" varStatus="status">
										<tr>
											<td align="center">${certificado.idDeuda}</td>
											<td align="center">${certificado.periodoCotizacion}</td>
											<td align="center">${certificado.origenDeuda}</td>		
											<td align="center">${certificado.rutString}</td>
											<td align="center">${certificado.nombreCompleto}</td>
											<td align="center">${certificado.montoRentaImponible}</td>
											<td align="center">${certificado.idProductoCCICO}</td>	
											<td align="center">${certificado.idProductoCCICV}</td>
											<td align="center">${certificado.idProductoCCIDC}</td>
											<td align="center">${certificado.idProductoCAV}</td>
											<td align="center">${certificado.idProductoAPVC}</td>	
											<td align="center">${certificado.idProductoCAI}</td>
											<td align="center">${certificado.idProductoCCIAV}</td>	
											<td align="center">${certificado.cotizacionTrabajoPesado}</td>
											<td align="center">${certificado.seguro}</td>					
											<td align="center">${certificado.total}</td>																																												
										</tr>
									</lista:forEach>
								</table>
							</center>
						</div> 
					</lista:if>
					<lista:if test="${empty listaCertificadoVO}">
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
				</lista:if>
				<!-- Fin tabla de resultados -->
				<!-- Inicio tabla de resultados -->
				<lista:if test="${tipoCertificado == '3'}">
					<lista:if test="${not empty listaCertificadoVO}">
						<div>
							<center>
								<table width="100%" class="tabla-dos">
									<tr>
										<th><center>No.</center></th>
										<th><center>Periodo</center></th>
										<th><center>Origen</center></th>
										<th><center>RUT Afiliado</center></th>
										<th><center>Nombre Afiliado</center></th>													
										<th><center>Renta Imponible</center></th>
										<th><center>Producto</center></th>	
										<th><center>MontoMora</center></th>																																																																	
									</tr>
									<lista:forEach items="${listaCertificadoVO}" var="certificado" varStatus="status">
										<tr>
											<td align="center">${status.count}</td>
											<td align="center">${certificado.periodoCotizacion}</td>
											<td align="center">${certificado.origenDeuda}</td>		
											<td align="center">${certificado.rutString}</td>
											<td align="center">${certificado.nombreCompleto}</td>
											<td align="center">${certificado.montoRentaImponible}</td>
											<td align="center">${certificado.producto}</td>					
											<td align="center">${certificado.montoMora}</td>																																												
										</tr>
									</lista:forEach>
								</table>
							</center>									
						</div> 
					</lista:if>
					<lista:if test="${empty listaCertificadoVO}">
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
				</lista:if>
				<!-- Fin tabla de resultados -->	
				<!-- Inicio tabla de resultados -->
				<lista:if test="${tipoCertificado == '4'}">
					<lista:if test="${not empty listaCertificadoVO}">
						<div>
							<center>
								<table width="100%" class="tabla-dos">
									<tr>
										<th><center>No.</center></th>
										<th><center>Periodo Cotizado</center></th>
										<th><center>Monto</center></th>
										<th><center>Origen</center></th>
									</tr>
									<lista:forEach items="${listaCertificadoVO}" var="certificado" varStatus="status">
										<tr>
											<td align="center">${status.count}</td>
											<td align="center">${certificado.periodoCotizacion}</td>
											<td align="center">${certificado.montoOriginalDeuda}</td>
											<td align="center">${certificado.origen}</td>			
										</tr>
									</lista:forEach>
								</table>
							</center>
						</div> 
					</lista:if>
					<lista:if test="${empty listaCertificadoVO}">
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
				</lista:if>
				<!-- Fin tabla de resultados -->													
			</div>
		</form>
		</div>
	</div>
<script>
 $(document).ready(function() { 

		$( function() {
			$( "#fechaInicio" ).datepicker();
			$( "#fechaFinal" ).datepicker();
		} );
		// validate signup form on keyup and submit
		$("#formCertificado").validate({
			rules: {
				rutEmpresa: {
					required: true,
					validaRut: true
				},
				fechaInicio: "required",
				fechaFinal: "required",				
				tipoCertificado: {
					required: true,
					combo:true
				}
			}
		});

    });
</script>

</body>
</html>
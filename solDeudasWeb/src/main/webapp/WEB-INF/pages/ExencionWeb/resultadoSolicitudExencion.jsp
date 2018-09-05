<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<script src="../scripts/jquery-ui.min.js"></script>
</head>
<body >
	<div class="my-2 my-md-2">
		<div class="container">
		<form id="formExencion" method="post" action="" modelAttribute="exencionVO"> 
			<div class="row">
				<div class="col-12">
					<div class="p-1 text-white bg-primary">
						<h5 class="card-title-2">Resultado Solicitud Excenci&oacute;n Web</h5>
					</div>
					<div class="row m-1">
						<div class="h7 col-lg-12">&nbsp;</div>
					</div>				
					<!-- Inicio tabla de resultados -->					
					<lista:if test="${empty codigoExcepcion}">
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
					<!-- Inicio tabla de resultados -->					
					<lista:if test="${not empty codigoExcepcion}">
						<div class="row m-1">
								<div class="row col-lg-12">
									<div class="col-md-1">
										<label class="form-label">&nbsp;</label>
									</div>
									<div class="col-md-10">
										<center><label class="form-label">Se ha generado correctamente el PDF de la solicitud para ser descargado.</label></center>
										<center><label class="form-label">Se ha enviado un email con el resultado de esta solicitud.</label></center>
									</div>
									<div class="col-md-1">
										<label class="form-label">&nbsp;</label>
									</div>							
								</div>
						</div> 
					</lista:if>	
					<!-- Fin tabla de resultados -->
					<div class="row m-1">
						<div class="h7 col-lg-12">&nbsp;</div>
					</div>	
					<div class="row m-1">
						<div class="row col-lg-12">
							<div class="col-md-1">
								<label class="form-label">&nbsp;</label>
							</div>
							<div class="col-md-10">
								<center>
									<button type="submit" class="btn">Nueva Solicitud</button>
								</center>
							</div>
							<div class="col-md-1">
								<label class="form-label">&nbsp;</label>
							</div>							
						</div>
					</div> 							
				</div>
			</div>
		</form>
		</div>
	</div>
</body>
</html>
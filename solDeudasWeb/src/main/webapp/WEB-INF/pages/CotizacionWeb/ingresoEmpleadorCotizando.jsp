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
	<script src="../scripts/jquery-ui.min.js"></script>
</head>
<body >
	<div class="my-2 my-md-2">
		<div class="container">
		<form id="formExencion" method="get" action=""> 
			<div class="row">
				<div class="col-12">
					<div class="p-1 text-white bg-primary">
						<h5 class="card-title-2">Ingreso de nuevo Empleador</h5>
					</div>
					<div class="row m-1 pt-1">
						<div class="row col-lg-12">
							<div class="col-md-2">
								<label class="form-label">Fecha Solicitud</label>
								<input type="text" name="fechaSolicitud" id="fechaSolicitud" class="form-control" readonly>
							</div>
							<div class="col-md-6">
								<label class="form-label">&nbsp;</label>
							</div>
							<div class="col-md-4">
								<label class="form-label">&nbsp;</label>
							</div>
							
						</div>
					</div>					
					<div class="row m-1">
						<div class="row col-lg-12">
							<div class="col-md-2">
								<label class="form-label">Rut Empleador</label>
								<input name="rutEmpleador" id="rutEmpleador" type="text" class="form-control rut_format"/>
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
							<div class="col-md-6">
								<label class="form-label">Direcci&oacute;n</label>
								<input name="direccionEmpleador" id="direccionEmpleador" type="text" class="text_format form-control"/>
							</div>		
							<div class="col-md-3">
								<label class="form-label">Tel&eacute;fono</label>
								<input name="telefonoEmpleador" id="telefonoEmpleador" type="text" class="telefono_format  form-control"/>
							</div>											
							<div class="col-md-3">
								<label class="form-label">Celular</label>
								<input name="celularEmpleador" id="celularEmpleador" type="text" class="telefono_format form-control"/>
							</div>	
						</div>
					</div >
					<div class="row m-1">
						<div class="row col-lg-12">
						<div class="col-md-2">
							<label class="form-label">Rut Representante</label>
							<input name="rutRepresentante" id="rutRepresentante" type="text" class="rut_format form-control"/>
						</div>
						<div class="col-md-6">
							<label class="form-label">Nombre Representante</label>
							<input name="nombreRepresentante" id="nombreRepresentante" type="text" class="text_format form-control"/>
						</div>
						<div class="col-md-4">
								<label class="form-label">Email</label>
								<input name="emailRepresentante" id="emailRepresentante" type="text" class="email_format form-control"/>
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
			</div>
		</form>
		</div>
	</div>
<script>
 $(document).ready(function() { 
		
		// validate signup form on keyup and submit
		$("#formExencion").validate({
			rules: { 
				rutEmpleador: {
					required: true,
					validaRut: true
				},
				emailAfiliado: {
					required: true,
					validaEmail: true
				},
				rutRepresentante: {
					required: true,
					validaRut: true
				},
				emailEmpresa: {
					required: true,
					validaRut: true
				},
				razonSocial: "required",
				nombreRepresentante: "required",
				emailRepresentante: {
					required: true,
					validaEmail: true
				},
				telefonoEmpleador:"required",
				celularEmpleador:"required"
			},
			messages: {
				

			}
		});

    });
</script>

</body>
</html>
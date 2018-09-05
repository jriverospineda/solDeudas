
<%@ page language="java" contentType="text/html; charset=iso-8859-1" pageEncoding="iso-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="baseTemplateUrl" value="${session_conf_template_path}" scope="application"/>
<html>
	<head>
		<link rel="stylesheet" href="${baseTemplateUrl}/styles/habitat_public.css" type="text/css"	media="screen" />
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title> </title>
	</head>
	<body>
		<div id="top">
			<div class="contenido">
				<div class="menu_top"></div>
				<h1>
					<span>AFP Habitat - Seguridad y Confianza</span>
				</h1>
			</div>
		</div>
		<div id="content">
			<div class="contenido">
				<div class="login">
					<div class="col">
						<div class="caja">
							<form action="j_security_check" method="POST">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tbody>
										<tr>
											<td class="nom">Usuario&nbsp;</td>
											<td class="inp">
												<label for="j_username"></label>
												<input type="text" name="j_username" id="j_username">
											</td>
										</tr>
	
										<tr>
											<td class="nom">Clave&nbsp;</td>
											<td class="inp">
												<input type="password" name="j_password" id="j_password">
											</td>
										</tr>
										<tr>
											<td colspan="2">&nbsp;</td>
										</tr>
										<tr>
											<c:if test="${mensaje ne null}">
												<td colspan="2">
													<div class="msj_alerta" id="mensajeLogin">${mensaje}</div>
												</td>
											</c:if>
										</tr>
										<tr>
											<td colspan="2">
												<input type="submit" name="button" id="button" value="Ingresar" class="ingresar">
											</td>
										</tr>
									</tbody>
								</table>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="waiting" style="display: none">
			<b><font color="white">momento por favor</font></b>
		</div>
	</body>
</html>
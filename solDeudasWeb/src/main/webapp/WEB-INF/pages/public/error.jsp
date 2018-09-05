<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<%@ page language="java" contentType="text/html; charset=iso-8859-1" pageEncoding="iso-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.afphabitat.cl/tags/habitatWebTools" prefix="habitatWebTools"%>

<tiles:insertDefinition name="root">
	<tiles:putAttribute name="body">

				<div align="center">
					<div class="error_zone"> 
						<div> 
							<b><fmt:message key="label.error.message" /></b><br/>
			
							<c:choose>	
								<c:when test="${param.error == 'login'}">	
									<fmt:message key="errors.security.login" /><br/>
									<a href="${portalUrl}" target="_top" style="color: white;"><fmt:message key="errors.security.login.portal" /></a>
								</c:when>
								<c:when test="${param.error == 'security'}">	
									<fmt:message key="errors.security" />
								</c:when>
								<c:when test="${param.error == 'resource'}">	
									<fmt:message key="errors.resource" />
								</c:when>
								<c:otherwise>
									<!--  busca la causa original (hasta en m�ximo 4 niveles) -->
									<c:set var="finalMessage"><c:out value="${exception.message}"/></c:set>
									<c:if test="${exception.cause != null}">
										<c:set var="finalMessage"><c:out value="${exception.cause.message}"/></c:set>
										<c:if test="${exception.cause.cause != null}">
											<c:set var="finalMessage"><c:out value="${exception.cause.cause.message}"/></c:set>
											<c:if test="${exception.cause.cause.cause != null}">
												<c:set var="finalMessage"><c:out value="${exception.cause.cause.cause.message}"/></c:set>
											</c:if>
										</c:if>
									</c:if>
									<c:out value="${finalMessage}"/>
									
								</c:otherwise>
							</c:choose>
			
							<div align="right"><a onclick="javascript:$('#errorDetails').show();"><small><fmt:message key="label.error.details" /></small></a></div>
									
						</div> 
					</div> 				
			
					<div id="errorDetails" style="display: none">
					
						<br/>
						
						<!-- Detalle del error. -->
						<div class="cuadro_zone">
							<font size="1"><habitatWebTools:errorTrace/></font>					
						</div>
						
					</div>
				</div>
		
		<br/>
				
	</tiles:putAttribute>
</tiles:insertDefinition>


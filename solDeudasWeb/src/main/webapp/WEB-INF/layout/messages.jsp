<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<%@ page language="java" contentType="text/html; charset=iso-8859-1" pageEncoding="iso-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${empty exception}" >

	
	<!-- mensajes generales -->	
	<c:if test="${not empty message}" >
		
			<div class="<c:out value="${message.type}"/>_zone"> 
				<div> 
					<b>
						<fmt:message key="${message.code}">
							<c:forEach items="${message.parametros}" var="parametro">
								<fmt:param><c:out value="${parametro}"/></fmt:param>
							</c:forEach>
						</fmt:message>
					</b>
					<c:if test="${not empty message.info}" >
						<br/><c:out value="${message.info}" />
					</c:if>
				</div> 
			</div> 				
			<br/>
	</c:if>


</c:if>
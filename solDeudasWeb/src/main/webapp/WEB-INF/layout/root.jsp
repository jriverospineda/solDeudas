<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<c:set var="baseUrl" value="${pageContext['request'].contextPath}" scope="application"/>
<c:set var="portalUrl" value="${session_conf_portal_path}" scope="application"/>
<c:set var="baseTemplateUrl" value="${session_conf_template_path}" scope="application"/>
<c:set var="isOldFashionBrowser" value="${fn:contains(header['User-Agent'],'MSIE')}" scope="application"/>

<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
	    <title><fmt:message key="label.titulo"/></title>
		<link rel="stylesheet" href="${baseTemplateUrl}/styles/css.css" type="text/css" media="screen" />
		<link rel="stylesheet" href="${baseTemplateUrl}/styles/commons.css" type="text/css" media="screen" />
		<link rel="stylesheet" href="${baseTemplateUrl}/styles/forms.css" type="text/css" media="screen" />
		<link rel="stylesheet" href="${baseTemplateUrl}/styles/messages.css" type="text/css"/>	
		<link rel="stylesheet" href="${baseTemplateUrl}/styles/jquery-ui.css" type="text/css"/>	
<%-- 		<link rel="stylesheet" href="${portalUrl}/habitat_public.css" type="text/css"	media="screen" /> --%>
<%-- 		<link href="${portalUrl}/habitat.css" rel="stylesheet" /> --%>
<%-- 		<link href="${portalUrl}/dashboard.css" rel="stylesheet" /> --%>
<%-- 		<link href="${portalUrl}/calendario.css" rel="stylesheet" /> --%>

		<!--  contexto para scope de JavaScript -->
		<script type="text/javascript">
		  var baseUrl = '${baseUrl}';
		  var portalUrl = '${portalUrl}';
		  var baseTemplateUrl = '${baseTemplateUrl}';
		</script>    
	
	  	<!-- jQuery -->
	  	<c:if test="${isOldFashionBrowser}">
			<script type="text/javascript" src="${portalUrl}/scripts/jquery-1.2.6.min.js"></script>
		</c:if>
	  	<c:if test="${not isOldFashionBrowser}">
			<script type="text/javascript" src="${portalUrl}/scripts/jquery-1.6.4.min.js"></script>
			<script type="text/javascript" src="${portalUrl}/scripts/jquery-ui-1.8.min.js"></script>
			<script type="text/javascript" src="${portalUrl}/scripts/jquery.ui.datepicker-<c:out value='${session_lang}'/>.js"></script>
	  	</c:if>
		<script type="text/javascript" src="${portalUrl}/scripts/jquery-1.2.6.tools.min.js"></script>
		<script type="text/javascript" src="${portalUrl}/scripts/jquery.blockUI.js"></script>
	
	    <!-- Otros utilitarios -->
		<script src="${portalUrl}/scripts/autoNumeric-1.7.4-B.js" type="text/javascript"></script>		
		<script src="${portalUrl}/scripts/utilbox.js" type="text/javascript"></script>	
		<script src="${portalUrl}/scripts/menu.js" type="text/javascript"></script>
		
		<script type="text/javascript">
			$(document).ready(function() {
				<c:if test="${not isOldFashionBrowser}">
					/** saca puntos y comas en campos de ingreso numericos (input.integerXX) */
					activeNumbers(); 
					
					/** saca puntos y reemplaza comas antes del submit */ 
					$('input[type=submit]').click(function() {
				    	cleanNumbers(); 
				    });
	
					/** calendario */
			    	$('.date').each(function(){
			      		$(this).datepicker({
			                showOn: 'both',
			                buttonImageOnly: true,
			                inline:true,
			                firstDay : 1,
			                buttonImage: '<c:out value='${baseTemplateUrl}'/>/images/calendar.png'
			            }, $.datepicker.regional['<c:out value='${session_lang}'/>'])
			      	});
				</c:if>
			});
			
			/** 
				detecta si esta en modo full o single
				dependen de eso, desactiva el waiting del iFrame del portal
			*/
			
			function bodyWaiting() {

				waiting();

				<c:if test="${ param.single != 'on' }">
					var o = document.getElementById('appIframe');
					if (o) o.contentWindow.dontWaiting();
				</c:if>
				
			}
			
			
		</script>
	</head>

	<body onbeforeunload="javascript:bodyWaiting();">
	
		<div id="main" class="cf" style="padding-top: 10px;">
		  <div class="cf">
		    <div class="cont" style="float:left;">
		      <tiles:insertAttribute name="messages"/>
			  <tiles:insertAttribute name="body"/>
		    </div>
		  </div>
		</div>

		<!--  mensaje de espera -->
        <div class="waiting" style="display:none">
            <b><font color='white'><fmt:message key="message.waiting"/></font></b>
        </div>
        
		<!--  versionamiento -->
        <div style="display:none">
            <b><fmt:message key="label.copyright"/> <fmt:message key="label.version"/></b>
        </div>
        

	</body>
</html>
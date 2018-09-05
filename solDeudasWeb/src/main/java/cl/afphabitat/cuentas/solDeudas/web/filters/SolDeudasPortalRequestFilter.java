package cl.afphabitat.cuentas.solDeudas.web.filters;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import cl.afphabitat.commonUtils.identidad.IdentityUtils;
import cl.afphabitat.portalPrivado.bpro.bo.FichaClienteBO;
import cl.afphabitat.cuentas.solDeudas.ejb.SolDeudasLocal;
import cl.afphabitat.webUtils.filters.SimpleRequestFilter;

/**
 * Request Processor de Modelo de Negocios<p>
 *
 * Registro de Versiones:<ul>
 * <li>Fecha [Analista - Proveedor.]: Versión Inicial</li>
 * </ul><p>
 * 
 * <b>Todos los derechos reservados por AFP Habitat.</b><p>
 *
 */
public class SolDeudasPortalRequestFilter extends SimpleRequestFilter {

	/** Logger */
	private static Logger logger = Logger.getLogger(SolDeudasPortalRequestFilter.class);

	/** delegate del negocio */
	@Autowired private SolDeudasLocal solDeudasDelegate;

	/** ID de ficha */
	public static final String FICHA_ID = "session_ficha_cliente";

	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {
		String principal = request.getUserPrincipal() == null ? "Anonimo" : request.getUserPrincipal().getName();
        org.apache.log4j.MDC.put("Principal", principal);

		boolean success = true;
		
		// setea ambiente y continua la marcha
		super.setEnvironment(request, response);
		
		// caso página de error (no se hace nada)
		boolean isErrorPage = request.getServletPath().indexOf("error.htm") > 0;
		
		if ( !isErrorPage ) {
			// Se encarga de generar el Menu y Ficha Usuaria de Portal
			String username = request.getUserPrincipal() == null ? null 
					: request.getUserPrincipal().getName();
			HttpSession session = request.getSession();
			FichaClienteBO fichaCliente = (FichaClienteBO)session.getAttribute(FICHA_ID);
			
			if (  username!= null && (fichaCliente == null || !fichaCliente.isOwner( username ) )) {
				try {
					logger.debug("Es necesario regenerar la Ficha" 
							+ " de Cliente y su ambientación");
					
					long rut = IdentityUtils.getCuerpoRutAsLong(username);
					String digito = IdentityUtils.getDigitoRut(username);
					fichaCliente = solDeudasDelegate.getFichaCliente(rut,digito);
					session.setAttribute(FICHA_ID, fichaCliente);
				} catch (Exception ex) {
					// Se despacha a error General
					logger.error("No fue posible ambientar sesión!!!", ex);
					success = false;
					request.getSession(true).setAttribute("exception", ex);
					response.sendRedirect(request.getContextPath() + "/public/error.htm");
				}
			}
		}
		
		logger.debug("Continúa cadena? : " + success);
		if (success){
			chain.doFilter(request, response);
			}
	}

	public void setConfiguracion(HashMap<String, String> configuracion) {
		logger.info("uso confguracion");
		super.setConfiguracion(configuracion);
	}

	

}

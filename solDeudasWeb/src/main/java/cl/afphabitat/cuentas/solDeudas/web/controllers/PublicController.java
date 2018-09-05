package cl.afphabitat.cuentas.solDeudas.web.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import cl.afphabitat.webUtils.UserSessionUtils;
import cl.afphabitat.webUtils.filters.SimpleRequestFilter;



/**
 * Controller de recursos publicos (todos deben tener acceso a ellos)<p>
 *
 * Registro de Versiones:<ul>
 * <li>Fecha [Analista Proveedor.]: Descripcion</li>
 * </ul><p>
 * 
 * <b>Todos los derechos reservados por AFP Habitat.</b><p>
 *
 */
@Controller
public class PublicController extends MultiActionController  {

	/** Logger */
	private static Logger logger = Logger.getLogger(PublicController.class);

	/**
	 * Atiende la pqgina de error (directa)<p>
	 *
	 * Registro de Versiones:<ul>
	 * <li>Fecha [Analista - Proveedor.]: Versión Inicial</li>
	 * </ul><p>
	 * 
	 * @param request del Http
	 * @return MV
	 * 
	 */
	@RequestMapping("/public/error.htm")
	public ModelAndView errorHandler(HttpServletRequest request) throws Exception {
		ModelAndView modelView = new ModelAndView();

		// Control por si es caso limite y no se ha configurado lo base
		HttpSession session = request.getSession();
		if ( session.getAttribute("session_conf") == null ){
			SimpleRequestFilter.setSpringContextEnv(request);
		}
		logger.debug("URL que origina el error: " 
				+ request.getAttribute("javax.servlet.error.request_uri"));

		return modelView;
	}	

	/**
	 * Pagina de ingreso.
	 * @param request del Http
	 */
	@RequestMapping("/login.htm")
	public ModelAndView loginHandler(HttpServletRequest request) {
		ModelAndView modelView = new ModelAndView();
		logger.debug("Entrando al LOGIN");
		HttpSession session = request.getSession();

		boolean isError = (request.getParameter("error") != null);
		if (isError) {
			logger.debug("Clave invalida!!");
			session.setAttribute("mensaje", "Usuario/Password inv&aacute;lido");					
		}
		modelView.setViewName("/login");
		return modelView;
	}

	/**
	 * Cierre de sesion y redirecciona al login
	 */
	@RequestMapping(value = "/logout.htm", method = RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request) {
		try {
			UserSessionUtils.logout(request);
		} catch (Exception e) {
			logger.error("Error al cerrar sesion --> " + e.getMessage());
		}
		return loginHandler(request);
	}
	
	/**
	 * Pagina de Prueba.
	 * @param request del Http
	 */
	@RequestMapping("/test.htm")
	public ModelAndView testHandler(HttpServletRequest request) {
		ModelAndView modelView = new ModelAndView();
		logger.debug("Entrando a la pagina de TEST");
/*		HttpSession session = request.getSession();

		boolean isError = (request.getParameter("error") != null);
		if (isError) {
			logger.debug("Clave invalida!!");
			session.setAttribute("mensaje", "Usuario/Password inv&aacute;lido");					
		}*/
		modelView.setViewName("/test");
		return modelView;
	}

	/**
	 * Seleccion Informacion Soliciud Exencion PAC.
	 * @param request del Http
	 */
	@RequestMapping("/solicitudExencion/seleccionSolicitudExencionPAC.htm")
	public ModelAndView seleccionSolicitudExencionHandler(HttpServletRequest request) {
		ModelAndView modelView = new ModelAndView();
		logger.debug("Entrando a la pagina de Seleccion Solicitud Exencion PAC.");
/*		HttpSession session = request.getSession();

		boolean isError = (request.getParameter("error") != null);
		if (isError) {
			logger.debug("Clave invalida!!");
			session.setAttribute("mensaje", "Usuario/Password inv&aacute;lido");					
		}
		modelView.setViewName("/seleccionSolicitudExencion");
*/
		return modelView;
	}
	


	
	
}

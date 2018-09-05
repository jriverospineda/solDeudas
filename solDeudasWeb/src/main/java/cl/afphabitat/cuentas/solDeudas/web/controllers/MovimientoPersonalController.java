package cl.afphabitat.cuentas.solDeudas.web.controllers;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 * Controller para acceso a test<p>
 *
 * Registro de Versiones:<ul>
 * <li>Fecha [Analista Proveedor.]: Descripcion</li>
 * </ul><p>
 * 
 * <b>Todos los derechos reservados por AFP Habitat.</b><p>
 *
 */
@Controller
public class MovimientoPersonalController extends MultiActionController {
	
	
	/** Logger */
	private static Logger logger = Logger.getLogger(MovimientoPersonalController.class);

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


	/**
	 * IngresoSoliciud Exencion PAC.
	 * @param request del Http
	 */
	@RequestMapping("/MovimientoPersonal/iniciacionServicios.htm")
	public ModelAndView iniciacionServiciosHandler(HttpServletRequest request) {
		ModelAndView modelView = new ModelAndView();
		logger.debug("Entrando a la pagina de Ingreso Movimiento Personal.");
/*		HttpSession session = request.getSession();

		boolean isError = (request.getParameter("error") != null);
		if (isError) {
			logger.debug("Clave invalida!!");
			session.setAttribute("mensaje", "Usuario/Password inv&aacute;lido");					
		}
		modelView.setViewName("/ingresoSolicitudExencion");
*/
		System.out.println("iniciacionServicios.htm");
		return modelView;
	}	
	
	@RequestMapping("/MovimientoPersonal/cesacionServicios.htm")
	public ModelAndView cesacionServiciosHandler(HttpServletRequest request) {
		ModelAndView modelView = new ModelAndView();
		logger.debug("Entrando a la pagina de Ingreso Movimiento Personal.");
/*		HttpSession session = request.getSession();

		boolean isError = (request.getParameter("error") != null);
		if (isError) {
			logger.debug("Clave invalida!!");
			session.setAttribute("mensaje", "Usuario/Password inv&aacute;lido");					
		}
		modelView.setViewName("/ingresoSolicitudExencion");
*/
		System.out.println("cesacionServicios.htm");
		return modelView;
	}		
	
	@RequestMapping("/MovimientoPersonal/incapacidadLaboral.htm")
	public ModelAndView incapacidadLaboralHandler(HttpServletRequest request) {
		ModelAndView modelView = new ModelAndView();
		logger.debug("Entrando a la pagina de Ingreso Movimiento Personal.");
/*		HttpSession session = request.getSession();

		boolean isError = (request.getParameter("error") != null);
		if (isError) {
			logger.debug("Clave invalida!!");
			session.setAttribute("mensaje", "Usuario/Password inv&aacute;lido");					
		}
		modelView.setViewName("/ingresoSolicitudExencion");
*/
		System.out.println("incapacidadLaboral.htm");
		return modelView;
	}	
	
	@RequestMapping("/MovimientoPersonal/sinGoceSueldo.htm")
	public ModelAndView sinGoceSueldoHandler(HttpServletRequest request) {
		ModelAndView modelView = new ModelAndView();
		logger.debug("Entrando a la pagina de Ingreso Movimiento Personal.");
/*		HttpSession session = request.getSession();

		boolean isError = (request.getParameter("error") != null);
		if (isError) {
			logger.debug("Clave invalida!!");
			session.setAttribute("mensaje", "Usuario/Password inv&aacute;lido");					
		}
		modelView.setViewName("/ingresoSolicitudExencion");
*/
		System.out.println("sinGoceSueldo.htm");
		return modelView;
	}		
	
	@RequestMapping("/MovimientoPersonal/incorporadoLugarTrabajo.htm")
	public ModelAndView incorporadoLugarTrabajoHandler(HttpServletRequest request) {
		ModelAndView modelView = new ModelAndView();
		logger.debug("Entrando a la pagina de Ingreso Movimiento Personal.");
/*		HttpSession session = request.getSession();

		boolean isError = (request.getParameter("error") != null);
		if (isError) {
			logger.debug("Clave invalida!!");
			session.setAttribute("mensaje", "Usuario/Password inv&aacute;lido");					
		}
		modelView.setViewName("/ingresoSolicitudExencion");
*/
		System.out.println("incorporadoLugarTrabajo.htm");
		return modelView;
	}		
	
	@RequestMapping("/MovimientoPersonal/contratoAPlazo.htm")
	public ModelAndView contratoAPlazoHandler(HttpServletRequest request) {
		ModelAndView modelView = new ModelAndView();
		logger.debug("Entrando a la pagina de Ingreso Movimiento Personal.");
/*		HttpSession session = request.getSession();

		boolean isError = (request.getParameter("error") != null);
		if (isError) {
			logger.debug("Clave invalida!!");
			session.setAttribute("mensaje", "Usuario/Password inv&aacute;lido");					
		}
		modelView.setViewName("/ingresoSolicitudExencion");
*/
		System.out.println("contratoAPlazo.htm");
		return modelView;
	}		
	
	@RequestMapping("/MovimientoPersonal/plazoFijoAIndefinido.htm")
	public ModelAndView plazoFijoAIndefinidoHandler(HttpServletRequest request) {
		ModelAndView modelView = new ModelAndView();
		logger.debug("Entrando a la pagina de Ingreso Movimiento Personal.");
/*		HttpSession session = request.getSession();

		boolean isError = (request.getParameter("error") != null);
		if (isError) {
			logger.debug("Clave invalida!!");
			session.setAttribute("mensaje", "Usuario/Password inv&aacute;lido");					
		}
		modelView.setViewName("/ingresoSolicitudExencion");
*/
		System.out.println("plazoFijoAIndefinido.htm");
		return modelView;
	}		
	
	@RequestMapping("/MovimientoPersonal/cesacionServiciosMedianteCarta.htm")
	public ModelAndView cesacionServiciosMedianteCartaHandler(HttpServletRequest request) {
		ModelAndView modelView = new ModelAndView();
		logger.debug("Entrando a la pagina de Ingreso Movimiento Personal.");
/*		HttpSession session = request.getSession();

		boolean isError = (request.getParameter("error") != null);
		if (isError) {
			logger.debug("Clave invalida!!");
			session.setAttribute("mensaje", "Usuario/Password inv&aacute;lido");					
		}
		modelView.setViewName("/ingresoSolicitudExencion");
*/
		System.out.println("cesacionServiciosMedianteCarta.htm");
		return modelView;
	}		
	
	@RequestMapping("/MovimientoPersonal/reliquidacion.htm")
	public ModelAndView reliquidacionHandler(HttpServletRequest request) {
		ModelAndView modelView = new ModelAndView();
		logger.debug("Entrando a la pagina de Ingreso Movimiento Personal.");
/*		HttpSession session = request.getSession();

		boolean isError = (request.getParameter("error") != null);
		if (isError) {
			logger.debug("Clave invalida!!");
			session.setAttribute("mensaje", "Usuario/Password inv&aacute;lido");					
		}
		modelView.setViewName("/ingresoSolicitudExencion");
*/
		System.out.println("reliquidacion.htm");
		return modelView;
	}	


}

package cl.afphabitat.cuentas.solDeudas.web.controllers;

import java.math.BigDecimal;
import java.rmi.RemoteException;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cl.afphabitat.cuentas.solDeudas.web.util.PropertiesFile;
import cl.afphabitat.cuentas.solDeudas.web.vo.ConsultarSolicitudVO;
import cl.afphabitat.cuentas.solDeudas.web.vo.ExcepcionVO;
import cl.afphabitat.cuentas.solDeudas.web.vo.ExencionVO;
import cl.afphabitat.soap.afiliado.*;
import cl.afphabitat.soap.empleador.GetEmpleadorProxy;
import cl.afphabitat.soap.empleador.GetEmpleadorRequest;
import cl.afphabitat.soap.empleador.GetEmpleadorResponse;
import cl.afphabitat.soap.exencion.SetSolicitudExencionProxy;
import cl.afphabitat.soap.exencion.SetSolicitudExencionRequest;
import cl.afphabitat.soap.exencion.SetSolicitudExencionResponse;

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
public class ExencionController extends MultiActionController {
	
	
	/** Logger */
	private static Logger logger = Logger.getLogger(ExencionController.class);
	private static PropertiesFile propertiesFile = PropertiesFile.getInstance();

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
	@RequestMapping("/ExencionSucursal/ingresoSolicitudExencion.htm")
	public ModelAndView ingresoSolExencionSucursalHandler(HttpServletRequest request) {
		ModelAndView modelView = new ModelAndView();
		//logger.debug("Entrando a la pagina de Ingreso Solicitud ExencionPAC.");
/*		HttpSession session = request.getSession();

		boolean isError = (request.getParameter("error") != null);
		if (isError) {
			logger.debug("Clave invalida!!");
			session.setAttribute("mensaje", "Usuario/Password inv&aacute;lido");					
		}
		modelView.setViewName("/ingresoSolicitudExencion");
*/
		System.out.println("ingresoSolicitudExencion.htm");
		return modelView;
	}

	@RequestMapping("/ExencionSucursal/seleccionSolicitudExencion.htm")
	public ModelAndView seleccionSolExencionSucursalHandler(HttpServletRequest request) {
		ModelAndView modelView = new ModelAndView();
		//logger.debug("Entrando a la pagina de Ingreso Solicitud ExencionPAC.");
/*		HttpSession session = request.getSession();

		boolean isError = (request.getParameter("error") != null);
		if (isError) {
			logger.debug("Clave invalida!!");
			session.setAttribute("mensaje", "Usuario/Password inv&aacute;lido");					
		}
		modelView.setViewName("/ingresoSolicitudExencion");
*/
		System.out.println("seleccionSolicitudExencion.htm");
		return modelView;
	}
	


	@RequestMapping("/ExencionWeb/seleccionSolicitudExencion.htm")
	public ModelAndView seleccionSolExencionWebHandler(HttpServletRequest request) {
		ModelAndView modelView = new ModelAndView();

		System.out.println("seleccionSolicitudExencion.htm");
		return modelView;
	}

    @RequestMapping(value = "/ExencionWeb/seleccionSolicitudExencion.htm", method = RequestMethod.POST)
  	public ModelAndView submitWebSeleccionExencion(@ModelAttribute("exencionVO") ExencionVO exencionVO) {

    	ModelAndView modelView = new ModelAndView("redirect:/ExencionWeb/ingresoSolicitudExencion.htm");


		String rutSession = "4.985.044-2";
		
		String rut = rutSession.replaceAll("\\.", "").replaceAll("\\-", "");
		
		GetAfiliadoProxy gAfil = new GetAfiliadoProxy(propertiesFile.getProperty("GetAfiliado"));
		GetAfiliadoRequest request = new GetAfiliadoRequest();
		GetAfiliadoResponse response = new GetAfiliadoResponse();		
		
		request.setRut(Integer.parseInt(rut.substring(0, rut.length()-1)));
    	request.setDv(rut.substring(rut.length()-1, rut.length()));
		
        try {
			response = gAfil.getAfiliado(request);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        if (response.getInformacionAfiliado() != null)
        {		
            modelView.addObject("rutAfiliado",rutSession);        	       	
            modelView.addObject("nombreCompleto",response.getInformacionAfiliado().getNombrePrimer() + " " + response.getInformacionAfiliado().getNombreSegundo() + " " + response.getInformacionAfiliado().getApellidoPaterno() + " " + response.getInformacionAfiliado().getApellidoMaterno());
            modelView.addObject("email",response.getInformacionAfiliado().getEmail());        	
            modelView.addObject("sistemaAntiguo",exencionVO.getSistemaAntiguo());     	
        }

        return modelView;
    	
    }	
    
	/**
	 * IngresoSoliciud Exencion PAC.
	 * @param request del Http
	 */
	@RequestMapping("/ExencionWeb/ingresoSolicitudExencion.htm")
	public ModelAndView ingresoSolExencionWebHandler(HttpServletRequest request) {

    	ModelAndView modelView = new ModelAndView();
		modelView.addObject("rutAfiliado", request.getParameter("rutAfiliado"));    	
		modelView.addObject("email", request.getParameter("email"));
		modelView.addObject("nombreCompleto", request.getParameter("nombreCompleto"));
		modelView.addObject("sistemaAntiguo", request.getParameter("sistemaAntiguo"));
		
		System.out.println("ingresoSolicitudExencion111.htm");
		logger.debug("Entrando a la pagina de Ingreso Solicitud ExencionPAC.");
 
		return modelView;
	}
    
    @RequestMapping(value = "/ExencionWeb/ingresoSolicitudExencion.htm", method = RequestMethod.POST)
  	public ModelAndView submitWebIngresoExencion(@ModelAttribute("exencionVO") ExencionVO exencionVO, HttpServletRequest requestServlet) {

    	ModelAndView modelView = new ModelAndView("redirect:/ExencionWeb/resultadoSolicitudExencion.htm");  
    	System.out.println("*** exencionVO.getBoton() : " + exencionVO.getBoton());
    	System.out.println("*** exencionVO.getEdadLegal() : " + exencionVO.getEdadLegal());
    	System.out.println("*** exencionVO.getPensionadoDL3500() : " + exencionVO.getPensionadoDL3500());
    	System.out.println("*** exencionVO.getPensionadosistemaAntiguo() : " + exencionVO.getPensionadosistemaAntiguo());    	
    	
    	if ("submit".equalsIgnoreCase(exencionVO.getBoton()))
    	{
	    	SetSolicitudExencionProxy soliExen = new SetSolicitudExencionProxy(propertiesFile.getProperty("SetSolicitudExencion"));
	    	SetSolicitudExencionRequest request = new SetSolicitudExencionRequest();
	    	SetSolicitudExencionResponse response = new SetSolicitudExencionResponse();
	    	
	    	String rutAfiliado =  requestServlet.getParameter("rutAfiliado").replaceAll("\\.", "").replaceAll("\\-", "");
	    	String rutEmpleador = requestServlet.getParameter("rutEmpleador").replaceAll("\\.", "").replaceAll("\\-", "");
	    	System.out.println("exVO == " + rutAfiliado);
	
	
	    	System.out.println("exVO == " + rutEmpleador);
	    	
	    	request.setRutAfiliado(new BigDecimal(rutAfiliado.substring(0, rutAfiliado.length()-1)));
	    	request.setDvAfiliado(rutAfiliado.substring(rutAfiliado.length()-1, rutAfiliado.length()));
	    	request.setRutEmpleado(new BigDecimal(rutEmpleador.substring(0, rutAfiliado.length()-1)));
	    	request.setDvEmpleado(rutEmpleador.substring(rutEmpleador.length()-1, rutAfiliado.length()));
	    	request.setIdSucursal(1);
	    	request.setIdTipoCanal(1);
	    	request.setRutRepresentante(new BigDecimal(1));
	    	request.setDvRepresentante("1");
	
	        try {
				response = soliExen.setSolicitudExencion(request);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        ExcepcionVO exceptionVO = null;
	        
	        if (response.getCondicion() != null)
	        {	
	        	if (response.getCondicion().getCodigoRespuesta() != 0)
	        	{
		        	exceptionVO = new ExcepcionVO();
		        	exceptionVO.setCodigoExcepcion(response.getCondicion().getCodigoRespuesta());
		        	exceptionVO.setDescripcionExcepcion(response.getCondicion().getDescripcionRespuesta());
			        modelView.addObject("codigoExcepcion", exceptionVO.getCodigoExcepcion());		        	
			        modelView.addObject("descripcionExcepcion", exceptionVO.getDescripcionExcepcion());			        	
		        	System.out.println("exceptionVO == " + response.getCondicion().getCodigoRespuesta() + " " + response.getCondicion().getDescripcionRespuesta());
	        	}
	        }
	        modelView.addObject("exceptionVO", exceptionVO);
			System.out.println("ingresoSolicitudExencion111.htm");
    	}
 
		return modelView;
	}

    @RequestMapping(value = "/ExencionWeb/resultadoSolicitudExencion.htm", method = RequestMethod.POST)
  	public ModelAndView submitWebIngresoExencion(HttpServletRequest requestServlet) {

    	ModelAndView modelView = new ModelAndView("redirect:/ExencionWeb/seleccionSolicitudExencion.htm");  
 
    
		return modelView;
	}
    
	@RequestMapping("/ExencionWeb/resultadoSolicitudExencion.htm")
	public ModelAndView resultadoSolExencionWebHandler(HttpServletRequest request) {

    	ModelAndView modelView = new ModelAndView();
		modelView.addObject("rutAfiliado", request.getParameter("rutAfiliado"));    	
		modelView.addObject("email", request.getParameter("email"));
		modelView.addObject("nombreCompleto", request.getParameter("nombreCompleto"));
		modelView.addObject("sistemaAntiguo", request.getParameter("sistemaAntiguo"));
		
		System.out.println("ingresoSolicitudExencion111.htm");
		logger.debug("Entrando a la pagina de Ingreso Solicitud ExencionPAC.");
 
		return modelView;
	}
    
    
    
    
	@RequestMapping("/ExencionSucursal/ingresoRepresentanteExencion.htm")
	public ModelAndView ingresoRepresentanteExencionSucursalHandler(HttpServletRequest request) {
		ModelAndView modelView = new ModelAndView();
		//logger.debug("Entrando a la pagina de Ingreso Solicitud ExencionPAC.");
/*		HttpSession session = request.getSession();

		boolean isError = (request.getParameter("error") != null);
		if (isError) {
			logger.debug("Clave invalida!!");
			session.setAttribute("mensaje", "Usuario/Password inv&aacute;lido");					
		}
		modelView.setViewName("/ingresoSolicitudExencion");
*/
		System.out.println("ingresoRepresentanteExencion.htm");
		return modelView;
	}
	
	@RequestMapping("/ExencionWeb/ingresoRepresentanteExencion.htm")
	public ModelAndView ingresoRepresentanteExencionWebHandler(HttpServletRequest request) {
		ModelAndView modelView = new ModelAndView();
		//logger.debug("Entrando a la pagina de Ingreso Solicitud ExencionPAC.");
/*		HttpSession session = request.getSession();

		boolean isError = (request.getParameter("error") != null);
		if (isError) {
			logger.debug("Clave invalida!!");
			session.setAttribute("mensaje", "Usuario/Password inv&aacute;lido");					
		}
		modelView.setViewName("/ingresoSolicitudExencion");
*/
		System.out.println("ingresoRepresentanteExencion.htm");
		return modelView;
	}	
	
}

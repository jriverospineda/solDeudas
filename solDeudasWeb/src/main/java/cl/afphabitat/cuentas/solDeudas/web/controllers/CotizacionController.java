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
public class CotizacionController extends MultiActionController {
	
	
	/** Logger */
	private static Logger logger = Logger.getLogger(CotizacionController.class);

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

	@RequestMapping("/CotizacionSucursal/solicitudContinuarCotizando.htm")
	public ModelAndView continuaCotizandoSucursalHandler(HttpServletRequest request) throws Exception {
		ModelAndView modelView = new ModelAndView();
		
//		 DeudaSucursalLocator serviceLocator = null;
//	     DeudaSucursalImpl port = null;
//	     Params reques = new Params();
//	     Params respons = new Params();
	  try {
//		  	reques.setEntrada(10);
//	        serviceLocator = new DeudaSucursalLocator();
//	        port = serviceLocator.getDeudaSucursalImplPort();
//	        respons = port.getDummiesItone(reques);
	        System.out.println("solicitudContinuarCotizando.htm");
	  } catch (Exception e) {
	   e.printStackTrace();
	  }   
		return modelView;
	}	

	@RequestMapping("/CotizacionSucursal/seleccionContinuarCotizando.htm")
	public ModelAndView seleccionCotizandoSucursalHandler(HttpServletRequest request) throws Exception {
		ModelAndView modelView = new ModelAndView();
		
//		 DeudaSucursalLocator serviceLocator = null;
//	     DeudaSucursalImpl port = null;
//	     Params reques = new Params();
//	     Params respons = new Params();
	  try {
//		  	reques.setEntrada(10);
//	        serviceLocator = new DeudaSucursalLocator();
//	        port = serviceLocator.getDeudaSucursalImplPort();
//	        respons = port.getDummiesItone(reques);
	        System.out.println("seleccionContinuarCotizando.htm");
	  } catch (Exception e) {
	   e.printStackTrace();
	  }   
		return modelView;
	}

	@RequestMapping("/CotizacionSucursal/ingresoEmpleadorCotizando.htm")
	public ModelAndView ingresoEmpleadorCotizandoSucursalHandler(HttpServletRequest request) throws Exception {
		ModelAndView modelView = new ModelAndView();
		
//		 DeudaSucursalLocator serviceLocator = null;
//	     DeudaSucursalImpl port = null;
//	     Params reques = new Params();
//	     Params respons = new Params();
	  try {
//		  	reques.setEntrada(10);
//	        serviceLocator = new DeudaSucursalLocator();
//	        port = serviceLocator.getDeudaSucursalImplPort();
//	        respons = port.getDummiesItone(reques);
	        System.out.println("ingresoEmpleadorCotizando.htm");
	  } catch (Exception e) {
	   e.printStackTrace();
	  }   
		return modelView;
	}
	
	@RequestMapping("/CotizacionSucursal/ingresoSolicitudContinuarCotizando.htm")
	public ModelAndView ingresoSolicitudContinuarCotizandoSucursalHandler(HttpServletRequest request) throws Exception {
		ModelAndView modelView = new ModelAndView();
		
//		 DeudaSucursalLocator serviceLocator = null;
//	     DeudaSucursalImpl port = null;
//	     Params reques = new Params();
//	     Params respons = new Params();
	  try {
//		  	reques.setEntrada(10);
//	        serviceLocator = new DeudaSucursalLocator();
//	        port = serviceLocator.getDeudaSucursalImplPort();
//	        respons = port.getDummiesItone(reques);
	        System.out.println("ingresoSolicitudContinuarCotizando.htm");
	  } catch (Exception e) {
	   e.printStackTrace();
	  }   
		return modelView;
	}	

	@RequestMapping("/CotizacionWeb/ingresoEmpleadorCotizando.htm")
	public ModelAndView ingresoEmpleadorCotizandoWebHandler(HttpServletRequest request) throws Exception {
		ModelAndView modelView = new ModelAndView();
		
//		 DeudaSucursalLocator serviceLocator = null;
//	     DeudaSucursalImpl port = null;
//	     Params reques = new Params();
//	     Params respons = new Params();
	  try {
//		  	reques.setEntrada(10);
//	        serviceLocator = new DeudaSucursalLocator();
//	        port = serviceLocator.getDeudaSucursalImplPort();
//	        respons = port.getDummiesItone(reques);
	        System.out.println("ingresoEmpleadorCotizando.htm");
	  } catch (Exception e) {
	   e.printStackTrace();
	  }   
		return modelView;
	}
	
	@RequestMapping("/CotizacionWeb/ingresoSolicitudContinuarCotizando.htm")
	public ModelAndView ingresoSolicitudContinuarCotizandoWebHandler(HttpServletRequest request) throws Exception {
		ModelAndView modelView = new ModelAndView();
		
//		 DeudaSucursalLocator serviceLocator = null;
//	     DeudaSucursalImpl port = null;
//	     Params reques = new Params();
//	     Params respons = new Params();
	  try {
//		  	reques.setEntrada(10);
//	        serviceLocator = new DeudaSucursalLocator();
//	        port = serviceLocator.getDeudaSucursalImplPort();
//	        respons = port.getDummiesItone(reques);
	        System.out.println("ingresoSolicitudContinuarCotizando.htm");
	  } catch (Exception e) {
	   e.printStackTrace();
	  }   
		return modelView;
	}	
	
	@RequestMapping("/CotizacionWeb/seleccionContinuarCotizando.htm")
	public ModelAndView seleccionCotizandoWebHandler(HttpServletRequest request) throws Exception {
		ModelAndView modelView = new ModelAndView();
		
//		 DeudaSucursalLocator serviceLocator = null;
//	     DeudaSucursalImpl port = null;
//	     Params reques = new Params();
//	     Params respons = new Params();
	  try {
//		  	reques.setEntrada(10);
//	        serviceLocator = new DeudaSucursalLocator();
//	        port = serviceLocator.getDeudaSucursalImplPort();
//	        respons = port.getDummiesItone(reques);
	        System.out.println("seleccionContinuarCotizando.htm");
	  } catch (Exception e) {
	   e.printStackTrace();
	  }   
		return modelView;
	}

	@RequestMapping("/CotizacionWeb/solicitudContinuarCotizando.htm")
	public ModelAndView continuaCotizandoWebHandler(HttpServletRequest request) throws Exception {
		ModelAndView modelView = new ModelAndView();
		
//		 DeudaSucursalLocator serviceLocator = null;
//	     DeudaSucursalImpl port = null;
//	     Params reques = new Params();
//	     Params respons = new Params();
	  try {
//		  	reques.setEntrada(10);
//	        serviceLocator = new DeudaSucursalLocator();
//	        port = serviceLocator.getDeudaSucursalImplPort();
//	        respons = port.getDummiesItone(reques);
	        System.out.println("solicitudContinuarCotizando.htm");
	  } catch (Exception e) {
	   e.printStackTrace();
	  }   
		return modelView;
	}	
	
}

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
public class SucursalTestController extends MultiActionController {
	
	
	/** Logger */
	private static Logger logger = Logger.getLogger(SucursalTestController.class);

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
	@RequestMapping("/deudaSucursal/testDeudaSucursal.htm")
	public ModelAndView testSucursalHandler(HttpServletRequest request) throws Exception {
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
	        System.out.println("ENTRAMOS : ");
	  } catch (Exception e) {
	   e.printStackTrace();
	  }   
	  	modelView.setViewName("/deudaSucursal/testDeudaSucursalWS");
		return modelView;
	}

}

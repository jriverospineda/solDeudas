package cl.afphabitat.cuentas.solDeudas.web.controllers;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.asm.commons.Method;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import cl.afphabitat.cuentas.solDeudas.ejb.SolDeudasLocal;
import cl.afphabitat.cuentas.solDeudas.web.filters.SolDeudasPortalRequestFilter;
import cl.afphabitat.cuentas.solDeudas.web.util.Common;
import cl.afphabitat.cuentas.solDeudas.web.util.PropertiesFile;
import cl.afphabitat.cuentas.solDeudas.web.vo.SolicitudVO;
import cl.afphabitat.cuentas.solDeudas.web.vo.ConsultarSolicitudVO;
import cl.afphabitat.cuentas.solDeudas.web.vo.SolicitudCertificadoVO;
import cl.afphabitat.portalPrivado.bpro.bo.FichaClienteBO;
import cl.afphabitat.soap.certificado.GetCertDetDeudaRequest;
import cl.afphabitat.soap.certificado.GetCertDetDeudaResponse;
import cl.afphabitat.soap.certificado.GetCertDetalleDeudaEmpleadorProxy;
import cl.afphabitat.soap.certificado.GetCertDeudaRequest;
import cl.afphabitat.soap.certificado.GetCertDeudaResponse;
import cl.afphabitat.soap.certificado.GetCertDeudaTotalEmpleadorProxy;
import cl.afphabitat.soap.certificado.GetCertDicomEmpleadorProxy;
import cl.afphabitat.soap.certificado.GetCertDicomEmpleadorRequest;
import cl.afphabitat.soap.certificado.GetCertDicomEmpleadorResponse;
import cl.afphabitat.soap.certificado.GetCertMoraPresuntaEmpleadorProxy;
import cl.afphabitat.soap.certificado.GetCertMoraPresuntaRequest;
import cl.afphabitat.soap.certificado.GetCertMoraPresuntaResponse;
import cl.afphabitat.soap.solicitud.GetSolicitudProxy;
import cl.afphabitat.soap.solicitud.GetSolicitudRequest;
import cl.afphabitat.soap.solicitud.GetSolicitudResponse;


/**
 * Controller de Consultas Generico<p>
 *
 * Registro de Versiones:<ul>
 * <li>Fecha [Analista - Proveedor.]: Versión Inicial</li>
 * </ul><p>
 * 
 * <b>Todos los derechos reservados por AFP Habitat.</b><p>
 *
 */
@Controller
public class ConsultasController extends MultiActionController  {
	
	/** Logger */
	private static Logger logger = Logger.getLogger(ConsultasController.class);
	private static PropertiesFile propertiesFile = PropertiesFile.getInstance();
	
	/** Delegate de negocio */
	@Autowired private SolDeudasLocal solDeudasDelegate;
	
	
	/**
	 * Recibe las coorddenadas de opción de la zona de URL, selecciona y activa despachador de URL<p>
	 *
	 * Registro de Versiones:<ul>
	 * <li>Fecha [Analista - Proveedor.]: Versión Inicial</li>
	 * </ul><p>
	 * 
	 * @param session del http
	 * @return MV
	 * @throws Exception
	 *
	 */
	 // Mapea a cap de presentacion
	@RequestMapping("/consultas/consultasample.htm")
	public ModelAndView consultaHandler(HttpSession session)  {
		ModelAndView modelView = new ModelAndView();

		FichaClienteBO fichaCliente = (FichaClienteBO)session.getAttribute(
				SolDeudasPortalRequestFilter.FICHA_ID);
		
		logger.debug("Obtiene ficha del cliente: " + fichaCliente.getFullRut());
		//TODO: Insertar logica del negocio
		
		return modelView;
	}

	@RequestMapping("/ConsultaSolicitudSucursal/buscarSolicitud.htm")
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
	        System.out.println("buscarSolicitud.htm");
	  } catch (Exception e) {
	   e.printStackTrace();
	  }   
		return modelView;
	}		

	@RequestMapping("/ConsultaSolicitudWeb/buscarSolicitud.htm")
	public ModelAndView consultaWeb(HttpServletRequest request) throws Exception {
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
	        System.out.println("buscarSolicitud.htm");
	  } catch (Exception e) {
	   e.printStackTrace();
	  }   
		return modelView;
	}	
	
	@RequestMapping("/ConsultaSolicitudSucursal/documentoSolicitud.htm")
	public ModelAndView documentoSolicitudHandler(HttpServletRequest request) throws Exception {
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
	        System.out.println("documentoSolicitud.htm");
	  } catch (Exception e) {
	   e.printStackTrace();
	  }   
		return modelView;
	}	
	
	@RequestMapping("/ConsultaSolicitudSucursal/buscarSolicitudPorTipo.htm")
	public ModelAndView buscarSolicitudPorTipo(HttpServletRequest request) throws Exception {
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
	        System.out.println("buscarSolicitudPorTipo.htm");
	  } catch (Exception e) {
	   e.printStackTrace();
	  }   
		return modelView;
	}	
	
    @RequestMapping(value = "/ConsultaSolicitudSucursal/buscarSolicitud.htm", method = RequestMethod.POST)
  	public ModelAndView submitWeb(@ModelAttribute("consultarSolicitudVO") ConsultarSolicitudVO consultarSolicitudVO) {

    	
    	ModelAndView modelView = new ModelAndView();
    	System.out.println("*** consultarSolicitudVO.getBoton() : " + consultarSolicitudVO.getBoton());
    	
    	modelView.addObject("rutAfiliado", consultarSolicitudVO.getRutAfiliado());
       	modelView.addObject("fechaInicio", consultarSolicitudVO.getFechaInicial());
       	modelView.addObject("fechaFinal", consultarSolicitudVO.getFechaFinal());
        modelView.addObject("folio", consultarSolicitudVO.getFolio());
        
        System.out.println("*** consultarSolicitudVO.getRutAfiliado() : " + consultarSolicitudVO.getRutAfiliado());
        System.out.println("*** solicitudCertificadoVO.getFechaInicial() : " + consultarSolicitudVO.getFechaInicial()); 
        System.out.println("*** solicitudCertificadoVO.getFechaFinal() : " +  consultarSolicitudVO.getFechaFinal()); 
        System.out.println("*** consultarSolicitudVO.getFolio() : " + consultarSolicitudVO.getFolio()); 

        GetSolicitudProxy gCert = new GetSolicitudProxy(propertiesFile.getProperty("GetSolicitud"));        
        GetSolicitudRequest request = new GetSolicitudRequest();
        GetSolicitudResponse response = new GetSolicitudResponse();

        request.setFolio(consultarSolicitudVO.getFolio());
        String rut = consultarSolicitudVO.getRutAfiliado().replaceAll("\\.", "").replaceAll("\\-", "");
        request.setRutAfiliadoIn(new BigDecimal(rut.substring(0, rut.length()-1)));
        request.setDvAfiliadoIn(rut.substring(rut.length()-1, rut.length())); 
/*        

        System.out.println("*** replace 1 : " + rut.substring(0, rut.length()-1)); 
        System.out.println("*** replace 2 : " + rut.substring(rut.length()-1, rut.length())); 
        System.out.println("*** replace 3 : " + Integer.parseInt(consultarSolicitudVO.getFechaInicial().substring(6, 10))); 
        System.out.println("*** replace 4 : " + Integer.parseInt(consultarSolicitudVO.getFechaInicial().substring(3, 5))); 
        System.out.println("*** replace 5 : " + Integer.parseInt(consultarSolicitudVO.getFechaInicial().substring(0, 2))); 
*/   
        Calendar fechaInicial = Calendar.getInstance();
        fechaInicial.set(Calendar.YEAR, Integer.parseInt(consultarSolicitudVO.getFechaInicial().substring(6,10)));
        fechaInicial.set(Calendar.MONTH, Integer.parseInt(consultarSolicitudVO.getFechaInicial().substring(3,5)));
        fechaInicial.set(Calendar.DATE, Integer.parseInt(consultarSolicitudVO.getFechaInicial().substring(0,2)));  
        
        Calendar fechaFinal = Calendar.getInstance();
        fechaFinal.set(Calendar.YEAR, Integer.parseInt(consultarSolicitudVO.getFechaFinal().substring(6,10)));
        fechaFinal.set(Calendar.MONTH, Integer.parseInt(consultarSolicitudVO.getFechaFinal().substring(3,5)));
        fechaFinal.set(Calendar.DATE, Integer.parseInt(consultarSolicitudVO.getFechaFinal().substring(0,2)));             
        
        request.setFechaInicialIn(fechaInicial);
        request.setFechaFinalIn(fechaFinal);  
        request.setIdTipoSolicitud("");
        
        try {
			response = gCert.getSolicitud(request);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        List<SolicitudVO> listaSolicitudVO = new ArrayList<SolicitudVO>();
        SolicitudVO solicitudVO = new SolicitudVO();


        if (response.getInformacionSolicitud() != null)
        {
        	for (int i=0; i < response.getInformacionSolicitud().length; i++)
        	{        
        		solicitudVO = new SolicitudVO();
        		solicitudVO.setFolio(response.getInformacionSolicitud()[i].getFolioSolicitud());
        		solicitudVO.setFechaSolicitud(response.getInformacionSolicitud()[i].getFechaSolicitud());
        		Date fechaSolicitud = solicitudVO.getFechaSolicitud().getTime();
        		solicitudVO.setFechaSolicitudString(Common.fechaString(fechaSolicitud));
        		solicitudVO.setRutEmpleador(response.getInformacionSolicitud()[i].getRutEmpleador() + "-" + response.getInformacionSolicitud()[i].getDvEmpleador());
        		solicitudVO.setRazonSocial(response.getInformacionSolicitud()[i].getRazonSocial());
        		solicitudVO.setRutAfiliado(response.getInformacionSolicitud()[i].getRutAfiliado() + "-" + response.getInformacionSolicitud()[i].getDvAfiliado());
        		solicitudVO.setApellidoPaterno(response.getInformacionSolicitud()[i].getApellidoPaterno());
        		solicitudVO.setApellidoMaterno(response.getInformacionSolicitud()[i].getApellidoMaterno());
        		solicitudVO.setPrimerNombre(response.getInformacionSolicitud()[i].getPrimerNombre());
        		solicitudVO.setSegundoNombre(response.getInformacionSolicitud()[i].getSegundoNombre());
        		solicitudVO.setNombreCompleto(solicitudVO.getPrimerNombre() + " " + solicitudVO.getSegundoNombre() + " " + solicitudVO.getApellidoPaterno() + " " + solicitudVO.getApellidoMaterno());
        		solicitudVO.setFechaInicial(response.getInformacionSolicitud()[i].getFechaInicial());
        		Date fechaIni = solicitudVO.getFechaInicial().getTime();
        		solicitudVO.setFechaInicialString(Common.fechaString(fechaIni));
        		solicitudVO.setFechaFinal(response.getInformacionSolicitud()[i].getFechaFinal());
        		Date fechaFin = solicitudVO.getFechaFinal().getTime();
        		solicitudVO.setFechaFinalString(Common.fechaString(fechaFin));
        		solicitudVO.setEstado(response.getInformacionSolicitud()[i].getEstado());
        		solicitudVO.setTipoSolicitud(response.getInformacionSolicitud()[i].getTipoSolicitud());
        		listaSolicitudVO.add(solicitudVO);
        	}
	        modelView.addObject("listaSolicitudVO",listaSolicitudVO);
        }      	
        
        return modelView;
	
    }
	
	
	
	
}


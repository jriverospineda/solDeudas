package cl.afphabitat.cuentas.solDeudas.web.controllers;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import cl.afphabitat.cuentas.solDeudas.web.vo.CertificadoVO;
import cl.afphabitat.cuentas.solDeudas.web.vo.SolicitudCertificadoVO;
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
import cl.afphabitat.cuentas.solDeudas.web.util.CertificadoPDF;
import cl.afphabitat.cuentas.solDeudas.web.util.Common;
import cl.afphabitat.cuentas.solDeudas.web.util.PropertiesFile;

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
public class CertificadoController extends MultiActionController {
	

	private static Logger logger = Logger.getLogger(CertificadoController.class);
	private static PropertiesFile propertiesFile = PropertiesFile.getInstance();

	@RequestMapping("/CertificadoSucursal/emisionCertificado.htm")
	public ModelAndView certificadoSucursalHandler(HttpServletRequest request) throws Exception {
		ModelAndView modelView = new ModelAndView();

	  try
	  {
	       	System.out.println("emisionCertificado.htm");

	  } catch (Exception e) {
	   e.printStackTrace();
	  }   
	      	
		return modelView;
	}	
	
	@RequestMapping("/CertificadoWeb/emisionCertificado.htm")
	public ModelAndView certificadoWebHandler(HttpServletRequest request) throws Exception {
		ModelAndView modelView = new ModelAndView();

	    System.out.println("emisionCertificado.htm");
		return modelView;
	}		
	
	@RequestMapping(value = "/CertificadoWeb/emisionCertificado.htm", method = RequestMethod.POST)
  	public ModelAndView submitWeb(@ModelAttribute("solicitudCertificadoVO") SolicitudCertificadoVO solicitudCertificadoVO,HttpServletRequest httpRequest, HttpServletResponse httpResponse) {

    	ModelAndView modelView = new ModelAndView();
    	ModelAndView modelViewPrint = new ModelAndView("redirect:/CertificadoWeb/printCertificado.htm");
    	ModelAndView modelViewClean = new ModelAndView("redirect:/CertificadoWeb/emisionCertificado.htm");

    	modelView.addObject("rutEmpresa", solicitudCertificadoVO.getRutEmpresa());
        System.out.println("*** solicitudCertificadoVO.getRutEmpresa() : " + solicitudCertificadoVO.getRutEmpresa());
        modelView.addObject("tipoCertificado", solicitudCertificadoVO.getTipoCertificado());
        System.out.println("***solicitudCertificadoVO.getTipoCertificado() : " +solicitudCertificadoVO.getTipoCertificado()); 
       	modelView.addObject("fechaInicio", solicitudCertificadoVO.getFechaInicio());
       	modelView.addObject("fechaFinal", solicitudCertificadoVO.getFechaFinal());
        System.out.println("*** solicitudCertificadoVO.getFechaInicio() : " + solicitudCertificadoVO.getFechaInicio()); 
        System.out.println("*** solicitudCertificadoVO.getFechaFinal() : " + solicitudCertificadoVO.getFechaFinal()); 
        
        if("reset".equalsIgnoreCase(solicitudCertificadoVO.getBoton()))
        {
        	return modelViewClean;
        }
    	
        List<CertificadoVO> listaCertificadoVO = new ArrayList<CertificadoVO>();
        CertificadoVO certificadoVO = new CertificadoVO();
        
        if (solicitudCertificadoVO.getTipoCertificado() == 1)
        {  
	        GetCertDeudaTotalEmpleadorProxy gCert = new GetCertDeudaTotalEmpleadorProxy(propertiesFile.getProperty("GetCertDeudaTotalEmpleador"));        
	        GetCertDeudaRequest request = new GetCertDeudaRequest();
	        GetCertDeudaResponse response = new GetCertDeudaResponse();
	        System.out.println("**replace : " + solicitudCertificadoVO.getRutEmpresa().replaceAll("\\.", "").replaceAll("\\-", ""));
	
	        request.setCodigoUsuario("1");
	        request.setFechaInicio(solicitudCertificadoVO.getFechaInicio());
	        request.setFechaTermino(solicitudCertificadoVO.getFechaFinal());
	        request.setRut(new BigDecimal(solicitudCertificadoVO.getRutEmpresa().replaceAll("\\.", "").replaceAll("\\-", "")));
	        
	        try {
				response = gCert.getCertDeudaTotalEmpleador(request);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        System.out.println("*** response : " + response.getInformacionCertificado().length);
	        
	        listaCertificadoVO = new ArrayList<CertificadoVO>();
	        certificadoVO = new CertificadoVO();
	
	
	        if (response.getInformacionCertificado() != null)
	        {
	        	for (int i=0; i < response.getInformacionCertificado().length; i++)
	        	{
	        		certificadoVO = new CertificadoVO();
	        		certificadoVO.setIdEjecucion(response.getInformacionCertificado()[i].getIdEjecucion());
	        		certificadoVO.setFechaRegistro(response.getInformacionCertificado()[i].getFechaRegistro());
	        		Date fechaRegistro = certificadoVO.getFechaRegistro().getTime();
	        		certificadoVO.setFechaRegistroString(Common.fechaString(fechaRegistro));
	        		certificadoVO.setOrigen(response.getInformacionCertificado()[i].getOrigen());
	        		certificadoVO.setPeriodoCotizacion(response.getInformacionCertificado()[i].getPeriodoCotizacion());
	        		certificadoVO.setMontoOriginalDeuda(response.getInformacionCertificado()[i].getMontoOriginalDeuda());
	        		certificadoVO.setSaldoNominal(response.getInformacionCertificado()[i].getSaldoNominal());
	        		certificadoVO.setReajuste(response.getInformacionCertificado()[i].getReajuste());
	        		certificadoVO.setIntereses(response.getInformacionCertificado()[i].getIntereses());
	        		certificadoVO.setRecargoAFP(response.getInformacionCertificado()[i].getRecargoAFP());
	        		certificadoVO.setTotalFondo(response.getInformacionCertificado()[i].getTotalFondo());
	        		certificadoVO.setTotalAPagar(response.getInformacionCertificado()[i].getTotalAPagar());
	        		listaCertificadoVO.add(certificadoVO);
	        	}
	        	
	        }
	        modelView.addObject("listaCertificadoVO",listaCertificadoVO);
	        
	    	//modelView.addObject("rutEmpresa", solicitudCertificado.getRutEmpresa());
	        System.out.println("*** listaCertificadoVO : " + listaCertificadoVO.size());
        }else if (solicitudCertificadoVO.getTipoCertificado() == 2)
        {  
	        GetCertDetalleDeudaEmpleadorProxy gCert = new GetCertDetalleDeudaEmpleadorProxy(propertiesFile.getProperty("GetCertDetalleDeudaEmpleador"));        
	        GetCertDetDeudaRequest request = new GetCertDetDeudaRequest();
	        GetCertDetDeudaResponse response = new GetCertDetDeudaResponse();
//	        System.out.println("**replace : " + solicitudCertificadoVO.getRutEmpresa().replaceAll("\\.", "").replaceAll("\\-", ""));
	
	        request.setCodigoUsuario("1");
	        request.setFechaInicio(solicitudCertificadoVO.getFechaInicio());
	        request.setFechaTermino(solicitudCertificadoVO.getFechaFinal());
	        request.setRutEmpresa(new BigDecimal(solicitudCertificadoVO.getRutEmpresa().replaceAll("\\.", "").replaceAll("\\-", "")));
	        
	        try {
				response = gCert.getCertDetalleDeudaEmpleador(request);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        listaCertificadoVO = new ArrayList<CertificadoVO>();
	        certificadoVO = new CertificadoVO();
	
	
	        if (response.getInformacionCertificado() != null)
	        {
	        	for (int i=0; i < response.getInformacionCertificado().length; i++)
	        	{	               	
	        		certificadoVO = new CertificadoVO();
	        		certificadoVO.setIdEjecucion(response.getInformacionCertificado()[i].getIdEjecucion());
	        		certificadoVO.setFechaRegistro(response.getInformacionCertificado()[i].getFechaRegistro());
	        		Date fechaRegistro = certificadoVO.getFechaRegistro().getTime();
	        		certificadoVO.setFechaRegistroString(Common.fechaString(fechaRegistro));
	        		certificadoVO.setIdDeuda(response.getInformacionCertificado()[i].getIdDeuda());
	        		certificadoVO.setPeriodoCotizacion(Common.fechaString(fechaRegistro)); // a esta falta mapear lo correcto.
	        		certificadoVO.setOrigenDeuda(response.getInformacionCertificado()[i].getOrigenDeuda());
	        		certificadoVO.setRutString(response.getInformacionCertificado()[i].getRut() + "-" + response.getInformacionCertificado()[i].getDv());
	        		certificadoVO.setNombreCompleto(response.getInformacionCertificado()[i].getApellidoPaterno() + ", " + response.getInformacionCertificado()[i].getPrimerNombre());
	        		certificadoVO.setMontoRentaImponible(response.getInformacionCertificado()[i].getMontoRentaImponible());
	        		certificadoVO.setIdProductoCCICO(response.getInformacionCertificado()[i].getIdPodructoCCICO());
	        		certificadoVO.setIdProductoCCICV(response.getInformacionCertificado()[i].getIdPodructoCCICV());
	        		certificadoVO.setIdProductoCCIDC(response.getInformacionCertificado()[i].getIdPodructoCCIDC());
	        		certificadoVO.setIdProductoCAV(response.getInformacionCertificado()[i].getIdPodructoCAV());
	        		certificadoVO.setIdProductoAPVC(response.getInformacionCertificado()[i].getIdPodructoAPVC());
	        		certificadoVO.setIdProductoCAI(response.getInformacionCertificado()[i].getIdPodructoCAI());
	        		certificadoVO.setIdProductoCCIAV(response.getInformacionCertificado()[i].getIdPodructoCCIAV());
	        		certificadoVO.setCotizacionTrabajoPesado(response.getInformacionCertificado()[i].getCotizacionTrabajoPesado());
	        		certificadoVO.setSeguro(response.getInformacionCertificado()[i].getSeguro());
	        		certificadoVO.setTotal(response.getInformacionCertificado()[i].getTotal());
	        		listaCertificadoVO.add(certificadoVO);
	        	}
	        	
	        }
	        modelView.addObject("listaCertificadoVO",listaCertificadoVO);
	        
	    	//modelView.addObject("rutEmpresa", solicitudCertificado.getRutEmpresa());
	        System.out.println("*** listaCertificadoVO : " + listaCertificadoVO.size());        	

        }else if (solicitudCertificadoVO.getTipoCertificado() == 3)	
        {
	        GetCertMoraPresuntaEmpleadorProxy gCert = new GetCertMoraPresuntaEmpleadorProxy(propertiesFile.getProperty("GetCertMoraPresuntaEmpleador"));        
	        GetCertMoraPresuntaRequest request = new GetCertMoraPresuntaRequest();
	        GetCertMoraPresuntaResponse response = new GetCertMoraPresuntaResponse();
//	        System.out.println("**replace : " + solicitudCertificadoVO.getRutEmpresa().replaceAll("\\.", "").replaceAll("\\-", ""));
	
	        request.setCodigoUsuario("1");
	        request.setFechaInicio(solicitudCertificadoVO.getFechaInicio());
	        request.setFechaTermino(solicitudCertificadoVO.getFechaFinal());
	        request.setRut(new BigDecimal(solicitudCertificadoVO.getRutEmpresa().replaceAll("\\.", "").replaceAll("\\-", "")));
	        
	        try {
				response = gCert.getCertMoraPresuntaEmpleador(request);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        listaCertificadoVO = new ArrayList<CertificadoVO>();
	        certificadoVO = new CertificadoVO();
	
	
	        if (response.getInformacionCertificado() != null)
	        {
	        	for (int i=0; i < response.getInformacionCertificado().length; i++)
	        	{	               	
	        		certificadoVO = new CertificadoVO();
	        		certificadoVO.setIdEjecucion(response.getInformacionCertificado()[i].getIdEjecucion());
	        		certificadoVO.setFechaRegistro(response.getInformacionCertificado()[i].getFechaRegistro());
	        		Date fechaRegistro = certificadoVO.getFechaRegistro().getTime();
	        		certificadoVO.setFechaRegistroString(Common.fechaString(fechaRegistro));
	        		Date periodoCotizacion = response.getInformacionCertificado()[i].getPeriodoCotizacion().getTime();
	    	       // System.out.println("*** periodoCotizacion : " + periodoCotizacion); 
	        		certificadoVO.setPeriodoCotizacion(Common.fechaString(periodoCotizacion)); // a esta falta mapear lo correcto.
	        		certificadoVO.setOrigenDeuda(response.getInformacionCertificado()[i].getOrigenMora());
	        		certificadoVO.setRutString(response.getInformacionCertificado()[i].getRutAfiliado() + "-" + response.getInformacionCertificado()[i].getDvAfiliado());
	        		certificadoVO.setNombreCompleto(response.getInformacionCertificado()[i].getApellidoPaterno() + ", " + response.getInformacionCertificado()[i].getPrimerNombre());
	        		certificadoVO.setMontoRentaImponible(response.getInformacionCertificado()[i].getMontoRemuneracionImponible());
	        		certificadoVO.setProducto(response.getInformacionCertificado()[i].getTipoConcepto());
	        		certificadoVO.setMontoMora(response.getInformacionCertificado()[i].getMontoConcepto());
	        		listaCertificadoVO.add(certificadoVO);
	        	}
	        	
	        }
	        modelView.addObject("listaCertificadoVO",listaCertificadoVO);
	        
	    	//modelView.addObject("rutEmpresa", solicitudCertificado.getRutEmpresa());
	        System.out.println("*** listaCertificadoVO : " + listaCertificadoVO.size());          	
        	
        }else if (solicitudCertificadoVO.getTipoCertificado() == 4)	
        {
	        GetCertDicomEmpleadorProxy gCert = new GetCertDicomEmpleadorProxy(propertiesFile.getProperty("GetCertDicomEmpleador"));        
	        GetCertDicomEmpleadorRequest request = new GetCertDicomEmpleadorRequest();
	        GetCertDicomEmpleadorResponse response = new GetCertDicomEmpleadorResponse();
//	        System.out.println("**replace : " + solicitudCertificadoVO.getRutEmpresa().replaceAll("\\.", "").replaceAll("\\-", ""));
	
	        request.setCodigoUsuario("1");
	        request.setFechaInicio(solicitudCertificadoVO.getFechaInicio());
	        request.setFechaTermino(solicitudCertificadoVO.getFechaFinal());
	        request.setRut(new BigDecimal(solicitudCertificadoVO.getRutEmpresa().replaceAll("\\.", "").replaceAll("\\-", "")));
	        
	        try {
				response = gCert.getCertDicomEmpleador(request);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        listaCertificadoVO = new ArrayList<CertificadoVO>();
	        certificadoVO = new CertificadoVO();
	
	
	        if (response.getInformacionCertificado() != null)
	        {
	        	for (int i=0; i < response.getInformacionCertificado().length; i++)
	        	{	               	
	        		certificadoVO = new CertificadoVO();
	        		certificadoVO.setIdEjecucion(response.getInformacionCertificado()[i].getIdEjecucion());
	        		certificadoVO.setFechaRegistro(response.getInformacionCertificado()[i].getFechaRegistro());
	        		Date fechaRegistro = certificadoVO.getFechaRegistro().getTime();
	        		certificadoVO.setFechaRegistroString(Common.fechaString(fechaRegistro));
	        		certificadoVO.setOrigen(response.getInformacionCertificado()[i].getOrigen());
	        		certificadoVO.setPeriodoCotizacion(response.getInformacionCertificado()[i].getPeriodoCotizacion());
	        		certificadoVO.setMontoOriginalDeuda(response.getInformacionCertificado()[i].getMontoOriginalDeuda());
	        		certificadoVO.setSaldoNominal(response.getInformacionCertificado()[i].getSaldoNominal());
	        		certificadoVO.setReajuste(response.getInformacionCertificado()[i].getReajuste());
	        		certificadoVO.setIntereses(response.getInformacionCertificado()[i].getIntereses());
	        		certificadoVO.setRecargoAFP(response.getInformacionCertificado()[i].getRecargoAFP());
	        		certificadoVO.setTotalFondo(response.getInformacionCertificado()[i].getTotalFondo());
	        		certificadoVO.setTotalAPagar(response.getInformacionCertificado()[i].getTotalAPagar());
	        		listaCertificadoVO.add(certificadoVO);
	        	}
	        	
	        }
	        modelView.addObject("listaCertificadoVO",listaCertificadoVO);
	        
	    	//modelView.addObject("rutEmpresa", solicitudCertificado.getRutEmpresa());
	        System.out.println("*** listaCertificadoVO : " + listaCertificadoVO.size());          	
        	
        }
        
        /* certificado en pdf */
        System.out.println("*** solicitudCertificadoVO.getBoton() : " + solicitudCertificadoVO.getBoton());  
        if("PDF_DeudaTotalEmpleador".equalsIgnoreCase(solicitudCertificadoVO.getBoton()))
        {
    		ServletContext servletContext = httpRequest.getSession().getServletContext();
    	    File tempDirectory = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
    	    String temperotyFilePath = tempDirectory.getAbsolutePath();
    	    String nombreArchivo = "CertDeudaTotalEmpleador.pdf";
    	    
     	    modelViewPrint.addObject("tempDirectory",tempDirectory.getAbsolutePath());
     	    modelViewPrint.addObject("url",tempDirectory.getAbsolutePath() + "/" + nombreArchivo);
     	    modelViewPrint.addObject("nombreArchivo",nombreArchivo);
    	        	    
    	    System.out.println("**** temperotyFilePath : " + temperotyFilePath);
        	CertificadoPDF.getCertDeudaTotalEmpleadorPDF(temperotyFilePath, nombreArchivo,listaCertificadoVO,solicitudCertificadoVO);
        	return modelViewPrint;	
        	
        }else if ("PDF_MoraPresuntaEmpleador".equalsIgnoreCase(solicitudCertificadoVO.getBoton()))
        {

    		ServletContext servletContext = httpRequest.getSession().getServletContext();
    	    File tempDirectory = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
    	    String temperotyFilePath = tempDirectory.getAbsolutePath();
    	    String nombreArchivo = "CertMoraPresuntaEmpleador.pdf";
    	    
     	    modelViewPrint.addObject("tempDirectory",tempDirectory.getAbsolutePath());
     	    modelViewPrint.addObject("url",tempDirectory.getAbsolutePath() + "/" + nombreArchivo);
     	    modelViewPrint.addObject("nombreArchivo",nombreArchivo);
    	        	    
    	    System.out.println("**** temperotyFilePath : " + temperotyFilePath);
        	CertificadoPDF.getCertMoraPresuntaEmpleadorPDF(temperotyFilePath, nombreArchivo,listaCertificadoVO,solicitudCertificadoVO);
        	return modelViewPrint;	
        	
        	
        	
        }
        
        
        return modelView;
	
    }
	
    @RequestMapping(value = "/CertificadoWeb/printCertificado.htm")
	public ModelAndView printCertificadoHandler(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView modelView = new ModelAndView();

	  try
	  {
		    modelView.addObject("url",request.getParameter("url"));
	       	System.out.println("url = " + request.getParameter("url"));
	       	System.out.println("tempDirectory = " + request.getParameter("tempDirectory"));
	       	System.out.println("nombreArchivo = " + request.getParameter("nombreArchivo"));
	       	
	       	String url = request.getParameter("url");
	       	String tempDirectory = request.getParameter("tempDirectory");
	       	String nombreArchivo = request.getParameter("nombreArchivo");
	       	
		    response.setContentType("application/pdf");
		    response.setHeader("Content-disposition", "attachment; filename="+ nombreArchivo);
		    try {
		        ByteArrayOutputStream baos = new ByteArrayOutputStream();
		        baos = convertPDFToByteArrayOutputStream(tempDirectory+"/"+nombreArchivo);
		        OutputStream os = response.getOutputStream();
		        baos.writeTo(os);
		        os.flush();
		    } catch (Exception e1) {
		    	e1.printStackTrace();
		    }

	       	System.out.println("printCertificado.htm");

	  } catch (Exception e) {
	   e.printStackTrace();
	  }   
	      	
		return modelView;
	}	

	private ByteArrayOutputStream convertPDFToByteArrayOutputStream(String fileName) {
		 
		InputStream inputStream = null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
 
			inputStream = new FileInputStream(fileName);
			byte[] buffer = new byte[1024];
			baos = new ByteArrayOutputStream();
 
			int bytesRead;
			while ((bytesRead = inputStream.read(buffer)) != -1) {
				baos.write(buffer, 0, bytesRead);
			}
 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return baos;
	}
    
    @RequestMapping(value = "/CertificadoSucursal/emisionCertificado.htm", method = RequestMethod.POST)
  	public ModelAndView submitSucursal(@ModelAttribute("solicitudCertificadoVO") SolicitudCertificadoVO solicitudCertificadoVO) {

    	ModelAndView modelView = new ModelAndView();
    	
    	modelView.addObject("rutEmpresa", solicitudCertificadoVO.getRutEmpresa());
        System.out.println("*** solicitudCertificadoVO.getRutEmpresa() : " + solicitudCertificadoVO.getRutEmpresa());
        modelView.addObject("tipoCertificado", solicitudCertificadoVO.getTipoCertificado());
        System.out.println("***solicitudCertificadoVO.getTipoCertificado() : " +solicitudCertificadoVO.getTipoCertificado()); 
       	modelView.addObject("fechaInicio", solicitudCertificadoVO.getFechaInicio());
       	modelView.addObject("fechaFinal", solicitudCertificadoVO.getFechaFinal());
        System.out.println("*** solicitudCertificadoVO.getFechaInicio() : " + solicitudCertificadoVO.getFechaInicio()); 
        System.out.println("*** solicitudCertificadoVO.getFechaFinal() : " + solicitudCertificadoVO.getFechaFinal()); 
        
        if (solicitudCertificadoVO.getTipoCertificado() == 1)
        {  
	        GetCertDeudaTotalEmpleadorProxy gCert = new GetCertDeudaTotalEmpleadorProxy(propertiesFile.getProperty("GetCertDeudaTotalEmpleador"));        
	        GetCertDeudaRequest request = new GetCertDeudaRequest();
	        GetCertDeudaResponse response = new GetCertDeudaResponse();
	        System.out.println("**replace : " + solicitudCertificadoVO.getRutEmpresa().replaceAll("\\.", "").replaceAll("\\-", ""));
	
	        request.setCodigoUsuario("1");
	        request.setFechaInicio(solicitudCertificadoVO.getFechaInicio());
	        request.setFechaTermino(solicitudCertificadoVO.getFechaFinal());
	        request.setRut(new BigDecimal(solicitudCertificadoVO.getRutEmpresa().replaceAll("\\.", "").replaceAll("\\-", "")));
	        
	        try {
				response = gCert.getCertDeudaTotalEmpleador(request);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        System.out.println("*** response : " + response.getInformacionCertificado().length);
	        
	        List<CertificadoVO> listaCertificadoVO = new ArrayList<CertificadoVO>();
	        CertificadoVO certificadoVO = new CertificadoVO();
	
	
	        if (response.getInformacionCertificado() != null)
	        {
	        	for (int i=0; i < response.getInformacionCertificado().length; i++)
	        	{
	        		certificadoVO = new CertificadoVO();
	        		certificadoVO.setIdEjecucion(response.getInformacionCertificado()[i].getIdEjecucion());
	        		certificadoVO.setFechaRegistro(response.getInformacionCertificado()[i].getFechaRegistro());
	        		Date fechaRegistro = certificadoVO.getFechaRegistro().getTime();
	        		certificadoVO.setFechaRegistroString(Common.fechaString(fechaRegistro));
	        		certificadoVO.setOrigen(response.getInformacionCertificado()[i].getOrigen());
	        		certificadoVO.setPeriodoCotizacion(response.getInformacionCertificado()[i].getPeriodoCotizacion());
	        		certificadoVO.setMontoOriginalDeuda(response.getInformacionCertificado()[i].getMontoOriginalDeuda());
	        		certificadoVO.setSaldoNominal(response.getInformacionCertificado()[i].getSaldoNominal());
	        		certificadoVO.setReajuste(response.getInformacionCertificado()[i].getReajuste());
	        		certificadoVO.setIntereses(response.getInformacionCertificado()[i].getIntereses());
	        		certificadoVO.setRecargoAFP(response.getInformacionCertificado()[i].getRecargoAFP());
	        		certificadoVO.setTotalFondo(response.getInformacionCertificado()[i].getTotalFondo());
	        		certificadoVO.setTotalAPagar(response.getInformacionCertificado()[i].getTotalAPagar());
	        		listaCertificadoVO.add(certificadoVO);
	        	}
	        	
	        }
	        modelView.addObject("listaCertificadoVO",listaCertificadoVO);
	        
	    	//modelView.addObject("rutEmpresa", solicitudCertificado.getRutEmpresa());
	        System.out.println("*** listaCertificadoVO : " + listaCertificadoVO.size());
        }else if (solicitudCertificadoVO.getTipoCertificado() == 2)
        {  
	        GetCertDetalleDeudaEmpleadorProxy gCert = new GetCertDetalleDeudaEmpleadorProxy(propertiesFile.getProperty("GetCertDetalleDeudaEmpleador"));        
	        GetCertDetDeudaRequest request = new GetCertDetDeudaRequest();
	        GetCertDetDeudaResponse response = new GetCertDetDeudaResponse();
//	        System.out.println("**replace : " + solicitudCertificadoVO.getRutEmpresa().replaceAll("\\.", "").replaceAll("\\-", ""));
	
	        request.setCodigoUsuario("1");
	        request.setFechaInicio(solicitudCertificadoVO.getFechaInicio());
	        request.setFechaTermino(solicitudCertificadoVO.getFechaFinal());
	        request.setRutEmpresa(new BigDecimal(solicitudCertificadoVO.getRutEmpresa().replaceAll("\\.", "").replaceAll("\\-", "")));
	        
	        try {
				response = gCert.getCertDetalleDeudaEmpleador(request);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        List<CertificadoVO> listaCertificadoVO = new ArrayList<CertificadoVO>();
	        CertificadoVO certificadoVO = new CertificadoVO();
	
	
	        if (response.getInformacionCertificado() != null)
	        {
	        	for (int i=0; i < response.getInformacionCertificado().length; i++)
	        	{	               	
	        		certificadoVO = new CertificadoVO();
	        		certificadoVO.setIdEjecucion(response.getInformacionCertificado()[i].getIdEjecucion());
	        		certificadoVO.setFechaRegistro(response.getInformacionCertificado()[i].getFechaRegistro());
	        		Date fechaRegistro = certificadoVO.getFechaRegistro().getTime();
	        		certificadoVO.setFechaRegistroString(Common.fechaString(fechaRegistro));
	        		certificadoVO.setIdDeuda(response.getInformacionCertificado()[i].getIdDeuda());
	        		certificadoVO.setPeriodoCotizacion(Common.fechaString(fechaRegistro)); // a esta falta mapear lo correcto.
	        		certificadoVO.setOrigenDeuda(response.getInformacionCertificado()[i].getOrigenDeuda());
	        		certificadoVO.setRutString(response.getInformacionCertificado()[i].getRut() + "-" + response.getInformacionCertificado()[i].getDv());
	        		certificadoVO.setNombreCompleto(response.getInformacionCertificado()[i].getApellidoPaterno() + ", " + response.getInformacionCertificado()[i].getPrimerNombre());
	        		certificadoVO.setMontoRentaImponible(response.getInformacionCertificado()[i].getMontoRentaImponible());
	        		certificadoVO.setIdProductoCCICO(response.getInformacionCertificado()[i].getIdPodructoCCICO());
	        		certificadoVO.setIdProductoCCICV(response.getInformacionCertificado()[i].getIdPodructoCCICV());
	        		certificadoVO.setIdProductoCCIDC(response.getInformacionCertificado()[i].getIdPodructoCCIDC());
	        		certificadoVO.setIdProductoCAV(response.getInformacionCertificado()[i].getIdPodructoCAV());
	        		certificadoVO.setIdProductoAPVC(response.getInformacionCertificado()[i].getIdPodructoAPVC());
	        		certificadoVO.setIdProductoCAI(response.getInformacionCertificado()[i].getIdPodructoCAI());
	        		certificadoVO.setIdProductoCCIAV(response.getInformacionCertificado()[i].getIdPodructoCCIAV());
	        		certificadoVO.setCotizacionTrabajoPesado(response.getInformacionCertificado()[i].getCotizacionTrabajoPesado());
	        		certificadoVO.setSeguro(response.getInformacionCertificado()[i].getSeguro());
	        		certificadoVO.setTotal(response.getInformacionCertificado()[i].getTotal());
	        		listaCertificadoVO.add(certificadoVO);
	        	}
	        	
	        }
	        modelView.addObject("listaCertificadoVO",listaCertificadoVO);
	        
	    	//modelView.addObject("rutEmpresa", solicitudCertificado.getRutEmpresa());
	        System.out.println("*** listaCertificadoVO : " + listaCertificadoVO.size());        	

        }else if (solicitudCertificadoVO.getTipoCertificado() == 3)	
        {
	        GetCertMoraPresuntaEmpleadorProxy gCert = new GetCertMoraPresuntaEmpleadorProxy(propertiesFile.getProperty("GetCertMoraPresuntaEmpleador"));        
	        GetCertMoraPresuntaRequest request = new GetCertMoraPresuntaRequest();
	        GetCertMoraPresuntaResponse response = new GetCertMoraPresuntaResponse();
//	        System.out.println("**replace : " + solicitudCertificadoVO.getRutEmpresa().replaceAll("\\.", "").replaceAll("\\-", ""));
	
	        request.setCodigoUsuario("1");
	        request.setFechaInicio(solicitudCertificadoVO.getFechaInicio());
	        request.setFechaTermino(solicitudCertificadoVO.getFechaFinal());
	        request.setRut(new BigDecimal(solicitudCertificadoVO.getRutEmpresa().replaceAll("\\.", "").replaceAll("\\-", "")));
	        
	        try {
				response = gCert.getCertMoraPresuntaEmpleador(request);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        List<CertificadoVO> listaCertificadoVO = new ArrayList<CertificadoVO>();
	        CertificadoVO certificadoVO = new CertificadoVO();
	
	
	        if (response.getInformacionCertificado() != null)
	        {
	        	for (int i=0; i < response.getInformacionCertificado().length; i++)
	        	{	               	
	        		certificadoVO = new CertificadoVO();
	        		certificadoVO.setIdEjecucion(response.getInformacionCertificado()[i].getIdEjecucion());
	        		certificadoVO.setFechaRegistro(response.getInformacionCertificado()[i].getFechaRegistro());
	        		Date fechaRegistro = certificadoVO.getFechaRegistro().getTime();
	        		certificadoVO.setFechaRegistroString(Common.fechaString(fechaRegistro));
	        		Date periodoCotizacion = response.getInformacionCertificado()[i].getPeriodoCotizacion().getTime();
	    	       // System.out.println("*** periodoCotizacion : " + periodoCotizacion); 
	        		certificadoVO.setPeriodoCotizacion(Common.fechaString(periodoCotizacion)); // a esta falta mapear lo correcto.
	        		certificadoVO.setOrigenDeuda(response.getInformacionCertificado()[i].getOrigenMora());
	        		certificadoVO.setRutString(response.getInformacionCertificado()[i].getRutAfiliado() + "-" + response.getInformacionCertificado()[i].getDvAfiliado());
	        		certificadoVO.setNombreCompleto(response.getInformacionCertificado()[i].getApellidoPaterno() + ", " + response.getInformacionCertificado()[i].getPrimerNombre());
	        		certificadoVO.setMontoRentaImponible(response.getInformacionCertificado()[i].getMontoRemuneracionImponible());
	        		certificadoVO.setProducto(response.getInformacionCertificado()[i].getTipoConcepto());
	        		certificadoVO.setMontoMora(response.getInformacionCertificado()[i].getMontoConcepto());
	        		listaCertificadoVO.add(certificadoVO);
	        	}
	        	
	        }
	        modelView.addObject("listaCertificadoVO",listaCertificadoVO);
	        
	    	//modelView.addObject("rutEmpresa", solicitudCertificado.getRutEmpresa());
	        System.out.println("*** listaCertificadoVO : " + listaCertificadoVO.size());          	
        	
        }else if (solicitudCertificadoVO.getTipoCertificado() == 4)	
        {
	        GetCertDicomEmpleadorProxy gCert = new GetCertDicomEmpleadorProxy(propertiesFile.getProperty("GetCertDicomEmpleador"));        
	        GetCertDicomEmpleadorRequest request = new GetCertDicomEmpleadorRequest();
	        GetCertDicomEmpleadorResponse response = new GetCertDicomEmpleadorResponse();
//	        System.out.println("**replace : " + solicitudCertificadoVO.getRutEmpresa().replaceAll("\\.", "").replaceAll("\\-", ""));
	
	        request.setCodigoUsuario("1");
	        request.setFechaInicio(solicitudCertificadoVO.getFechaInicio());
	        request.setFechaTermino(solicitudCertificadoVO.getFechaFinal());
	        request.setRut(new BigDecimal(solicitudCertificadoVO.getRutEmpresa().replaceAll("\\.", "").replaceAll("\\-", "")));
	        
	        try {
				response = gCert.getCertDicomEmpleador(request);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        List<CertificadoVO> listaCertificadoVO = new ArrayList<CertificadoVO>();
	        CertificadoVO certificadoVO = new CertificadoVO();
	
	
	        if (response.getInformacionCertificado() != null)
	        {
	        	for (int i=0; i < response.getInformacionCertificado().length; i++)
	        	{	               	
	        		certificadoVO = new CertificadoVO();
	        		certificadoVO.setIdEjecucion(response.getInformacionCertificado()[i].getIdEjecucion());
	        		certificadoVO.setFechaRegistro(response.getInformacionCertificado()[i].getFechaRegistro());
	        		Date fechaRegistro = certificadoVO.getFechaRegistro().getTime();
	        		certificadoVO.setFechaRegistroString(Common.fechaString(fechaRegistro));
	        		certificadoVO.setOrigen(response.getInformacionCertificado()[i].getOrigen());
	        		certificadoVO.setPeriodoCotizacion(response.getInformacionCertificado()[i].getPeriodoCotizacion());
	        		certificadoVO.setMontoOriginalDeuda(response.getInformacionCertificado()[i].getMontoOriginalDeuda());
	        		certificadoVO.setSaldoNominal(response.getInformacionCertificado()[i].getSaldoNominal());
	        		certificadoVO.setReajuste(response.getInformacionCertificado()[i].getReajuste());
	        		certificadoVO.setIntereses(response.getInformacionCertificado()[i].getIntereses());
	        		certificadoVO.setRecargoAFP(response.getInformacionCertificado()[i].getRecargoAFP());
	        		certificadoVO.setTotalFondo(response.getInformacionCertificado()[i].getTotalFondo());
	        		certificadoVO.setTotalAPagar(response.getInformacionCertificado()[i].getTotalAPagar());
	        		listaCertificadoVO.add(certificadoVO);
	        	}
	        	
	        }
	        modelView.addObject("listaCertificadoVO",listaCertificadoVO);
	        
	    	//modelView.addObject("rutEmpresa", solicitudCertificado.getRutEmpresa());
	        System.out.println("*** listaCertificadoVO : " + listaCertificadoVO.size());          	
        	
        }
        	
        
        return modelView;
	
    }    
	
	
	
	
}

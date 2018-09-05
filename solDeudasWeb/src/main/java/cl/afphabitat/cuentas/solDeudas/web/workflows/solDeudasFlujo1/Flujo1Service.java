package cl.afphabitat.cuentas.solDeudas.web.workflows.solDeudasFlujo1;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import cl.afphabitat.cuentas.solDeudas.bpro.bo.SolDeudasBO;
import cl.afphabitat.cuentas.solDeudas.ejb.SolDeudasLocal;
import cl.afphabitat.cuentas.solDeudas.web.filters.SolDeudasPortalRequestFilter;
import cl.afphabitat.webUtils.webFlows.CommonWebFlowServiceBase;

/**
 * WebFlow Controller del flujo1<p>
 *
 * Registro de Versiones:<ul>
 * <li>29/06/2012 [Proveedor - Analista.]: Detalle</li>
 * </ul><p>
 * 
 * <b>Todos los derechos reservados por AFP Habitat.</b><p>
 *
 */
@Component
public class Flujo1Service extends CommonWebFlowServiceBase {
	
	/** logger aplicativo */
	private static Logger logger = Logger.getLogger(Flujo1Service.class);
	
	/**delegate del negocio */
	 @Autowired private SolDeudasLocal solDeudasDelegate;	
	
	/**
	 * Entrega el Command de CambiaClave<p>
	 *
	 * Registro de Versiones:<ul>
	 * <li>29/06/2012 [Proveedor - Analista.]: Descripcion</li>
	 * </ul><p>
	 * 
	 * @return el objeto
	 *
	 */
    public Flujo1Command getFlujo1Command()  {
    	logger.debug("Inicializando elemento de CambiaClaveCommand");
    	return new Flujo1Command();
    }  	
    
    /**
     * Obtiene la ficha de seguridad<p>
     *
     * Registro de Versiones:<ul>
     * <li>03/07/2012 [Analista - Proveedor]: Version Inicial</li>
     * </ul><p>
     *
     * @param request del http
     * @return el objeto
     */
    public SolDeudasBO getBussines( HttpServletRequest request )  {
    	HttpSession session = request.getSession();
    	return  (SolDeudasBO) session.getAttribute(SolDeudasPortalRequestFilter.FICHA_ID);
    	
    }
    
    
}

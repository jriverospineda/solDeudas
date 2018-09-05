package cl.afphabitat.cuentas.solDeudas.ejb;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import cl.afphabitat.portalPrivado.bpro.PortalPrivadoBusiness;
import cl.afphabitat.portalPrivado.bpro.bo.FichaClienteBO;
import org.apache.log4j.Logger;

import cl.afphabitat.cuentas.solDeudas.bpro.SolDeudasBusiness;

/**
 * Implementacion modelo genérico Ejb <p>
 *
 * Registro de Versiones:<ul>
 * <li>fecha [proveedor-analista] descripcion cambio
 * </ul><p>
 * 
 * <b>Todos los derechos reservados por AFP Habitat.</b><p>
 * 
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class SolDeudasBean implements SolDeudasLocal {
	//TODO: Este definicion de ejb agrupa todo metodo implementado. No generar un ejb por metodo requerido
	/** Logger de traza aplicativa */
	private static Logger logger = Logger.getLogger(SolDeudasBean.class);
	
	/** context del Ejb */
	@Resource
    private SessionContext ctx;

	/** business de de la aplicacion*/
	private SolDeudasBusiness solDeudasBusiness;
    /** business para acitvar ficha cliente */
	private PortalPrivadoBusiness portalPrivadoBusiness;
	
    /**
     * Default constructor. 
     * @throws Exception 
     */
    public SolDeudasBean() throws Exception {
    	logger.debug("Instanciando Ejb ...");
    	solDeudasBusiness = new SolDeudasBusiness();
		portalPrivadoBusiness = new PortalPrivadoBusiness();
	
    }

  public FichaClienteBO getFichaCliente(long rut, String digito) throws Exception {
    	return portalPrivadoBusiness.getFichaCliente(rut, digito);
    }        
/*
*  Version inicial arquetipo proyecto Habitat
*
*/
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public boolean metod( String ficha) throws Exception {
		try { 
			return solDeudasBusiness.metod(ficha);
		} catch ( Exception ex ) {
			try {
	            if ( !ctx.getRollbackOnly() ){
	            	ctx.setRollbackOnly();
	            	}
	            throw ex;
			} catch (Exception oe) {
				throw ex;
			}
        }
	}  
	
	
}

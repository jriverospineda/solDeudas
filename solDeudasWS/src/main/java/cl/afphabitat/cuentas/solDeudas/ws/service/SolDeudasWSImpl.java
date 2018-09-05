
package cl.afphabitat.cuentas.solDeudas.ws.service;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import org.apache.log4j.Logger;
import cl.afphabitat.cuentas.solDeudas.ws.core.dao.impl.ServiceDaoImpl;

/**
 * Implementacion modelo generico Web Service<p>
 *
 * Registro de Versiones:<ul>
 * <li>fecha [proveedor-analista] descripcion cambio
 * </ul><p>
 * 
 * <b>Todos los derechos reservados por AFP Habitat.</b><p>
 *
 */

@WebService (serviceName ="SolDeudas")

@SOAPBinding(
                style=SOAPBinding.Style.DOCUMENT, 
                use=SOAPBinding.Use.LITERAL, 
                parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
public class SolDeudasWSImpl {
    
    private ServiceDaoImpl serviceDaoImpl;
	
    private Logger  logger = Logger.getLogger(SolDeudasWSImpl.class);
    
    /**
    * @return the serviceDao.
    * <b>Todos los derechos reservados por AFP Habitat.</b><p>
    */
    @WebMethod(exclude=true)
        public ServiceDaoImpl getServiceDao() {
                return serviceDaoImpl;
        }

        /**
         * @param serviceDao the serviceDao to set
         */
        @WebMethod(exclude=true)
        public void setServiceDao(ServiceDaoImpl serviceDao) {
  		logger.debug("set");
                this.serviceDaoImpl = serviceDao;
        }

    /**
     * Metodo de ejemplo que permite insertar un item en particular
	 * Metodo del web service
     * @param nombre
     * @param apellidoPaterno
     * @param apellidoMaterno
     * <b>Todos los derechos reservados por AFP Habitat.</b><p>
     */
        @WebMethod
        @WebResult(name = "resultInsert") 
    public boolean insertUser(
                @WebParam(name="id")Integer id, 
                @WebParam(name="nombre")String nombre, 
                        @WebParam(name="apellidoPaterno")String apellidoPaterno, 
                        @WebParam(name="apellidoMaterno")String apellidoMaterno) {
  
        	
        	return true;
   
    }
    
}

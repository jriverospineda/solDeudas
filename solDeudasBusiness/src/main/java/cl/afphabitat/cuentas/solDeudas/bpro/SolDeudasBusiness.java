package cl.afphabitat.cuentas.solDeudas.bpro;


import org.apache.log4j.Logger;

import cl.afphabitat.cuentas.solDeudas.bpro.bo.SolDeudasBO;
import cl.afphabitat.cuentas.solDeudas.bpro.dao.DAOFactory;
import cl.afphabitat.cuentas.solDeudas.bpro.dao.impl.SolDeudasDAO;


/**
 * Capa de negocio de Modelo de dominio<p>
 *
 * Registro de Versiones:<ul>
 * <li>fecha [proveedor-analista] descripcion cambio
 * </ul><p>
 * <b>Todos los derechos reservados por AFP Habitat.</b><p>	 * 
 * 
 * <b>Todos los derechos reservados por AFP Habitat.</b><p>
 *
 */
public class SolDeudasBusiness {

	/** Logger de traza aplicativa */
	private static Logger logger = Logger.getLogger(SolDeudasBusiness.class);

	/** DAO de servicios de capa de datos */
	private SolDeudasDAO solDeudasDao;

	/**
	 * 
	 * Constructor de la Clase.<p>
	 * Disponibiliza recursos de Base de Datos. <p>
	 * Registro de Versiones:<ul>
	 * <li>Fecha [Proveedor - Analista.]: Descripcion</li>
	 * </ul><p>
	 * 
	 * @throws Exception
	 *
	 */
	public SolDeudasBusiness(){
		// Configura DAO según la modalidad que se esté trabajando
		int daoType = DAOFactory.DAO_TYPE_DUMMY;
		solDeudasDao = DAOFactory.getDAOFactory(daoType).getSolDeudasDAO();
		logger.debug("Business creado con DAOType --> " + daoType);
	}

	/**
	 * Metodo del Business
	 *
	 * Registro de Versiones:<ul>
	 * <li>Fecha [Proveedor - analista ltda.]: descripcion</li>
	 * </ul><p>
	 * 
	 * @param param1  Parametros del metodo
	 * @throws Exception
	 *
	 */
	public boolean metod(String param1)  {
		return solDeudasDao.metod(param1);

	}
	
	
	
}

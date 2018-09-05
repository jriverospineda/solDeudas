package cl.afphabitat.cuentas.solDeudas.bpro.dao.impl;

import org.apache.log4j.Logger;

/**
 * DAO en base a Dummies<p>
 *
 * Registro de Versiones:<ul>
 * <li>fecha [proveedor-analista] descripcion cambio
 * </ul><p>
 * <b>Todos los derechos reservados por AFP Habitat.</b><p>	 * 
 *
 */
public class DummySolDeudasDAO implements SolDeudasDAO {

    /** Logger de la clase. */
    private static Logger logger = Logger.getLogger( DummySolDeudasDAO.class );

    public boolean metod(String texto)  {
	    logger.debug(texto);
    	return true;
    }
    
	



}

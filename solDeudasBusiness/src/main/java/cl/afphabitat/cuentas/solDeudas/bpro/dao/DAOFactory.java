package cl.afphabitat.cuentas.solDeudas.bpro.dao;

import cl.afphabitat.cuentas.solDeudas.bpro.dao.impl.SolDeudasDAO;

/**
 * Factory de los DAOs Aplicativos<p>
 *
 * Registro de Versiones:<ul>
 * <li>fecha [Proveedor - analista.]: Descripcion</li>
 * </ul><p>
 * 
 * <b>Todos los derechos reservados por AFP Habitat.</b><p>
 *
 */
public abstract class DAOFactory {
	
	/** Tipo de DAO basado en DUMMY */
	public static final int DAO_TYPE_DUMMY = 0;	


	/**
	 * Constructor de la Clase.<p>
	 *
     *
     * Registro de Versiones:<ul>
     * <li>fecha [proveedor-analista] descripcion cambio
     * </ul><p>
     * <b>Todos los derechos reservados por AFP Habitat.</b><p>	 * 
	 *
	 */
    public DAOFactory() {
    }
    
	/**
	 * Obtiene el DAO de servicios propios de dominio<p>
	 *
	 *
	 * Registro de Versiones:<ul>
	 * <li>fecha [Proveedor - analista.]: Descripcion</li>
	 * </ul><p>
     * 
     * <b>Todos los derechos reservados por AFP Habitat.</b><p>
     *
 	 * 
	 * @return DAO Asociado
	 * @throws Exception
	 *
	 */
	public abstract SolDeudasDAO getSolDeudasDAO() ;


    /**
     * Entrega el DAO Factory segun el tipo de Repositorio<p>
     *
     * Registro de Versiones:<ul>
	 * <li>fecha [Proveedor - analista.]: Descripcion</li>
	 * </ul><p>
     * 
     * @param whichFactory indicador del tipo de DAO
     * @return DAO Factory
     * @throws Exception
     *
     */
    public static DAOFactory getDAOFactory( int whichFactory ) {
  		switch ( whichFactory ) {
			case DAO_TYPE_DUMMY:
			default:
				return new DummyDAOFactory();
				
			
		}
	}
}

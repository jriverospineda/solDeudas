package cl.afphabitat.cuentas.solDeudas.bpro.dao;

import cl.afphabitat.cuentas.solDeudas.bpro.dao.impl.DummySolDeudasDAO;


/**
 * Factory para Dummies<p>
 *
 * Registro de Versiones:<ul>
 * <li>fecha [proveedor-analista] descripcion cambio
 * </ul><p>
 * <b>Todos los derechos reservados por AFP Habitat.</b><p>	 
 *  
 *
 */
public class DummyDAOFactory extends DAOFactory {

	/**
	 * Produce DAO Dummy de Seguridad<p>
	 *
	 * Registro de Versiones:<ul>
     * <li>fecha [proveedor-analista] descripcion cambio
     * </ul><p>
     * 
	 * <b>Todos los derechos reservados por AFP Habitat.</b><p>	 * 
	 	
	 * @return el DAO
	 * @throws Exception
	 *
	 */
	@Override
	public cl.afphabitat.cuentas.solDeudas.bpro.dao.impl.SolDeudasDAO getSolDeudasDAO()
			{
		return new DummySolDeudasDAO();
	}
	

}

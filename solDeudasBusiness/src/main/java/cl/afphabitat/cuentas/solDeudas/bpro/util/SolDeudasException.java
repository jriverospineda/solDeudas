package cl.afphabitat.cuentas.solDeudas.bpro.util;

import cl.afphabitat.commonUtils.BusinessException;

/**
 * Excepciones de Modelo de Seguridad<p>
 *
 * Registro de Versiones:<ul>
 * <li>fecha [proveedor-analista] descripcion cambio
 * </ul><p>
 * <b>Todos los derechos reservados por AFP Habitat.</b><p>	 * 
 *
 */
public class SolDeudasException extends BusinessException {

	/** Serial */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * Constructor de la Clase.<p>
	 *
	 * Registro de Versiones:<ul>
     * <li>fecha [proveedor-analista] descripcion cambio
     * </ul><p>
     * <b>Todos los derechos reservados por AFP Habitat.</b><p>	 * 
	 * 
	 * @param errorCode código del error
	 * @param message mensaje adicional
	 * @param ex original
	 *
	 */
	public SolDeudasException(String codigo, String message, Throwable ex) {
		super(codigo, message, ex);
	}

	/**
	 * 
	 * Constructor de la Clase.<p>
	 *
	 * Registro de Versiones:<ul>
     * <li>fecha [proveedor-analista] descripcion cambio
     * </ul><p>
     * <b>Todos los derechos reservados por AFP Habitat.</b><p>	 * 
	 * 
	 * @param errorCode código del error
	 * @param message mensaje adicional
	 *
	 */
	public SolDeudasException(String codigo, String message) {
		super(codigo, message);
	}

	/**
	 * 
	 * Constructor de la Clase.<p>
	 *
	 * Registro de Versiones:<ul>
     * <li>fecha [proveedor-analista] descripcion cambio
     * </ul><p>
     * <b>Todos los derechos reservados por AFP Habitat.</b><p>	 * 
	 * 
	 * 
	 * @param errorCode código del error
	 * @param ex original
	 *
	 */
	public SolDeudasException(String codigo, Throwable ex) {
		super(codigo, ex);
	}
	
	
	

}

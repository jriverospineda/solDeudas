package cl.afphabitat.cuentas.solDeudas.bpro.bo;


/**
 * Objeto de negocios Base del proyecto <p>
 *
 * Registro de Versiones:<ul>
 * <li>fecha [Proveedor - analista.]: Descripcion</li>
 * </ul><p>
 * 
 * <b>Todos los derechos reservados por AFP Habitat.</b><p>
 *
 */
public class SolDeudasBO implements java.io.Serializable {

	/** Serial del bean */
	private static final long serialVersionUID = 1L;
	
	
	//TODO: Arquetipo Agregar metodos aca
	/**
	 * metodo ejemplo implementado en Arquetipo	 
	 * Registro de Versiones: (todo cambio debe quedar registrado en esta zona<ul>
	 * <li>Fecha [Analista-Proveedor]: Versión Inicial</li>
	 * </ul><p>
	 * 
	 * @param respuesta a validar
	 * @return indicador true/false
	 *
	 */
	public boolean metod(String texto) {

		// casos inconsistentes
		if ( texto != null ) {
			return (boolean) false;
			}
		return true;
	}


	}
	
package cl.afphabitat.cuentas.solDeudas.web.workflows.solDeudasFlujo1;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import cl.afphabitat.commonUtils.tools.DataUtils;

/**
 * Validador<p>
 *
 * Registro de Versiones:<ul>
 * <li>20/08/2012 [Analista - Proveedor]: Versión Inicial</li>
 * </ul><p>
 * 
 * <b>Todos los derechos reservados por AFP Habitat.</b><p>
 *
 */
@Component
public class Flujo1Validator {

	/**
	 * Valida el paso 1<p>
	 * IMPORTANTE: DEBE LLAMARSE IGUAL AL VIEW-STATE QUE ESTA VALIDANDO, CON PREFIJO VALIDATE<p>
	 *
	 * Registro de Versiones:<ul>
	 * <li>Fecha [Proveedor - Analista.]: Descripcion</li>
	 * </ul><p>
	 * 
	 * @param command form
	 * @param errors generados
	 * @throws Exception
	 *
	 */
    public void validateStep1View( final Flujo1Command command, final Errors errors ) throws Exception {

    	// detecta tipo de validación y, en base a eso, evalua
    	
   
    	
    }
    
}

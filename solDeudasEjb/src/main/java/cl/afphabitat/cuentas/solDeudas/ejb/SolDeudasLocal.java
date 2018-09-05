package cl.afphabitat.cuentas.solDeudas.ejb;

import javax.ejb.Local;
import cl.afphabitat.portalPrivado.bpro.bo.FichaClienteBO;

/**
 * Interfaz Remota Ejb de acceso servicios de Modelo de Seguridad<p>
 * debe contener todos lo metodos del Bean
 *
 * Registro de Versiones:<ul>
 * -- fecha - Programador- detalle 
 * <b>Todos los derechos reservados por AFP Habitat.</b><p>
 *
 */
@Local
public interface SolDeudasLocal {
	// metodo para contener ducha cliente
	 FichaClienteBO getFichaCliente(long rut, String digito) throws Exception;
	 boolean metod(String ficha) throws Exception;
	

}

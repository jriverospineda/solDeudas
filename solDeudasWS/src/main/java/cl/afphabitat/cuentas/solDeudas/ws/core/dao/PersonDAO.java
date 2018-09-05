package cl.afphabitat.cuentas.solDeudas.ws.core.dao;

import java.util.List;

import cl.afphabitat.cuentas.solDeudas.ws.core.model.Person;
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
public interface PersonDAO {


	public List<Person> selectAllPersons();	
	public Person getPersonById(int i);

}

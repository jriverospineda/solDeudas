package cl.afphabitat.cuentas.solDeudas.ws.core.dao;

import java.util.List;

import cl.afphabitat.cuentas.solDeudas.ws.core.model.Person;
import cl.afphabitat.cuentas.solDeudas.ws.core.model.Rol;
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
public interface ServiceDao {


        List<Person> selectAllPersons(); 
        Person getPersonById(int i);
        int deletePersonById(int i);
        int deleteMultiplePersonsById(int i, int j);
        void insertNewPerson(Person p);
        int updatePersonById(Person p);
        
        

}
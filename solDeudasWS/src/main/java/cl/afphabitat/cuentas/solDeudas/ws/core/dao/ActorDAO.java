package cl.afphabitat.cuentas.solDeudas.ws.core.dao;

import java.util.List;

import cl.afphabitat.cuentas.solDeudas.ws.core.model.Actor;
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
public interface ActorDAO {


	public List<Actor> selectAllActors();	
	public Actor getActorById(int i);

}

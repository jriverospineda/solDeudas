package cl.afphabitat.cuentas.solDeudas.ws.core.model;

import java.util.Date;
import java.util.Map;


/**
 *  Version inicial arquetipo proyecto Habitat
 * Immutable Actor class.
 * Only getters are provided, not setters.
 */
public class Actor {
  private Integer id;
  private String firstName;
  private String lastName;
  private Date lastUpdate;
  
  public Actor() {
	  
  }

  public Actor(Integer id, String firstName, String lastName, Date lastUpdate) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.lastUpdate = (Date)lastUpdate.clone();

    // do not edit this line

  }

  public Actor(Integer id, String firstName, String lastName) {
    this(id, firstName, lastName, new Date());
  }

  public Actor(Map<String,Object> argsMap) {
    this.id = (Integer) argsMap.get("id");
    this.firstName = (String) argsMap.get("firstName");
    this.lastName = (String) argsMap.get("lastName");
    this.lastUpdate = (Date)argsMap.get("lastUpdate");

    // do not edit this line
   
  }



  @Override
  public String toString() {
    return String.format("[Actor: id = %d; firstName = %s; lastName = %s]", id, firstName, lastName);
  }


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getLastUpdate() {
		return (Date)lastUpdate.clone();
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = (Date) lastUpdate.clone();
	}
  
}
package cl.afphabitat.cuentas.solDeudas.ws.core.model;


/*
*  Version inicial arquetipo proyecto Habitat
*
*/
public class Person {
  private Integer id;
  private String firstName;
  private String lastName;
  private Integer rolId;
  private String rut;
  private String roleName;
  


public Person() {
          
  }

  public Person(Integer id, String firstName, String lastName, String rut) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.rut = rut;


  }

  @Override
  public String toString() {
    return String.format("[Person: id = %d; firstName = %s; lastName = %s]", id, firstName, lastName);
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

        public Integer getRolId() {
                return rolId;
        }

        public void setRolId(Integer rolId) {
                this.rolId = rolId;
        }

        public String getRut() {
                return rut;
        }

        public void setRut(String rut) {
                this.rut = rut;
        }
        
    public String getRoleName() {
                return roleName;
        }

        public void setRoleName(String roleName) {
                this.roleName = roleName;
        }


  
  
  
}
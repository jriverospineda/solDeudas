package cl.afphabitat.cuentas.solDeudas.ws.core.model;

/*
*  Version inicial arquetipo proyecto Habitat
*
*/
public class Rol {
        
        private Integer rolId;
        private String rolName;
        
        public Rol(Integer rolId, String rolname) {
                this.rolId =rolId;
                this.rolName =rolname;
        }
        
        public Integer getRolId() {
                return rolId;
        }
        public void setRolId(Integer rolId) {
                this.rolId = rolId;
        }
        public String getRolName() {
                return rolName;
        }
        public void setRolName(String rolName) {
                this.rolName = rolName;
        }
        
        

}
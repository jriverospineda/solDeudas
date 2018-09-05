package cl.afphabitat.cuentas.solDeudas.ws.core.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import cl.afphabitat.cuentas.solDeudas.ws.core.dao.ServiceDao;
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
public class ServiceDaoImpl implements ServiceDao {
        private static Logger log = Logger.getLogger(ServiceDaoImpl.class.getName());
        public static final int FAIL = 3;
		public static final int SUCCESS = 1;
		public static final int NUMBERTREE= 3;
		public static final String STATEDELETE="cl.afphabitat.mybatis.mapper.person.deletePersonById";
		 		
		private SqlSession sqlSession;

        public SqlSession getSqlSession() {
                log.debug("message");
                return sqlSession;
        }
        
        public void setSqlSession(SqlSession sqlSession) {
                this.sqlSession = sqlSession;
        }

        /**
         * Obtiene una lista con todas las personas
         */
        public List<Person> selectAllPersons() {
                try{
                return this.getSqlSession().selectList("cl.afphabitat.mybatis.mapper.person.selectAllPersons");
                } catch (Exception e){
                        log.debug(e);
                        return null;
                }       
        }
        
        /**
         * Obtiene una lista con todas las personas en un rol determinado
         */
        public List<Person> selectAllPersons(int i) {
                try{
                return this.getSqlSession().selectList("cl.afphabitat.mybatis.mapper.person.selectAllPersonsByRol",i);
                } catch (Exception e){
                        log.debug(e);
                        return null;
                }       
        }
        
        /**
         * Obtener una persona por ID
         */
        @Transactional
        public Person getPersonById(int i){
                
                try{
                        return this.getSqlSession().selectOne("cl.afphabitat.mybatis.mapper.person.getPersonById",i);
        
                } catch (Exception e){
                        log.debug(e);
                        return null;
                }
        }
        
        @Transactional
        public void insertNewPerson(Person a){
                try{
                        int success = this.getSqlSession().insert("cl.afphabitat.mybatis.mapper.person.insertNewPerson",a);
                                
                                if (success==SUCCESS){
                                    Person b = getPersonById(a.getId());
                                        log.debug("@@@ New person id, "+b.getId()+" name, "+b.getFirstName()+" last name, "+b.getLastName()+" has been created.  @@@");
                                
                                } else {
                                        log.debug("@@@ New person creation, has been failed.  @@@");
                                        
                                }
                
                    } catch (Exception e){
                                log.debug(e);
                        }
                
        }
        
        
        

        @Transactional
        public int deletePersonById(int i){
                int r = FAIL;
                Person act = new Person(i,"", "",null);
                r =     this.getSqlSession().delete(STATEDELETE,act);
                return r;       
        }
        
        /**
         * Actulizar dos datos de un miembro
         */
        
        @Transactional
        public int updatePersonById(Person a){
                int r = FAIL;
                try{
                        
                r =     this.getSqlSession().update("cl.afphabitat.mybatis.mapper.person.updatePersonById",a);  
                } catch (Exception e){
                        log.debug(e);
                }
                return r;       
        }
        
        /*
         * Borra multiples usuarios.
         * @see cl.afphabitat.ws.core.dao.PersonDAO#deleteMultiplePersonsById(int, int)
         */
        
        @Transactional
        public int deleteMultiplePersonsById(int a,int b){
                int r = 2;
                int q = 2;
                Person firstPerson = new Person(a,"", "",null);
                Person secondPerson = new Person(b,"", "",null);
                r =     this.getSqlSession().delete(STATEDELETE,firstPerson);
                q =     this.getSqlSession().delete(STATEDELETE,secondPerson);
                
                if (r==SUCCESS&& q==SUCCESS){
                return SUCCESS;
                } else {
                        throw new IllegalAccessError();
                }
                
        }
        
        
        /**
         * Obtiene una lista con todas las personas
         */
        public List<Person> selectFromTwoTables() {
                try{
                return this.getSqlSession().selectList("cl.afphabitat.mybatis.mapper.person.selectAllPersons");
                } catch (Exception e){
                        log.debug(e);
                        return null;
                }       
        }
        
        
}
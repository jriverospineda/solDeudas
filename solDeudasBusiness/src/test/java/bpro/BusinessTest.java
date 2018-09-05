package bpro;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import cl.afphabitat.cuentas.solDeudas.bpro.SolDeudasBusiness;

/**
 * JUnit de las clases de negocio<p>
 *
 * Registro de Versiones:<ul>
 * <li>fecha [proveedor-analista] descripcion cambio
 * </ul><p>
 * <b>Todos los derechos reservados por AFP Habitat.</b><p>	  
 *
 */
public class BusinessTest extends TestCase
{
    /**
     * 
     * Constructor de la Clase.<p>
     *
	 * Registro de Versiones:<ul>
     * <li>fecha [proveedor-analista] descripcion cambio
     * </ul><p> 
	 * @param testName nombre
     *
     */
    public BusinessTest( String testName ) {
        super( testName );
    }

    /**
     * Tester<p>
     *
     * Registro de Versiones:<ul>
     * <li>Fecha [Analista - proveedor.]: Versión Inicial</li>
     * </ul><p>
     * 
     * @return el Tester
     *
     */
    public static Test suite()  {
        return new TestSuite( BusinessTest.class );
    }

    /**
     * Inicializa<p>
     *
     * Registro de Versiones:<ul>
     * <li>Fecha [Analista - Proveedor.]: Versión Inicial</li>
     * </ul><p>
     * 
     * @throws Exception
     *
     */
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     * Finaliza<p>
     *
     * Registro de Versiones:<ul>
     * <li>Fecha [Analista- Proveedor.]: Versión Inicial</li>
     * </ul><p>
     * 
     * @throws Exception
     *
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }    
    
    /**
     * Tester de "Nada" :)<p>
     *
     * Registro de Versiones:<ul>
     * <li>Fecha [Analista - Proveedor.]: Versión Inicial</li>
     * </ul><p>
     * 
     *
     */
    public void testNothing() {
    	// Nada que probar en realidad, por ahora
    	assertTrue("Test Ejemplo", true);
    	}
    
    /**
     * Tester de "Nada" :)<p>
     *
     * Registro de Versiones:<ul>
     * <li>Fecha [Analista - Proveedor.]: Versión Inicial</li>
     * </ul><p>
     * 
     *
     */
    public void testmetod() {
    /** business de de la aplicacion*/
	final SolDeudasBusiness solDeudasBusiness= new SolDeudasBusiness();
    	String ficha ="test";
    	boolean resultTest = true;
    	resultTest = solDeudasBusiness.metod(ficha);
    	
    	// Nada que probar en realidad, por ahora
    	assertTrue(resultTest);
    	
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import metaData.MetaDataGraph;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paloschi
 */
public class MetaDataGraphFactoryTest {
    
    public MetaDataGraphFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of build method, of class MetaDataGraphFactory.
     */
    @Test
    public void testBuild() {
        System.out.println("build");
        int type_metaData = MetaDataGraphFactory.MD_XML;
        MetaDataGraphFactory instance = new MetaDataGraphFactory();

        MetaDataGraph result = instance.build(type_metaData);
        
        
        assertFalse("Data retornada não pode ser nula", result==null);
        // TODO review the generated test code and remove the default call to fail.
  
    }
    
    
    @Test(expected = UnsupportedOperationException.class)
    public void testBuild2() {
        System.out.println("build2");
        int type_metaData = 15;
        MetaDataGraphFactory instance = new MetaDataGraphFactory();

        MetaDataGraph result = instance.build(type_metaData);
        
        assertTrue("Data retornada deve ser nula", result==null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
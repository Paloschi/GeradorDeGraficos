/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.io.FileNotFoundException;
import javafx.stage.Stage;
import metaData.MetaDataGraph;
import metaData.MetaDataXLS;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jean
 */
public class GraficoBarrasJFXTest {
    
    public GraficoBarrasJFXTest() {
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
     * Test of generateGraph method, of class GraficoBarrasJFX.
     */

    /**
     * Test of generateGraph method, of class GraficoBarrasJFX.
     */
  @Test
    public void testGenerateGraph() throws FileNotFoundException {
        MetaDataXLS md = new  MetaDataXLS();
        md.generateData("c://test//teste.xls");
        GraficoBarrasJFX gp = new GraficoBarrasJFX();
        gp.generateGraph(md);
       
    }

    /**
     * Test of start method, of class GraficoBarrasJFX.
     */
    @Test
    public void testStart() throws Exception {
        System.out.println("start");
        Stage stage = null;
        GraficoBarrasJFX instance = new GraficoBarrasJFX();
        instance.start(stage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
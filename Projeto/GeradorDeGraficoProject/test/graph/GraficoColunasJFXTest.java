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
public class GraficoColunasJFXTest {
    
    public GraficoColunasJFXTest() {
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
     * Test of generateGraph method, of class GraficoColunasJFX.
     */
   @Test
    public void testGenerateGraph() throws FileNotFoundException {
        MetaDataXLS md = new  MetaDataXLS();
        md.generateData("c://test//teste.xls");
        GraficoColunasJFX gp = new GraficoColunasJFX();
        gp.generateGraph(md);
       
    }

    /**
     * Test of generateGraph method, of class GraficoColunasJFX.
     */
  
   
}
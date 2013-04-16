/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Group;
import javafx.stage.Stage;
import metaData.MetaDataGraph;
import metaData.MetaDataXML;
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
public class GraficoSpiderJFXTest {
    
    public GraficoSpiderJFXTest() {
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
     * Test of generateGraph method, of class GraficoSpiderJFX.
     */
    @Test
    public void testGenerateGraph() {
        try {
            System.out.println("generateGraph");
            String path = "C:\\1 - UTFPR\\6 periodo\\frameWork\\GeradorDeGraficos\\Projeto\\GeradorDeGraficoProject\\src\\aquivosTeste\\data.xml";
            MetaDataXML data = new MetaDataXML();
            
            data.generateData(path);
                
            GraficoSpiderJFX instance = new GraficoSpiderJFX();
            
            instance.generateGraph(data);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GraficoSpiderJFXTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
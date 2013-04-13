/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaData;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import metaData.util.Data;
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
public class MetaDataXMLTest {

    public MetaDataXMLTest() {
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
     * Test of generateData method, of class MetaDataXML.
     */
    @Test
    public void testGenerateData() throws Exception {
        System.out.println("generateData");
        String path = "C:\\1 - UTFPR\\6 periodo\\frameWork\\GeradorDeGraficos\\Projeto\\GeradorDeGraficoProject\\src\\aquivosTeste\\data.xml";
        MetaDataXML instance = new MetaDataXML();
        instance.generateData(path);

        //fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class MetaDataXML.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        String path = "C:\\1 - UTFPR\\6 periodo\\frameWork\\GeradorDeGraficos\\Projeto\\GeradorDeGraficoProject\\src\\aquivosTeste\\data.xml";
        MetaDataXML instance = new MetaDataXML();
        try {
            instance.generateData(path);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MetaDataXMLTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        Data result = instance.getData();


        // TODO review the generated test code and remove the default call to fail.


        if (result == null) {
            fail("data nula");
        }
        if (result.getTitulo() == null || result.getTitulo().length() == 0) {
            fail("Titulo do grafico nulo ou em branco");
        }


    }
}
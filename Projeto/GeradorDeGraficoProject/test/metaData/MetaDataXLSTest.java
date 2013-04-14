/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaData;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import metaData.util.Atributo;
import metaData.util.Data;
import metaData.util.Elemento;
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
public class MetaDataXLSTest {
    
    public MetaDataXLSTest() {
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
     * Test of getData method, of class MetaDataXLS.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        String path = "c://test//teste.xls";
        MetaDataXLS instance = new MetaDataXLS();
        try {
            instance.generateData(path);
            
            Data data = instance.getData();
            
            for(Elemento e : data.getElemento()){
                System.out.println("Nome :" + e.getNome());
                System.out.println("Numero de atributos" + e.getAtributo().size());
                for(Atributo a : e.getAtributo()){
                    System.out.print("Atributo - nome: " + a.getNome());
                    System.out.println(" valor: " + a.getValor().toString());
                }
            }
            
            // TODO review the generated test code and remove the default call to fail.
        } catch (FileNotFoundException ex) {
            fail();
            Logger.getLogger(MetaDataXLSTest.class.getName()).log(Level.SEVERE, null, ex);
        }  
   
    }

    /**
     * Test of generateData method, of class MetaDataXLS.
     */
    @Test
    public void testGenerateData() throws FileNotFoundException, FileNotFoundException {
        System.out.println("generateData");
        String path = "c://test//teste.xls";
        MetaDataXLS instance = new MetaDataXLS();
        try {
            instance.generateData(path);
            // TODO review the generated test code and remove the default call to fail.
        } catch (FileNotFoundException ex) {
            fail();
            Logger.getLogger(MetaDataXLSTest.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    

}
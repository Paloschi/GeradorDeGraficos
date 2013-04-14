/**
 * *********************************************************************
 * Module: MetaDataXML.java Author: Paloschi Purpose: Defines the Class
 * MetaDataXML
 **********************************************************************
 */
package metaData;

import static org.apache.commons.digester3.binder.DigesterLoader.newLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import metaData.util.Data;
import org.apache.commons.digester3.Digester;
import org.apache.commons.digester3.xmlrules.FromXmlRulesModule;
import org.xml.sax.SAXException;


public class MetaDataXML extends AbstractMetaDataGraph {

    /**
     * String -> titulo do elemento Double -> valor do elemento
     */
    private Data dados;
    
    @Override
    public void generateData(String path)  throws FileNotFoundException  {
        try { 
        final String rulesfileName = "./src/metaData/util/xmlrules.xml";
        String datafileName = path;

        Digester d = newLoader(new FromXmlRulesModule() {
            @Override
            protected void loadRules() {
                loadXMLRules(new File(rulesfileName));
            }
        }).newDigester();


        Data data = new Data();
        
        d.push(data);

        // Process the input file.

            File srcfile = new java.io.File(datafileName);
              
            d.parse(srcfile);
            
        this.dados = data;
        Logger.getGlobal().setLevel(Level.ALL);
        
        Logger.getLogger(MetaDataXML.class.getName()).log(Level.INFO, "Data Gerada: Arquivo - " + srcfile.getName()  );
        
        } catch (IOException | SAXException ex) {
            Logger.getLogger(MetaDataXML.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
       
    }
  
        
    @Override
    public Data getData() {
        return dados;
    }
    
//    @Test
//    public void teste() throws FileNotFoundException{
//        MetaDataGraph metadata = new MetaDataXML();
//        
//        metadata.generateData("C:\\1 - UTFPR\\6 periodo\\frameWork\\GeradorDeGraficos\\Projeto\\GeradorDeGraficoProject\\src\\aquivosTeste\\data.xml");
//
//    }
    

            
}
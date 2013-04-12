/**
 * *********************************************************************
 * Module: MetaDataXML.java Author: Paloschi Purpose: Defines the Class
 * MetaDataXML
 **********************************************************************
 */
package metaData;

import static org.apache.commons.digester3.binder.DigesterLoader.newLoader;
import java.io.File;
import java.io.IOException;
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
    public void generateData(String path) {
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
        try {
            File srcfile = new java.io.File(datafileName);
            d.parse(srcfile);
        } catch (IOException ioe) {
            System.out.println("Error reading input file:" + ioe.getMessage());
            System.exit(-1);
        } catch (SAXException se) {
            System.out.println("Error parsing input file:" + se.getMessage());
            System.exit(-1);
        }
       
    }
    
    
    public static void main(String[] args){
        MetaDataGraph metadata = new MetaDataXML();
        
        metadata.generateData("C:\\1 - UTFPR\\6 periodo\\frameWork\\GeradorDeGraficos\\Projeto\\GeradorDeGraficoProject\\src\\aquivosTeste\\data.xml");

    }
    
    
    @Override
    public Data getData() {
        return dados;
    }
            
}
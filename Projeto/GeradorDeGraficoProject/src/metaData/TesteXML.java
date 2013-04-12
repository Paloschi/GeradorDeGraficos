/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaData;


/**
 *
 * @author Paloschi
 */
public class TesteXML {
    public static void main(String[] args){
        System.out.println("Init App ");
        
       MetaDataGraph metadata = new MetaDataXML();
        
        metadata.generateData("C:\\1 - UTFPR\\6 periodo\\frameWork\\GeradorDeGraficos\\Projeto\\GeradorDeGraficoProject\\src\\aquivosTeste\\Grafico.xml");
        

    }
}

/***********************************************************************
 * Module:  GraficoPizzaJFX.java
 * Author:  Paloschi
 * Purpose: Defines the Class GraficoPizzaJFX
 ***********************************************************************/

package graph;

import java.util.*;
import javafx.stage.Stage;
import javax.lang.model.element.Element;
import metaData.MetaDataGraph;
import metaData.util.Atributo;
import metaData.util.Elemento;


/** @pdOid a6ce4d2c-7a42-4bf3-bbdc-a532faa1a695 */
public class GraficoPizzaJFX extends AbstractGraphJFX {
   /** @pdOid 23140441-0f59-4ee1-8a85-ab8f62b7ae0b */


    @Override
    public void generateGraph(MetaDataGraph data) {
        
        Elemento e = (Elemento) data.getData().getElemento().toArray()[0];
        
        for (Atributo a : e.getAtributo()){
            a.getNome();
            a.getValor();
        }
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    


}
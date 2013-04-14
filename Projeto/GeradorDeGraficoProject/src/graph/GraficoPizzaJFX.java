/***********************************************************************
 * Module:  GraficoPizzaJFX.java
 * Author:  Paloschi
 * Purpose: Defines the Class GraficoPizzaJFX
 ***********************************************************************/

package graph;

import java.util.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;
import javax.lang.model.element.Element;
import metaData.MetaDataGraph;
import metaData.util.Atributo;
import metaData.util.Data;
import metaData.util.Elemento;


/** @pdOid a6ce4d2c-7a42-4bf3-bbdc-a532faa1a695 */
public class GraficoPizzaJFX extends AbstractGraphJFX {
   /** @pdOid 23140441-0f59-4ee1-8a85-ab8f62b7ae0b */


    private static MetaDataGraph data;
    private ObservableList<PieChart.Data> lista;

    @Override

    public void generateGraph(MetaDataGraph data) {
        
        
         
        this.data = data;
         System.out.println(this.data);  
        String[] a = {""};
        System.out.println(data.getData().elemento);
        launch(a);
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        Scene scene = new Scene(new Group());
        stage.setWidth(500);
        stage.setHeight(500);  
        System.out.println(data);
        Elemento e =  data.getData().getElemento().iterator().next() ;
        stage.setTitle("Gerador de graficos");
        //System.out.println("asdasdasd");
        
        System.out.println(e.getNome());
         lista = FXCollections.observableArrayList();
                
        for (Atributo a : e.getAtributo()){
            System.out.println(a.getNome()); 
            a.getValor();
            lista.add(new PieChart.Data(a.getNome(), a.getValor()));
        }
        
        final PieChart chart = new PieChart(lista);
        chart.setTitle(e.getNome());
        
        ((Group) scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();
    }
    
    


}
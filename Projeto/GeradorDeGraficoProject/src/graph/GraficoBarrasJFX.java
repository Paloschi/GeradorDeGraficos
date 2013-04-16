/***********************************************************************
 * Module:  GraficoBarrasJFX.java
 * Author:  Paloschi
 * Purpose: Defines the Class GraficoBarrasJFX
 ***********************************************************************/

package graph;

import java.util.*;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import metaData.MetaDataGraph;
import metaData.util.Atributo;
import metaData.util.Elemento;

/** @pdOid 6e4d5cd0-8334-4701-acab-d87f6aab3408 */
public class GraficoBarrasJFX extends AbstractGraphJFX {
   /** @pdOid ad38c5e5-a1f2-45d9-be64-62debf403f2d */
    
     private static MetaDataGraph data;
    private ObservableList<BarChart.Data> lista;
   public void generateGraph() {
      // TODO: implement
   }

    @Override
    public void generateGraph(MetaDataGraph data) {
          this.data = data;
         //System.out.println(this.data);  
        String[] a = {""};
        System.out.println(this.data.getData().elemento);
        launch(a);
    }

    @Override
    public void start(Stage stage) throws Exception {
         stage.setTitle("Bar Chart Sample");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = 
            new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("Gerador de Graficos");
        xAxis.setLabel("Tipo");       
        yAxis.setLabel("Pontuação");
        //lista = FXCollections.observableArrayList();
        for(Elemento e : data.getData().getElemento()){
            XYChart.Series series = new XYChart.Series();  
            series.setName(e.getNome());    
         for (Atributo a : e.getAtributo()){
          
               
            series.getData().add(new XYChart.Data(a.getNome(),a.getValor())); 
             System.out.println(a.getNome());
           // System.out.println(a.getNome()); 
          //  a.getValor();
          //  lista.add(new BarChart.Data(a.getNome(), a.getValor()));
        }
         bc.getData().add(series);
        }
         
         Scene scene  = new Scene(bc,800,600);
    
        stage.setScene(scene);
        stage.show();
        
        
    }

}
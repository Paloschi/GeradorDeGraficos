/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import static javafx.application.Application.launch;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import metaData.MetaDataGraph;
import metaData.util.Atributo;
import metaData.util.Elemento;

/**
 *
 * @author Jean
 */
public class GraficoRankingJFX extends AbstractGraphJFX{

     private static MetaDataGraph data;
    private ObservableList<LineChart.Data> lista;
   public void generateGraph() {
       
   }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Line Chart Sample");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
         xAxis.setLabel("Tipo");
        final LineChart<String,Number> lineChart = 
                new LineChart<String,Number>(xAxis,yAxis);
       
        lineChart.setTitle("Stock Monitoring, 2010");
        
        for(Elemento e : data.getData().getElemento()){
            XYChart.Series series = new XYChart.Series();  
            series.setName(e.getNome());    
         for (Atributo a : e.getAtributo()){
          
               
            series.getData().add(new XYChart.Data(a.getNome(),a.getValor())); 
             System.out.println(a.getNome());
           System.out.println(a.getNome()); 
         
        }
         lineChart.getData().add(series);
        }
         
         Scene scene  = new Scene(lineChart,800,600);
    
        stage.setScene(scene);
        stage.show();
        
        
    
    }

    @Override
    public void generateGraph(MetaDataGraph data) {
       this.data = data;
        System.out.println(this.data);  
        String[] a = {""};
        System.out.println(data.getData().elemento);
        launch(a);
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import static javafx.application.Application.launch;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
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
public class GraficoColunasJFX extends AbstractGraphJFX{
    
      private static MetaDataGraph data;
    private ObservableList<BarChart.Data> lista;

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Bar Chart Sample");
        final NumberAxis xAxis = new NumberAxis();
        final CategoryAxis yAxis = new CategoryAxis();
        final BarChart<Number,String> bc = 
            new BarChart<Number,String>(xAxis,yAxis);
        bc.setTitle("Gerador de Graficos");
        xAxis.setLabel("Valor");  
        xAxis.setTickLabelRotation(90);
        yAxis.setLabel("Tipo");   
        //lista = FXCollections.observableArrayList();
        for(Elemento e : data.getData().getElemento()){
            XYChart.Series series = new XYChart.Series();  
            series.setName(e.getNome());    
         for (Atributo a : e.getAtributo()){
                         
            series.getData().add(new XYChart.Data(a.getValor(),a.getNome())); 
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

    @Override
    public void generateGraph(MetaDataGraph data) {
        this.data = data;
        System.out.println(this.data);  
        String[] a = {""};
        System.out.println(data.getData().elemento);
        launch(a);
    }
    
}

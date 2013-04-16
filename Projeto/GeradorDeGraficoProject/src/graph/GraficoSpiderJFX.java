/**
 * *********************************************************************
 * Module: GraficoSpiderJFX.java Author: Paloschi Purpose: Defines the Class
 * GraficoSpiderJFX
 * *********************************************************************
 */
package graph;

import graph.spiderUtil.Position;
import graph.spiderUtil.SpiderUtilHendler;
import java.util.ArrayList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import metaData.MetaDataGraph;
import metaData.util.Atributo;
import metaData.util.Elemento;

public class GraficoSpiderJFX extends AbstractGraphJFX {

    private static final double x0 = 200.0;
    private static final double y0 = 200.0;
    private static double maior_atributo;
    private static MetaDataGraph data;
    SpiderUtilHendler util = new SpiderUtilHendler();
    private ArrayList<Line> linhas = new ArrayList<Line>();

    @Override
    public void generateGraph(MetaDataGraph data) {
        
        
 
        
        
        this.data = data;
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

               System.out.println("----------------------------------------------------------");
        for (Elemento e : data.getData().getElemento()) {
            System.out.println(e.getNome());
            
            for(Atributo a : e.getAtributo()){
                System.out.println(a.getNome());
            }
        }
        
        final Group rootGroup = new Group();
        final Scene scene = new Scene(rootGroup, 800, 400);

        maior_atributo = util.encontrar_maior_atributo(data.getData());
        gerar_linhas(data.getData().getElemento().iterator().next().getAtributo().size(), rootGroup);

        gerar_poligonos(rootGroup);

        stage.setScene(scene);
        stage.show();

    }

    public void gerar_linhas(int tolal_linhas, Group rootGroup) {
        for (int i = 1; i <= tolal_linhas; i++) {
            double angulo = util.calcular_angulo(i, tolal_linhas);
            Position p = util.getPosition(angulo, x0, y0);
            Line linha = new Line(x0, y0, p.x, p.y);
            rootGroup.getChildren().add(linha);
            
            Label l = new Label(data.getData().getElemento().iterator().next().getAtributo().iterator().next().getNome());
            
            l.setLayoutX(p.x + 15);
           l.setLayoutY( p.y + 5);
            rootGroup.getChildren().add(l);
            linhas.add(linha);
        }
    }

    public void gerar_poligonos(Group rootGroup) {

        for (Elemento e : data.getData().getElemento()) {
            Polygon p = gerar_poligono(e);
            rootGroup.getChildren().add(p);
        }

    }
    private static int num_cor = 20;

    public Polygon gerar_poligono(Elemento e) {

        Polygon polygon = new Polygon();

        polygon.setOpacity(0.43);

        polygon.setFill(Paint.valueOf("#ff66af"));

        num_cor += 20;

        int index = 0;
        for (Atributo a : e.getAtributo()) {
            
            Position position = encontrar_atributo_position(index, a.getValor());
            polygon.getPoints().add(position.x);
            polygon.getPoints().add(position.y);
            index++;
        }

        return polygon;

    }

    public Position encontrar_atributo_position(int index, double valor) {

        Position p = new Position();


//        System.out.println("Index :" + index);
//        System.out.println("Valor :" + valor);
//        System.out.println("Maior Atributo :" + maior_atributo);

        switch (util.getQuadrantePoligonos(util.calcular_angulo(index, linhas.size()))) {
            case 1:
                System.out.println("---------------------------");
                System.out.println("2");
                System.out.println("---------------------------");
                
                
                
                double varianciaX = linhas.get(index).getStartX() - linhas.get(index).getEndX();
                
                double varianciaY = linhas.get(index).getStartY() - linhas.get(index).getEndY();
                
                System.out.println("maior_atributo :" + maior_atributo);
                System.out.println("valor: " + valor);
                System.out.println("variancia x :" + varianciaX);    
                
                System.out.println("variancia y :" + varianciaY);   
                
                p.x = x0 -  (varianciaX * valor / maior_atributo );       
                p.y = y0 - (varianciaY * valor / maior_atributo );
                
                System.out.println("---------------------------");
                System.out.println(p.x +"-"+ p.y);
                
 
                break;
                

            case 2:
                System.out.println("---------------------------");
                System.out.println("2");
                System.out.println("---------------------------");
                
                
                
                 varianciaX = linhas.get(index).getStartX() - linhas.get(index).getEndX();
                
                 varianciaY = linhas.get(index).getStartY() - linhas.get(index).getEndY();
                
                System.out.println("maior_atributo :" + maior_atributo);
                System.out.println("valor: " + valor);
                System.out.println("variancia x :" + varianciaX);    
                
                System.out.println("variancia y :" + varianciaY);   
                
                p.x = x0 - (varianciaX * valor / maior_atributo );       
                p.y = y0 - (varianciaY * valor / maior_atributo );
                
                System.out.println("---------------------------");
                System.out.println(p.x +"-"+ p.y);
                
 
                break;
                
                
            case 3:
                System.out.println("---------------------------");
                System.out.println("3");
                System.out.println("---------------------------");
                
                
                
                 varianciaX = linhas.get(index).getStartX() - linhas.get(index).getEndX();
                
                 varianciaY = linhas.get(index).getStartY() - linhas.get(index).getEndY();
                
                System.out.println("maior_atributo :" + maior_atributo);
                System.out.println("valor: " + valor);
                System.out.println("variancia x :" + varianciaX);    
                
                System.out.println("variancia y :" + varianciaY);   
                
                p.x = x0 - (varianciaX * valor / maior_atributo );       
                p.y = y0 - (varianciaY * valor / maior_atributo );
                
                System.out.println("---------------------------");
                System.out.println(p.x +"-"+ p.y);
                
 
                break;
                
                
            case 4:
                System.out.println("---------------------------");
                System.out.println("4");
                System.out.println("---------------------------");
                
                
                
                 varianciaX = linhas.get(index).getStartX() - linhas.get(index).getEndX();
                
                 varianciaY = linhas.get(index).getStartY() - linhas.get(index).getEndY();
                
                System.out.println("maior_atributo :" + maior_atributo);
                System.out.println("valor: " + valor);
                System.out.println("variancia x :" + varianciaX);    
                
                System.out.println("variancia y :" + varianciaY);   
                
                p.x = x0 - (varianciaX * valor / maior_atributo );       
                p.y = y0 - (varianciaY * valor / maior_atributo );
                
                System.out.println("---------------------------");
                System.out.println(p.x +"-"+ p.y);
                
 
                break;
        };

        return p;
    }
}
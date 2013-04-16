/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graph.spiderUtil;

import javafx.scene.Group;
import javafx.scene.shape.Line;
import metaData.util.Atributo;
import metaData.util.Data;
import metaData.util.Elemento;

/**
 *
 * @author Paloschi
 */
public class SpiderUtilHendler {

    public int calcular_angulo(int index_linha, int tolal_linhas) {

        return ((360 / tolal_linhas) * index_linha);
    }

    public Position getPosition(double angulo, double x0, double y0) {

        Position p = new Position();

        switch (getQuadrante(angulo)) {
            case 1:
                p.x = ((angulo / 90) * x0) + x0;
                p.y = ((angulo) / 90) * y0;

                break;
            case 2:
                p.x = (((180 - angulo) / 90) * x0) + x0;
                p.y = (((angulo - 90) / 90) * y0) + y0;
                break;
            case 3:
                p.x = ((270 - angulo) / 90) * x0;
                p.y = (((270 - angulo) / 90) * y0) + y0;
                break;
            case 4:
                p.y = ((360 - angulo) / 90) * y0;
                p.x = (((angulo - 270) / 90) * x0);
        }

        return p;
    }

    public int getQuadrante(double angulo) {

       

        if (angulo > 270 && angulo <= 360 || angulo == 0) {
            return 4;
        } else if (angulo > 180 && angulo <= 270) {
            return 3;
        } else if (angulo > 90 && angulo <= 180) {
            return 2;
        } else if (angulo > 0 && angulo <= 90  ) {
            return 1;
        } else {
            throw new UnsupportedOperationException();
        }
      
    }
    
    
        public int getQuadrantePoligonos(double angulo) {

       

        if (angulo > 270 && angulo <= 360 || angulo == 0) {
            return 4;
        } else if (angulo > 180 && angulo <= 270) {
            return 3;
        } else if (angulo > 90 && angulo <= 180) {
            return 2;
        } else if (angulo > 0 && angulo <= 90  ) {
            return 1;
        } else {
            throw new UnsupportedOperationException();
        }
      
    }

  

    public double encontrar_maior_atributo(Data data){
        
        double maior = 0;
        
        for (Elemento e : data.getElemento()){
            for(Atributo a : e.getAtributo()){
                if(a.getValor()>maior) maior = a.getValor();
            }
        }
        
        return maior;
        
    }


    
    
}

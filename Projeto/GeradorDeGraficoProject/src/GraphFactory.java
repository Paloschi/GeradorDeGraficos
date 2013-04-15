
/**
 * *********************************************************************
 * Module: GraphFactory.java Author: Paloschi Purpose: Defines the Class
 * GraphFactory
 * *********************************************************************
 */
import graph.GraficoBarrasJFX;
import graph.GraficoPizzaJFX;
import graph.GraficoSpiderJFX;
import graph.GraphJFX;

/**
 * @pdOid 10acf71e-7548-428d-945a-10e4bd205ebb
 */
public class GraphFactory {

    /**
     * @pdOid 8a75d11f-baa4-41fa-b451-e202050fd0e1
     */
    public static final int G_BARRAS = 1;
    /**
     * @pdOid ce03be78-06d9-4b7e-8b73-e9591169c0a2
     */
    public static final int G_PIZZA = 2;
    /**
     * @pdOid f61f8adf-fccf-4b30-a98b-85e32926d850
     */
    public static final int G_SPIDER = 3;
    
    public static final int G_COLUNAS = 4;
    
    public static final int G_RANKING = 5;

    /**
     * @pdOid bd4a2663-8e89-4939-956d-22eb9811da0e
     */
    public GraphJFX build(int type_graph) {
        // TODO: implement

        switch (type_graph) {

            case G_BARRAS:
                return new GraficoBarrasJFX();
            case G_PIZZA:
                return new GraficoPizzaJFX();
            case G_SPIDER:
                //testando o teste do git
                return new GraficoSpiderJFX();
            case G_COLUNAS:
                return new GraficoSpiderJFX();
            case G_RANKING:
                return new GraficoSpiderJFX();
            default:
                throw new UnsupportedOperationException("Tipo de Grafico não suportado!");
        }
    }
}
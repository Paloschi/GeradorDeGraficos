
import com.sun.corba.se.impl.orbutil.graph.Graph;
import graph.GraphJFX;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import metaData.MetaDataGraph;

/***********************************************************************
 * Module:  JGraphApp.java
 * Author:  Paloschi
 * Purpose: Defines the Class JGraphApp
 ***********************************************************************/



/** @pdOid c5cde055-7885-4062-af2b-db9b38e02348 */
public class JGraphApp {
   /** @pdRoleInfo migr=no name=MetaDataGraphFactory assc=association1 mult=1..1 */
   public MetaDataGraphFactory metaDataGraphFactory;
   /** @pdRoleInfo migr=no name=GraphFactory assc=association2 mult=1..1 */
   public GraphFactory graphFactory;
   /** @pdRoleInfo migr=no name=InterfaceController assc=association3 mult=1..1 */
   public InterfaceController interfaceController;
   
    public static void main(String[] args){
        // Inicia a aplicaçao aqui
        
        
         GraphFactory gf = new GraphFactory();
         MetaDataGraphFactory mf = new MetaDataGraphFactory();
         
         MetaDataGraph metadata = mf.build(MetaDataGraphFactory.MD_XML);
       try {
           metadata.generateData("c:/teste.xls");
       } catch (FileNotFoundException ex) {
           Logger.getLogger(JGraphApp.class.getName()).log(Level.SEVERE, null, ex);
       }
         
         GraphJFX graph =  gf.build(GraphFactory.G_BARRAS);
         graph.generateGraph(metadata);
         
         
        
         
        
        
    }

}
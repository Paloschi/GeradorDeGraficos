package metaData.util;

/***********************************************************************
 * Module:  Data.java
 * Author:  Paloschi
 * Purpose: Defines the Class Data
 ***********************************************************************/



import java.util.*;

/** @pdOid 328a412a-7f2a-4da1-9728-dde56b8d5eb5 */
public class Data {
   /** @pdOid 0bc71823-2812-456f-88f9-9bb277ef28e0 */
   private String titulo;
   
   /** @pdRoleInfo migr=no name=Elemento assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<Elemento> elemento;
   
   /** @pdOid a27a393c-13b6-4e2c-9b39-8ac88ce002c3 */
   public String getTitulo() {
      return titulo;
   }
   
   /** @param newTitulo
    * @pdOid ffb727ca-e7de-4844-a456-f5ca58c1be95 */
   public void setTitulo(String newTitulo) {
      titulo = newTitulo;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Elemento> getElemento() {
      if (elemento == null)
         elemento = new java.util.ArrayList<Elemento>();
      return elemento;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorElemento() {
      if (elemento == null)
         elemento = new java.util.ArrayList<Elemento>();
      return elemento.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newElemento */
   public void setElemento(java.util.Collection<Elemento> newElemento) {
      removeAllElemento();
      for (java.util.Iterator iter = newElemento.iterator(); iter.hasNext();)
         addElemento((Elemento)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newElemento */
   public void addElemento(Elemento newElemento) {
      if (newElemento == null)
         return;
      if (this.elemento == null)
         this.elemento = new java.util.ArrayList<Elemento>();
      if (!this.elemento.contains(newElemento))
         this.elemento.add(newElemento);
   }
   
   /** @pdGenerated default remove
     * @param oldElemento */
   public void removeElemento(Elemento oldElemento) {
      if (oldElemento == null)
         return;
      if (this.elemento != null)
         if (this.elemento.contains(oldElemento))
            this.elemento.remove(oldElemento);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllElemento() {
      if (elemento != null)
         elemento.clear();
   }

}
package metaData.util;

/***********************************************************************
 * Module:  Elemento.java
 * Author:  Paloschi
 * Purpose: Defines the Class Elemento
 ***********************************************************************/



import java.util.*;

/** @pdOid 12614c74-17b7-4874-b3a1-a497342854db */
public class Elemento {
   /** @pdOid 7b680e47-2794-4f54-a2c5-dccdfe9d0ca8 */
   private String nome;
   
   /** @pdRoleInfo migr=no name=Atributo assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<Atributo> atributo;
   
   /** @pdOid d8fa832e-cd26-4604-8d8c-dfe5b4ee3032 */
   public String getNome() {
      return nome;
   }
   
   /** @param newNome
    * @pdOid bf270789-963d-4172-914a-4dff44311c52 */
   public void setNome(String newNome) {
      nome = newNome;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Atributo> getAtributo() {
      if (atributo == null)
         atributo = new java.util.HashSet<Atributo>();
      return atributo;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorAtributo() {
      if (atributo == null)
         atributo = new java.util.HashSet<Atributo>();
      return atributo.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newAtributo */
   public void setAtributo(java.util.Collection<Atributo> newAtributo) {
      removeAllAtributo();
      for (java.util.Iterator iter = newAtributo.iterator(); iter.hasNext();)
         addAtributo((Atributo)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newAtributo */
   public void addAtributo(Atributo newAtributo) {
      if (newAtributo == null)
         return;
      if (this.atributo == null)
         this.atributo = new java.util.HashSet<Atributo>();
      if (!this.atributo.contains(newAtributo))
         this.atributo.add(newAtributo);
   }
   
   /** @pdGenerated default remove
     * @param oldAtributo */
   public void removeAtributo(Atributo oldAtributo) {
      if (oldAtributo == null)
         return;
      if (this.atributo != null)
         if (this.atributo.contains(oldAtributo))
            this.atributo.remove(oldAtributo);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllAtributo() {
      if (atributo != null)
         atributo.clear();
   }

}
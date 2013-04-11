package metaData.util;

/***********************************************************************
 * Module:  Atributo.java
 * Author:  Paloschi
 * Purpose: Defines the Class Atributo
 ***********************************************************************/



import java.util.*;

/** @pdOid 9745f26c-3eb9-4d10-80c5-ac10b44d2eab */
public class Atributo {
   /** @pdOid 270b198e-5c0f-4a8f-83e0-a1de3db4998a */
   private String nome;
   /** @pdOid aef934b0-cfda-47ba-a691-c8b26ecf3055 */
   private Double valor;
   
   /** @pdOid e388678c-2800-4532-b02c-479217dca75c */
   public String getNome() {
      return nome;
   }
   
   /** @param newNome
    * @pdOid aa29353d-1bbb-4d4f-a33e-ce272f6c23c9 */
   public void setNome(String newNome) {
      nome = newNome;
   }
   
   /** @pdOid c2c37621-2588-4233-bc7f-7b4deae38a8a */
   public Double getValor() {
      return valor;
   }
   
   /** @param newValor
    * @pdOid 48989e47-db52-4493-abcc-55370b37ab77 */
   public void setValor(Double newValor) {
      valor = newValor;
   }

}
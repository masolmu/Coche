/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche;

/**
 *
 * @author msolm
 */
public interface NewInterface {

      /** Método que me devuelve el stock de coches disponible en cada momento */
      int cochesQuedan();

      /** Método para comprar coches. Modifica el stock.
       * Este método va a ser probado con Junit
       */
      void comprar(java.lang.Double cantidad) throws Exception;

      void vender(java.lang.Double cantidad) throws Exception;
      
}

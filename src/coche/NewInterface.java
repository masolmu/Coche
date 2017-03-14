/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche;

/**
 *
 * @author msolm
 * @version 8/03/2017
 */
public interface NewInterface {

      /** Método que me devuelve el stock de coches disponible en cada momento */
      int cochesQuedan();

      /** Método para comprar coches. Modifica el stock.
       * Este método va a ser probado con Junit
       */
      void comprar(java.lang.Double cantidad) throws Exception;
      
      /** Método para vender coches. Modifica el stock.
       * Este método va a ser probado con Junit
       */
      void vender(java.lang.Double cantidad) throws Exception;
      
}

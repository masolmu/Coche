/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author MANUEL
 */
public class CarTest {

    Car coche1; 
    
    @Before
    public void antes(){ 
        System.out.println("antes");
        coche1 = new Car("Ford",12000,300);
    }
    @After
    public void despues(){ System.out.println("después");}
    /**
* Test para el método Comprar. Si el método comprar es correcto la prueba debe
ser exitosa.
* Vamos a comprobar si partiendo de un stock de 300 coches si compro 100 coches
más el stock es 400. Si es asi el resultado es correcto.
* @throws java.lang.Exception
*/
@Test
public void testComprar1() throws Exception {
System.out.println("Test de prueba para Comprar un número positivo de coches");
int cantidad = 100;
//Coche coche1 = new Car("Ford",12000,300);
coche1.comprar(cantidad);
assertTrue(coche1.obtenerStock()==400); /* Como parto de un stock de 300
al comprar 100 coches más ahora el stock es de 400 */
}

/**
* Test para el método Comprar. En esta prueba intento comprar una cantidad
negativa de coches. Debe saltar la excepción. Con esta prueba comprobamos que 
el método comprar no acepta números negativos.
* @throws java.lang.Exception
*/
@Test
public void testComprar2() throws Exception {
System.out.println("Test de prueba para Comprar un número negativo de coches");
int cantidad = -100;
//Coche coche1 = new Car("Ford",12000,300);
try {
coche1.comprar(cantidad);
fail("Intento de comprar un número negativo de coches");
}
catch (Exception e){
System.out.println(e);
assertTrue(coche1.obtenerStock()==300);
}
}
/**
* Test para el método Vender. Si el método vender es correcto la prueba debe
* ser exitosa. En esta prueba vamos a comprobar que si partiendo de un stock
* de 300 coches vendo 200 el stock que me queda es 100
**/

    /**
     * Test para el método Vender.Si el método vender es correcto la prueba debe
 ser exitosa. En esta prueba vamos a comprobar que si partiendo de un stock
 de 300 coches vendo 200 el stock que me queda es 100
     * @throws java.lang.Exception
     */
    @Test
public void testVender1() throws Exception {
System.out.println("Test de prueba para vender un número positivo y menor que"
+ " el stock de coches");
int cantidad = 200;
//Coche coche1 = new Car("Ford",12000,300);
coche1.vender(cantidad);
assertTrue(coche1.obtenerStock()==100); /* Como parto de un stock de 300
al comprar 100 coches más ahora el stock es de 400 */
}

/**
* Test para el método Vender. En esta prueba intento vender más coches
* que hay en stock. El método vender no debe permitirlo y debe saltar
* la excepción.
* @throws java.lang.Exception
**/
@Test
public void testVender2() throws Exception {
System.out.println("Test de prueba para vender un número positivo pero mayor que"
+ " el stock de coches ");
int cantidad = 400;
//Coche coche1 = new Car("Ford",12000,300);
try {
coche1.vender(cantidad);
fail("Intento de vender más coches que hay en el stock");
}
catch (Exception e){
System.out.println(e);
assertTrue(coche1.obtenerStock()==300);
}
}
}
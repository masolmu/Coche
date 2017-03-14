package coche;

/**
 *
 * @author Sonia
 */
public class Main {
    
      public static void main(String[] args) {
        Auto miCoche;
        int stockActual;
        
        miCoche = compraventacoche();
        stockActual = miCoche.cochesQuedan();
        System.out.println("El stock actual es "+ stockActual );
    }
      /** Método en el que se incluyen las llamadas a los métodos 
       * comprar y vender de la clase Car, con objeto de verificar
       * su funcionamiento */
      
      /**
       * Método en el que se incluyen las llamadas a los métodos 
 comprar y vender de la clase Auto, con objeto de verificar
 su funcionamiento
       */
      public static Auto compraventacoche() {
            Auto miCoche;
            miCoche = new Auto("Opel",12000,500);
            try            {
                  System.out.println("Venta de Coches");
                  miCoche.vender(300);
            } catch (Exception e)
            {
                  System.out.print("Fallo al vender " + e);
            }   try
            {
                  System.out.println("Compra de Coches");
                  miCoche.comprar(500);
            } catch (Exception e)
            {
                  System.out.print("Fallo al ingresar " + e);
            }   return miCoche;
      }

}
    

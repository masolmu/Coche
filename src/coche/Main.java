package coche;

/**
 *
 * @author Sonia
 */
public class Main {
    
      public static void main(String[] args) {
        Bolido miCoche;
        int stockActual;
        
        miCoche = concesionarioVentas();
        stockActual = miCoche.cochesQuedan();
        System.out.println("El stock actual es "+ stockActual );
    }
      /** Método en el que se incluyen las llamadas a los métodos 
       * comprar y vender de la clase Car, con objeto de verificar
       * su funcionamiento */
      
      /**
       * Método en el que se incluyen las llamadas a los métodos 
 comprar y vender de la clase Bolido, con objeto de verificar
 su funcionamiento
       */
      public static Bolido concesionarioVentas() {
            Bolido miAuto;
            miAuto = new Bolido("Opel",12000,500);
            try            {
                  System.out.println("Venta de Coches");
                  miAuto.vender(300);
            } catch (Exception e)
            {
                  System.out.print("Fallo al vender " + e);
            }   try
            {
                  System.out.println("Compra de Coches");
                  miAuto.comprar(500);
            } catch (Exception e)
            {
                  System.out.print("Fallo al ingresar " + e);
            }   return miAuto;
      }

}
    

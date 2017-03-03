package coche;

/**
 *
 * @author Sonia
 */
public class Main {
    
      public static void main(String[] args) {
        Coche miCoche;
        int stockActual;
        
        miCoche = compraventacoche();
        stockActual = miCoche.cochesQuedan();
        System.out.println("El stock actual es "+ stockActual );
    }

      public static Coche compraventacoche() {
            Coche miCoche;
            miCoche = new Coche("Opel",12000,500);
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
    

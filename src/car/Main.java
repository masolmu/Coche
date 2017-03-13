package car;

/**
 *
 * @author Sonia
 */
public class Main {
    
      public static void main(String[] args) {
        Coche miCoche;
        int stockActual;
        
        miCoche = new Coche("Opel",12000,500);
        accionesCoche(miCoche); 
        stockActual = miCoche.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

    public static void accionesCoche(Coche miCoche) {
        try
        {
            System.out.println("Venta de Coches");
            miCoche.vender(300);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender " + e);
        }
        
        try
        {
            System.out.println("Compra de Coches");
            miCoche.adquirir(500);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar " + e);
        }
    }

}
    

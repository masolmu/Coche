package coche;

/**
 *
 * @author Sonia
 * @version 1
 * @since 9/03/2017
 */
public class Auto implements NewInterface {

    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;

    /** Constructor sin argumentos
     */
    public Auto ()
    {
    }
    /** Constructor con parámetro para iniciar todas las propiedades de la clase    /** Constructor con parámetro para iniciar todas las propiedades de la clase    /** Constructor con parámetro para iniciar todas las propiedades de la clase    /** Constructor con parámetro para iniciar todas las propiedades de la clase
     coche */
    
    public Auto (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
   // Método para asignar el nombre del coche
    public void asignarNombre(String nom)
    {
            setNombre(nom);
    }
    // Método que me devuelve el nombre del coche
    public String obtenerNombre()
    {
        return getNombre();
    }

    // Método que me devuelve el stock de coches disponible en cada momento
      @Override
     public int cochesQuedan ()
    {
        return getStock();
    }

    /* Método para comprar coches. Modifica el stock.
     * Este método va a ser probado con Junit
     */
      @Override
    public void comprar(java.lang.Double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de coches");
            setStock((int) (getStock() + cantidad));
    }

      @Override
    public void vender (java.lang.Double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de coches");
        if (cochesQuedan()< cantidad)
            throw new Exception ("No  hay suficientes coches para vender");
            setStock((int) (getStock() - cantidad));
    }

      /**
       * @return the nombre
       */
      public String getNombre() {
            return nombre;
      }

      /**
       * @param nombre the nombre to set
       */
      public void setNombre(String nombre) {
            this.nombre = nombre;
      }

      /**
       * @return the precio
       */
      public double getPrecio() {
            return precio;
      }

      /**
       * @param precio the precio to set
       */
      public void setPrecio(double precio) {
            this.precio = precio;
      }

      /**
       * @return the precioIVA
       */
      public double getPrecioIVA() {
            return precioIVA;
      }

      /**
       * @param precioIVA the precioIVA to set
       */
      public void setPrecioIVA(double precioIVA) {
            this.precioIVA = precioIVA;
      }

      /**
       * @return the stock
       */
      public int getStock() {
            return stock;
      }

      /**
       * @param stock the stock to set
       */
      public void setStock(int stock) {
            this.stock = stock;
      }

      void comprar(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }

      void vender(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }
    
}  
   
    


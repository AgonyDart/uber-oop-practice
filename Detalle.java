import java.util.Scanner;

public class Detalle {
  private int cantidad;
  private String producto;
  private float precio;

    public Detalle(int cantidad, String producto, float precio) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.precio = precio;
    }

    public Detalle() {

    }

    public void mostrar(){
      System.out.println(" - - - - Mostrar Detalles - - - -");
      System.out.println("Cantidad    : " + cantidad);
      System.out.println("Producto    : " + producto);
      System.out.println("Precio      : " + precio);
    }

    public void capturar(){
      Scanner read = new Scanner(System.in);
      System.out.println(" - - - - Mostrar Detalles - - - -");
      System.out.print("Cantidad    :");
      cantidad = read.nextInt();
      System.out.print("Producto    :");
      producto = read.nextLine();
      System.out.print("Precio      :");
      precio = read.nextFloat();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}

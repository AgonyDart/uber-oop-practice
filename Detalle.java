import java.util.Scanner;

public class Detalle implements Basics {
    private int cantidad;
    private String producto;
    private float precio;
    private String indicacionesEspeciales;

    public Detalle(int cantidad, String producto, float precio, String indicacionesEspeciales) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.precio = precio;
        this.indicacionesEspeciales = indicacionesEspeciales;
    }

    public Detalle() {
    }

    public String whatI() {
        return "Detalle";
    }

    public void mostrar() {
        System.out.println("\n( << << Mostrar Detalle >> >> )");
        System.out.println("Cantidad                  : " + cantidad);
        System.out.println("Producto                  : " + producto);
        System.out.println("Precio                    : " + precio);
        System.out.println("Indicaciones Especiales   : " + indicacionesEspeciales);
    }

    public void capturar() {
        Scanner read = new Scanner(System.in);
        System.out.println("\n( >> >> Capturar Detalle << << )");
        System.out.print("Cantidad                  : ");
        cantidad = read.nextInt();
        System.out.print("Producto                  : ");
        producto = read.nextLine();
        producto = read.nextLine();
        System.out.print("Precio                    : ");
        precio = read.nextFloat();
        System.out.print("Indicaciones Especiales   : ");
        indicacionesEspeciales = read.nextLine();
        indicacionesEspeciales = read.nextLine();
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
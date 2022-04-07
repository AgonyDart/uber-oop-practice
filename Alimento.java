import java.util.Scanner;

public class Alimento implements Basics {
    private String nombre;
    private float precio;
    private String descripcion;
    private int tiempo;
    private boolean estaDisponible;
    private int tipo;

    public Alimento() {
    }

    public Alimento(String nombre, float precio, String descripcion, int tiempo, boolean estaDisponible, int tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.tiempo = tiempo;
        this.estaDisponible = estaDisponible;
        this.tipo = tipo;
    }

    public String whatI() {
        return "Alimento";
    }

    public void mostrar() {
        System.out.println(" - - - - Mostrar Alimento - - - - ");
        System.out.println("Nombre : " + nombre);
        System.out.println("Precio : " + precio);
        System.out.println("Descripcion : " + descripcion);
        System.out.println("Tiempo : " + tiempo);
        System.out.println("Esta Disponible? : " + estaDisponible);
        System.out.println("Tipo : " + tipo);
    }

    public void capturar() {
        System.out.println(" - - - - Capturar Alimento - - - - ");
        Scanner read = new Scanner(System.in);
        System.out.print("Nombre : ");
        nombre = read.nextLine();
        System.out.print("Precio : ");
        precio = read.nextFloat();
        System.out.print("Descripcion : ");
        descripcion = read.nextLine();
        descripcion = read.nextLine();
        System.out.print("Tiempo : ");
        tiempo = read.nextInt();
        System.out.print("Esta Disponible? : ");
        estaDisponible = read.nextBoolean();
        System.out.print("Tipo : ");
        tipo = read.nextInt();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}

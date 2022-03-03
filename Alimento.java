import java.util.Scanner;

public class Alimento {
  private String nombre;
  private float precio;
  private String descripcion;
  private int tiempo;
  private boolean estaDisponible;
  private int tipo;

  public Restaurante(){

  }

  public Restaurante(String nombre, float precio, String descripcion, int tiempo, boolean estaDisponible, int tipo){
    this.nombre = nombre;
    this.precio = precio;
    this.descripcion = descripcion;
    this.tiempo = tiempo;
    this.estaDisponible = estaDisponible;
    this.tipo = tipo;
  }

  public void mostrar(){
    System.out.println(" - - - - Mostrar Alimento - - - - ");
    System.out.println("Nombre            : " + nombre);
    System.out.println("Precio            : " + precio);
    System.out.println("Descripcion       : " + descripcion);
    System.out.println("Tiempo            : " + tiempo);
    System.out.println("Esta Disponible?  : " + estaDisponible);
    System.out.println("Tipo              : " + tipo);
  }

  public void capturar(){
    Scanner read = new Scanner(System.in);
    System.out.println("Nombre : ");
    nombre = read.nextLine();
    System.out.println("Precio : ");
    precio = read.nextfloat();
    System.out.println("Descripcion : ");
    descripcion = read.nextLine();
    System.out.println("Tiempo : ");
    tiempo = read.nextInt();
    System.out.println("Esta Disponible? : ");
    estaDisponible = read.nextBoolean();
    System.out.println("Tipo : ");
    tipo = read.nextInt();
  }
//encapsulamiento

}

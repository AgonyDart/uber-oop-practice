import java.util.Scanner;

public class Persona {
  protected String nombreCompleto;
  protected String telefono;
  protected String domicilio;
  protected String correo;
  protected char sexo;
  protected String fechaNacimiento;
  // Borrar los atributos de Repartidor y Cliente Unidad 3, Herencia
  // Datos protegidos y no privados;

  public Persona() {

  }

  public Persona(String nombreCompleto, String telefono, String domicilio, String correo, char sexo, String fechaNacimiento) {
    this.nombreCompleto = nombreCompleto;
    this.telefono = telefono;
    this.domicilio = domicilio;
    this.correo = correo;
    this.sexo = sexo;
    this.fechaNacimiento = fechaNacimiento;
  }

  public void mostrar() {
      System.out.println("Nombre               : " + nombreCompleto);
      System.out.println("Telefono             : " + telefono);
      System.out.println("Domiclio             : " + domicilio);
      System.out.println("Correo               : " + correo);
      System.out.println("Sexo                 : " + sexo);
      System.out.println("Fecha de nacimiento  : " + fechaNacimiento);
  }

  public void capturar() {
    Scanner read = new Scanner(System.in);
    System.out.print("Nombre               : ");
    nombreCompleto = read.nextLine();
    System.out.print("Telefono             : ");
    telefono = read.nextLine();
    System.out.print("Domiclio             : ");
    domicilio = read.nextLine();
    System.out.print("Correo               : ");
    correo = read.nextLine();
    System.out.print("Sexo                 : ");
    sexo = read.nextLine().charAt(0);
    System.out.print("Fecha de nacimiento  : ");
    fechaNacimiento = read.nextLine();
  }

  protected String getNombreCompleto(){
    return nombreCompleto;
  }

  protected void setNombreCompleto(String nombreCompleto){
    this.nombreCompleto = nombreCompleto;
  }

  protected String getTelefono(){
    return telefono;
  }

  protected void setTelefono(String telefono){
    this.telefono = telefono;
  }

  protected String getDomicilio(){
    return domicilio;
  }

  protected void setDomicilio(String domicilio){
    this.domicilio = domicilio;
  }

  protected String getCorreo(){
    return correo;
  }

  protected void setCorreo(String correo){
    this.correo = correo;
  }

  protected char getSexo(){
    return sexo;
  }

  protected void setSexo(char sexo){
    this.sexo = sexo;
  }

  protected String getFechaNacimiento(){
    return fechaNacimiento;
  }

  protected void setFechaNacimiento(String fechaNacimiento){
    this.fechaNacimiento = fechaNacimiento;
  }
}

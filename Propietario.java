import.java.util.Scanner;

public class Propietario extends Persona {
  private String rfc;
  private String id;
  private String ocupacion;
  private String cuentaBancaria;

  public Propietario(String nombreCompleto, String telefono, String domicilio, String correo, char sexo, String fechaNacimiento, String rfc, String id, String ocupacion, String cuentaBancaria){
    super(nombreCompleto, telefono, domicilio, correo, sexo, fechaNacimiento
    this.rfc = rfc;
    this.id = id;
    this.ocupacion = ocupacion;
    this.cuentaBancaria = cuentaBancaria;
  }

  public Propietario(){

  }

  @Override
  public void mostrar(){
    super.mostrar();
    System.out.print(" - - - - Mostrar Propietario - - - - ");
    System.out.print("RFC               : " + rfc);
    System.out.print("Id                : " + id);
    System.out.print("Ocupacion         : " + ocupacion);
    System.out.print("Cuenta Bancaria   : " + cuentaBancaria);
  }

  @Override
  public void capturar(){
    Scanner read = new Scanner(System.in);
    System.out.print(" - - - - Capturar Propietario - - - - ");
    super.capturar();
    System.out.print("RFC               : ");
    rfc = read.nextLine();
    System.out.print("Id                : ");
    id = read.NextLine();
    System.out.print("Ocupacion         : ");
    ocupacion = read.nextLine();
    System.out.print("Cuenta Bancaria   : ");
    cuentaBancaria = read.nexnextLine();
  }
}

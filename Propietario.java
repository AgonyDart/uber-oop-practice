import java.util.Scanner;

public class Propietario extends Persona {
  private String rfc;
  private String id;
  private String ocupacion;
  private String cuentaBancaria;

  public Propietario(String nombreCompleto, String telefono, String domicilio, String correo, char sexo,
      String fechaNacimiento, String rfc, String id, String ocupacion, String cuentaBancaria) {
    super(nombreCompleto, telefono, domicilio, correo, sexo, fechaNacimiento);
    this.rfc = rfc;
    this.id = id;
    this.ocupacion = ocupacion;
    this.cuentaBancaria = cuentaBancaria;
  }

  public Propietario() {
  }

  @Override
  public String whatI() {
    return "Propietario";
  }

  @Override
  public void mostrar() {
    System.out.println(" - - - - Mostrar Propietario - - - - ");
    super.mostrar();
    System.out.println("RFC                  : " + rfc);
    System.out.println("Id                   : " + id);
    System.out.println("Ocupacion            : " + ocupacion);
    System.out.println("Cuenta Bancaria      : " + cuentaBancaria);
  }

  @Override
  public void capturar() {
    Scanner read = new Scanner(System.in);
    System.out.println(" - - - - Capturar Propietario - - - - ");
    super.capturar();
    System.out.print("RFC                  : ");
    rfc = read.nextLine();
    System.out.print("Id                   : ");
    id = read.nextLine();
    System.out.print("Ocupacion            : ");
    ocupacion = read.nextLine();
    System.out.print("Cuenta Bancaria      : ");
    cuentaBancaria = read.nextLine();
  }

  public String getRfc() {
    return rfc;
  }

  public void setRfc(String rfc) {
    this.rfc = rfc;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getOcupacion() {
    return ocupacion;
  }

  public void setOcupacion(String ocupacion) {
    this.ocupacion = ocupacion;
  }

  public String getCuentaBancaria() {
    return cuentaBancaria;
  }

  public void setCuentaBancaria(String cuentaBancaria) {
    this.cuentaBancaria = cuentaBancaria;
  }
}

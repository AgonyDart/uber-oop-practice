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

  }

  public void capturar() {

  }

  protected String getNombreCompleto(){
    return nombreCompleto;
  }

  protected String getTelefono(){
    return telefono;
  }

  protected String getDomicilio(){
    return domicilio;
  }

  protected String getCorreo(){
    return correo;
  }
  protected char getSexo(){
    return sexo;
  }
  protected String getFechaNacimiento(){
  return fechaNacimiento;
  }
}

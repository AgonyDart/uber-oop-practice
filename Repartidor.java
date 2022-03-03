
import java.util.Scanner;

public class Repartidor {

    private String telefono;
    private String nombreCompleto;
    private String rfc;
    private String correo;
    private char tipoVehiculo;
    private String numeroLicencia;
    private String descripcionVehiculo;
    private String domicilio;
    private String cuentaBancaria;
    private String fechaNacimiento;
    private char sexo;
    private boolean estaDisponible;

    public Repartidor(String telefono, String nombreCompleto, String rfc, String correo, char tipoVehiculo, String numeroLicencia, String descripcionVehiculo, String domicilio, String cuentaBancaria, String fechaNacimiento, char sexo, boolean estaDisponible) {
        this.telefono = telefono;
        this.nombreCompleto = nombreCompleto;
        this.rfc = rfc;
        this.correo = correo;
        this.tipoVehiculo = tipoVehiculo;
        this.numeroLicencia = numeroLicencia;
        this.descripcionVehiculo = descripcionVehiculo;
        this.domicilio = domicilio;
        this.cuentaBancaria = cuentaBancaria;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.estaDisponible = estaDisponible;
    }

    public Repartidor() {
        this.sexo = 'M';
        this.tipoVehiculo = 'M';
        this.estaDisponible = false;
    }

    public void mostrar() {
        System.out.println(" - - - - Mostrar Repartidor - - - - ");
        System.out.println("Nombre Completo      : " + nombreCompleto);
        System.out.println("Teléfono             : " + telefono);
        System.out.println("RFC                  : " + rfc);
        System.out.println("Correo               : " + correo);
        System.out.println("Tipo de Vehículo     : " + tipoVehiculo);
        System.out.println("Núm. de Licencia     : " + numeroLicencia);
        System.out.println("Vehículo             : " + descripcionVehiculo);
        System.out.println("Domicilio            : " + domicilio);
        System.out.println("Cuenta Bancaria      : " + cuentaBancaria);
        System.out.println("Fecha de Nacimiento  : " + fechaNacimiento);
        System.out.println("Sexo                 : " + sexo);
        System.out.println("¿Disponible?         : " + estaDisponible);
    }

    public void capturar() {
        Scanner read = new Scanner(System.in);
        System.out.println(" - - - - Capturar Repartidor - - - - ");
        System.out.print("Nombre Completo      : ");
        nombreCompleto = read.nextLine();
        System.out.print("Teléfono             : ");
        telefono = read.nextLine();
        System.out.print("RFC                  : ");
        rfc = read.nextLine();
        System.out.print("Correo               : ");
        correo = read.nextLine();
        System.out.print("Tipo de Vehículo     : ");
        tipoVehiculo = read.nextLine().charAt(0);
        System.out.print("Núm. de Licencia     : ");
        numeroLicencia = read.nextLine();
        System.out.print("Vehículo             : ");
        descripcionVehiculo = read.nextLine();
        System.out.print("Domicilio            : ");
        domicilio = read.nextLine();
        System.out.print("Cuenta Bancaria      : ");
        cuentaBancaria = read.nextLine();
        System.out.print("Fecha de Nacimiento  : ");
        fechaNacimiento = read.nextLine();
        System.out.print("Sexo                 : ");
        sexo = read.nextLine().charAt(0);
        System.out.print("¿Disponible?         : ");
        estaDisponible = read.nextBoolean();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public char getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(char tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public String getDescripcionVehiculo() {
        return descripcionVehiculo;
    }

    public void setDescripcionVehiculo(String descripcionVehiculo) {
        this.descripcionVehiculo = descripcionVehiculo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

}

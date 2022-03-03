
import java.util.Scanner;

public class Cliente {

    private String nombreCompleto;
    private String domicilio;
    private String telefono;
    private String correo;
    private char sexo;
    private String fechaNacimiento;
    private double saldo;
    private String municipio;
    private String codigoPostal;

    public Cliente(String nombreCompleto, String domicilio, String telefono, String correo, char sexo, String fechaNacimiento, double saldo, String municipio, String codigoPostal) {
        this.nombreCompleto = nombreCompleto;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.correo = correo;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.saldo = saldo;
        this.municipio = municipio;
        this.codigoPostal = codigoPostal;
    }

    public Cliente() {
    }

    public void mostrar() {
        System.out.println(" - - - - Mostrar Cliente - - - - ");
        System.out.println("Nombre Completo      : " + nombreCompleto);
        System.out.println("Domicilio            : " + domicilio);
        System.out.println("Teléfono             : " + telefono);
        System.out.println("Correo               : " + correo);
        System.out.println("Sexo                 : " + sexo);
        System.out.println("Fecha de Nacimiento  : " + fechaNacimiento);
        System.out.println("Saldo                : " + saldo);
        System.out.println("Municipio            : " + municipio);
        System.out.println("Codigo Postal        : " + codigoPostal);
    }

    public void capturar() {
        Scanner read = new Scanner(System.in);
        System.out.println(" - - - - Capturar Cliente - - - - ");
        System.out.println("Nombre Completo      : ");
        nombreCompleto = read.nextLine();
        System.out.println("Domicilio            : ");
        domicilio = read.nextLine();
        System.out.println("Teléfono             : ");
        telefono = read.nextLine();
        System.out.println("Correo               : ");
        correo = read.nextLine();
        System.out.println("Sexo                 : ");
        sexo = read.nextLine().charAt(0);
        System.out.println("Fecha de Nacimiento  : ");
        fechaNacimiento = read.nextLine();
        System.out.println("Saldo                : ");
        saldo = read.nextDouble();
        System.out.println("Municipio            : ");
        municipio = read.nextLine();
        System.out.println("Codigo Postal        : ");
        codigoPostal = read.nextLine();
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}

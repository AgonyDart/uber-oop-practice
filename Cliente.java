import java.util.Scanner;


public class Cliente extends Persona{

    private double saldo;
    private String municipio;
    private String codigoPostal;

    public Cliente(String nombreCompleto, String domicilio, String telefono, String correo, char sexo, String fechaNacimiento, double saldo, String municipio, String codigoPostal) {
        super(nombreCompleto, telefono, domicilio, correo, sexo, fechaNacimiento);
        this.saldo = saldo;
        this.municipio = municipio;
        this.codigoPostal = codigoPostal;
    }

    public Cliente() {
    }

    @Override
    public void mostrar() {
        System.out.println(" - - - - Mostrar Cliente - - - - ");
        super.mostrar();
        System.out.println("Saldo                : " + saldo);
        System.out.println("Municipio            : " + municipio);
        System.out.println("Codigo Postal        : " + codigoPostal);
    }

    @Override
    public void capturar() {
        Scanner read = new Scanner(System.in);
        System.out.println(" - - - - Capturar Cliente - - - - ");
        super.capturar();
        System.out.print("Saldo                : ");
        saldo = read.nextDouble();
        System.out.print("Municipio            : ");
        municipio = read.nextLine();
        municipio = read.nextLine();
        System.out.print("Codigo Postal        : ");
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

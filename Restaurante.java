import java.util.Scanner;

public class Restaurante {

    private String nombre;
    private String domicilio;
    private String rfc;
    private String horario;
    private boolean estaAbierto;
    private int tipo;
    private String descripcion;
    private String sitioWeb;
    private String telefono;
    private String correo;
    private Alimento alimentos[] = new Alimento[15];
    private int cAlimentos;

    public Restaurante() {
    }

    public Restaurante(String nombre, String domicilio, String rfc, String horario, boolean estaAbierto, int tipo,
            String descripcion, String sitioWeb, String telefono, String correo) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.horario = horario;
        this.estaAbierto = estaAbierto;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.sitioWeb = sitioWeb;
        this.telefono = telefono;
        this.correo = correo;
        cAlimentos = 0;
    }

    public void mostrar() {
        System.out.println(" - - - - Mostrar Restaurante - - - - ");
        System.out.println("Nombre          : " + nombre);
        System.out.println("Domicilio       : " + domicilio);
        System.out.println("RFC             : " + rfc);
        System.out.println("Horario         : " + horario);
        System.out.println("Esta abierto?   : " + estaAbierto);
        System.out.println("Tipo            : " + tipo);
        System.out.println("Descripcion     : " + descripcion);
        System.out.println("Sitio Web       : " + sitioWeb);
        System.out.println("Telefono        : " + telefono);
        System.out.println("Correo          : " + correo);
    }

    public void capturar() {
        Scanner read = new Scanner(System.in);
        System.out.println(" - - - - Capturar Restaurante - - - - ");
        System.out.print("Nombre          : ");
        nombre = read.nextLine();
        System.out.print("Domicilio       : ");
        domicilio = read.nextLine();
        System.out.print("RFC             : ");
        rfc = read.nextLine();
        System.out.print("Horario         : ");
        horario = read.nextLine();
        System.out.print("Esta abierto?   : ");
        estaAbierto = read.nextBoolean();
        System.out.print("Tipo            : ");
        tipo = read.nextInt();
        System.out.print("Descripcion     : ");
        descripcion = read.nextLine();
        System.out.print("Sitio Web       : ");
        sitioWeb = read.nextLine();
        System.out.print("Telefono        : ");
        telefono = read.nextLine();
        System.out.print("Correo          : ");
        correo = read.nextLine();
        read.close();
    }

    public void agregarAlimento(String nombre, float precio, String descripcion, int tiempo, boolean estaDisponible,
            int tipo) {
        alimentos[cAlimentos++] = new Alimento(nombre, precio, descripcion, tiempo, estaDisponible, tipo);
    }

    public void mostrarAlimento() {
        for (int i = 0; i <= cAlimentos; i++) {
            if (alimentos[i] != null) {
                alimentos[i].mostrar();
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public boolean isEstaAbierto() {
        return estaAbierto;
    }

    public void setEstaAbierto(boolean estaAbierto) {
        this.estaAbierto = estaAbierto;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
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
}

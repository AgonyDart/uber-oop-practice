
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

    public Repartidor(){
    }

    public Restaurante(String nombre, String domicilio, String rfc, String horario, boolean estaAbierto, int tipo, String descripcion, String sitioWeb, String telefono, String correo) {
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

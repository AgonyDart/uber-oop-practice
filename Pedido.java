import java.util.Scanner;

public class Pedido {
  private String telefonoCliente;
  private String rfcRestaurante;
  private String domicilioPedido;
  private String folio;
  private String rfcRepartidor;
  private String fecha;
  private String hora;
  private int formaPago;
  private int status;
  private float costoEnvio;
  private int calificacionRestaurante;
  private int calificacionRepartidor;
  private Detalle detalles[] = new Detalle[100];
  private int cDetalles = 0;

    public Pedido(String telefonoCliente, String rfcRestaurante, String domicilioPedido, String folio, String rfcRepartidor, String fecha, String hora, int formaPago, int status, float costoEnvio, int calificacionRestaurante, int calificacionRepartidor) {
        this.telefonoCliente = telefonoCliente;
        this.rfcRestaurante = rfcRestaurante;
        this.domicilioPedido = domicilioPedido;
        this.folio = folio;
        this.rfcRepartidor = rfcRepartidor;
        this.fecha = fecha;
        this.hora = hora;
        this.formaPago = formaPago;
        this.status = status;
        this.costoEnvio = costoEnvio;
        this.calificacionRestaurante = calificacionRestaurante;
        this.calificacionRepartidor = calificacionRepartidor;
    }

    public Pedido(){

    }

    public void mostrar(){
      System.out.println("( << << Mostrar Pedido >> >> )");
      System.out.println("Telefono del Cliente  : " + telefonoCliente);
      System.out.println("RFC del Restaurante   : " + rfcRestaurante);
      System.out.println("Domiclio del Cliente  : " + domicilioPedido);
      System.out.println("Folio del Pedido      : " + folio);
      System.out.println("RFC del Repartidor    : " + rfcRepartidor);
      System.out.println("Fecha                 : " + fecha);
      System.out.println("Hora del Pedido       : " + hora);
      System.out.println("Forma de pago         : (i) " + formaPago);
      System.out.println("Status                : (i) " + status);
      System.out.println("Costo del envio       : " + costoEnvio);
      System.out.println("Calf. restaurante     : " + calificacionRestaurante);
      System.out.println("Calf. repartidor      : " + calificacionRepartidor);
    }

    public void capturar() {
      Scanner read = new Scanner(System.in);
      System.out.println(" - - - - Mostrar Pedido - - - -");
      System.out.print("Telefono del Cliente  : ");
      telefonoCliente = read.nextLine();
      System.out.print("RFC del Restaurante   : ");
      rfcRestaurante = read.nextLine();
      System.out.print("Domiclio del Cliente  : ");
      domicilioPedido = read.nextLine();
      System.out.print("Folio del Pedido      : ");
      folio = read.nextLine();
      System.out.print("RFC del Repartidor    : ");
      rfcRepartidor = read.nextLine();
      System.out.print("Fecha                 : ");
      fecha = read.nextLine();
      System.out.print("Hora del Pedido       : ");
      hora = read.nextLine();
      System.out.print("Forma de pago         : (i) ");
      formaPago = read.nextInt();
      System.out.print("Status                : (i) ");
      status = read.nextInt();
      System.out.print("Costo del envio       : ");
      costoEnvio = read.nextFloat();
      System.out.print("Calf. restaurante     : ");
      calificacionRestaurante = read.nextInt();
      System.out.print("Calf. repartidor      : ");
      calificacionRepartidor= read.nextInt();
    }

    public void agregarDetalle(int cantidad, String producto, float precio, String indicacionesEspeciales) {
      detalles[cDetalles++] = new Detalle(cantidad, producto, precio, indicacionesEspeciales);
    }

    public void mostrarDetalle() {
      for (int i = 0; i < cDetalles; i++) {
        if (detalles[i] != null) {
          detalles[i].mostrar();
        }
      }
    }

    public void capturarDetalle() {
      for (int i = 0; i < cDetalles; i++) {
        if (detalles[i] != null) {
          detalles[i].capturar();
        }
      }
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getRfcRestaurante() {
        return rfcRestaurante;
    }

    public void setRfcRestaurante(String rfcRestaurante) {
        this.rfcRestaurante = rfcRestaurante;
    }

    public String getDomicilioPedido() {
        return domicilioPedido;
    }

    public void setDomicilioPedido(String domicilioPedido) {
        this.domicilioPedido = domicilioPedido;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getRfcRepartidor() {
        return rfcRepartidor;
    }

    public void setRfcRepartidor(String rfcRepartidor) {
        this.rfcRepartidor = rfcRepartidor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(int formaPago) {
        this.formaPago = formaPago;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public float getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(float costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public int getCalificacionRestaurante() {
        return calificacionRestaurante;
    }

    public void setCalificacionRestaurante(int calificacionRestaurante) {
        this.calificacionRestaurante = calificacionRestaurante;
    }

    public int getCalificacionRepartidor() {
        return calificacionRepartidor;
    }

    public void setCalificacionRepartidor(int calificacionRepartidor) {
        this.calificacionRepartidor = calificacionRepartidor;
    }
}

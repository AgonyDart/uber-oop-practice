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

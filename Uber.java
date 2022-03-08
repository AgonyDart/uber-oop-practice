import java.util.Scanner;

public class Uber {

    private String rfc;
    private String telefono;
    private String paginaWeb;
    private String correo;
    private Repartidor repartidores[] = new Repartidor[1000];
    private Cliente clientes[] = new Cliente[1000];
    private Restaurante restaurantes[] = new Restaurante[1000];
    private int cRepartidores;
    private int cClientes;
    private int cRestaurantes;

    public Uber(String rfc, String telefono, String paginaWeb, String correo) {
        this.rfc = rfc;
        this.telefono = telefono;
        this.paginaWeb = paginaWeb;
        this.correo = correo;
        inicializarDatos();
    }

    private void inicializarDatos() {
        repartidores[0] = new Repartidor("443 173 9989", "Angel Duarte", "TIDA031201-xxx", "angelduarte@gmail.com", 'M', "123456789", "honda cbf 125 twister", "17 de Marzo #149", "1234-1234-1234-1234", "12-03-01", 'M', true);
        repartidores[1] = new Repartidor("443 106 3851", "David T.", "TIDA031201-xxx", "davidt@gmail.com", 'M', "123456789", "honda cbt 250", "17 de Marzo #149", "1234-1234-1234-1234", "12-03-01", 'M', true);
        repartidores[2] = new Repartidor("443 234 4365", "Jared Monterrosa", "MOEE021019-xxx", "jaredmon@gmail.com", 'A', "123456789", "Mercedes-Benz. negro", "Av. ventura puente #788", "1234-1234-1234-1234", "10-02-19", 'M', false);
        repartidores[3] = new Repartidor("443 223 3645", "Leonardo Guido", "GUAL030730-xxx", "leonardoga@gmail.com", 'A', "123456789", "Tsuru tuneado", "Jardines de Guadalupe #169", "1234-1234-1234-1234", "07-03-30", 'M', true);
        repartidores[4] = new Repartidor("443 423 7564", "Emir Rodriguez", "GARC030122-xxx", "carlosemir@gmail.com", 'M', "123456789", "moto sin luces", "Ciudad Jardin #876", "1234-1234-1234-1234", "01-03-22", 'M', true);
        repartidores[5] = new Repartidor("443 127 4567", "Damian Hernandez ", "HECD030311-xxx", "damianhc@gmail.com", 'A', "123456789", "bochito", "Villa magna #763", "1234-1234-1234-1234", "03-03-11", 'M', false);
        repartidores[6] = new Repartidor("443 567 6456", "Sarai Lemus", "LENS030913-xxx", "sarailemus@gmail.com", 'M', "123456789", "honda cbt 250", "Corregidora #234", "1234-1234-1234-1234", "09-03-13", 'F', false);
        repartidores[7] = new Repartidor("443 467 7456", "Samar Alcala ", "ALAS030625-xxx", "samarsulu@gmail.com", 'A', "123456789", "Mustang", "Solidaridad #444", "1234-1234-1234-1234", "06-03-25", 'F', true);
        repartidores[8] = new Repartidor("443 856 4564", "Daliah Pardo", "PAXD010113-xxx", "pardo@gmail.com", 'M', "123456789", "roja", "Los Angeles, California", "1234-1234-1234-1234", "01-01-13", 'F', false);
        repartidores[9] = new Repartidor("443 677 6456", "Fatima Chavez", "CHPF010631-xxx", "fatimachavez@gmail.com", 'M', "123456789", "tiene 4 llantas", "CDMX, Av. Insurgentes #777", "1234-1234-1234-1234", "06-00-31", 'F', true);
        cRepartidores = 10;
        clientes[0] = new Cliente("Angel T.", "17 de Marzo #149", "443 173 9989", "angelt@gmail.com", 'M', "12-03-01", 200, "Morelia", "58337");
        clientes[1] = new Cliente("David Duarte", "17 de Marzo #149", "443 106 3851", "davidduarte@gmail.com", 'M', "12-03-01", 250, "Morelia", "58337");
        clientes[2] = new Cliente("Fatima Chavez", "CDMX, Av. Insurgentes #777", "443 677 6456", "fatimachavez@gmail.com", 'F', "06-00-31", 870, "CDMX", "34556");
        clientes[3] = new Cliente("Jared Monterrosa", "Av. ventura puente #788", "443 234 4365", "jaredmon@gmail.com", 'M', "10-02-19", 1, "Tapachula", "69696");
        clientes[4] = new Cliente("Daliah Pardo", "Los Angeles, California", "443 856 4564", "pardo@gmail.com", 'F', "01-01-13", 20000, "Los Angeles", "??????");
        clientes[5] = new Cliente("Leonardo Guido", "Jardines de Guadalupe #169", "443 223 3645", "leonardoga@gmail.com", 'M', "07-03-30", 137, "Morelia", "58457");
        clientes[6] = new Cliente("Samar Alcala", "Solidaridad #444", "4443 467 7456", "samarsulu@gmail.com", 'F', "06-03-25", 580, "Morelia", "58457");
        clientes[7] = new Cliente("Emir Rodriguez", "Ciudad Jardin #876", "443 423 7564", "carlosemir@gmail.com", 'M', "01-03-22", 0, "Morelia", "58337");
        clientes[8] = new Cliente("Sarai Lemus", "Corregidora #234", "443 567 6456", "sarailemus@gmail.com", 'F', "01-03-13", 200, "Tarimbaro", "58XXX");
        clientes[9] = new Cliente("Damian Hernandez", "Villa magna #763", "43 127 4567", "damianhc@gmail.com", 'M', "03-03-11", 1500, "Morelia", "58337");
        cClientes = 10;
        // restaurante[0] = new Restaurante("McDonalds", "Villa Siempreviva, #123", "MCDS030322-xxx", "11:00-9:00", true, 1, "hamburguesas", "www.mcdonalds.com", "123456789", "uncorreo@gmail.com");
        cRestaurantes = 1;
    }

    public void mostrarRepartidores() {
        for (int i = 0; i < cRepartidores; i++) {
          if (repartidores[i] != null) {
            repartidores[i].mostrar();
          }
        }
    }

    public void mostrarRepartidores(String string) {
      String textForSearching;
      Repartidor r;
      for (int i = 0; i < cRepartidores; i++) {
        r = repartidores[i];
        textForSearching = r.getNombreCompleto() + r.getTelefono() + r.getRfc() + r.getCorreo() + r.getNumeroLicencia() + r.getDescripcionVehiculo() + r.getDomicilio() + r.getCuentaBancaria() + r.getFechaNacimiento();
        if (textForSearching.contains(string)) {
          repartidores[i].mostrar();
        }
        textForSearching = "";
      }
    }

    public void mostrarRepartidores(int lines) {
      Scanner read = new Scanner(System.in);
  		for (int i = 0; i < cRepartidores;) {
  		    for (int j = 0; j < lines; j++) {
            if (repartidores[i] != null) {
              repartidores[i].mostrar();
              i++;
            }
  		    }
  		    System.out.print("\nPresione 'Enter' para continuar : ");
  		    read.nextLine();
  		  }
    }

    public void capturarRepartidor() {
        repartidores[cRepartidores] = new Repartidor();
        repartidores[cRepartidores].capturar();
        cRepartidores++;
    }

    public void mostrarClientes() {
        for (int i = 0; i <= cClientes; i++) {
            if (clientes[i] != null) {
                clientes[i].mostrar();
            }
        }
    }

    public void mostrarClientes(String string) {
      String textForSearching;
      Cliente r;
      for (int i = 0; i < cClientes; i++) {
        r = clientes[i];
        textForSearching = r.getNombreCompleto() + r.getTelefono() + r.getCorreo() + r.getDomicilio() + r.getSaldo() + r.getFechaNacimiento() + r.getMunicipio() + r.getCodigoPostal();
        if (textForSearching.contains(string)) {
          clientes[i].mostrar();
        }
        textForSearching = "";
      }
    }

    public void mostrarClientes(int lines) {
      Scanner read = new Scanner(System.in);
  		for (int i = 0; i < cClientes;) {
  		    for (int j = 0; j < lines; j++) {
            if (clientes[i] != null) {
              clientes[i].mostrar();
              i++;
            }
  		    }
  		    System.out.print("\nPresione 'Enter' para continuar : ");
  		    read.nextLine();
  		  }
    }

    public void capturarCliente() {
        clientes[cClientes] = new Cliente();
        clientes[cClientes].capturar();
        cClientes++;
    }

    public void mostrarRestaurantes() {
        for (int i = 0; i <= cRestaurantes; i++) {
            if (restaurantes[i] != null) {
                restaurantes[i].mostrar();
            }
        }
    }

    public void capturarRestaurante() {
        restaurantes[cRestaurantes] = new Restaurante();
        restaurantes[cRestaurantes].capturar();
        cRestaurantes++;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}

import java.util.Scanner;

public class Uber {

  private String rfc;
  private String telefono;
  private String paginaWeb;
  private String correo;
  private Persona personas[] = new Persona[100];
  private Restaurante restaurantes[] = new Restaurante[20];
  private Pedido pedidos[] = new Pedido[50];
  private int cRestaurantes, cPedidos, cPersonas;

  public Uber(String rfc, String telefono, String paginaWeb, String correo) {
    this.rfc = rfc;
    this.telefono = telefono;
    this.paginaWeb = paginaWeb;
    this.correo = correo;
    inicializarDatos();
  }

  private void inicializarDatos() {
    personas[0] = new Repartidor("443 173 9989", "Angel Duarte", "TIDA031201-xxx", "angelduarte@gmail.com", 'M',
        "123456789", "honda cbf 125 twister", "17 de Marzo #149", "1234-1234-1234-1234", "12-03-01", 'M', true);
    personas[1] = new Repartidor("443 106 3851", "David T.", "TIDA031201-xxx", "davidt@gmail.com", 'M', "123456789",
        "honda cbt 250", "17 de Marzo #149", "1234-1234-1234-1234", "12-03-01", 'M', true);
    personas[2] = new Repartidor("443 234 4365", "Jared Monterrosa", "MOEE021019-xxx", "jaredmon@gmail.com", 'A',
        "123456789", "Mercedes-Benz. negro", "Av. ventura puente #788", "1234-1234-1234-1234", "10-02-19", 'M', false);
    personas[3] = new Repartidor("443 223 3645", "Leonardo Guido", "GUAL030730-xxx", "leonardoga@gmail.com", 'A',
        "123456789", "Tsuru tuneado", "Jardines de Guadalupe #169", "1234-1234-1234-1234", "07-03-30", 'M', true);
    personas[4] = new Repartidor("443 423 7564", "Emir Rodriguez", "GARC030122-xxx", "carlosemir@gmail.com", 'M',
        "123456789", "moto sin luces", "Ciudad Jardin #876", "1234-1234-1234-1234", "01-03-22", 'M', true);
    personas[5] = new Repartidor("443 127 4567", "Damian Hernandez ", "HECD030311-xxx", "damianhc@gmail.com", 'A',
        "123456789", "bochito", "Villa magna #763", "1234-1234-1234-1234", "03-03-11", 'M', false);
    personas[6] = new Repartidor("443 567 6456", "Sarai Lemus", "LENS030913-xxx", "sarailemus@gmail.com", 'M',
        "123456789", "honda cbt 250", "Corregidora #234", "1234-1234-1234-1234", "09-03-13", 'F', false);
    personas[7] = new Repartidor("443 467 7456", "Samar Alcala ", "ALAS030625-xxx", "samarsulu@gmail.com", 'A',
        "123456789", "Mustang", "Solidaridad #444", "1234-1234-1234-1234", "06-03-25", 'F', true);
    personas[8] = new Repartidor("443 856 4564", "Daliah Pardo", "PAXD010113-xxx", "pardo@gmail.com", 'M',
        "123456789", "roja", "Los Angeles, California", "1234-1234-1234-1234", "01-01-13", 'F', false);
    personas[9] = new Repartidor("443 677 6456", "Fatima Chavez", "CHPF010631-xxx", "fatimachavez@gmail.com", 'M',
        "123456789", "tiene 4 llantas", "CDMX, Av. Insurgentes #777", "1234-1234-1234-1234", "06-00-31", 'F', true);
    personas[10] = new Cliente("Angel T.", "17 de Marzo #149", "443 173 9989", "angelt@gmail.com", 'M', "12-03-01", 200,
        "Morelia", "58337");
    personas[11] = new Cliente("David Duarte", "17 de Marzo #149", "443 106 3851", "davidduarte@gmail.com", 'M',
        "12-03-01", 250, "Morelia", "58337");
    personas[12] = new Cliente("Fatima Chavez", "CDMX, Av. Insurgentes #777", "443 677 6456", "fatimachavez@gmail.com",
        'F', "06-00-31", 870, "CDMX", "34556");
    personas[13] = new Cliente("Jared Monterrosa", "Av. ventura puente #788", "443 234 4365", "jaredmon@gmail.com", 'M',
        "10-02-19", 1, "Tapachula", "69696");
    personas[14] = new Cliente("Daliah Pardo", "Los Angeles, California", "443 856 4564", "pardo@gmail.com", 'F',
        "01-01-13", 20000, "Los Angeles", "??????");
    personas[15] = new Cliente("Leonardo Guido", "Jardines de Guadalupe #169", "443 223 3645", "leonardoga@gmail.com",
        'M', "07-03-30", 137, "Morelia", "58457");
    personas[16] = new Cliente("Samar Alcala", "Solidaridad #444", "4443 467 7456", "samarsulu@gmail.com", 'F',
        "06-03-25", 580, "Morelia", "58457");
    personas[17] = new Cliente("Emir Rodriguez", "Ciudad Jardin #876", "443 423 7564", "carlosemir@gmail.com", 'M',
        "01-03-22", 0, "Morelia", "58337");
    personas[18] = new Cliente("Sarai Lemus", "Corregidora #234", "443 567 6456", "sarailemus@gmail.com", 'F',
        "01-03-13", 200, "Tarimbaro", "58XXX");
    personas[19] = new Cliente("Damian Hernandez", "Villa magna #763", "43 127 4567", "damianhc@gmail.com", 'M',
        "03-03-11", 1500, "Morelia", "58337");
    cPersonas = 10;
    restaurantes[0] = new Restaurante("McDonalds", "Villa Siempreviva, #123",
        "MCDS030322-xxx", "11:00-9:00", true, 1, "hamburguesas", "https://www.mcdonalds.com.mx/",
        "123456789", "mccorreo@gmail.com");
    restaurantes[1] = new Restaurante("Carnitas La Luz",
        "Teniente Coronel Juan Pablo Aldasoro 35, Jardines de Guadalupe, 58140 Morelia, Mich.",
        "CALL030322-xxx", "10:00 - 2:00", false, 5, "tacos de tortilla",
        "https://restaurantguru.com/Carnitas-La-Luz-Morelia",
        "443 334 0424", "carnitasbienricas@gmail.com");
    restaurantes[2] = new Restaurante("China Town",
        "C. Juan Guillermo Villasana 164, Jardines de Guadalupe, 58140 Morelia, Mich.",
        "CHTW030322-xxx", "12:00 - 6:00", true, 3, "china number one",
        "https://foursquare.com/v/china-town/4ed7e8c761afca7b26035db6",
        "443 257 0653", "chinese@gmail.com");
    cRestaurantes = 3;
    restaurantes[0].agregarAlimento("hamburguesa 1", 200, "queso bien rico", 10, true, 2);
    restaurantes[0].agregarAlimento("hamburguesa 2", 300, "carne bien rica", 10, true, 3);
    restaurantes[0].agregarAlimento("hamburguesa 2.0", 400, "papas bien ricas", 10, true, 2);
    restaurantes[0].agregarAlimento("hamburguesa 2.0 version final", 500, "pan bien rico", 10, true, 3);
    restaurantes[1].agregarAlimento("Tacos de carnitas", 13, "carnitas de quiroga", 5, true, 1);
    restaurantes[1].agregarAlimento("Tacos de tortilla", 4, "?", 1, true, 1);
    restaurantes[1].agregarAlimento("Tacos de sal", 2, "sal", 1, false, 1);
    restaurantes[1].agregarAlimento("Tacos para ingeniero", 60, "pal inge", 10, true, 1);
    restaurantes[2].agregarAlimento("Chine food", 45, "food?", 15, true, 4);
    restaurantes[2].agregarAlimento("Not a dog", 20, "I wouldn't buy this", 10, true, 3);
    restaurantes[2].agregarAlimento("Bat soup", 999, "not again pls", 60, !true, 9);
    restaurantes[2].agregarAlimento("I swear is food", 60, "Sure it is :D", 5, true, 3);
    restaurantes[0].agregarPropietario("Diego Contreras", "443 690 6066", "C.U.", "diegonicus@gmail.com", 'm', "30-03-03", "COTD030330-XXX", "0", "Licenciado", "1234-1234-1234-1234");
    restaurantes[1].agregarPropietario("Carlos Gasca", "443 320 6066", "El pipila", "cgasca@gmail.com", 'f', "04-10-03", "GACC031004-XXX", "1", "Programador", "1234-1234-1234-1234");
    restaurantes[1].agregarPropietario("Jasiel Huerta", "443 690 3245", "Por la pedregal", "jhuerta@gmail.com", 'm', "29-11-03", "HUMJ031129-XXX", "1", "Psicologo", "1234-1234-1234-1234");
    restaurantes[2].agregarPropietario("Octavio Pena", "443 345 1230", "Villas del Sol", "octpen@gmail.com", 'm', "16-04-03", "PEXO030416-XXX", "2", "Contador", "1234-1234-1234-1234");
    restaurantes[2].agregarPropietario("Valeria Bocanegra", "443 435 1234", "Casa 2", "valbocng@gmail.com", 'f', "01-07-03", "BOVD030701-XXX", "2", "Futbolista", "1234-1234-1234-1234");
    pedidos[0] = new Pedido("443-323-3141", "rfcRestaurante", "Av. Sur 5", "0", "rfcRepartidor", "24-03-2022", "08:07", 2, 4, 20, 5, 4);
    cPedidos = 1;
  }

  public void mostrarRepartidores() {
    for (int i = 0; i < cPersonas; i++) {
      if (personas[i] != null && personas[i].ksoi().equals("Repartidor")) {
        personas[i].mostrar();
      }
    }
  }

  // public void mostrarRepartidores(String string) {
  //   String textForSearching;
  //   Repartidor r;
  //   for (int i = 0; i < cRepartidores; i++) {
  //     r = repartidores[i];
  //     textForSearching = r.getNombreCompleto() + r.getTelefono() + r.getRfc() + r.getCorreo() + r.getNumeroLicencia()
  //         + r.getDescripcionVehiculo() + r.getDomicilio() + r.getCuentaBancaria() + r.getFechaNacimiento();
  //     if (textForSearching.contains(string)) {
  //       repartidores[i].mostrar();
  //     }
  //     textForSearching = "";
  //   }
  // }
  //
  // public void mostrarRepartidores(int lines) {
  //   Scanner read = new Scanner(System.in);
  //   for (int i = 0; i < cRepartidores;) {
  //     for (int j = 0; j < lines; j++) {
  //       if (repartidores[i] != null) {
  //         repartidores[i].mostrar();
  //         i++;
  //       }
  //     }
  //     System.out.print("\nPresione 'Enter' para continuar : ");
  //     read.nextLine();
  //   }
  // }
  //
  // public void capturarRepartidor() {
  //   repartidores[cRepartidores] = new Repartidor();
  //   repartidores[cRepartidores].capturar();
  //   cRepartidores++;
  // }

  public void mostrarClientes() {
    for (int i = 0; i < cPersonas; i++) {
      if (personas[i] != null && personas[i].ksoi().equals("Cliente")) {
        personas[i].mostrar();
      }
    }
  }

  // public void menuclientsformat() {
  //   for (int i = 0; i <= cclientes; i++) {
  //     if (clientes[i] != null) {
  //       system.out.print(i + ".-  ");
  //       clientes[i].menuclientformat();
  //     }
  //   }
  // }

  // public void mostrarClientes(String string) {
  //   String textForSearching;
  //   Cliente r;
  //   for (int i = 0; i < cClientes; i++) {
  //     r = clientes[i];
  //     textForSearching = r.getNombreCompleto() + r.getTelefono() + r.getCorreo() + r.getDomicilio() + r.getSaldo()
  //         + r.getFechaNacimiento() + r.getMunicipio() + r.getCodigoPostal();
  //     if (textForSearching.contains(string)) {
  //       clientes[i].mostrar();
  //     }
  //     textForSearching = "";
  //   }
  // }
  //
  // public void mostrarClientes(int lines) {
  //   Scanner read = new Scanner(System.in);
  //   for (int i = 0; i < cClientes;) {
  //     for (int j = 0; j < lines; j++) {
  //       if (clientes[i] != null) {
  //         clientes[i].mostrar();
  //         i++;
  //       }
  //     }
  //     System.out.print("\nPresione 'Enter' para continuar : ");
  //     read.nextLine();
  //   }
  // }
  //
  // public void capturarCliente() {
  //   clientes[cClientes] = new Cliente();
  //   clientes[cClientes].capturar();
  //   cClientes++;
  // }

  public void mostrarRestaurantes() {
    for (int i = 0; i <= cRestaurantes; i++) {
      if (restaurantes[i] != null) {
        restaurantes[i].mostrar();
      }
    }
  }

  public void mostrarRestaurantes(String string) {
    String textForSearching;
    Restaurante r;
    for (int i = 0; i < cRestaurantes; i++) {
      r = restaurantes[i];
      textForSearching = r.getNombre() + r.getTelefono() + r.getRfc() + r.getCorreo() + r.getHorario()
          + r.getDescripcion() + r.getDomicilio() + r.getSitioWeb();
      if (textForSearching.contains(string)) {
        restaurantes[i].mostrar();
      }
      textForSearching = "";
    }
  }

  public void capturarRestaurante() {
    restaurantes[cRestaurantes] = new Restaurante();
    restaurantes[cRestaurantes].capturar();
    cRestaurantes++;
  }

  public void mostrarAlimentos() {
    Scanner read = new Scanner(System.in);
    System.out.println("Quieres mostrar todos los elementos?\n1. Si       2. No");
    if (read.nextInt() == 1) {
      for (int i = 0; i <= cRestaurantes; i++) {
        if (restaurantes[i] != null) {
          restaurantes[i].mostrarAlimento();
        }
      }
    } else {
      System.out.println("Seleccionar el numero de restaurante a mostrar alimentos (0-2)");
      int option = read.nextInt();
      if (restaurantes[option] != null) {
        restaurantes[option].mostrarAlimento();
      }
    }
  }

  public void mostrarAlimentos(String string) {
    for (int i = 0; i < cRestaurantes; i++) {
      if (restaurantes[i] != null) {
        restaurantes[i].mostrarAlimento(string);
      }
    }
  }

  public void capturarAlimentos() {
    System.out.println("Para que restaurante quieres capturarlo? (0-2)");
    Scanner read = new Scanner(System.in);
    int option = read.nextInt();
    restaurantes[option].capturarAlimento();
  }

  public void mostrarPropietarios() {
    Scanner read = new Scanner(System.in);
    System.out.println("Quieres mostrar todos los elementos?\n1. Si       2. No");
    if (read.nextInt() == 1) {
      for (int i = 0; i <= cRestaurantes; i++) {
        if (restaurantes[i] != null) {
          restaurantes[i].mostrarPropietario();
        }
      }
    } else {
      System.out.println("Seleccionar el numero de restaurante a mostrar propietarios (0-2)");
      int option = read.nextInt();
      if (restaurantes[option] != null) {
        restaurantes[option].mostrarPropietario();
      }
    }
  }

  public void mostrarPropietarios(String string) {
    for (int i = 0; i < cRestaurantes; i++) {
      if (restaurantes[i] != null) {
        restaurantes[i].mostrarPropietario(string);
      }
    }
  }

  public void capturarProietarios() {
    System.out.println("Para que restaurante quieres capturarlo? (0-2)");
    Scanner read = new Scanner(System.in);
    int option = read.nextInt();
    restaurantes[option].capturarProietario();
  }

  public void mostrarPedidos() {
    for (int i = 0; i < cPedidos; i++) {
      if (pedidos[i] != null) {
        pedidos[i].mostrar();
      }
    }
  }

  // public void capturarPedido() {
  //   Scanner read = new Scanner(System.in);
  //   System.out.println(">> >> Capturar Pedido << <<");
  //   System.out.println("Telefono del Cliente  : ");
  //   System.out.println("Por favor seleccione el cliente a tomar el telefono :         (PRESIONA ENTER PARA CONTINUAR)");
  //   read.nextLine();
  //   menuClientsFormat();
  //   int telephoneSelected = read.nextInt();
  //   String telefono = clientes[telephoneSelected].getTelefono();
  //   System.out.print("RFC del Restaurante   : ");
  //   String rfcRestaurante = read.nextLine();
  //   rfcRestaurante = read.nextLine();
  //   System.out.print("Domiclio del Cliente  : ");
  //   menuClientsFormat();
  //   int addressSelected = read.nextInt();
  //   String Domiclio = clientes[addressSelected].getDomicilio();
  //   System.out.print("Folio del Pedido      : ");
  //   int folio = cPedidos++;
  //   System.out.print("RFC del Repartidor    : ");
  //   String rfcRepartidor = read.nextLine();
  //   rfcRepartidor = read.nextLine();
  //   System.out.print("Fecha                 : ");
  //   String fecha = read.nextLine();
  //   System.out.print("Hora del Pedido       : ");
  //   String hora = read.nextLine();
  //   System.out.println("Forma de pago         : (i) ");
  //   System.out.print("1.- Efectivo    2.- Tarjeta");
  //   int formaPago = read.nextInt();
  //   System.out.print("Status                : (i) 1");
  //   int status = 1;
  //   System.out.print("Costo del envio       : ");
  //   float costoEnvio = read.nextFloat();
  //   System.out.print("Calf. restaurante     : ");
  //   int calificacionRestaurante = read.nextInt();
  //   System.out.print("Calf. repartidor      : ");
  //   int calificacionRepartidor= read.nextInt();
  // }

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

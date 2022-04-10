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
    personas[0] = new Repartidor("443 123 9989", "Angel Duarte", "TIDA031201-xxx", "angelduarte@gmail.com", 'M',
        "123456789", "honda cbf 125 twister", "45 de Marzo #239", "1234-1234-1234-1234", "12-03-01", 'M', true);
    personas[1] = new Repartidor("443 123 3851", "David T.", "TIDA031201-xxx", "davidt@gmail.com", 'M', "123456789",
        "honda cbt 250", "123 de Marzo #12332", "1234-1234-1234-1234", "12-03-01", 'M', true);
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
    personas[10] = new Cliente("Angel T.", "412 de Marzo #213", "443 112 1223", "angelt@gmail.com", 'M', "12-03-01",
        200,
        "Morelia", "58337");
    personas[11] = new Cliente("David Duarte", "12323 de Marzo #542", "443 123 3851", "davidduarte@gmail.com", 'M',
        "12-03-01", 250, "Morelia", "58337");
    personas[12] = new Cliente("Fatima Chavez", "CDMX, Av. Insurgentes #777", "443 122 4324", "fatimachavez@gmail.com",
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
    personas[20] = new Propietario("Diego Contreras", "443 690 6066", "C.U.", "diegonicus@gmail.com", 'm', "30-03-03",
        "COTD030330-XXX", "0", "Licenciado", "1234-1234-1234-1234");
    personas[21] = new Propietario("Carlos Gasca", "443 320 6066", "El pipila", "cgasca@gmail.com", 'f', "04-10-03",
        "GACC031004-XXX", "1", "Programador", "1234-1234-1234-1234");
    personas[22] = new Propietario("Jasiel Huerta", "443 690 3245", "Por la pedregal", "jhuerta@gmail.com", 'm',
        "29-11-03", "HUMJ031129-XXX", "1", "Psicologo", "1234-1234-1234-1234");
    personas[23] = new Propietario("Octavio Pena", "443 345 1230", "Villas del Sol", "octpen@gmail.com", 'm',
        "16-04-03", "PEXO030416-XXX", "2", "Contador", "1234-1234-1234-1234");
    personas[24] = new Propietario("Valeria Bocanegra", "443 435 1234", "Casa 2", "valbocng@gmail.com", 'f', "01-07-03",
        "BOVD030701-XXX", "2", "Futbolista", "1234-1234-1234-1234");
    personas[25] = new Propietario("Robert S Costello", "440-614-9467", "2681 Bingamon Road", "kacie.schill@yahoo.com",
        'm', "3/12/1985",
        "COSR851203-XXX", "3", "Painter, Construction and Maintenance", "1234-1234-1234-1234");
    personas[26] = new Propietario("Rebecca D Snell", "407-213-3671", "3373 Coolidge Street", "ocie1984@hotmail.com",
        'f', "2/1/2001",
        "SNDR010102-XXX", "4", "Broadcast Technician", "1234-1234-1234-1234");
    cPersonas = 27;
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
    restaurantes[3] = new Restaurante("Mos Eisley Cantina",
        "Tatooine",
        "MOEI458792-xxx", "12:00 - 23:00", false, 3, "Kylo Ren besto Sith",
        "https://www.starwars.com/databank/mos-eisley-cantina",
        "443 257 0653", "starwars@gmail.com");
    restaurantes[4] = new Restaurante("Joe's Pizza",
        "233 Bleecker Street",
        "JOPI060801-xxx", "9:00 - 16:00", true, 4, "u'r late petter",
        "https://spiderman-films.fandom.com/wiki/Joe%27s_Pizza",
        "443 257 0653", "spiderpizza@gmail.com");
    cRestaurantes = 5;
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
    restaurantes[3].agregarAlimento("Peanut butter wookie", 1, "It's like a little chewy", 1, true, 4);
    restaurantes[3].agregarAlimento("Boba fet burguer", 10, "Choice of burguer", 20, true, 5);
    restaurantes[3].agregarAlimento("Spaceballs the slider", 4, "with Swarzbier BBQ sauce", 30, false, 2);
    restaurantes[3].agregarAlimento("Ham solo", 1, "ham", 2, true, 4);
    restaurantes[3].agregarAlimento("Mistery Galaxy", 10, "?", 15, true, 5);
    restaurantes[4].agregarAlimento("Water Pizza", 5, "not what u thinkin", 20, true, 6);
    restaurantes[4].agregarAlimento("Salad of Pizza", 60, "best salad ever", 15, false, 3);
    restaurantes[4].agregarAlimento("Chicken Pizza", 60, "is this legal?", 35, true, 7);
    restaurantes[4].agregarAlimento("Taco Pizza", 60, "Cielito lindo", 25, false, 1);
    restaurantes[4].agregarAlimento("Viking Pizza", 60, "In the name of Ivar Lothbrok", 40, true, 2);
    pedidos[0] = new Pedido("443-323-3141", "CALL030322", "Av. Sur 5", "0", "rfcRepartidor", "24-03-2022", "08:07",
        2, 4, 20, 5, 4);
    pedidos[1] = new Pedido("443-323-3141", "JOPI060801", "746 Laurel Lane", "1", "rfcRepartidor", "23-03-2022", "18:07",
        1, 3, 20, 5, 5);
    pedidos[2] = new Pedido("443-323-3141", "MOEI458792", "694 Stark Hollow Road", "2", "rfcRepartidor", "21-02-2021", "08:17",
        2, 1, 20, 5, 4);
    pedidos[3] = new Pedido("443-323-3141", "CALL030322", "4144 Trails End Road", "3", "rfcRepartidor", "14-12-2021", "02:27",
        1, 2, 20, 4, 5);
    pedidos[4] = new Pedido("443-323-3141", "UIXS012302", "4154 Thomas Street", "4", "rfcRepartidor", "17-05-2022", "07:57",
        2, 4, 20, 5, 5);
    cPedidos = 5;
    pedidos[0].agregarDetalle(3, "hamburguesa", 200, "sin cebolla");
    pedidos[1].agregarDetalle(2, "tacos para el ingeniero", 60, "salsa de la que pica");
    pedidos[2].agregarDetalle(1, "chine food", 45, "none");
  }

  public void mostrarRepartidores() {
    for (int i = 0; i < cPersonas; i++) {
      if (personas[i] != null && personas[i].whatI().equals("Repartidor")) {
        personas[i].mostrar();
      }
    }
  }

  public void capturarRepartidor() {
    personas[cPersonas] = new Repartidor();
    personas[cPersonas].capturar();
    cPersonas++;
  }

  public void mostrarRepartidores(String string) {
    String textForSearching;
    for (int i = 0; i < cPersonas; i++) {
      if (personas[i] != null && personas[i].whatI().equals("Repartidor")) {
        Repartidor r = (Repartidor) personas[i];
        textForSearching = r.getNombreCompleto() + r.getTelefono() + r.getRfc() + r.getCorreo() + r.getNumeroLicencia()
            + r.getDescripcionVehiculo() + r.getDomicilio() + r.getCuentaBancaria() + r.getFechaNacimiento();
        if (textForSearching.contains(string)) {
          r.mostrar();
        }
        textForSearching = "";
      }
    }
  }

  public void mostrarClientes() {
    for (int i = 0; i < cPersonas; i++) {
      if (personas[i] != null && personas[i].whatI().equals("Cliente")) {
        personas[i].mostrar();
      }
    }
  }

  public void capturarCliente() {
    personas[cPersonas] = new Cliente();
    personas[cPersonas].capturar();
    cPersonas++;
  }

  public void mostrarClientes(String string) {
    String textForSearching;
    for (int i = 0; i < cPersonas; i++) {
      if (personas[i] != null && personas[i].whatI().equals("Cliente")) {
        Cliente c = (Cliente) personas[i];
        textForSearching = c.getNombreCompleto() + c.getTelefono() + c.getCorreo() + c.getDomicilio() + c.getSaldo()
            + c.getFechaNacimiento() + c.getMunicipio() + c.getCodigoPostal();
        if (textForSearching.contains(string)) {
          c.mostrar();
        }
        textForSearching = "";
      }
    }
  }

  public void mostrarPropietarios() {
    for (int i = 0; i < cPersonas; i++) {
      if (personas[i] != null && personas[i].whatI().equals("Propietario")) {
        personas[i].mostrar();
      }
    }
  }

  public void capturarPropietario() {
    personas[cPersonas] = new Propietario();
    personas[cPersonas].capturar();
    cPersonas++;
  }

  public void mostrarPropietarios(String string) {
    String textForSearching;
    for (int i = 0; i < cPersonas; i++) {
      if (personas[i] != null && personas[i].whatI().equals("Propietario")) {
        Propietario p = (Propietario) personas[i];
        textForSearching = p.getNombreCompleto() + p.getTelefono() + p.getCorreo() + p.getDomicilio() + p.getRfc()
            + p.getFechaNacimiento() + p.getOcupacion() + p.getId();
        if (textForSearching.contains(string)) {
          p.mostrar();
        }
        textForSearching = "";
      }
    }
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
      System.out.println("Seleccionar el numero de restaurante a mostrar alimentos (0-4)");
      int option = read.nextInt();
      if (restaurantes[option] != null) {
        restaurantes[option].mostrarAlimento();
      }
    }
  }

  public void capturarAlimento() {
    System.out.println("Para que restaurante quieres capturarlo? (0-4)");
    Scanner read = new Scanner(System.in);
    int option = read.nextInt();
    restaurantes[option].capturarAlimento();
  }

  public void mostrarAlimentos(String string) {
    for (int i = 0; i < cRestaurantes; i++) {
      if (restaurantes[i] != null) {
        restaurantes[i].mostrarAlimento(string);
      }
    }
  }

  public void mostrarPedidos() {
    for (int i = 0; i < cPedidos; i++) {
      if (pedidos[i] != null) {
        pedidos[i].mostrar();
        pedidos[i].mostrarDetalle();
      }
    }
  }

  public void capturarPedido() {
    pedidos[cPedidos] = new Pedido();
    pedidos[cPedidos].capturar(personas, restaurantes);
    cPedidos++;
  }

  public void mostrarPedidos(String string) {
    String textForSearching;
    Pedido p;
    for (int i = 0; i < cPedidos; i++) {
      p = pedidos[i];
      textForSearching = p.getTelefonoCliente() + p.getRfcRestaurante() + p.getDomicilioPedido() + p.getFolio()
          + p.getRfcRepartidor() + p.getFecha() + p.getHora();
      if (textForSearching.contains(string)) {
        pedidos[i].mostrar();
      }
      textForSearching = "";
    }
  }

  public void mostrarDetalles() {
    for (int i = 0; i < cPedidos; i++) {
      if (pedidos[i] != null) {
        pedidos[i].mostrarDetalle();
      }
    }
  }

  public void capturarDetalle() {
    System.out.println("Para que pedido quieres capturarlo? (0-4)");
    Scanner read = new Scanner(System.in);
    int option = read.nextInt();
    pedidos[option].capturarDetalle();
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

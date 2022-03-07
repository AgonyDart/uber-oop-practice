
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int opcion;
        Uber uberEats = new Uber("UPM974734", "helpuber.com.mx", "Uber.com", "4432947201");

        do {
            opcion = mostrarMenu();
            switch (opcion) {
                case 11:
                    uberEats.mostrarRepartidores();
                    break;
                case 12:
                    uberEats.capturarRepartidor();
                    break;
                case 21:
                    uberEats.mostrarClientes();
                    break;
                case 22:
                    uberEats.capturarCliente();
                    break;
                case 31:
                    uberEats.mostrarRestaurantes();
                    break;
                case 32:
                    uberEats.capturarRestaurante();
                    break;
                case 34:
                    //
                case 0:
                    return;
            }
        } while (opcion > 0);
    }

    public static int mostrarMenu() {
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("1.- Repartidor         2.-Cliente       3.-Restaurante   0.-Salir");
            int opcion = read.nextInt();
            if (opcion == 0) {
                return opcion;
            } else if (opcion == 3) {
                System.out.println("1. Mostrar Restaurante  2. Capturar Restaurante     3. Mostrar Alimento     4. Capturar Alimento");
                opcion = opcion * 10 + read.nextInt();
                return opcion;
            } else {
                System.out.println("1.- Mostrar          2.- Capturar      3.-Cancelar");
                opcion = opcion * 10 + read.nextInt();
                return opcion;
            }
        }
    }
}

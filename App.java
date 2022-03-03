
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
                case 0:
                    return;
            }
        } while (opcion > 0);
    }

    public static int mostrarMenu() {
        Scanner dato = new Scanner(System.in);
        System.out.println("1.- Repartidor         2.-Cliente       3.-Restaurante   0.-Salir");
        int opcion = dato.nextInt();
        if (opcion == 0) {
            return opcion;
        }
        System.out.println("1.- Mostrar          2.- Capturar      3.-Cancelar");
        opcion = opcion * 10 + dato.nextInt();
        return opcion;
    }
}

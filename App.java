
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int opcion;
        Scanner read = new Scanner(System.in);
        String search;
        Uber uberEats = new Uber("UPM974734", "helpuber.com.mx", "Uber.com", "4432947201");
        // imprime todos los repartidores y lineas, indica cuantos a la vez (hacer un limite de datos);

        do {
            opcion = mostrarMenu();
            switch (opcion) {
                case 11:
                    uberEats.mostrarRepartidores();
                    break;
                case 12:
                    uberEats.capturarRepartidor();
                    break;
                case 13:
                    System.out.println("Introduce la cadena de texto a buscar, o el numero de repartidores : ");
                    search = read.nextLine();
                    if (isNumeric(search)) {
                        uberEats.mostrarRepartidores(Integer.parseInt(search));
                    } else {
                        uberEats.mostrarRepartidores(search);
                    }
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
                case 0:
                    return;
            }
        } while (opcion > 0);
	}

    public static int mostrarMenu() {
        Scanner read = new Scanner(System.in);
			System.out.println("1.- Repartidor         2.-Cliente       3.-Restaurante   0.-Salir");
			int opcion = read.nextInt();
			if (opcion == 0) {
			    return opcion;
			}
			System.out.println("1.- Mostrar          2.- Capturar      3. Buscar       0.-Cancelar");
			opcion = opcion * 10 + read.nextInt();
			return opcion;
    }

    private static boolean isNumeric(String string){
    	try {
    		Integer.parseInt(string);
    		return true;
    	} catch (NumberFormatException nfe){
    		return false;
    	}
    }
}
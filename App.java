
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int opcion;
		Scanner read = new Scanner(System.in);
		String search;
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
				case 13:
					search = read.nextLine();
					uberEats.mostrarRepartidores(search);
					break;
				case 21:
					uberEats.mostrarClientes();
					break;
				case 22:
					uberEats.capturarCliente();
					break;
				case 23:
					search = read.nextLine();
					uberEats.mostrarClientes(search);
					break;
				case 31:
					uberEats.mostrarPropietarios();
					break;
				case 32:
					uberEats.capturarPropietario();
					break;
				case 33:
					search = read.nextLine();
					uberEats.mostrarPropietarios(search);
					break;
				case 41:
					uberEats.mostrarRestaurantes();
					break;
				case 42:
					uberEats.capturarRestaurante();
					break;
				case 43:
					search = read.nextLine();
					uberEats.mostrarRestaurantes(search);
					break;
				case 44:
					uberEats.mostrarAlimentos();
					break;
				case 45:
					uberEats.capturarAlimento();
					break;
				case 46:
					search = read.nextLine();
					uberEats.mostrarAlimentos(search);
					break;
				case 0:
					return;
			}
		} while (opcion > 0);
	}

	public static int mostrarMenu() {
		Scanner read = new Scanner(System.in);
		System.out.print("\n1.- Repartidor		2.- Cliente		3.- Propietario		4.- Restaurante		5.- Pedido		0.- Salir\n> ");
		int opcion = read.nextInt();
		if (opcion == 0) {
			return opcion;
		}
		if (opcion == 4) {
			System.out.print("\n1.- Mostrar		2.- Capturar		3.- Buscar			4.-Mostrar alimentos\n5. Capturar alimento	6. Buscar alimento	0.- Cancelar\n> ");
			opcion = opcion * 10 + read.nextInt();
		} else {
			System.out.print("\n1.- Mostrar		2.- Capturar		3. Buscar		0.-Cancelar\n> ");
			opcion = opcion * 10 + read.nextInt();
		}
		if (opcion % 10 == 3 || opcion % 10 == 6) {
			System.out.print("> Introduce la cadena de texto a buscar: ");
		}
		return opcion;
	}
}
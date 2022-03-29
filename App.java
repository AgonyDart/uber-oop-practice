
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int opcion;
		Scanner read = new Scanner(System.in);
		String search;
		Uber uberEats = new Uber("UPM974734", "helpuber.com.mx", "Uber.com", "4432947201");
		// imprime todos los repartidores y lineas, indica cuantos a la vez (hacer un
		// limite de datos);

		do {
			opcion = mostrarMenu();
			switch (opcion) {
				case 11:
					uberEats.mostrarRepartidores();
					break;
				case 12:
					// uberEats.capturarRepartidor();
					break;
				case 13:
					search = read.nextLine();
					// uberEats.mostrarRepartidores(search);
					// if (isNumeric(search)) {
					// 	uberEats.mostrarRepartidores(Integer.parseInt(search));
					// } else {
					// 	uberEats.mostrarRepartidores(search);
					// }
					break;
				case 21:
					uberEats.mostrarClientes();
					break;
				case 22:
					// uberEats.capturarCliente();
					break;
				case 23:
					search = read.nextLine();
					// uberEats.mostrarClientes(search);
					// if (isNumeric(search)) {
					// 	uberEats.mostrarClientes(Integer.parseInt(search));
					// } else {
					// 	uberEats.mostrarClientes(search);
					// }
					break;
				case 31:
					uberEats.mostrarRestaurantes();
					break;
				case 32:
					uberEats.capturarRestaurante();
					break;
				case 33:
					uberEats.mostrarRestaurantes(read.nextLine());
					break;
				case 34:
					uberEats.mostrarAlimentos();
					break;
				case 35:
					uberEats.capturarAlimentos();
					break;
				case 36:
					System.out.print("Introduce la cadena de texto a buscar : ");
					uberEats.mostrarAlimentos(read.nextLine());
					break;
				case 37:
					uberEats.mostrarPropietarios();
					break;
				case 38:
					uberEats.capturarProietarios();
					break;
				case 39:
					System.out.print("Introduce la cadena de texto a buscar : ");
					uberEats.mostrarPropietarios(read.nextLine());
					break;
				case 41:
					uberEats.mostrarPedidos();
					break;
				case 42:
					// uberEats.capturarPedido();
					break;
				case 0:
					return;
			}
		} while (opcion > 0);
	}

	public static int mostrarMenu() {
		Scanner read = new Scanner(System.in);
		System.out.println("1.- Repartidor		2.- Cliente		3.- Restaurante		4.Pedido		0.- Salir");
		int opcion = read.nextInt();
		if (opcion == 0) {
			return opcion;
		}
		if (opcion == 3) {
			System.out.println("1.- Mostrar		2.- Capturar		3.- Buscar			4.-Mostrar alimentos\n5. Capturar alimento	6. Buscar alimento	7. Mostrar propietario		8. Capturar propietario\n9. Buscar propietario	0.- Cancelar");
			opcion = opcion * 10 + read.nextInt();
		} else {
			System.out.println("1.- Mostrar		2.- Capturar		3. Buscar		0.-Cancelar");
			opcion = opcion * 10 + read.nextInt();
		}
		if (opcion % 10 == 3) {
			System.out.println("Introduce la cadena de texto a buscar, o el numero de lineas : ");
		}
		return opcion;
	}

	//  Metodo de apoyo para la funcion de mostrar solo cierto numero de repartidores, clientes, etc, hasta el siguiente 'enter'
	private static boolean isNumeric(String string) {
		try {
			Integer.parseInt(string);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
}

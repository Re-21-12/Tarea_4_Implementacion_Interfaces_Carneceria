package implementacion_interfaces;

import java.util.*;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String opcion = "";
		ArrayList<Producto> Arr_Inv = new ArrayList<Producto>();
		Inventario inventario = new Inventario(Arr_Inv);
		Carniceria carniceria = new Carniceria(inventario);
		System.out.println("Bienvenido a la Carniceria");
		do {

			System.out.println(
					"Seleccione una opcion: \n 1. Cargar inventario \n 2. Ver inventario \n 3. Realizar Orden \n 4. salir");
			opcion = entrada.nextLine();
			switch (opcion) {
			case "1":
				System.out.println("Ha seleccionado cargar inventairo");

				carniceria.cargar_Inventario(inventario);

				break;
			case "2":
				System.out.println("Ha seleccionado ver inventario");
				carniceria.revisar_Inventario(inventario);
				break;

			case "3":
				System.out.println("Ha seleccionado realizar orden");
				carniceria.realizar_Ordenes(inventario);
				break;

			}
		} while (!opcion.equalsIgnoreCase("4"));
		entrada.close();
		System.out.println("Que haya disfrutado su compra!");
		
	}

}

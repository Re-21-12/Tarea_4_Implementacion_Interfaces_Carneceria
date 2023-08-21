package implementacion_interfaces;

import java.util.*;

public class Carniceria implements Interfaz_Carniceria {
	private Inventario inventario;

	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}

	public Carniceria(Inventario inventario) {
		super();
		this.inventario = inventario;
	}

	@Override
	public String toString() {
		return "Carniceria [inventario=" + inventario + "]";
	}

//metodos de interfaz
//realizar orden a partir de los objetos creados
	public void realizar_Ordenes(Inventario inventario) {
		// instanciamos los valores que llevar los valores de compra y venta
		double total_compra = 0.0;
		double total_venta = 0.0;
		int cantidad_compra = 0;
		int cantidad_venta = 0;
		// iteramos sobre el objeto inventario a traves de su get
		for (Producto producto : inventario.getInventario()) {
			switch (producto.getOrden()) {
			case "c":
				total_compra += producto.getCosto() * producto.getCantidad();
				cantidad_compra += producto.getCantidad();
				break;

			case "v":
				total_venta += producto.getCosto() * producto.getCantidad();
				cantidad_venta += producto.getCantidad();
				break;

			}
		}
		System.out.println("La cantidad de productos comprados es: " + cantidad_compra + " el gasto de la compra es: "
				+ total_compra);
		System.out.println("La cantidad de productos vendidos es: " + cantidad_venta + " la ganancia de la venta es: "
				+ total_venta);
		System.out.println("La cantidad de productos en el invntario es: " + (cantidad_compra + cantidad_venta));
	}

	// cargar inventario
	public void cargar_Inventario(Inventario inventario) {
		ArrayList<Producto> inventario_Cargado = inventario.getInventario();
		Scanner entrada = new Scanner(System.in);
		String salir;
		do {	
		
		System.out.println("Ingrese un nombre para el producto");
		String nombre = entrada.nextLine();
		System.out.println("Ingrese el tipo de orden el producto: [c] Compra || [v] Venta");
		String orden = entrada.nextLine();
		System.out.println("Ingrese un costo para el producto");
		Double costo = entrada.nextDouble();
		System.out.println("Ingrese una cantidad para el producto");
		Integer cantidad = entrada.nextInt();
		System.out.println("Presione Enter para continuar");
		
		entrada.nextLine();
		System.out.println("Desea continuar? : [s] SI || [n] NO");
		//opcion para salir 
		salir = entrada.nextLine();
		//agregar al arreglo
		inventario_Cargado.add(new Producto(nombre,costo,cantidad,orden ));
		inventario.setInventario(inventario_Cargado);
		}while(!salir.equalsIgnoreCase("n"));
		System.out.println("Ha cargado el inventario");
		//entrada.close();
		
	}

//revisar el inventairo
	public void revisar_Inventario(Inventario inventario) {
	int cantidad_productos = 0; Double total_compra = 0.0; Double total_venta = 0.0;
	Double cantidad_total = 0.0;	
	for(Producto producto: inventario.getInventario()) {
			switch(producto.getOrden()) {
			case "c":
				total_compra += producto.getCosto() * producto.getCantidad();
				break;
			case "v":
				total_venta += producto.getCosto() * producto.getCantidad();
				break;
		
			}
			cantidad_productos += producto.getCantidad();
		}
		cantidad_total = total_venta - total_compra;
		if(cantidad_total > 0) {
			System.out.println("La ganancia  es de: " + cantidad_total);					
		}else {
			System.out.println("La perdida  es de: " + cantidad_total);					
		}
		System.out.println("La cantidad de productos en el invntario es: " + cantidad_productos);
	
	}

}
